package com.example.myapplication.presentaition.viewmodels.courseviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.models.Course
import com.example.myapplication.domain.usecases.courseusecase.GetCoursesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

@HiltViewModel
class GetCourseViewModel @Inject constructor(
    private val getCoursesUseCase: GetCoursesUseCase
) : ViewModel() {

    private val _courses = MutableStateFlow<List<Course>>(emptyList())
    val courses: StateFlow<List<Course>> = _courses

    init {
        fetchCourses()
    }

    private fun fetchCourses() = viewModelScope.launch {
        val result = getCoursesUseCase()
        _courses.value = result
    }
}
