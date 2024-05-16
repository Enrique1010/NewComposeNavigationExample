package com.erapp.newnavigationexample.navigation

import kotlinx.serialization.Serializable

sealed interface ProfileRoute {
    // graph route reference
    @Serializable
    data object ProfileMainRoute : ProfileRoute

    // screens route reference
    @Serializable
    data object Profile : ProfileRoute
    @Serializable
    data class ProfileDetails(
        val userId: String,
        val name: String
    ) : ProfileRoute
}