package com.erapp.newnavigationexample.ui.screens.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ProfileScreenDetails(
    modifier: Modifier = Modifier,
    userId: String,
    userName: String,
    onNavigateToHome: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Profile Details Screen")
        Text(text = "User ID: $userId")
        Text(text = "User Name: $userName")
        Button(onClick = onNavigateToHome) {
            Text(text = "Go to Home")
        }
    }
}