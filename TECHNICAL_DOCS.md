# TECHNICAL_DOCS

## Identificadores (NO CAMBIAR)

- **applicationId / namespace:** `com.akyz.scanx`
- **Nombre visible:** `ScanX_ByAkyz` (`app/src/main/res/values/strings.xml` → `app_name`)
- Cambiar el `applicationId` crea una app distinta en el dispositivo (pierde datos y actualizaciones). Debe mantenerse en todas las fases.

## Herramientas y versiones

| Componente | Versión | Nota |
|---|---|---|
| Gradle (wrapper) | 8.11.1 | AGP 8.7.x exige ≥ 8.9 |
| Android Gradle Plugin | 8.7.3 | |
| Kotlin | 2.1.0 | Plugin `kotlin-compose` con la misma versión |
| KSP | 2.1.0-1.0.29 | Declarado; se aplicará con Room |
| JDK | 17 | `sourceCompatibility`/`jvmTarget` 17; CI usa Temurin 17 |
| compileSdk / targetSdk / minSdk | 35 / 35 / 26 | minSdk 26 permite iconos adaptativos sin variantes |

Versiones elegidas por ser estables y mutuamente compatibles; **no son necesariamente las más recientes**. Actualizarlas es una decisión de la Fase 8/9.

## Dependencias

**Activas (Fase 1):** core-ktx 1.15.0, lifecycle-runtime-ktx 2.8.7, activity-compose 1.9.3, navigation-compose 2.8.5, Compose BOM 2024.12.01 (ui, ui-graphics, ui-tooling-preview, material3; ui-tooling solo debug).

**Reservadas en el catálogo, no usadas aún:**

| Fase | Librería | Versión |
|---|---|---|
| 3 | CameraX (core, camera2, lifecycle, view) | 1.4.1 |
| 4 | ML Kit Text Recognition (`com.google.mlkit:text-recognition`) | 16.0.1 |
| 5 | ML Kit Barcode Scanning (`com.google.mlkit:barcode-scanning`) | 17.3.0 |
| 7 | Room (runtime, ktx, compiler vía KSP) | 2.6.1 |
| 5 | SoundPool | API de plataforma, sin dependencia |

## Arquitectura de paquetes (`com.akyz.scanx`)

| Paquete | Responsabilidad futura |
|---|---|
| `core` | Utilidades y constantes compartidas |
| `camera` | CameraX: vista previa, zoom |
| `scanner` | Coordinación del escaneo y área de escaneo |
| `ocr` | Motor de texto (ML Kit) |
| `barcode` | Motor QR/barras (ML Kit) |
| `history` | Lógica y UI del historial |
| `data` | Room, repositorios |
| `domain` | Modelos y casos de uso |
| `ui` | Tema y pantallas Compose (`ui/theme`, `ui/home`) |
| `navigation` | `ScanXNavHost` y rutas |

Los paquetes sin código contienen `.gitkeep`. Se ordenan por responsabilidad, no por capas estrictas; se podrán refinar al implementar cada fase.

## Permisos

- **Fase 1:** ninguno declarado en el manifest.
- **Fase 3:** `android.permission.CAMERA` (solicitud en tiempo de ejecución).
- **Nunca:** `VIBRATE` (el producto no usa vibración).
- ML Kit en modo empaquetado (no requiere Internet para OCR/barras); se decidirá en las fases 4 y 5. `INTERNET` solo si una función lo exige.

## CI (`.github/workflows/android-build.yml`)

- Disparadores: `workflow_dispatch` y push a `main`.
- Pasos: checkout → JDK 17 (Temurin) → aceptar licencias del SDK preinstalado → `gradle/actions/setup-gradle@v4` → `./gradlew assembleDebug` → subir `app/build/outputs/apk/debug/*.apk` como artefacto `ScanX_ByAkyz-debug-apk` (30 días).
- Sin secretos ni servicios de pago.
- Decisión: no se usa `android-actions/setup-android` (falló en el run 44327872822); el runner `ubuntu-latest` trae SDK y `sdkmanager`.
- Build `debug` sin firma de release. La firma se resolverá en la Fase 9.

## Decisiones

- Tema siempre oscuro desde el inicio (el diseño final será oscuro).
- `isMinifyEnabled = false` hasta la Fase 8/9.
- `RepositoriesMode.FAIL_ON_PROJECT_REPOS`: repositorios solo en `settings.gradle.kts`.
- `gradlew` en el repositorio con `gradle-wrapper.jar` versionado (excepción en `.gitignore`).
