# Clase Libro

La clase `Libro` representa un ejemplar físico dentro del sistema de gestión de la biblioteca. Su responsabilidad principal es almacenar los datos descriptivos del material (como su título, edición, editorial y año de publicación) y llevar un registro de su historial de préstamos. A través de sus métodos, permite consultar fácilmente si el libro está disponible o si actualmente se encuentra en poder de algún socio.

### MÃ©todos principales

*   **`ultimoPrestamo()`**: 
    Retorna el ultimo prestamo asociado al libro (un objeto de la clase `Prestamo`). Es util para saber quien tiene o tuvo el libro por ultima vez.

*   **`prestado()`**: 
    Devuelve `true` (verdadero) si el libro se encuentra actualmente prestado a un socio, o `false` (falso) si esta disponible en la biblioteca.

*   **`toString()`**: 
    Devuelve una representacion en texto (String) del libro con el siguiente formato: `Titulo: <<titulo>>`
    *Ejemplo de salida:* `Titulo: JAVA. Como Programar`
