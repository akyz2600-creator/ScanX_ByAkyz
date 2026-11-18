package com.akyz.scanx.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.akyz.scanx.ui.home.HomeScreen

/** Rutas de la app. Las pantallas reales se añaden en fases posteriores. */
object Routes {
    const val HOME = "home"
}

@Composable
fun ScanXNavHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.HOME,
        modifier = modifier,
    ) {
        composable(Routes.HOME) { HomeScreen() }
    }
}
