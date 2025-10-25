package com.kelvsricafort101.wordpress.restaurantdetails.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvsricafort101.wordpress.restaurantdetails.R
import com.kelvsricafort101.wordpress.restaurantdetails.data.mock.MockData
import com.kelvsricafort101.wordpress.restaurantdetails.data.models.Restaurant
import com.kelvsricafort101.wordpress.restaurantdetails.ui.theme.RestaurantAppTheme

@Composable
fun RestaurantCard(
    restaurant: Restaurant,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = stringResource(
                    R.string.restaurant_info,
                    restaurant.cuisine,
                    restaurant.type
                ),
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = stringResource(R.string.rating, restaurant.rating),
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantCardPreview() {
    RestaurantAppTheme {
        RestaurantCard(
            restaurant = MockData.sampleRestaurants.first(),
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantCardPreviewDark() {
    RestaurantAppTheme(darkTheme = true) {
        RestaurantCard(
            restaurant = MockData.sampleRestaurants.first(),
            onClick = {}
        )
    }
}