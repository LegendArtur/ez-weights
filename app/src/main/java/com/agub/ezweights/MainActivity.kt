package com.agub.ezweights

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import ui.ItemList
import   ui.ListItem
import com.agub.ezweights.ui.theme.EzWeightsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EzWeightsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val items = listOf(
                        ListItem(Icons.Default.Star, "Enter number 1"),
                        ListItem(Icons.Default.Favorite, "Enter number 2"),
                        ListItem(Icons.Default.Home, "Enter number 3")
                        // Add more items as needed
                    )
                    ItemList(items)
                }
            }
        }
    }
}
