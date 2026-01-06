
```md
# 🍔 Food Delivery System – Low Level Design (Java)

This repository contains a **Low-Level Design (LLD) implementation of a Food Delivery System** built using **Java**.  
The project focuses on **clean architecture, extensibility, and correct application of object-oriented design principles**.

---

## 📌 Problem Overview

Design a food delivery system that supports:
- Multiple restaurants with independent menus
- Order customization with add-ons
- Flexible pricing based on customer type
- Automatic notifications on order lifecycle changes

The system is designed to be **easy to extend and maintain**, similar to real-world backend systems.

---

## 🧩 Core Features

### 🍴 Restaurant & Menu Management
- Supports multiple restaurants (e.g., KFC, McDonald’s)
- Each restaurant maintains its own menu
- Restaurants and menus are created using centralized creation logic

### 🛒 Order Creation & Customization
- Orders can contain multiple items with quantities
- Menu items can be dynamically customized with add-ons such as:
  - Cheese
  - Coke
- Add-ons are applied at runtime without modifying existing item classes

### 💰 Flexible Pricing
- Pricing logic is completely decoupled from order creation
- Supports:
  - Regular customers
  - Premium customers
- New pricing rules can be added without changing core order logic

### 🔔 Order Lifecycle & Notifications
- Order lifecycle states:
  - CREATED
  - PAID
  - PREPARED
  - DELIVERED
- Email and SMS notifications are triggered automatically on each status change
- Notification logic is independent of order processing

---

## 🏗️ Design Patterns Used

- **Factory Pattern** – Restaurant and menu creation
- **Builder Pattern** – Step-by-step construction of complex objects
- **Decorator Pattern** – Dynamic food add-ons
- **Strategy Pattern** – Flexible pricing logic
- **Observer Pattern** – Order status notifications

---

## 📐 UML Diagram

A clean UML class diagram is included to show:
- Core domain relationships
- Interaction between design patterns
- Order lifecycle flow

(Refer to the UML image in the repository)

---

## 🗂️ Project Structure

```

src/main/java/com/yoshitha/lld/fooddelivery
│
├── creational
│   ├── builder
│   └── factory
│
├── decorator
│
├── domain
│
├── observer
│
├── service
│
├── strategy
│
└── Main.java

````

Each package follows **single-responsibility principles** for clarity and maintainability.

---

## ▶️ How to Run

1. Clone the repository  
   ```bash
   git clone <repository-url>
````

2. Open the project in IntelliJ IDEA
3. Run `Main.java`
4. Follow the console prompts to:

   * Select a restaurant
   * Choose menu items
   * Add custom add-ons
   * Select customer type
   * Observe order notifications

---

## 🎯 Learning Outcomes

* Gained strong confidence in Low-Level Design
* Learned how multiple design patterns work together
* Improved understanding of clean object composition
* Debugged real OOP issues (decorator wrapping, object ownership)

---

## 🚀 Future Enhancements

* Support multiple orders per customer
* Add payment gateway abstraction
* Persist orders using a database
* Expose REST APIs on top of the domain layer

---

## 👤 Author

**Yoshitha**
Java | Backend Engineering | Low-Level Design

```

Just tell me 👍
```
