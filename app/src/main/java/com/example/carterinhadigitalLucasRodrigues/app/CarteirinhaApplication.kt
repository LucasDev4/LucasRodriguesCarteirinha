package com.example.carterinhadigitalLucasRodrigues.app

import com.example.carterinhadigitalLucasRodrigues.app.di.DefaultAppContainer

class CarteirinhaApplication : android.app.Application() {
    val container: com.example.carterinhadigitalLucasRodrigues.app.di.AppContainer by lazy {
        _root_ide_package_.com.example.carterinhadigitalLucasRodrigues.app.di.DefaultAppContainer()
    }
}