# Clase Libro

La clase `Libro` representa un ejemplar fÃ­sico dentro del sistema de gestiÃ³n de la biblioteca. Su responsabilidad principal es almacenar los datos descriptivos del material (como su tÃ­tulo, ediciÃ³n, editorial y aÃ±o de publicaciÃ³n) y llevar un registro de su historial de prÃ©stamos. A travÃ©s de sus mÃ©todos, permite consultar fÃ¡cilmente si el libro estÃ¡ disponible o si actualmente se encuentra en poder de algÃºn socio.

### MÃ©todos principales

*   **`ultimoPrestamo()`**: 
    Retorna el Ãºltimo prÃ©stamo asociado al libro (un objeto de la clase `Prestamo`). Es Ãºtil para saber quiÃ©n tiene o tuvo el libro por Ãºltima vez.

*   **`prestado()`**: 
    Devuelve `true` (verdadero) si el libro se encuentra actualmente prestado a un socio, o `false` (falso) si estÃ¡ disponible en la biblioteca.

*   **`toString()`**: 
    Devuelve una representaciÃ³n en texto (String) del libro con el siguiente formato: `Titulo: <<titulo>>`
    *Ejemplo de salida:* `Titulo: JAVA. Como Programar`
