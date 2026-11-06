package com.example.carterinhadigitalLucasRodrigues.feature.login.domain.repository

import com.example.carterinhadigitalLucasRodrigues.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}