# Module 4 Analysis - Architecture, Navigation, and Adaptive UI

## Architecture and state ownership

Module 4 moves selection state into `TopicsViewModel`. UI-owned state would be sufficient if the selected topic mattered only inside one composable, but the compact list and detail destinations both require the same selection. ViewModel ownership creates a single source of truth and separates state from rendering. The public `select` function controls updates while the property setter remains private.

For a production application, immutable `UiState` exposed through `StateFlow` would provide stronger separation and easier asynchronous updates. The current `mutableStateOf` approach is intentionally smaller and suitable for a synchronous learning example.

## Navigation and adaptive layout

On a compact width, `NavHost` represents list and detail as separate destinations. Selecting a topic updates the ViewModel and navigates to detail, allowing the back stack to return to the list. At 600 dp or wider, the same content appears in a two-pane `Row`; selection updates the detail pane without changing destination.

This comparison shows that navigation is not only movement between pages. On a larger display, simultaneous list-detail presentation uses space more effectively. Reusing `TopicList` and `TopicDetail` in both arrangements avoids separate phone and tablet implementations.

## Strengths, limitations, and justification

The design connects architecture, navigation, and responsive presentation without over-engineering. The 600 dp rule is transparent and easy to demonstrate, but official adaptive APIs and window-size classes would handle foldables, posture, and more device categories better in production. String routes are sufficient here, while type-safe navigation would be safer in a larger project.

## Practical evidence

The source contains three topics, ViewModel-managed selection, a compact navigation graph, and an expanded 40/60 list-detail split. The project passed Kotlin compilation with Navigation Compose and lifecycle ViewModel dependencies, confirming that the components integrate correctly.

