# ROADMAP

| # | Fase | Estado |
|---|---|---|
| 1 | Estructura y configuración | ✅ Completada (2026-11-18) |
| 2 | Diseño cyberpunk e identidad visual | ⏳ Pendiente |
| 3 | Sistema de cámara | ⏳ Pendiente |
| 4 | Motor OCR | ⏳ Pendiente |
| 5 | Lector QR y códigos de barras | ⏳ Pendiente |
| 6 | Controles avanzados del escáner | ⏳ Pendiente |
| 7 | Historial y herramientas | ⏳ Pendiente |
| 8 | Pruebas y optimización | ⏳ Pendiente |
| 9 | Compilación y entrega | ⏳ Pendiente |

## Detalle previsto

1. **Estructura y configuración:** Gradle, dependencias, paquetes, CI, documentación.
2. **Diseño cyberpunk e identidad visual:** paleta negro/cian/violeta/magenta, tipografía, componentes, icono definitivo.
3. **Sistema de cámara:** CameraX, vista previa, permiso `CAMERA`.
4. **Motor OCR:** ML Kit Text Recognition (offline).
5. **Lector QR y códigos de barras:** ML Kit Barcode Scanning; sonido de confirmación con SoundPool.
6. **Controles avanzados del escáner:** zoom, área de escaneo ajustable, copiado de resultados.
7. **Historial y herramientas:** Room, historial local.
8. **Pruebas y optimización:** pruebas, rendimiento, revisión de permisos y R8.
9. **Compilación y entrega:** build final, firma, APK de entrega.

## Reglas transversales

- Sin vibración: el sonido es la única confirmación.
- Offline siempre que sea posible.
- No cambiar el `applicationId` (`com.akyz.scanx`).
