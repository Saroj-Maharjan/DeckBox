package app.deckbox.common.compose.widgets

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val LocalIconSize = compositionLocalOf {
  24.dp
}

/**
 * A custom wrapper for [Icon] so that we can use a CompositionLocal
 * to provide a size for custom composable slots.
 */
@Composable
fun SizedIcon(
  icon: ImageVector,
  contentDescription: String?,
  modifier: Modifier = Modifier,
  size: Dp = LocalIconSize.current,
) {
  Icon(
    icon,
    contentDescription = contentDescription,
    modifier = modifier.size(size),
  )
}