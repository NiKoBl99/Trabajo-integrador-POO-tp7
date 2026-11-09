# Gestión de Biblioteca
# Trabajo Práctico Integrador - Programación Orientada a Objetos

**Universidad Nacional del Nordeste (UNNE)**
**Facultad de Ciencias Exactas y Naturales y Agrimensura (FaCENA)**
**Carrera:** Licenciatura en Sistemas de Información

---

## 👥 Equipo
- Fava, Gabriel
- Blanco, Nicolas Gustavo
- Cardozo Candia, Santiago
- Boilini, Festorazzi Uriel Irto
- Cabrera, Jorge Sebastian
- Alegre, Geronimo David

## 📋 Caso de Estudio
**Sistema de Gestión de Biblioteca:** Aplicación desarrollada en Java para la administración de préstamos de libros. Permite gestionar el catálogo de títulos y controlar los préstamos según el tipo de socio (Estudiantes y Docentes). Incluye validaciones de cupos, control de fechas de vencimiento, un sistema de recompensas con días de préstamo extra para docentes responsables, y generación de reportes estadísticos mediante colecciones genéricas.

## 📂 Estructura del Repositorio
El código fuente y su respectiva documentación están organizados en paquetes según el diagrama de clases:

```text
Gestión de Biblioteca/
├── <<Ejecutable>>GestionBiblioteca /
│   ├── ejecutable.java
│   └── ejecutable.md
├── <<abs>>Socio/
│   ├── Docente/
│   │   ├── Docente.java
│   │   └── Docente.md
│   ├── Estudiante/
│   │   ├── Estudiante.java
│   │   └── Estudiante.md
│   ├── Socio.java
│   └── Socio.md
├── Biblioteca/
│   ├── Biblioteca.java
│   └── Biblioteca.md
├── Libro no prestado/
│   ├── LibroNoPrestado.java
│   └── LibroNoPrestado.md
├── Libro/
│   ├── Libro.java
│   └── Libro.md
├── Prestamo/
│   ├── Prestamo.java
│   └── Prestamo.md
└── README.md
   ```

## 🛠️ Tecnologías Utilizadas

* **Lenguaje / IDE:** ☕ Java, 🔵 BlueJ
* **Gestión de Proyectos:** Trello ``` https://trello.com/invite/b/6aec7b40c0128ca41b58b42c/ATTI545c32a70edc9e69996d4bc00f3d44ebFE2C2063/integrador-poo ```
* **Documentación y Control de Versiones:** Markdown, Git & GitHub

## 🚀 Cómo Ejecutar el Proyecto

1. **Clonar el repositorio:** ``` bash git clone https://github.com/NiKoBl99/Trabajo-integrador-POO-tp7.git ```
2. Abrir el entorno BlueJ.**
3. Cargar el proyecto:** Selecciona `Project` -> `Open Project...` y elige la carpeta clonada.
4. Compilar** todas las clases.
5. Ejecutar** el método `main` (o instanciar) la clase principal `GestionBiblioteca` para visualizar los listados y reportes solicitados.
