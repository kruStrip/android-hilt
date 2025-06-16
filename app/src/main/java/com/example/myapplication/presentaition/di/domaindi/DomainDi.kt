package com.example.myapplication.presentaition.di.domaindi

import com.example.myapplication.domain.repositories.authenticationrepository.IInterUserAccountRepository
import com.example.myapplication.domain.repositories.courserepository.IAddCourseRepository
import com.example.myapplication.domain.repositories.courserepository.IGetCourseRepository
import com.example.myapplication.domain.repositories.studentrepository.IAddStudentRepository
import com.example.myapplication.domain.repositories.studentrepository.IGetStudentsRepository
import com.example.myapplication.domain.repositories.teacherrepository.IAddTeacherRepository
import com.example.myapplication.domain.repositories.teacherrepository.IGetTeachersRepository
import com.example.myapplication.domain.repositories.userrepository.IAddUserRepository
import com.example.myapplication.domain.repositories.userrepository.ICheckUserRepository
import com.example.myapplication.domain.repositories.userrepository.IGetLastUserRepository
import com.example.myapplication.domain.repositories.userrepository.IGetUsersRepository
import com.example.myapplication.domain.usecases.authenticationusecase.InterUserAccountUseCase
import com.example.myapplication.domain.usecases.courseusecase.AddCourseUseCase
import com.example.myapplication.domain.usecases.courseusecase.GetCoursesUseCase
import com.example.myapplication.domain.usecases.studentusecase.AddStudentUseCase
import com.example.myapplication.domain.usecases.studentusecase.GetStudentsUseCase
import com.example.myapplication.domain.usecases.teacherusecase.AddTeacherUseCase
import com.example.myapplication.domain.usecases.teacherusecase.GetTeachersUseCase
import com.example.myapplication.domain.usecases.userusecase.AddUserUseCase
import com.example.myapplication.domain.usecases.userusecase.CheckUserUseCase
import com.example.myapplication.domain.usecases.userusecase.GetUserUseCase
import com.example.myapplication.domain.usecases.userusecase.GetUsersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainDi {

    @Provides
    fun provideAddUserUseCase(addUserRepository: IAddUserRepository): AddUserUseCase =
        AddUserUseCase(addUserRepository)

    @Provides
    fun provideGetUsersUseCase(getUsersRepository: IGetUsersRepository): GetUsersUseCase =
        GetUsersUseCase(getUsersRepository)

    @Provides
    fun provideGetUserUseCase(getLastUserRepository: IGetLastUserRepository): GetUserUseCase =
        GetUserUseCase(getLastUserRepository)

    @Provides
    fun provideCheckUserUseCase(checkUserRepository: ICheckUserRepository): CheckUserUseCase =
        CheckUserUseCase(checkUserRepository)

    @Provides
    fun provideInterUserAccountUseCase(interUserAccountRepository: IInterUserAccountRepository): InterUserAccountUseCase =
        InterUserAccountUseCase(interUserAccountRepository)

    @Provides
    fun provideGetTeachersUseCase(getTeachersRepository: IGetTeachersRepository): GetTeachersUseCase =
        GetTeachersUseCase(getTeachersRepository)

    @Provides
    fun provideAddTeacherUseCase(addTeacherRepository: IAddTeacherRepository): AddTeacherUseCase =
        AddTeacherUseCase(addTeacherRepository)

    @Provides
    fun provideGetStudentsUseCase(getStudentsRepository: IGetStudentsRepository): GetStudentsUseCase =
        GetStudentsUseCase(getStudentsRepository)

    @Provides
    fun provideAddStudentUseCase(addStudentRepository: IAddStudentRepository): AddStudentUseCase =
        AddStudentUseCase(addStudentRepository)

    @Provides
    fun provideGetCoursesUseCase(getCourseRepository: IGetCourseRepository): GetCoursesUseCase =
        GetCoursesUseCase(getCourseRepository)

    @Provides
    fun provideAddCourseUseCase(addCourseRepository: IAddCourseRepository): AddCourseUseCase =
        AddCourseUseCase(addCourseRepository)
}
