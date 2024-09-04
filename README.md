# Inheritance and Polymorphism Example: Candle and ScentedCandle

## Overview

This repository showcases a Java program demonstrating inheritance and polymorphism through the modeling of candles. 
The program includes a base class `Candle` and a derived class `ScentedCandle`, illustrating how inheritance allows for code reuse and extension of functionality.

## Features

- **`Candle` Class**: Represents a basic candle with properties such as color, height, and price.
- **`ScentedCandle` Class**: Inherits from `Candle` and adds the scent property, demonstrating polymorphism and method overriding.
- **Polymorphism**: Demonstrates the use of polymorphism by extending the base class and overriding methods.

## Classes

### `Candle` Class

- **Attributes**:
  - `color`: The color of the candle.
  - `height`: The height of the candle in inches.
  - `price`: The price of the candle, calculated as `2 * height`.

- **Constructor**: Initializes the candle's color, height, and calculates the price.

- **Methods**:
  - `getColor()`: Returns the color of the candle.
  - `setColor(String color)`: Sets the color of the candle.
  - `getHeight()`: Returns the height of the candle.
  - `setHeight(double height)`: Sets the height of the candle and updates the price.
  - `getPrice()`: Returns the price of the candle.

### `ScentedCandle` Class (Inherits from `Candle`)

- **Attributes**:
  - `scent`: The scent of the scented candle.

- **Constructor**: Initializes the scented candle with color, height, and scent. Calls the constructor of the `Candle` class to set color and height.

- **Methods**:
  - `getScent()`: Returns the scent of the scented candle.
  - `setScent(String scent)`: Sets the scent of the scented candle.
  - `setHeight(double height)`: Overrides the `setHeight` method to update the price based on a different formula (`3 * height`).

### `Inheritance1` Class

- **Purpose**: Demonstrates the use of the `Candle` and `ScentedCandle` classes. Creates instances of both classes and displays their details.

## How It Works

1. **Inheritance**: The `ScentedCandle` class inherits from the `Candle` class, gaining its properties and methods while extending functionality with a new `scent` attribute.

2. **Method Overriding**: The `ScentedCandle` class overrides the `setHeight` method to provide a different pricing formula,
   illustrating polymorphism where a subclass modifies the behavior of an inherited method.

4. **Polymorphism**: While the `ScentedCandle` is a specialized type of `Candle`, it can still be treated as a `Candle` due to inheritance.
   This allows for flexible code that can operate on different types of candles using a common interface.

   Notes
Inheritance: Allows for code reuse and extension. The ScentedCandle class inherits from Candle, demonstrating how subclasses can build on top of existing classes.
Polymorphism: Demonstrated through method overriding and the ability to use a subclass in place of its superclass.
