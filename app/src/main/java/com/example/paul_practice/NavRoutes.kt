package com.example.paul_practice

sealed class NavRoutes(val route: String) {
    object Pendulum : NavRoutes("pendulum")
}