# Proyecto de Patrones de Diseño en Java

## Autores
- **Santiago Guerra Penagos**
- **Marco Antonio Alvarez Ramirez**

## Descripción del Proyecto
Este proyecto implementa el patrón de diseño Fábrica (**Factory Pattern**) en Java. 

### Clases Implementadas
#### `ShapeFactory`
La clase `ShapeFactory` implementa el patrón de diseño Fábrica. Contiene el método `create(ShapeType type)`, que devuelve una instancia de `Shape` basada en el tipo de forma solicitado. Utiliza una estructura `switch-case` para decidir qué instancia crear.

# Clases dadas por la guía del laboratorio
#### `Shape`
Esta es una interfaz que define el comportamiento común de todas las formas. 

#### `Hexagon`, `Pentagon`, `Quadrilateral`, `Triangle`
Son las clases concretas que implementan la interfaz `Shape`. 

- **`Hexagon`**: Implementa el método `getNumberOfEdges()`.
- **`Pentagon`**: Implementa el método `getNumberOfEdges()`.
- **`Quadrilateral`**: Implementa el método `getNumberOfEdges()`.
- **`Triangle`**: Implementa el método `getNumberOfEdges()`.

#### `ShapeType`
Es una enumeración que define los diferentes tipos de formas que la fábrica puede crear. Los valores en esta enumeración incluyen `HEXAGON`, `PENTAGON`, `QUADRILATERAL` y `TRIANGLE`.


