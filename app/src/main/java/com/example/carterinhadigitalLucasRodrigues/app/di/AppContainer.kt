package com.example.carterinhadigitalLucasRodrigues.app.di

import com.example.carterinhadigitalLucasRodrigues.core.auth.SessionTokenStore
import com.example.carterinhadigitalLucasRodrigues.feature.aluno.unidadescurriculares.domain.repository.UnidadeCurricularRepository
import com.example.carterinhadigitalLucasRodrigues.feature.login.domain.repository.LoginRepository
import com.example.carterinhadigitalLucasRodrigues.feature.professor.turmas.domain.repository.TurmaRepository
import com.example.carterinhadigitalLucasRodrigues.feature.professor.unidadescurriculares.domain.repository.UnidadeCurricularProfessorRepository

interface AppContainer {
    val sessionTokenStore: SessionTokenStore
    val loginRepository: LoginRepository
    val unidadeCurricularRepository: UnidadeCurricularRepository
    val turmaRepository: TurmaRepository
    val unidadeCurricularProfessorRepository: UnidadeCurricularProfessorRepository
}
