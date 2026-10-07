# Overview

As a software engineer, I am expanding my skills by learning Java, one of the most widely used object-oriented languages in the industry, especially for enterprise and backend development. My goal was to understand how Java handles classes, inheritance, and its standard collections, and to get comfortable with the compile-and-run workflow using the JDK. I chose a topic I understand well — an inventory management system — so I could focus my energy on learning the language rather than the problem domain.

This software is a command-line inventory management system that lets a user manage a store's product catalog. It can add products, search for them by ID, update stock levels, handle errors, and calculate the total value of the inventory. It uses an abstract base class with two concrete subclasses to represent different kinds of products.

My purpose for writing this software was to learn Java's object-oriented features hands-on, especially inheritance with abstract classes, and to practice using the Java Collection Framework — skills that are essential for professional Java development.

[Software Demo Video](http://youtube.link.goes.here)

# Development Environment

I developed this software using Visual Studio Code with the Extension Pack for Java. I compiled the code with the Java compiler (javac) and ran it with the Java runtime (java) from the terminal.

The programming language is Java, running on the Eclipse Temurin JDK (version 25 LTS). I used the standard Java Collection Framework (specifically HashMap from java.util) to store and manage the product catalog. No external libraries were needed.

# Useful Websites

* [Java Platform, Standard Edition Documentation](https://docs.oracle.com/en/java/javase/)
* [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
* [W3Schools Java Tutorial](https://www.w3schools.com/java/)
* [Eclipse Temurin (Adoptium) JDK](https://adoptium.net/)

# Future Work

* Add an interactive menu so the user can add, search, and update products in real time instead of using predefined items.
* Add persistence by reading and writing the inventory to a file so data is not lost when the program closes.
* Add more product subclasses (for example, perishable products with an expiration date).
* Add more validation and a search by product name, not just by ID.