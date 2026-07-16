# Java Project-Based Learning Roadmap
### 70 Projects, 7 Stages — Beginner to Advanced

Work through each stage roughly in order. Don't rush — the goal is depth, not speed. After finishing a stage, pick one earlier project and **refactor it** using what you just learned (e.g., rebuild your Stage 1 calculator using OOP once you hit Stage 2).

---

## Stage 1: Fundamentals
**Concepts:** variables, data types, operators, loops, conditionals, arrays, methods, `Scanner`, basic debugging

1. Number Guessing Game — loops, `Random`, conditionals - DONE✔️
2. Simple Calculator (console) — methods, `switch`, input validation - DONE✔️
3. Temperature Converter (C/F/K) — functions, formatted output - DONE✔️
4. Tic-Tac-Toe (2-player, console) — 2D arrays, win-condition logic - DONE✔️
5. Rock-Paper-Scissors (vs computer) — randomness, loops, score tracking - DONE✔️
6. Password Strength Checker — string manipulation, conditionals - DONE✔️
7. Palindrome & Anagram Checker — string/array manipulation - DONE✔️
8. Simple ATM Simulator (single account, no classes yet) — control flow, basic validation - 
9. Multiplication Table Generator — nested loops
10. Basic Unit Converter (length/weight/currency using fixed rates) — methods, arrays/maps of conversion factors

**Goal:** total comfort with syntax, loops, arrays, and breaking logic into methods before touching OOP.

---

## Stage 2: OOP Basics
**Concepts:** classes, objects, constructors, encapsulation, getters/setters, `ArrayList`, basic file I/O

1. Library Management System (console) — `Book`, `Member`, `Library` classes
2. Bank Account Simulator — multiple accounts, deposit/withdraw, transaction history
3. Student Grade Management System — objects, `ArrayList`, sorting, save/load to text file
4. Contact Book (add/search/delete contacts) — CRUD with objects, `ArrayList`
5. Simple Inventory Tracker (single store) — objects, stock updates, low-stock alerts
6. Movie Ticket Booking (console) — seat objects, booking logic, availability tracking
7. Employee Payroll Calculator — class per employee, salary computation logic
8. Personal Diary/Journal App — file I/O, date stamping, `ArrayList` of entries
9. Simple Quiz App (console, hardcoded questions) — objects for `Question`, score tracking
10. Recipe Book App — classes for `Recipe`/`Ingredient`, search by ingredient

**Goal:** think in terms of objects and responsibilities — not just procedures.

---

## Stage 3: OOP Deep Dive
**Concepts:** inheritance, polymorphism, abstract classes, interfaces, custom exceptions

1. Employee Management System — `Employee` → `Manager`, `Developer` hierarchy
2. Shape Area/Perimeter Calculator — `Shape` interface → `Circle`, `Rectangle`, `Triangle`
3. Vehicle Rental System — interfaces, composition, custom exceptions (e.g., `VehicleNotAvailableException`)
4. Zoo/Animal Simulation — abstract `Animal` class, polymorphic `makeSound()`/`move()`
5. Shape-based Drawing App (console output of ASCII shapes) — polymorphism in action
6. Payroll System with Employee Types (Full-time, Part-time, Contractor) — abstract classes, method overriding
7. Banking System with Account Types (Savings, Checking, Fixed Deposit) — inheritance, interest calculation overrides
8. Media Player Simulation (Audio, Video files) — interfaces (`Playable`), polymorphism
9. Restaurant Ordering System (Menu items as subclasses of `MenuItem`) — inheritance, abstract pricing logic
10. Custom Exception Playground — a small app (e.g., age/grade validator) built specifically to practice creating and throwing custom exceptions

**Goal:** deeply internalize inheritance vs. composition, and when to use interfaces vs. abstract classes.

---

## Stage 4: Intermediate — Collections, Exceptions, File I/O
**Concepts:** `HashMap`, `Set`, `List` in depth, exception handling, file persistence (text/CSV/JSON), basic multithreading intro

1. To-Do List App with File Persistence — save/load tasks to a file, `ArrayList`
2. Contact Book v2 (with file storage + search/sort) — `HashMap`, file I/O
3. Inventory Management System (multi-category) — `HashMap<String, List<Item>>`, exception handling
4. Expense Tracker (CSV import/export) — file parsing, collections, basic statistics
5. Word Frequency Counter (reads a text file) — `HashMap`, file reading, sorting by frequency
6. Simple Spell Checker (dictionary file lookup) — `Set`, file I/O
7. Student Result Processing System — reads student data from file, computes grades/ranks
8. Simple Chat Logger (two threads simulating chat, writing to file) — intro threading, file I/O
9. File Organizer Tool (sorts files in a folder by type/extension) — `java.io.File`, file manipulation
10. JSON-based Config Manager (read/write app settings using a JSON library like Gson) — external libraries, serialization

**Goal:** comfortable manipulating real data — reading, writing, transforming, and handling failures gracefully.

---

## Stage 5: GUI + Database Integration
**Concepts:** Swing or JavaFX, event-driven programming, JDBC, SQL basics, MVC-style separation

1. Calculator with GUI (Swing/JavaFX) — event handling, layout basics
2. Student Database App with JDBC (MySQL/SQLite) — CRUD via GUI + SQL
3. Expense Tracker with GUI + Database — JDBC, charts (JFreeChart optional)
4. Library Management System v2 (GUI + Database) — refactor Stage 2 project with persistence
5. Quiz Application with Timer (GUI) — event-driven timers, score GUI
6. To-Do List App with GUI + Database — full CRUD, persistent storage
7. Employee Management System (GUI + Database) — refactor Stage 3 project, JDBC-backed
8. Simple Notes App with Search (GUI + local database) — GUI + SQL queries
9. Movie Ticket Booking System (GUI + Database) — seat maps in GUI, booking persistence
10. Personal Finance Dashboard (GUI + Database + basic charts) — combines forms, tables, and visualizations

**Goal:** build real desktop applications with persistent data — this is where projects start looking "complete."

---

## Stage 6: Advanced — Concurrency, Networking, Design Patterns
**Concepts:** multithreading, synchronization, sockets, `ExecutorService`, design patterns (Singleton, Factory, Observer, Strategy)

1. Multi-threaded File Downloader — `ExecutorService`, thread pools
2. Producer-Consumer Simulation (e.g., print queue) — synchronization, `BlockingQueue`
3. Chat Server-Client Application (multi-client) — sockets, threads
4. Multiplayer Tic-Tac-Toe over Network — sockets, simple protocol design
5. Online Library System with Design Patterns — Singleton (DB connection), Factory (book types)
6. Observer-Pattern Stock Ticker Simulation — Observer pattern, real-time updates
7. Strategy-Pattern Payment System (Card, UPI, Wallet as strategies) — Strategy pattern
8. Thread-safe Bank Account System (concurrent transactions) — synchronization, race condition handling
9. Simple Job Scheduler (runs tasks at intervals) — `ScheduledExecutorService`, threading
10. Mini E-Commerce Console/GUI App (combines patterns, concurrency, persistence) — capstone-style integration project

**Goal:** handle concurrency safely and start designing software with reusable, maintainable patterns.

---

## Stage 7: Framework-Level (Spring Boot / Backend Dev)
**Concepts:** REST APIs, Spring Boot, dependency injection, databases via Spring Data JPA, basic security

1. REST API for a Task Manager — CRUD API, Spring Boot basics
2. REST API for a Library System — relationships between entities (Book, Author, Member)
3. User Authentication API (Spring Security + JWT) — auth basics
4. Blog Platform API (Posts, Comments, Users) — entity relationships, pagination
5. URL Shortener Service — REST, database, simple caching
6. E-Commerce Backend (Products, Cart, Orders) — multi-entity API, business logic
7. Notes App API with File Uploads — handling multipart requests
8. Weather App (consumes external API + exposes own endpoints) — API integration
9. Job Board API (Job postings, Applications) — filtering, search endpoints
10. Full-Stack Task Manager (Spring Boot backend + simple frontend, e.g., Thymeleaf or React) — capstone project tying frontend + backend + database together

**Goal:** transition from "Java the language" to building real, deployable backend services.

---

## How to Use This Roadmap
- **Don't skip projects** thinking they're repetitive — repetition with variation is how patterns become instinct.
- **Refactor old projects** as you learn new concepts (e.g., redo the Stage 1 calculator with OOP in Stage 2, then with a GUI in Stage 5).
- **Push everything to GitHub** — by the end you'll have a strong portfolio, not just practice code.
- **Time budget (rough guide):** Stages 1–2 can move fast (days each project). Stages 3–5 deserve more time (design decisions matter). Stages 6–7 are where real engineering judgment develops — take your time.
