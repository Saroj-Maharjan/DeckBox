package app.deckbox.common.resources.strings

import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import app.deckbox.core.model.Format
import cafe.adriel.lyricist.LyricistStrings

@LyricistStrings(languageTag = "en", default = true)
val EnDeckBoxStrings = DeckBoxStrings(
  standardLegality = "Standard",
  expandedLegality = "Expanded",
  unlimitedLegality = "Unlimited",
  genericEmptyCardsMessage = "A Snorlax has blocked the path.\nPlease try another way.",
  genericSearchEmpty = { query ->
    buildAnnotatedString {
      append("Unable to find results for ")
      withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
        append("\"${query ?: "???"}\"")
      }
      append(".")
      append("\nYou've hurt yourself with confusion.")
    }
  },
  cardPlaceholderContentDescription = "Pokemon Card Placeholder",
  refreshPricesContentDescription = "Refresh Prices",
  format = { format ->
    when (format) {
      Format.STANDARD -> "Standard"
      Format.EXPANDED -> "Expanded"
      Format.UNLIMITED -> "Unlimited"
      Format.LEGACY -> "Legacy"
      Format.THEME -> "Theme"
    }
  },

  decks = "Decks",
  decksTabContentDescription = "List of saved decks",
  deckDefaultNoName = "A deck has no name",
  deckLastUpdated = { timestamp -> "Last updated $timestamp" },
  deckActionTestButton = "Experiment",
  deckActionDuplicateButton = "Duplicate",
  deckActionDuplicateButtonContentDescription = "Duplicate deck",
  deckActionDeleteButton = "Delete",
  deckActionDeleteButtonContentDescription = "Delete deck",
  fabActionNewDeckButton = "New deck",
  addSuggestedEnergyCards = { count, name -> "Add $count $name cards to the deck" },
  importTournaments = "Tournaments",
  importText = "Text",
  importTextTitle = "Import Text",

  boosterPacks = "Packs",
  boosterPacksTitleLong = "Booster Packs",
  boosterPacksTabContentDescription = "List of custom booster packs",
  boosterPackTitleNoName = "Enter pack name",

  expansions = "Expansions",
  expansionsTabContentDescription = "List of expansion sets",
  expansionReleaseDate = { "Released on $it" },
  collection = "Collection",
  inCollection = "in Collection",
  collectionCountOfTotal = { count, total -> "$count of $total" },
  expansionSearchHint = "Search expansions",
  expansionSearchEmptyMessage = { "No expansions found for $it, please try searching again" },
  expansionsEmptyMessage = "No expansions found. Please check another castle.",
  expansionsErrorMessage = "Uh-oh! Looks like the expansion sets failed to load.",
  fabActionEditCollection = "Edit collection",
  collectionEditingTitle = "Editing collection",

  browse = "Browse",
  browseTabContentDescription = "Browse all Pokemon cards",
  browseSearchHint = "Search for any card",

  tcgPlayer = "TCGPlayer",
  tcgPlayerNormal = "Normal",
  tcgPlayerHolofoil = "Holo",
  tcgPlayerReverseHolofoil = "Reverse Holo",
  tcgPlayerFirstEditionHolofoil = "1st Edition Holo",
  tcgPlayerFirstEditionNormal = "1st Edition",
  priceMarket = "Market",
  priceLow = "Low",

  priceMid = "Mid",
  priceHigh = "High",
  cardMarket = "Cardmarket",
  priceTrend = "Price trend",

  oneDayAvg = "1 day avg",
  sevenDayAvg = "7 day avg",
  thirtyDayAvg = "30 day avg",
  actionBuy = "Buy",
  lessThan = { "Less than $it" },
  lessThanEqual = { "Less than or equal to $it" },
  greaterThan = { "Greater than $it" },
  greaterThanEqual = { "Greater than or equal to $it" },

  tournamentsTitle = "Tournaments",
  tournamentsErrorMessage = "Unable to load the list of recent tournaments",
  fabActionImport = "Import deck",

  settings = "Settings",
  settingsTabContentDescription = "Change application settings",
  decksEmptyStateMessage = "Looks like you don't have any decks!\n" +
    "Try building one or importing an existing deck to see them appear here",
  deckListHeaderPokemon = "Pokémon",
  deckListHeaderTrainer = "Trainer",
  deckListHeaderEnergy = "Energy",
  cardCountInDeck = { count ->
    if (count == 1) {
      "$count Copy"
    } else {
      "$count Copies"
    }
  },
  deckTitleNoName = "Enter a name for your deck",
  fabActionNewBoosterPack = "New pack",
  actionCancel = "Cancel",
  actionDelete = "Delete",
  actionDeleteAreYouSure = "Are you sure?",
  boosterPickerEmptyMessage = "You don't have any booster packs made. " +
    "Try building some to start adding them to your decks.",
  boosterPackNoName = "Unnamed pack",
  deckNoName = "Unnamed deck",
  deckPickerTitle = "Choose a deck",
  boosterPackPickerTitle = "Choose a booster pack",

  timeAgoNow = "now",
  timeAgoMinutes = { min -> "$min minutes ago" },
  timeAgoHours = { hrs -> "$hrs hours ago" },
  timeAgoDays = { days -> "$days days ago" },
  timeAgoMonths = { months -> "$months months ago" },
  timeAgoYears = { yrs -> "$yrs years ago" },
  deckSortOrderUpdatedAt = "Last updated",
  deckSortOrderCreatedAt = "Created",
  deckSortOrderAlphabetically = "Alphabetically",
  deckSortOrderLegality = "Legality",
  gridStyleCompact = "Compact",
  gridStyleSmall = "Small",
  gridStyleLarge = "Large",
  favorites = "Favorites",
  similarCardsLabel = "Similar cards",
  evolvesFromLabel = "Evolves from",
  evolvesToLabel = "Evolves to",
  similarCardsErrorLabel = "Uh-oh! Unable to load a list of similar cards",
  similarCardsEmptyLabel = "No similar cards found",
  evolvesFromErrorLabel = "Uh-oh! Unable to load evolves from cards",
  evolvesFromEmptyLabel = "No cards found that this one evolves from",
  evolvesToErrorLabel = "Uh-oh! Unable to load cards that this evolves to",
  evolvesToEmptyLabel = "No cards found that this one evolves to",
  cardDetailAddedToDeck = { name -> "Added to \"$name\"" },
  cardDetailAddedToBoosterPack = { name ->
    name?.let { "Added to \"$it\"" } ?: "Added to booster pack"
  },
  builderEditingTitle = "Editing",
  deckPickerEmptyMessage = "You don't have any decks. Try creating one to start building.",
)
