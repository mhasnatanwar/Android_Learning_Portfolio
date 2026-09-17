# Module 4 - Architecture, Navigation, and Adaptive UI

## Completed pathways

1. Architecture components
2. Navigation in Jetpack Compose
3. Adapt for different display sizes

The [module completion screenshot](Screenshots/module-4-completion.png) shows all three pathways at 100%. Detailed evidence is available for [architecture components](Screenshots/pathway-1-architecture-components.png), [Compose navigation](Screenshots/pathway-2-navigation-compose.png), and [adaptive layouts](Screenshots/pathway-3-adaptive-layouts.png). The representative exercise in `Source-Code` combines a ViewModel-owned UI state, Compose Navigation, and width-aware list/detail presentation.

## Implementation feature

On compact widths, selecting a topic navigates to a detail destination. On wider widths, list and detail panes appear together. Selection state lives in a `ViewModel`, so it survives configuration changes and remains separate from rendering.

## Evidence still required

- Add compact and expanded emulator/device screenshots to `Screenshots/`.
- All three Module 4 badge screenshots are verified in `Badge-Evidence/`.
- Complete `Analysis.md` in your own words.

## Run

Open `Source-Code` in Android Studio, allow Gradle sync to finish, and run the `app` configuration. Test both phone and resizable/tablet configurations.
