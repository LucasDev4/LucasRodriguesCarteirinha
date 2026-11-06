package com.example.carterinhadigitalLucasRodrigues.feature.professor.turmas.domain.repository

import com.example.carterinhadigitalLucasRodrigues.feature.professor.turmas.domain.model.Turma

interface TurmaRepository {
    suspend fun listar(): Result<List<Turma>>
}
