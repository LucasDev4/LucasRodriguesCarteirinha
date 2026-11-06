package com.example.carterinhadigitalLucasRodrigues.feature.professor.turmas.data.remote.service

import com.example.carterinhadigitalLucasRodrigues.feature.professor.turmas.data.remote.dto.TurmaDto
import retrofit2.http.GET

interface TurmaApi {
    @GET("professores/me/turmas")
    suspend fun listar(): List<TurmaDto>
}
