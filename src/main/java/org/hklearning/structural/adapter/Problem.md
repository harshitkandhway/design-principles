# Problem Statement: Weather Sensor Integration (Adapter Pattern)

## 1. Overview
You are the lead developer for **ClimateTrack**, a professional weather monitoring dashboard. The system is designed to consume data from various sensors to provide real-time updates to logistics companies.

## 2. Current Architecture
Your system is built around a standard interface that all sensors must follow to be compatible with the dashboard.

### Existing Interface: `IWeatherSensor`
* **Method:** `getTemperature()`
* **Return Type:** `double`
* **Unit:** Celsius (°C)



---

## 3. The Problem
Your company has just acquired a high-end hardware provider from the United States. They provide a library for their sensors called `AdvancedUSASensor`. However, this library is **incompatible** with your existing system for two reasons:

1.  **Method Signature Mismatch:** The library uses a method named `getTempF()` instead of `getTemperature()`.
2.  **Unit Inconsistency:** The library returns data in **Fahrenheit**, while your dashboard exclusively processes **Celsius**.
3.  **Data Type Mismatch:** The library returns a `float` instead of the expected `double`.

### Interface Comparison

| Feature | Your Interface (`IWeatherSensor`) | US Library (`AdvancedUSASensor`) |
| :--- | :--- | :--- |
| **Method Name** | `getTemperature()` | `getTempF()` |
| **Data Type** | `double` | `float` |
| **Unit** | Celsius (°C) | Fahrenheit (°F) |

---

## 4. Constraints
* **Closed Library:** The `AdvancedUSASensor` library is a third-party binary. You **cannot** modify its source code.
* **Open/Closed Principle:** You should not modify the existing `Dashboard` class to add `if-else` checks for different sensor types. The dashboard should only know about the `IWeatherSensor` interface.

## 5. Requirements
Your task is to implement the **Adapter Design Pattern** to bridge this gap.

1.  **Create an Adapter class** that implements your `IWeatherSensor` interface.
2.  **Wrap the Third-Party Class:** The adapter should hold a reference to the `AdvancedUSASensor`.
3.  **Perform Translation:** When `getTemperature()` is called, the adapter should internally call `getTempF()`.
4.  **Perform Conversion:** Convert the Fahrenheit value to Celsius using the standard formula before returning the value:

    $$C = (F - 32) \times \frac{5}{9}$$

---

## 6. Goal
Successfully integrate the `AdvancedUSASensor` into the `ClimateTrack` dashboard so that the dashboard remains unaware that it is communicating with a Fahrenheit-based sensor.