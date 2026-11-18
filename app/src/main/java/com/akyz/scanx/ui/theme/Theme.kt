package com.akyz.scanx.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val ScanXDarkColorScheme = darkColorScheme(
    primary = ScanXCyan,
    secondary = ScanXViolet,
    tertiary = ScanXMagenta,
    background = ScanXBlack,
    surface = ScanXSurface,
    onPrimary = ScanXBlack,
    onSecondary = ScanXOnDark,
    onTertiary = ScanXBlack,
    onBackground = ScanXOnDark,
    onSurface = ScanXOnDark,
)

/** Tema inicial de Compose (Material 3, siempre oscuro). Se ampliará en la Fase 2. */
@Composable
fun ScanXTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = ScanXDarkColorScheme,
        typography = ScanXTypography,
        content = content,
    )
}
