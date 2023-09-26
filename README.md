# Ch. 10 Notes -- Ch9 is included in PolymorphHW repo README.md


# Numbers and Static Members in Java

how to work with numbers (primitive data types) and static members (variables and methods) in Java.

## Numbers in Java

Java provides several primitive data types to work with numbers. These include:

1. **byte**: A 1-byte integer.
2. **short**: A 2-byte integer.
3. **int**: A 4-byte integer (most commonly used).
4. **long**: An 8-byte integer.
5. **float**: A 4-byte floating-point number.
6. **double**: An 8-byte floating-point number.

### Variable Declarations

To declare a variable to hold a number, you can use the following syntax:

1. int age = 25;
2. double price = 19.99;


### Arithmetic Operations

Java supports basic arithmetic operations on numbers, including addition, subtraction, multiplication, division, and modulus (remainder).


1. int sum = a + b;
2. int difference = a - b;
3. int product = a * b;
4. int quotient = a / b;
5. int remainder = a % b;


### Type Casting

When working with different data types, you may need to perform typecasting. For example:


1. double x = 5.5;
2. int y = (int) x; // Casting double to int (y becomes 5)


## Static Members in Java

In Java, `static` members (variables and methods) belong to the class itself rather than to instances of the class. They are shared across all instances of the class.

### Static Variables

Static variables are shared among all instances of a class. They are declared using the `static` keyword.


1. public class MyClass {
2.   static int count = 0; // Static variable
3. }


To access a static variable, you don't need to create an instance of the class:


1. int currentCount = MyClass.count;


### Static Methods

Static methods belong to the class and can be called without creating an instance of the class. They are declared using the `static` keyword.


1. public class MathUtils {
2.   public static int add(int a, int b) {
3.    return a + b;
4.  }
5. }


You can call a static method using the class name:


1. int result = MathUtils.add(5, 3);


### When to Use Static Members

Use static members when you want to share data or functionality across all instances of a class. Common use cases include utility methods and constants.


