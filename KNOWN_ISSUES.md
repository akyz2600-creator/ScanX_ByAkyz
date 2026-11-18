# KNOWN_ISSUES

**Última actualización:** 2026-11-18

## Abiertos

| # | Tema | Detalle | Acción sugerida |
|---|---|---|---|
| 1 | APK no probado en dispositivo | El APK se compila y publica, pero no se ha instalado ni ejecutado en un teléfono. | Instalar y confirmar que abre (inicio de Fase 2). |
| 2 | Contenido del artefacto no inspeccionado | Se asume que el zip contiene `app-debug.apk`; solo se verificó el tamaño (9 405 113 bytes). | Confirmar al descargarlo. |
| 3 | Deprecación de acciones de GitHub | El log avisa que `actions/setup-java@v4` está obsoleta (migrar a v5) y que `checkout@v4`, `upload-artifact@v4`, `setup-gradle@v4` corren en Node 24 forzado. No rompe el build hoy. | Actualizar versiones y verificar con un run. |
| 4 | Compilación local imposible en el entorno de desarrollo de Claude | Sin Android SDK y con red bloqueada a `dl.google.com` y `services.gradle.org`. | Verificar siempre mediante GitHub Actions. |
| 5 | Versiones no necesariamente las últimas | Se priorizó estabilidad y compatibilidad verificada por el build. | Revisar en Fase 8/9. |
| 6 | Nombre del repositorio | Git responde que el repo "se movió" entre `scanx_byakyz` y `ScanX_ByAkyz` (mayúsculas). El push funciona. | Usar `ScanX_ByAkyz`. |

## Limitaciones de la Fase 1

- Pantalla provisional; sin funciones de escaneo.
- Icono y tema provisionales.
- Build solo `debug`; sin firma de release.

## Resueltos

- Run `44327872822` falló por `android-actions/setup-android` ("Failed to find package 'tools'"). Corregido en el commit "ci: usar Android SDK preinstalado…"; run `44328114550` exitoso.
