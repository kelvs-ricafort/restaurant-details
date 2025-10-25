package com.kelvsricafort101.wordpress.restaurantdetails.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvsricafort101.wordpress.restaurantdetails.data.mock.MockData
import com.kelvsricafort101.wordpress.restaurantdetails.data.models.Restaurant
import com.kelvsricafort101.wordpress.restaurantdetails.ui.theme.RestaurantAppTheme

@Composable
fun RestaurantListScreen(
    restaurants: List<Restaurant>,
    onRestaurantClick: (Restaurant) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(restaurants) { restaurant ->
            RestaurantCard(
                restaurant = restaurant,
                onClick = { onRestaurantClick(restaurant) }
            )
            HorizontalDivider()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantListScreenPreview() {
    RestaurantAppTheme {
        RestaurantListScreen(
            restaurants = MockData.sampleRestaurants,
            onRestaurantClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantListScreenPreviewDark() {
    RestaurantAppTheme(darkTheme = true) {
        RestaurantListScreen(
            restaurants = MockData.sampleRestaurants,
            onRestaurantClick = {}
        )
    }
}