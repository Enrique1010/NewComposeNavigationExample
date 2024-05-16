package com.erapp.newnavigationexample.utils

import androidx.navigation.NavHostController
import androidx.navigation.NavOptions

fun <T: Any> NavHostController.safeNavigate(
    route: T,
    popUpTo: T? = null,
    inclusive: Boolean = false,
    saveState: Boolean = false,
    singleTop: Boolean = true,
    restoreState: Boolean = true
) {
    navigate(
        route = route,
        navOptions = NavOptions.Builder()
            .setPopUpTo(popUpTo ?: route, inclusive, saveState)
            .setLaunchSingleTop(singleTop)
            .setRestoreState(restoreState)
            .build()
    )
}