# Descripción de la Clase `Socio`

La clase **`Socio`** es una clase **abstracta** (`<<abs>>`) que representa a un miembro de la biblioteca o sistema de préstamos. De ella heredan otras clases específicas (como se insinúa con las subclases `Docente` o `Estudiante` en el método `toString`).

## Atributos

La clase cuenta con los siguientes atributos privados:

*   **`dniSocio`** (`int`): Almacena el número de documento de identidad del socio.
*   **`nombre`** (`String`): Almacena el nombre y apellido del socio.
*   **`diasPrestamo`** (`int`): Indica la cantidad de días permitidos para el préstamo de un libro.

## Métodos

*   **`Socio(p_dniSocio: int, p_nombre: String, p_diasPrestamo: int)`**: 
    Constructor de la clase. Inicializa un nuevo objeto `Socio` con su DNI, nombre y los días de préstamo correspondientes.

*   **`cantLibrosPrestados() -> int`**: 
    Devuelve la cantidad de libros que actualmente están en poder del Socio.

*   **`toString() -> String`**: 
    Devuelve una representación en formato cadena (String) de los datos del socio. 
    *   *Formato:* `D.N.I.: <<dni>> || <<nombre y apellido>> ([Docente|Estudiante]) || Libros Prestados: <<cantidad>>`
    *   *Ejemplo:* `D.N.I.: 14524782 || Juan Perez (Docente) || Libros Prestados: 6`

*   **`puedePedir() -> boolean`**: 
    Devuelve `true` si el socio está habilitado para pedir un nuevo libro, es decir, si no tiene ningún préstamo vencido.

*   **`soyDeLaClase() -> String`** (`<<abs>>`): 
    Método **abstracto**. Su implementación se delega a las clases hijas (como Docente o Estudiante) para que devuelvan qué tipo específico de socio son.
