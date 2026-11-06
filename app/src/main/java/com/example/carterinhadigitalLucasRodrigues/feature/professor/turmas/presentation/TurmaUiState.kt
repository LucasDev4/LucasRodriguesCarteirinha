package com.example.carterinhadigitalLucasRodrigues.feature.professor.turmas.presentation

import com.example.carterinhadigitalLucasRodrigues.feature.professor.turmas.domain.model.Turma

data class TurmaUiState(
    val isLoading: Boolean = false,
    val turmas: List<Turma> = emptyList(),
    val errorMessage: String? = null
)
