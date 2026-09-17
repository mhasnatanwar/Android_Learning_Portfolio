# Module 2 Analysis - Interaction and UI State

## State and data flow

The tip calculator demonstrates unidirectional data flow. User events update `amountText`, `tipPercent`, or `roundUp`; Compose recalculates the tip and redraws the affected output. `rememberSaveable` is appropriate because the values belong to one small screen and should survive common activity recreation. Moving this state to a ViewModel would help if several screens shared it, but it would add unnecessary structure here.

## Approaches compared

The calculation is placed in the pure `calculateTip` function instead of inside the output composable. This separates presentation from calculation and makes the rule easier to test. The slider constrains the percentage to a valid range, whereas unrestricted text input would allow more values but require additional validation.

The amount field filters input to digits and a decimal point, then safely uses `toDoubleOrNull()`. This prevents a crash when the field is empty or temporarily incomplete. The filter can still accept more than one decimal point; production validation should show an error rather than treating invalid input as zero.

## Strengths, limitations, and decision

Local saved state keeps the example understandable and demonstrates recomposition clearly. The pure function improves readability and testability, while `NumberFormat` presents a currency-style result. A limitation is that currency depends on the device locale and invalid input is not explained to the user. For a classroom exercise focused on state and interaction, these trade-offs are reasonable.

## Practical evidence

With an amount of 100 and a 15% setting, the function calculates 15. Enabling round-up applies `ceil`, so a result such as 15.2 becomes 16. The Kotlin source and Gradle project compile successfully, providing reproducible implementation evidence.

