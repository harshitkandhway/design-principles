# Design Pattern Challenge: The Smart Home Dashboard

## 📌 Context
You are the lead developer for **"HomeSync"**, a high-end interior design tool. The application allows designers to drag and drop complex smart devices (lighting, security, HVAC) onto a digital floor plan.

## 🏗️ The Problem
Creating a new `SmartDevice` object from scratch is a "heavy" operation. Each device requires:
1. **Network Handshake:** Simulating a connection to a specific protocol (Zigbee, Matter, or Wi-Fi).
2. **Firmware Loading:** Loading a large `byte[]` representing the device's operating system.
3. **Complex Presets:** A list of 50+ color profiles and energy-saving modes calculated based on the hardware version.

**The Bottleneck:** If a designer wants to place 30 identical "Lumina X1" lightbulbs in a hallway, calling the standard constructor 30 times causes the UI to freeze because it re-runs the expensive initialization logic for every single bulb.

## 🎯 Your Objective
Implement the **Prototype Design Pattern** to allow the system to "clone" an existing, already-initialized device. This avoids the expensive re-initialization and ensures the UI remains fluid.

---

## 🛠️ Implementation Tasks

### 1. The Interface (`Prototype`)
Create an interface or abstract class named `SmartDevice`.
* It must define a `clone()` method.
* It should have common properties like `modelName`, `firmwareVersion`, and `connectivityType`.

### 2. Concrete Prototype (`SmartLight`)
Implement a `SmartLight` class that extends `SmartDevice`.
* Add a specific property: `List<String> colorProfiles`.
* Implement the `clone()` method to return a new instance of `SmartLight` with all current properties copied over.

### 3. The Registry (`Prototype Manager`)
Create a class called `DeviceRegistry`.
* This class should store a "master copy" of different device types in a `Map` or `Dictionary`.
* **Method:** `getDevice(String modelName)` — This should look up the model and return a **clone** of the master copy, not the original itself.

---

## ⚠️ The "Deep Copy" Challenge
To successfully complete this exercise, you must handle **Deep Copying**.

If you modify the `colorProfiles` list on a *cloned* lightbulb, the *original* lightbulb in the registry must remain unchanged. A simple "Shallow Copy" will likely fail this test because both objects will point to the same list in memory.

---

## ✅ Success Criteria
1. You can create 100 lightbulbs in under 10ms.
2. Changing the `brightness` or `colorProfiles` of `clonedLight_A` does **not** change the values in `clonedLight_B`.
3. The `DeviceRegistry` is the only place where the "heavy" initialization (constructor) is called.