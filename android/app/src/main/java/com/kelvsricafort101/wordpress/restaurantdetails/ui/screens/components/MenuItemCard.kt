package com.kelvsricafort101.wordpress.restaurantdetails.ui.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvsricafort101.wordpress.restaurantdetails.R
import com.kelvsricafort101.wordpress.restaurantdetails.data.models.MenuItem
import com.kelvsricafort101.wordpress.restaurantdetails.ui.theme.RestaurantAppTheme


@Composable
fun MenuItemCard(
    item: MenuItem,
    onAddClick: (MenuItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = item.name,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "PHP ${item.price}",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Button(onClick = {onAddClick(item) }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = stringResource(R.string.add)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuItemCardPreview() {
    RestaurantAppTheme {
        MenuItemCard(item = MenuItem(name = "Pizza", price = 350.0), {})
    }
}

@Preview(showBackground = true)
@Composable
fun MenuItemCardDarkPreview() {
    RestaurantAppTheme(darkTheme = true) {
        MenuItemCard(item = MenuItem(name = "Pizza", price = 350.0), {})
    }
}