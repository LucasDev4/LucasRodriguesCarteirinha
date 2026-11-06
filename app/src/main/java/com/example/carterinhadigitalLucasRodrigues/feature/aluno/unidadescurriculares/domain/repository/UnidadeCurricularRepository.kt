package com.example.carterinhadigitalLucasRodrigues.feature.aluno.unidadescurriculares.domain.repository

import com.example.carterinhadigitalLucasRodrigues.feature.aluno.unidadescurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listar():Result<List<UnidadeCurricular>>
}