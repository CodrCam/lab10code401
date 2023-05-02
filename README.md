# Stack, Queue, PseudoQueue, and AnimalShelter Implementation

The Stack, Queue, PseudoQueue, and AnimalShelter Implementation is a simple Java program that demonstrates the usage of Linked Lists as the underlying data storage mechanism for Stack, Queue, and PseudoQueue data structures, as well as a specific use case with an AnimalShelter class. The application contains several classes, which implement the respective data structures and their associated operations.

## Application Overview

The application consists of the following main components:

1. `Node` class: Represents a node object with value and next properties for use in the Linked List.
2. `Stack` class: Implements a Stack data structure using a Linked List, with methods such as push, pop, peek, and isEmpty.
3. `Queue` class: Implements a Queue data structure using a Linked List, with methods such as enqueue, dequeue, peek, and isEmpty.
4. `PseudoQueue` class: Implements a Queue-like data structure using two Stack instances, with methods such as enqueue and dequeue. This class demonstrates the usage of two stacks to simulate the behavior of a queue.
5. `AnimalShelter` class: Implements an AnimalShelter that holds dogs and cats, with methods such as enqueue and dequeue based on a first-in, first-out approach.
6. `DataStructureTests` class: Contains JUnit Jupiter tests for validating the functionality of the Stack, Queue, PseudoQueue, and AnimalShelter classes.

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

The tests will validate the functionality of the Stack, Queue, PseudoQueue, and AnimalShelter classes, ensuring proper operation of push, pop, peek, and isEmpty methods for Stack, enqueue, dequeue, peek, and isEmpty methods for Queue, enqueue and dequeue methods for PseudoQueue, and enqueue and dequeue methods for AnimalShelter.

## Time Spent on coding problem

.25 hours on prep

.80 hours on the build

1.05 hours total

## Built With

- [Java](https://www.oracle.com/java/) - The programming language used
- [Gradle](https://gradle.org/) - Build tool and dependency management
- [JUnit 5](https://junit.org/junit5/) - Testing framework for Java applications

## Authors

- Cameron Griffin - [CodrCam](https://github.com/CodrCam)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE) file for details.
