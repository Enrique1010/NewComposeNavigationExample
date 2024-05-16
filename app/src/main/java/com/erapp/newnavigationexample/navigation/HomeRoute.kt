package com.erapp.newnavigationexample.navigation

import kotlinx.serialization.Serializable

sealed interface HomeRoute {
    @Serializable
    data object HomeMainRoute : HomeRoute

    @Serializable
    data object Home : HomeRoute
    @Serializable
    data object Details : HomeRoute
}