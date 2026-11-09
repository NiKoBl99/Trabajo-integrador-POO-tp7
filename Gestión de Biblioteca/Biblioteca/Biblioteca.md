
# Clase `Biblioteca`

La clase `Biblioteca` es la clase administradora principal (fachada o gestor) del sistema. Centraliza todas las colecciones y coordina las acciones entre socios, libros y préstamos.

## Colecciones y Atributos
*   **nombre**: Nombre de la institución (texto).
*   **socios**: Lista de todos los socios registrados (Docentes y Estudiantes).
*   **libros**: Lista del catálogo de libros disponibles.

## Responsabilidades Claves (Métodos)
*   **Gestión de Catálogo e Inventario**: Permite registrar nuevos libros (`nuevoLibro`) e imprimir listados (`listaDeLibros`, `listaDeTitulos`).
*   **Gestión de Usuarios**: Permite registrar nuevos estudiantes y docentes (`nuevoSocioEstudiante`, `nuevoSocioDocente`), buscarlos por DNI (`buscarSocio`), y listar la base de usuarios.
*   **Operaciones de Préstamo**: Coordina la entrega (`prestarLibro`) y recepción (`devolverLibro`) de material.
*   **Reportes y Consultas**: Provee información general, como la cantidad de socios de un tipo específico (`cantidadDeSociosPorTipo`), listar préstamos atrasados (`prestamosVencidos`), identificar a los docentes responsables (`docentesResponsables`) y saber quién tiene un libro en particular (`quienTieneElLibro`).
