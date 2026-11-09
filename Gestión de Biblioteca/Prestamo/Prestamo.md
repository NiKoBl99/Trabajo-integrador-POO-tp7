# Clase `Prestamo`

La clase `Prestamo` representa la transacción o el vínculo físico temporal entre un `Socio` y un `Libro`. Es la encargada de gestionar los tiempos y estados de las devoluciones.

## Relaciones
*   Conoce exactamente a un **Socio** (quien retira el libro).
*   Conoce exactamente a un **Libro** (el ítem prestado).

## Atributos Principales
*   **fechaRetiro**: La fecha exacta en la que se entregó el libro (`Calendar`).
*   **fechaDevolucion**: La fecha en la que el libro fue efectivamente devuelto (puede ser nula o vacía si aún está en poder del socio).

## Responsabilidades Claves (Métodos)
*   **`registrarFechaDevolucion(Calendar)`**: Actualiza el registro indicando cuándo se devolvió el libro.
*   **`vencido(Calendar)`**: Compara una fecha dada (generalmente la actual) contra la fecha de vencimiento teórica (que se calcula sumando la `fechaRetiro` y los `diasPrestamo` del socio). Devuelve `true` si el préstamo está atrasado.
*   **`toString()`**: Devuelve un resumen del préstamo mostrando las fechas, el título del libro y el nombre del socio.
