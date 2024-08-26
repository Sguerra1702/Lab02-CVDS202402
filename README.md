# Proyecto de Patrones de Diseño en Java

## Autores
- **Santiago Guerra Penagos**
- **Marco Antonio Alvarez Ramirez**

## Descripción del Proyecto
Este proyecto implementa el patrón de diseño Fábrica (**Factory Pattern**) en Java. 

### Clases Implementadas
#### `ShapeFactory`
La clase `ShapeFactory` implementa el patrón de diseño Fábrica. Contiene el método `createShape(ShapeType type)`, que devuelve una instancia de `Shape` basada en el tipo de forma solicitado. Utiliza una estructura `switch-case` para decidir qué instancia crear.

# Clases dadas por la guía del laboratorio
#### `Shape`
Esta es una interfaz que define el comportamiento común de todas las formas. Contiene el método `draw()` que debe ser implementado por todas las clases concretas que representen una forma.

#### `Circle`, `Square`, `Triangle`
Son las clases concretas que implementan la interfaz `Shape`. Cada una de estas clases proporciona una implementación específica del método `draw()` para dibujar la forma correspondiente.

- **`Circle`**: Implementa el método `draw()` para dibujar un círculo.
- **`Square`**: Implementa el método `draw()` para dibujar un cuadrado.
- **`Triangle`**: Implementa el método `draw()` para dibujar un triángulo.

#### `ShapeType`
Es una enumeración que define los diferentes tipos de formas que la fábrica puede crear. Los valores en esta enumeración incluyen `CIRCLE`, `SQUARE` y `TRIANGLE`.


