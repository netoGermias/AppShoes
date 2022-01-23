package com.example.appshoes.menuBottom

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BarScreenBotton(
    val endereco: String,
    val titulo: String,
    val icon: ImageVector
){
    object home : BarScreenBotton(
        endereco = "home",
        titulo = "Home",
        icon = Icons.Default.Home
    )
}