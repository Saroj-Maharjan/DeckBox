package app.deckbox.ui.browse

import DeckBoxRootAppBar
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import app.deckbox.common.screens.BrowseScreen
import cafe.adriel.lyricist.LocalStrings
import com.slack.circuit.runtime.CircuitContext
import com.slack.circuit.runtime.Screen
import com.slack.circuit.runtime.ui.Ui
import com.slack.circuit.runtime.ui.ui
import me.tatarka.inject.annotations.Inject

@Inject
class BrowseUiFactory : Ui.Factory {
  override fun create(screen: Screen, context: CircuitContext): Ui<*>? = when (screen) {
    is BrowseScreen -> {
      ui<BrowseUiState> { state, modifier ->
        Browse(state, modifier)
      }
    }

    else -> null
  }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun Browse(
  state: BrowseUiState,
  modifier: Modifier = Modifier,
) {
  print(state)
  Scaffold(
    modifier = modifier,
    topBar = {
      DeckBoxRootAppBar(
        title = LocalStrings.current.browse,
      )
    },
  ) { paddingValues ->
    // TODO: Replace with actual UI
    Box(
      modifier = Modifier
        .padding(paddingValues)
        .fillMaxSize(),
      contentAlignment = Alignment.Center,
    ) {
      Text("Browse UI using Circuit")
    }
  }
}