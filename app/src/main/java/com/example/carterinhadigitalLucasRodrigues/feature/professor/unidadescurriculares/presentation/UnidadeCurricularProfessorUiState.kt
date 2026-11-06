package com.example.carterinhadigitalLucasRodrigues.feature.professor.unidadescurriculares.presentation

import com.example.carterinhadigitalLucasRodrigues.feature.professor.unidadescurriculares.domain.model.UnidadeCurricularProfessor

data class UnidadeCurricularProfessorUiState(
    val isLoading: Boolean = false,
    val unidades: List<UnidadeCurricularProfessor> = emptyList(),
    val errorMessage: String? = null
)
