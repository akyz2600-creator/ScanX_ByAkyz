# ScanX_ByAkyz

Aplicación Android nativa para escanear texto (OCR) y códigos QR / de barras con la cámara, con historial local y diseño cyberpunk.

> **Estado:** Fase 1 de 9 (estructura y configuración). La app solo muestra una pantalla provisional; **no hay cámara, OCR ni escáner todavía**. Ver [PROJECT_STATUS.md](PROJECT_STATUS.md).

## Objetivo

Una app rápida y llamativa que, desde la cámara, permita:

- OCR de texto.
- Lectura de códigos QR y de barras.
- Copiar resultados.
- Zoom de cámara y área de escaneo ajustable.
- Sonido de confirmación al detectar un código (sin vibración).
- Historial local.

Funciona offline en todo lo que lo permita; algunas operaciones o recursos podrán requerir Internet.

## Tecnologías

| Área | Tecnología |
|---|---|
| Lenguaje | Kotlin 2.1.0 |
| UI | Jetpack Compose + Material 3 |
| Build | Gradle 8.11.1 (Kotlin DSL) + Version Catalog (`gradle/libs.versions.toml`) |
| Android Gradle Plugin | 8.7.3 (compileSdk/targetSdk 35, minSdk 26) |
| JDK | 17 |
| Previstas | CameraX, ML Kit Text Recognition, ML Kit Barcode Scanning, Room, SoundPool |

- Nombre visible: **ScanX_ByAkyz**
- Identificador de aplicación (estable, no cambiar): `com.akyz.scanx`

## Compilar

- **Recomendado:** GitHub Actions (workflow `Android Build`), sin instalar nada. Ver abajo.
- **Local:** requiere JDK 17 y Android SDK 35; `./gradlew assembleDebug`. El APK queda en `app/build/outputs/apk/debug/`.

## Descargar el APK desde un teléfono Android

1. Abre el repositorio en el navegador del teléfono (o en la app de GitHub) e inicia sesión en GitHub (necesario para descargar artefactos).
2. Ve a la pestaña **Actions** y abre la última ejecución marcada con ✅ del workflow **Android Build**.
3. Al final de la página, en **Artifacts**, toca **ScanX_ByAkyz-debug-apk**. Se descarga un `.zip`.
4. Abre el `.zip` con tu app de archivos y extrae `app-debug.apk`.
5. Toca el APK para instalarlo. Si Android lo pide, permite **instalar apps desconocidas** para el navegador o gestor de archivos que estés usando.

Para generar un APK nuevo sin cambiar código: **Actions → Android Build → Run workflow**.

> Los artefactos se conservan 30 días.

## Documentación del proyecto

| Archivo | Contenido |
|---|---|
| [PROJECT_STATUS.md](PROJECT_STATUS.md) | Fase actual, avances comprobados, pendientes |
| [ROADMAP.md](ROADMAP.md) | Las 9 fases |
| [TECHNICAL_DOCS.md](TECHNICAL_DOCS.md) | Arquitectura, dependencias, decisiones |
| [CHANGELOG.md](CHANGELOG.md) | Cambios por fase |
| [SESSION_LOG.md](SESSION_LOG.md) | Registro de sesiones para continuar desde otra conversación |
| [KNOWN_ISSUES.md](KNOWN_ISSUES.md) | Errores y limitaciones conocidos |
