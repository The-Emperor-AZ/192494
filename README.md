
# 🧠 **Ejercicio 2: Control de Nómina**

- ¡No todos los datos vienen como los esperamos! Valida que el sueldo sea positivo, por si acaso hay un rebelde con sueldo negativo 😅
- Usa una variable tipo `double acumuladoSueldos`, y cuando imprimas, hazle un casting a `float` solo por estética.
- **Entre `$100 y $300`** incluye ambos extremos, no los dejes por fuera como si no importaran.
- Para separar en rangos, **los operadores `>=` y `<=` son tu espada y escudo.**
- Si te dan una lista de 10 sueldos y te piden saber cuántos están en cierto rango, **no necesitas un array — un contador bien ubicado es suficiente.**

Documentacion:
-se crea el scanner "input"  para pedirle al ususario qque ingrese los valores de la nomina de cada trabajador
- se crean las variables : int cantidadEmpleados, float sueldoEmpleado, float acumuladoSueldos
-se crea un if en el que se va a pedir que los sueldos deben estar en una rango de sueldoEmpleados >= 100 && 300 <= sueldoEmpleados
-con un for se procede a calcular el rango de la nomina
