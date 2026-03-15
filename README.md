# 🌵 Suculenta Class

This project contains a simple Java class that represents a **succulent plant** and simulates basic care actions like watering and sun exposure.

The objective is to practice **Object-Oriented Programming (OOP)** concepts such as classes, attributes, methods, and object instantiation.

---

# 📦 Class: `Suculenta`

The `Suculenta` class represents a succulent plant and stores basic information about it, allowing simple actions that simulate plant care.

---

# 🧩 Attributes

| Attribute      | Type      | Description                                       |
| -------------- | --------- | ------------------------------------------------- |
| `especie`      | `String`  | Name of the succulent species                     |
| `nivelAgua`    | `int`     | Indicates the plant's need for water              |
| `solConstante` | `boolean` | Indicates if the plant requires constant sunlight |

---

# ⚙️ Methods

### `regar()`

Simulates watering the plant.

* If `nivelAgua >= 3`, the plant is watered and the water level resets to `1`.
* Otherwise, a message indicates that the plant was watered recently.

### `tomarSol()`

Simulates sun exposure.

* If the plant requires constant sun, the water need increases.
* Otherwise, a message indicates that the plant does not need constant sun.

---

# 🚀 Example

```java
Suculenta echeveria = new Suculenta("Echeveria", 3, true);

echeveria.regar();
echeveria.tomarSol();
```
