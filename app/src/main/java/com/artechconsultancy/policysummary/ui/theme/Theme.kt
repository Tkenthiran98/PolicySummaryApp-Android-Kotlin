package com.artechconsultancy.policysummary.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = DarkBlue,
    secondary = LightRed,
    background = LightGray,
    surface = White,
    onPrimary = White,
    onSecondary = White,
    onBackground = DarkBlue,
    onSurface = DarkBlue
)

@Composable
fun PolicySummaryTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}