# Simulador con Variables Aleatorias 🎲

Este proyecto es un simulador que genera y calcula valores aleatorios para diferentes productos, incluyendo su cantidad, precio, y el impuesto correspondiente. La aplicación está desarrollada en Java y demuestra conceptos de programación orientada a objetos y manipulación de datos aleatorios.

## Funcionalidades 🚀

- **Generación aleatoria de cantidades y precios** para un conjunto de productos.
- **Cálculo del total** sin impuestos.
- **Aplicación de impuestos** basados en el total calculado.
- **Visualización de detalles** de productos, cantidades, precios, subtotal, impuesto y total con impuesto.

## Tecnologías Utilizadas 🛠️

- [Java](https://www.java.com/)

## Clase Principal: `opesimula` 📄

La clase `opesimula` contiene los siguientes métodos:

- **Constructores:**
  - `public opesimula()`: Constructor por defecto.

- **Métodos de Acceso:**
  - `public float getImpuesto()`: Obtiene el valor del impuesto.
  - `public void setImpuesto(float impuesto)`: Establece el valor del impuesto.

- **Métodos Funcionales:**
  - `public int variable_ale()`: Genera un número entero aleatorio entre 1 y 10.
  - `public void cantidad()`: Asigna cantidades aleatorias a los productos.
  - `public float valor()`: Genera un valor de precio aleatorio entre 5.000 y 50.000.
  - `public void llenar()`: Llena el array de precios con valores aleatorios.
  - `public float total()`: Calcula el total del valor de los productos sin impuestos.
  - `public float porcentaje(int por, float tol)`: Calcula el porcentaje dado un valor total.
  - `public float impu()`: Calcula el impuesto basado en el total.
  - `public float totalcon_impuesto()`: Calcula el total incluyendo el impuesto.
  - `public void mostrar()`: Muestra los detalles de los productos, cantidades, precios, subtotal, impuesto y total con impuesto.

## Instalación y Ejecución ⚙️

1. **Clonar el repositorio:**

   ```sh
   git clone https://github.com/rafapcjs/Simulador-con-Variable-Aleatorias.git
