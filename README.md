# Conversor-de-Monedas-Challenge-Back-End-ONE


## Descripción

El **Conversor de Monedas** es una aplicación de consola desarrollada en Java que permite convertir cantidades entre diferentes monedas utilizando tasas de cambio predefinidas. Este proyecto es parte del desafío Back-End de Oracle Next Education (ONE) y tiene como objetivo demostrar el conocimiento en programación orientada a objetos y manejo de estructuras de datos.

## Características

- Conversión entre varias monedas, incluyendo USD, EUR, COP, GBP, JPY, AUD, CAD, y CHF.
- Interfaz de usuario en consola que permite realizar múltiples conversiones en una sola sesión.
- Tasas de cambio predefinidas que se pueden extender fácilmente.

## Requisitos

- JDK 8 o superior
- IDE de Java (opcional, pero recomendado)


 ## Uso

1. Ejecuta la clase principal `ConvertidorMoneda` que contiene el método `main`.
2. Sigue las instrucciones en la consola para ingresar la moneda de origen, la moneda de destino y la cantidad a convertir.
3. El programa te mostrará el resultado de la conversión.

## Estructura del Proyecto

- `Moneda`: Clase que representa una moneda con un código.
- `TasaCambio`: Clase que representa una tasa de cambio entre dos monedas.
- `ConvertidorMoneda`: Clase principal que maneja las conversiones de monedas y contiene el método `main` para la interacción con el usuario.
