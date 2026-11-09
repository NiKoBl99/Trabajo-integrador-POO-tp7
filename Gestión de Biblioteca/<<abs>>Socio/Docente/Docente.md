# Clase `Docente`

La clase `Docente` hereda de la clase abstracta `Socio` y representa a un profesor registrado en la biblioteca. Tiene beneficios y comportamientos específicos que lo diferencian de un estudiante.

## Atributos Específicos
*   **area**: Área o departamento académico al que pertenece el docente (texto).

## Responsabilidades Claves (Métodos)
*   **`esResponsable()`**: Verifica el historial del docente. Devuelve `true` si el docente nunca ha tenido un préstamo vencido.
*   **`cambiarDiasDePrestamo(int)`**: Permite adicionar días extra al límite de préstamo del docente como un premio a su responsabilidad.
*   **`puedePedir()`**: Determina si puede solicitar un libro.
*   **`soyDeLaClase()`**: Implementa el método abstracto de la clase padre devolviendo el texto `"Docente"`.
