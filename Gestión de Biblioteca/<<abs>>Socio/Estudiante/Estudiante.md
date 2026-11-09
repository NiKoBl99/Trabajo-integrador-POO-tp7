# Clase `Estudiante`

La clase `Estudiante` también hereda de la clase abstracta `Socio`, representando a los alumnos que utilizan los servicios de la biblioteca. Tiene restricciones más estrictas a la hora de pedir libros.

## Atributos Específicos
*   **carrera**: La carrera universitaria que el estudiante está cursando (texto).

## Responsabilidades Claves (Métodos)
*   **`puedePedir()`**: Sobrescribe el comportamiento base. Para que un estudiante pueda pedir un libro, no solo debe no tener préstamos vencidos, sino que además **no puede tener más de 3 libros** prestados en su poder simultáneamente.
*   **`soyDeLaClase()`**: Implementa el método abstracto de la clase padre devolviendo el texto `"Estudiante"`.
