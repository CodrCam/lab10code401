# Stack, Queue, and PseudoQueue Implementation

The Stack, Queue, and PseudoQueue Implementation is a simple Java program that demonstrates the usage of Linked Lists as the underlying data storage mechanism for Stack and Queue data structures. The application contains three classes, `Stack`, `Queue`, and `PseudoQueue`, which implement the respective data structures and their associated operations.

## Application Overview

The application consists of the following main components:

1. `Node` class: Represents a node object with value and next properties for use in the Linked List.
2. `Stack` class: Implements a Stack data structure using a Linked List, with methods such as push, pop, peek, and isEmpty.
3. `Queue` class: Implements a Queue data structure using a Linked List, with methods such as enqueue, dequeue, peek, and isEmpty.
4. `PseudoQueue` class: Implements a Queue-like data structure using two Stack instances, with methods such as enqueue and dequeue. This class demonstrates the usage of two stacks to simulate the behavior of a queue.
5. `DataStructureTests` class: Contains JUnit Jupiter tests for validating the functionality of the Stack, Queue, and PseudoQueue classes.

## Getting Started

These instructions will help you get the project up and running on your local machine for development and testing purposes.

### Prerequisites

Make sure you have the following software installed:

- Java JDK 8 or later
- Gradle

### Installing

1. Clone the repository:

    ```
    git clone https://github.com/CodrCam/lab10code401.git
    cd lab10code401
    ```

2. Build the project:

   `$ gradle build`

## Running the Tests

To run the tests for the application, use the following command:

`$ gradle test`

The tests will validate the functionality of the Stack, Queue, and PseudoQueue classes, ensuring proper operation of push, pop, peek, and isEmpty methods for Stack, enqueue, dequeue, peek, and isEmpty methods for Queue, and enqueue and dequeue methods for PseudoQueue.

## Time Spent on coding problem

.2 hours on prep

.40 hours on the build

.6 hours total


## Built With

- [Java](https://www.oracle.com/java/) - The programming language used
- [Gradle](https://gradle.org/) - Build tool and dependency management
- [JUnit 5](https://junit.org/junit5/) - Testing framework for Java applications

## Authors

- Cameron Griffin - [CodrCam](https://github.com/CodrCam)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE) file for details.