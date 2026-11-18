# CHANGELOG

## [0.1.0] — Fase 1: Estructura y configuración — 2026-11-18

### Añadido
- Proyecto Android (Kotlin, Jetpack Compose, Material 3) con Gradle Kotlin DSL y Gradle Wrapper 8.11.1.
- Version Catalog `gradle/libs.versions.toml` con dependencias activas y reservadas (CameraX, ML Kit, Room).
- Módulo `app` (`applicationId` `com.akyz.scanx`, minSdk 26, target/compile 35, JDK 17).
- `MainActivity`, tema Compose oscuro provisional, `ScanXNavHost` y `HomeScreen` provisional.
- Estructura de paquetes: `core, camera, scanner, ocr, barcode, history, data, ui, navigation, domain`.
- Icono adaptativo provisional y recursos base; nombre visible `ScanX_ByAkyz`.
- Workflow `Android Build` (manual y push a `main`) que genera y publica el APK debug.
- Documentación: README, PROJECT_STATUS, ROADMAP, CHANGELOG, TECHNICAL_DOCS, SESSION_LOG, KNOWN_ISSUES.

### Corregido
- Workflow: se eliminó `android-actions/setup-android` (fallaba con "Failed to find package 'tools'"); ahora se usa el SDK preinstalado del runner.

### No incluido (otras fases)
Cámara, OCR, QR/barras, historial, sonido, diseño cyberpunk final.
