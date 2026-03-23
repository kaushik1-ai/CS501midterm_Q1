# CS501midterm_Q1

# Question 1: Compose State & Recomposition

## Description

This task implements a simple counter screen using Jetpack Compose. The screen displays a numeric value starting at 0 and provides two buttons to modify the value:

* **Increment** increases the counter
* **Reset** sets the counter back to 0

The UI updates automatically whenever the counter value changes, demonstrating Compose recomposition.

---

## Screenshots

| Initial State                   | After Increment                 |
| ------------------------------- | ------------------------------- |
| ![Initial](SS/mid_1st_mid1.png) | ![Incremented](SS/1st_mid2.png) |

---

## Implementation Details

The counter is implemented in the `TallyDashboard` composable function.

### State Management

* The counter state is defined as:

  ```kotlin
  var currentCount by rememberSaveable { mutableStateOf(0) }
  ```
* `mutableStateOf` is used to create observable state
* `rememberSaveable` ensures the state persists across configuration changes such as screen rotation

### UI Structure

* A `Column` layout is used to center all elements on the screen
* The UI consists of:

  * A title ("Total Count")
  * A large text displaying the current count
  * Two buttons arranged in a `Row`:

    * **Increment Button** → increases the count
    * **Reset Button** → resets the count to 0

### Recomposition Behavior

* When `currentCount` changes:

  * Compose automatically triggers recomposition
  * The displayed value updates instantly without manual UI refresh

---

## Key Features Implemented

* Counter starts at **0**
* UI updates dynamically on state change
* Two-button interaction (**Increment** and **Reset**)
* State persistence across screen rotation
* Proper use of:

  * `rememberSaveable`
  * `mutableStateOf`

---

## Conclusion

This implementation demonstrates fundamental Jetpack Compose concepts, including state management and recomposition. By using `rememberSaveable`, the app maintains a consistent user experience even during configuration changes.

---

## AI Usage Disclosure

* **Tool Used:** ChatGPT
* **How it was used:** Assisted in writing and structuring the README, and helped identify and fix small bugs/issues during development
* **Extent of Use:** AI was used only for support purposes; all core implementation and problem-solving were completed independently

---
