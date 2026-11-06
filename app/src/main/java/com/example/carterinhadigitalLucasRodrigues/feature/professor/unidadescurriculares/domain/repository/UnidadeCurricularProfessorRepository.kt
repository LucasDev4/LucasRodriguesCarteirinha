package com.example.carterinhadigitalLucasRodrigues.feature.professor.unidadescurriculares.domain.repository

import com.example.carterinhadigitalLucasRodrigues.feature.professor.unidadescurriculares.domain.model.UnidadeCurricularProfessor

interface UnidadeCurricularProfessorRepository {
    suspend fun listar(): Result<List<UnidadeCurricularProfessor>>
}
