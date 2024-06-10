package ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.overscroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ItemList(items: List<ListItem>) {
    val overscrollEffect = ScrollableDefaults.overscrollEffect()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .overscroll(overscrollEffect)
    ) {
        items(items) { item ->
            ListItemView(item = item)
        }
    }
}
