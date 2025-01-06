public class OperatorExamples {

    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        if (b != 0) {
            System.out.println("a / b = " + (a / b)); // Division (safe check)
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational (Comparison) Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // 4. Bitwise Operators
        int num1 = 5, num2 = 3; // binary: 0101 and 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("num1 & num2: " + (num1 & num2));  // Bitwise AND
        System.out.println("num1 | num2: " + (num1 | num2));  // Bitwise OR
        System.out.println("num1 ^ num2: " + (num1 ^ num2));  // Bitwise XOR
        System.out.println("~num1: " + (~num1));  // Bitwise NOT
        System.out.println("num1 << 1: " + (num1 << 1));  // Left shift
        System.out.println("num1 >> 1: " + (num1 >> 1));  // Right shift
        System.out.println("num1 >>> 1: " + (num1 >>> 1));  // Unsigned right shift

        // 5. Assignment Operators
        int result = 20;
        result += 5; // result = result + 5
        System.out.println("\nAssignment Operators:");
        System.out.println("result += 5: " + result);
        result -= 5; // result = result - 5
        System.out.println("result -= 5: " + result);
        result *= 2; // result = result * 2
        System.out.println("result *= 2: " + result);
        result /= 4; // result = result / 4
        System.out.println("result /= 4: " + result);
        result %= 3; // result = result % 3
        System.out.println("result %= 3: " + result);

        // 6. Unary Operators
        int num = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("++num: " + (++num)); // Pre-increment
        System.out.println("num++: " + (num++)); // Post-increment
        System.out.println("num after num++: " + num);
        System.out.println("--num: " + (--num)); // Pre-decrement
        System.out.println("num--: " + (num--)); // Post-decrement
        System.out.println("num after num--: " + num);

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b; // max = a if a > b, else b
        System.out.println("The max between a and b is: " + max);

        // 8. Instanceof Operator
        System.out.println("\nInstanceof Operator:");
        Object obj = new Person("Alice", 30);
        System.out.println("obj instanceof Person: " + (obj instanceof Person));  // true
        System.out.println("obj instanceof String: " + (obj instanceof String));  // false

        // 9. Type Cast Operator
        double pi = 3.14159;
        int piInt = (int) pi;  // Explicit casting
        System.out.println("\nType Cast Operator:");
        System.out.println("Pi as integer: " + piInt);

        // 10. Lambda Operator (Java 8+)
        System.out.println("\nLambda Operator:");
        MyFunction sum = (x1, y1) -> x1 + y1; // Lambda expression
        System.out.println("Sum of 3 and 4 using lambda: " + sum.apply(3, 4));

        // 11. New (Object Creation Operator)
        System.out.println("\nNew Operator:");
        Person person = new Person("John", 25); // Creating new object
        System.out.println("Person name: " + person.name + ", Age: " + person.age);

        // 12. Method Reference Operator (Java 8+)
        System.out.println("\nMethod Reference Operator:");
        MyFunction printName = Person::printPersonName; // Method reference
        printName.apply(person);
    }
}

// Functional Interface for lambda and method reference examples
@FunctionalInterface
interface MyFunction {
    int apply(int x, int y);
}

// A simple class for demonstrating 'new' and method reference operator
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void printPersonName(Person person) {
        System.out.println("Person's name: " + person.name);
    }
}
