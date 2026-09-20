# Module 2 - Kotlin, Interaction, and State

## Completed pathways

1. Kotlin fundamentals
2. Add a button to an app
3. Interact with UI and state

The [module completion screenshot](Screenshots/module-2-completion.png) shows all three pathways at 100%. Detailed evidence is available for [Kotlin fundamentals](Screenshots/pathway-1-kotlin-fundamentals.png), [button interaction](Screenshots/pathway-2-add-a-button.png), and [UI state](Screenshots/pathway-3-ui-and-state.png). The representative exercise in `Source-Code` is a tip calculator with numeric input, a service-quality slider, rounding control, and calculated output.

## Implementation feature

Input values are state owned by the screen and passed to a pure calculation function. This keeps the small example testable and makes recomposition behavior easy to explain.

## Application output evidence

- [Tip calculator output](Screenshots/app-output-tip-calculator.png) was generated directly from the composable with Android's official Compose Preview Screenshot Testing tool.
- All three Module 2 badge screenshots are verified in `Badge-Evidence/`.
- The technical discussion is recorded in `Analysis.md` for student review.

## Run

Open `Source-Code` in Android Studio, allow Gradle sync to finish, and run the `app` configuration.
