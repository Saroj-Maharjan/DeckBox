// Copyright 2020, Google LLC, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.deckbox.shared

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.LocalUIViewController
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalViewConfiguration
import androidx.compose.ui.platform.ViewConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeUIViewController
import app.deckbox.common.screens.DecksScreen
import app.deckbox.shared.root.DeckBoxContent
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.rememberCircuitNavigator
import me.tatarka.inject.annotations.Inject
import platform.Foundation.NSURL
import platform.SafariServices.SFSafariViewController
import platform.UIKit.UIViewController

typealias DeckBoxUiViewController = () -> UIViewController

@Inject
fun DeckBoxUiViewController(
  deckBoxContent: DeckBoxContent,
): UIViewController = ComposeUIViewController {
  val backstack = rememberSaveableBackStack(listOf(DecksScreen()))
  val navigator = rememberCircuitNavigator(backstack, onRootPop = { /* no-op */ })

  val uiViewController = LocalUIViewController.current

  // Increase the touch slop. The default value of 3.dp is a bit low imo, so we use the
  // Android default value of 8.dp
  // https://github.com/JetBrains/compose-multiplatform/issues/3397
  val vc = LocalViewConfiguration.current.withTouchSlop(
    with(LocalDensity.current) { 8.dp.toPx() },
  )

  CompositionLocalProvider(LocalViewConfiguration provides vc) {
    deckBoxContent(
      backstack,
      navigator,
      { url ->
        val safari = SFSafariViewController(NSURL(string = url))
        uiViewController.presentViewController(safari, animated = true, completion = null)
      },
      Modifier,
    )
  }
}

private fun ViewConfiguration.withTouchSlop(
  touchSlop: Float,
): ViewConfiguration = object : ViewConfiguration by this {
  override val touchSlop: Float = touchSlop
}
