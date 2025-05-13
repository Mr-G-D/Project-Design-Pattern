# 🎯 Java Design Patterns Showcase

This repository demonstrates key **Software Design Patterns** in Java, grouped by category:

- **Creational**
- **Structural**
- **Behavioral**

Each pattern is implemented as an **individual, self-contained project** with minimal code and maximum clarity — designed for both learning and reference.

---

## 📁 Project Structure

```plaintext
design-patterns-java/
├── creational/
│   ├── singleton/
│   │   └── LoggerModule.java
│   ├── builder/
│   │   └── UserModule.java
│   └── abstract-factory/
│       └── UIGenerator.java
├── structural/
│   ├── facade/
│   │   └── HomeTheaterSystem.java
│   └── adapter/
│       └── MusicPlayer.java
└── behavioral/
    ├── strategy/
    │   └── NavigatorModule.java
    └── observer/
        └── WeatherApplication.java
```
---

## 🧱 Creational Patterns

### 🔹 Singleton
Ensures a class has **only one instance** and provides a global point of access to it.

✅ Key Concepts:
- Private constructor
- Static instance
- Thread-safe (with double-checked locking)

### 🔹 Builder
Builds complex objects **step-by-step** without using telescoping constructors.

✅ Key Concepts:
- Immutable object creation
- Chainable setter methods
- `build()` method

### 🔹 Abstract Factory
Creates **families of related objects** without specifying concrete classes.

✅ Key Concepts:
- Factory of factories
- Consistency across product families (e.g., Mac UI vs Windows UI)

---

## 🧩 Structural Patterns

### 🔹 Facade
Provides a **simplified interface** to a complex subsystem.

✅ Key Concepts:
- Hides complexity
- Single entry point
- Ideal for APIs and libraries

### 🔹 Adapter
Allows **incompatible interfaces** to work together.

✅ Key Concepts:
- Converts one interface to another
- Useful for integrating legacy code

---

## 🔁 Behavioral Patterns

### 🔹 Strategy
Defines a family of algorithms, encapsulates each one, and makes them **interchangeable** at runtime.

✅ Key Concepts:
- Interface-based design
- Replace logic at runtime
- Promotes flexibility

### 🔹 Observer
Defines a **one-to-many dependency** between objects — when one changes, all dependents are notified.

✅ Key Concepts:
- Publisher-subscriber model
- Real-time notifications
- Loosely coupled components

---

## 🚀 How to Run

Each pattern resides in its own folder with a dedicated `Main.java`. You can:

1. Open the folder in your IDE (e.g., IntelliJ, Eclipse)
2. Run `Main.java`
3. Observe the output in the console

---

## 🛠 Technologies Used

- Java 17 (or compatible version)
- No external dependencies
- IDE-agnostic folder structure

---

## 📚 Resources for Further Learning

- [Refactoring.Guru](https://refactoring.guru/design-patterns)
- *Design Patterns: Elements of Reusable Object-Oriented Software* (GoF)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)

---

## 🤝 Contributing

Feel free to fork, modify, and submit pull requests. If you have ideas for additional patterns or examples, contributions are welcome!

---

## 📄 License

This project is licensed under the MIT License.

---

## 📌 Author

**Dinesh Kumar Gopinathan**  

---

> ⭐ If this helped you understand design patterns better, consider giving it a star!
