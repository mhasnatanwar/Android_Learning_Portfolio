# Module 3 Analysis - Lists, Material Design, and Accessibility

## Lazy list versus simple scrolling

The affirmations exercise uses `LazyColumn`, which composes visible items as needed. A `Column` with `verticalScroll` would be simpler for a very short fixed screen, but it composes every item and becomes less efficient as data grows. `LazyColumn` is the more scalable choice for a list-based interface.

Each `Affirmation` is immutable and has an `id`, `title`, and `note`. Passing an immutable list into `AffirmationList` makes data flow predictable. Stable item keys help Compose preserve identity when a list changes. Separating `AffirmationCard` from the list also avoids repeated markup and allows the card design to change in one place.

## Material Design and accessibility

Material 3 cards, typography, theme colors, and consistent spacing create a clear hierarchy. The decorative star icon uses a null content description so a screen reader does not announce meaningless repeated information; the adjacent text communicates the content. Readable spacing and full-width cards also support scanning.

## Strengths, limitations, and decision

The structure is concise, reusable, and suitable for a growing list. Its limitation is that the demonstration uses local sample data and no images, persistence, or dynamic updates. Those features would require resource handling and possibly a repository or ViewModel, but they are not needed to demonstrate list rendering and Material presentation.

## Practical evidence

Five immutable items are displayed through the same reusable card function. The project passed Kotlin compilation. The structure demonstrates the relationship between a data model, lazy rendering, stable keys, theming, and accessibility rather than repeating UI code for each entry.

