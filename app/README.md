# NEVER ANOTHER — Custom BH App

En Android app bygget i Kotlin og Jetpack Compose til det danske lingeri-brand Never Another.
Appen guider brugeren gennem et købsflow hvor de måler sig selv og bestiller en skræddersyet BH.

---

## Om appen

Never Another tilbyder en skræddersyet BH oplevelse hvor brugeren indtaster deres egne mål
og vælger farve. Appen sender derefter ordren direkte til en Supabase database.

---

## Købsflow

1. **Home** — landingsside med produktbilleder og karrusel
2. **Get Started** — introduktion til målingsprocessen
3. **Measures 1** — indtast øvre og nedre omkreds
4. **Measures 2** — indtast brystbredde og brysthøjde
5. **Results of Measure** — se dine mål og vælg farve (Hvid/Sort)
6. **Basket** — kurv med produkt, antal og ordreoversigt
7. **Order Information** — indtast kontakt- og leveringsinformation
8. **Purchased** — ordrebekræftelse

---

## Teknologi

- **Kotlin** — primært programmeringssprog
- **Jetpack Compose** — UI framework
- **Navigation Compose** — navigation mellem screens
- **ViewModel & Lifecycle** — state management på tværs af screens
- **Supabase** — database med tabellerne Customer, Product og Order
- **Kotlinx Serialization** — konverterer Kotlin objekter til JSON
- **Kotlinx Coroutines** — asynkrone database-kald

---

## Database

Appen bruger Supabase med tre tabeller:

- **Customer** — firstName, lastName, streetName, city, postalCode, phoneNumber, email
- **Product** — upperCircumference, lowerCircumference, breastWidth, breastHeight, color, quantity
- **Order** — forbinder Customer og Product via foreign keys

---

## Arkitektur

Appen følger MVVM-arkitekturen:

- **Model** — data classes og Supabase database-kald
- **ViewModel** — holder state på tværs af screens og kalder model-laget
- **View** — Compose screens der viser UI og tager imod brugerens input

---

## Udviklere

Projektet er udviklet af Frederik, Loui, Storm og Simon.