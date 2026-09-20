
# Logistics Application (Factory Method & Abstract Factory)

**Course:** Software Design Patterns (ShP-2216)  
**Academic Year:** 2026-2027  
**Institution:** Astana IT University  
**Language:** Java (JDK 17)  

## Description
This project is a console-based Java application that demonstrates the combined usage of two fundamental creational design patterns:
1. **Factory Method (Part A):** Manages dynamic transport selection (`Truck` for road delivery, `Ship` for sea delivery) via creator subclasses without tightly coupling client code to concrete implementations.
2. **Abstract Factory (Part B):** Manages platform-specific UI component families (`WindowsButton`/`WindowsCheckbox` and `MacOSButton`/`MacOSCheckbox`), ensuring that UI components are always created in matching pairs.

---

## Project Structure
```text
src/
└── kz/
    └── astana/
        └── logistics/
            ├── Main.java
            ├── app/
            │   └── DeliveryApplication.java
            ├── factorymethod/
            │   ├── Transport.java
            │   ├── Truck.java
            │   ├── Ship.java
            │   ├── Logistics.java
            │   ├── RoadLogistics.java
            │   └── SeaLogistics.java
            └── abstractfactory/
                ├── Button.java
                ├── Checkbox.java
                ├── WindowsButton.java
                ├── MacOSButton.java
                ├── WindowsCheckbox.java
                ├── MacOSCheckbox.java
                ├── GUIFactory.java
                ├── WindowsFactory.java
                └── MacOSFactory.java
Supported Inputs
Delivery modes: ROAD, SEA

UI platforms: WINDOWS, MACOS

How to Build and Run
Prerequisites
Java Development Kit (JDK 17 or higher)

Option 1: Command Line / Terminal
Open terminal and navigate to the src directory:

Bash
cd src
Compile the application:

Bash
javac kz/astana/logistics/Main.java
Run the application:

Bash
java kz.astana.logistics.Main
Option 2: Online Compilers / IDEs
Run Main.java directly in VS Code, IntelliJ IDEA, or an online compiler like OnlineGDB/Replit.

Sample Execution
Plaintext
Delivery mode (ROAD / SEA): ROAD
UI platform (WINDOWS / MACOS): WINDOWS

Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse
Error Handling
If an invalid delivery mode or UI platform is entered (e.g., AIR or LINUX), the application displays a clear error message and halts execution safely without producing partial output or crashing.
