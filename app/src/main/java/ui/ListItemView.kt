package ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chargemap.compose.numberpicker.NumberPicker

@Composable
fun ListItemView(item: ListItem) {
    var number by remember { mutableStateOf(0) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Icon(
            imageVector = item.icon,
            contentDescription = "Icon",
            modifier = Modifier
                .weight(1f)
                .size(48.dp)
        )
        NumberPicker(
            value = number,
            onValueChange = { number = it },
            range = 0..999,
            textStyle = TextStyle(
                color = Color.White,
                fontSize = 32.sp // Adjust font size as needed
            ),
            dividersColor = Color.Transparent,
            modifier = Modifier
                .weight(1f)
                .height(150.dp)
        )
    }
}
