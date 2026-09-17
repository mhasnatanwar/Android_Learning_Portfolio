# Android Learning Portfolio

An evidence-based learning portfolio for **CDE2313 Mobile Application Development**. This repository documents four completed Android Developers learning modules, representative Kotlin/Jetpack Compose exercises, authentic completion evidence, and the student's own analysis and reflection.

> **Assessment status:** Student details, four module projects, 12 verified badges, technical analyses, reflection, build verification, and submission data are documented. Emulator/device output screenshots remain listed in the final checklist.

## Student and course information

| Item | Details |
| --- | --- |
| Student name | Muhammad Hasnat Anwar |
| Student ID | AIU24102076 |
| Programme | Bachelor in Data Science |
| Course | CDE2313 - Mobile Application Development |
| Academic session | 2025/2026, Semester 3 |
| Lecturer | Ts Mohd Zulkifli Mohd Zaki |
| Assessment | Assessment 1 - Lab Exercises (15%) |
| GitHub repository | [Android_Learning_Portfolio](https://github.com/mhasnatanwar/Android_Learning_Portfolio) |
| Android Developers profile | [Muhammad Hasnat Anwar](https://me.developers.google.com/u/100305728997274440370) |

## Assessment overview

The portfolio demonstrates practical Android learning and analytical thinking. Its evidence is organized by module so a reviewer can move directly from learning completion, to source code, to application output, and finally to the student's technical analysis.

## Completed learning modules

| Module | Completed pathways | Evidence | Source code |
| --- | --- | --- | --- |
| [Module 1](Module-1/README.md) | Introduction to Kotlin; Set up Android Studio; Build a basic layout | [Completion screenshot](Module-1/Screenshots/module-1-completion.png) | [Compose profile card](Module-1/Source-Code/app/src/main/java/com/example/module1/MainActivity.kt) |
| [Module 2](Module-2/README.md) | Kotlin fundamentals; Add a button; Interact with UI and state | [Completion screenshot](Module-2/Screenshots/module-2-completion.png) | [Stateful tip calculator](Module-2/Source-Code/app/src/main/java/com/example/module2/MainActivity.kt) |
| [Module 3](Module-3/README.md) | More Kotlin fundamentals; Build a scrollable list; Build beautiful apps | [Completion screenshot](Module-3/Screenshots/module-3-completion.png) | [Material 3 affirmation list](Module-3/Source-Code/app/src/main/java/com/example/module3/MainActivity.kt) |
| [Module 4](Module-4/README.md) | Architecture components; Navigation in Compose; Adaptive layouts | [Completion screenshot](Module-4/Screenshots/module-4-completion.png) | [Navigation, ViewModel, and adaptive UI](Module-4/Source-Code/app/src/main/java/com/example/module4/MainActivity.kt) |

## Badge summary

The supplied screenshots authenticate completion of all 12 pathways and visibly show “Badge earned!” for every badge. This exceeds the assessment minimum of 10 badges.

| Badge | Module | Evidence status |
| --- | --- | --- |
| Introduction to Programming in Kotlin | Module 1 | [Verified](Module-1/Badge-Evidence/01-introduction-to-programming-in-kotlin.png) |
| Set up Android Studio | Module 1 | [Verified](Module-1/Badge-Evidence/02-setup-android-studio.png) |
| Build a Basic Layout | Module 1 | [Verified](Module-1/Badge-Evidence/03-build-a-basic-layout.png) |
| Kotlin Fundamentals | Module 2 | [Verified](Module-2/Badge-Evidence/04-kotlin-fundamentals.png) |
| Add a Button to an App | Module 2 | [Verified](Module-2/Badge-Evidence/05-add-a-button-to-an-app.png) |
| Interacting with UI and State | Module 2 | [Verified](Module-2/Badge-Evidence/06-interacting-with-ui-and-state.png) |
| More Kotlin Fundamentals | Module 3 | [Verified](Module-3/Badge-Evidence/07-more-kotlin-fundamentals.png) |
| Build a Scrollable List | Module 3 | [Verified](Module-3/Badge-Evidence/08-build-a-scrollable-list.png) |
| Build Beautiful Apps | Module 3 | [Verified](Module-3/Badge-Evidence/09-build-beautiful-apps.png) |
| Architecture Components | Module 4 | [Verified](Module-4/Badge-Evidence/10-architecture-components.png) |
| Navigation in Jetpack Compose | Module 4 | [Verified](Module-4/Badge-Evidence/11-navigation-in-jetpack-compose.png) |
| Adaptive Layouts | Module 4 | [Verified](Module-4/Badge-Evidence/12-adaptive-layouts.png) |

**Verified badge count: 12 of 12 (minimum requirement: 10).**

## Code implementation overview

Each module contains a complete standalone Android Studio project with its own Gradle wrapper. All four projects have passed `:app:compileDebugKotlin`:

- **Module 1:** composable structure, layout, typography, modifiers, icon, and preview.
- **Module 2:** validated input, remembered UI state, slider and switch interaction, pure tip calculation, and formatted output.
- **Module 3:** immutable data model, reusable Material cards, stable list keys, and lazy scrolling.
- **Module 4:** ViewModel-owned selection state, Compose Navigation, and compact versus expanded list-detail layouts.

See [build verification](BUILD_VERIFICATION.md) for the recorded verification results.

Do not count a pathway-completion card as a badge unless the Android Developers profile explicitly identifies it as a badge.

## Repository structure

```text
Android_Learning_Portfolio/
|- README.md
|- ASSESSMENT_STATUS.md
|- Module-1/
|  |- Source-Code/
|  |- Screenshots/
|  |- Badge-Evidence/
|  `- Analysis.md
|- Module-2/ ...
|- Module-3/ ...
|- Module-4/ ...
|- Reflection/Reflection.md
|- References/README.md
`- Assets/
```

## Reflection summary

The learning journey progressed from basic Kotlin and static Compose layouts to interactive state, efficient lists, ViewModel-based architecture, navigation, and adaptive interfaces. The most important improvement was learning to treat UI as a function of state and to separate state ownership from rendering as an application becomes more complex. The exercises also demonstrated that an implementation choice should match the size of the problem: local state is sufficient for a small calculator, while shared navigation state benefits from a ViewModel. The complete reflection is available in [Reflection/Reflection.md](Reflection/Reflection.md).

## Academic integrity and AI disclosure

All completion and badge evidence must come from the student's own Android Developers account. The student must understand and be able to explain every submitted code example. AI may support concept clarification, syntax, debugging, readability, brainstorming, and grammar, but the student's analysis, reflection, practical ownership, and technical justification must remain their own. Complete the disclosure in [ASSESSMENT_STATUS.md](ASSESSMENT_STATUS.md) accurately before submission.

## Quick review route

1. Verify the four module-completion screenshots linked above.
2. Review each module's source code and application-output screenshots.
3. Read the student's four analysis documents.
4. Verify at least 10 badge screenshots and the public Android Developers profile.
5. Read the final reflection and references.
