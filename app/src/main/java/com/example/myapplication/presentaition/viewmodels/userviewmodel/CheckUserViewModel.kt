package com.example.myapplication.presentaition.viewmodels.userviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.models.User
import com.example.myapplication.domain.usecases.userusecase.CheckUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class CheckUserViewModel @Inject constructor(
    private val checkUserUseCase: CheckUserUseCase
) : ViewModel() {

    fun checkUser(user: User) = viewModelScope.launch {
        checkUserUseCase(user)
    }
}
