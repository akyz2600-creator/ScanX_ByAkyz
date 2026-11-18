// Archivo raíz: solo declara plugins (sin aplicarlos). Las versiones viven en gradle/libs.versions.toml.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // Reservado para la fase de Room (historial). No se aplica todavía.
    alias(libs.plugins.ksp) apply false
}
