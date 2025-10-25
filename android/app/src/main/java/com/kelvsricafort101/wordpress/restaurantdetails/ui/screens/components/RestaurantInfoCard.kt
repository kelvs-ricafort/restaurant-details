package com.kelvsricafort101.wordpress.restaurantdetails.ui.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvsricafort101.wordpress.restaurantdetails.data.mock.MockData
import com.kelvsricafort101.wordpress.restaurantdetails.data.models.Restaurant
import com.kelvsricafort101.wordpress.restaurantdetails.ui.theme.RestaurantAppTheme

@Composable
fun RestaurantInfoCard(
    restaurant: Restaurant,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier
        .fillMaxWidth()
        .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Cuisine: ${restaurant.cuisine}"
            )
            Text(
                text = "Type: ${restaurant.type}"
            )
            Text(
                text = "Rating: ${restaurant.rating}"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantInfoCardPreview() {
    RestaurantAppTheme {
        RestaurantInfoCard(restaurant = MockData.sampleRestaurant)
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantInfoCardPreviewDark() {
    RestaurantAppTheme(darkTheme = true) {
        RestaurantInfoCard(restaurant = MockData.sampleRestaurant)
    }
}