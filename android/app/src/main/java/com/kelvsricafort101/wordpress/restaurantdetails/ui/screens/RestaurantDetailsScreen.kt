package com.kelvsricafort101.wordpress.restaurantdetails.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvsricafort101.wordpress.restaurantdetails.R
import com.kelvsricafort101.wordpress.restaurantdetails.ui.screens.components.MenuItemCard
import com.kelvsricafort101.wordpress.restaurantdetails.ui.screens.components.RestaurantInfoCard
import com.kelvsricafort101.wordpress.restaurantdetails.ui.theme.RestaurantAppTheme
import com.kelvsricafort101.wordpress.restaurantdetails.viewmodels.RestaurantViewModel

@Composable
fun RestaurantDetailsScreen(
    viewModel: RestaurantViewModel,
    onCartClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val restaurant = viewModel.restaurant.value
    val cartCount = viewModel.getCartCount()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.restaurant_details)) },
                actions = {
                    BadgedBox(badge = {
                        if (cartCount > 0) {
                            Badge {
                                Text("$cartCount")
                            }
                        }
                    }) {
                        IconButton(onClick = onCartClick) {
                            Icon(
                                imageVector = Icons.Default.ShoppingCart,
                                contentDescription = stringResource(R.string.shopping_cart)
                            )
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
        ) {
            RestaurantInfoCard(restaurant = restaurant)
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn(contentPadding = PaddingValues(16.dp)) {
                items(restaurant.menu) { item ->
                    MenuItemCard(item = item, onAddClick = { viewModel.addToCart(it) })
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantDetailsScreenPreview() {
    val viewModel = remember { RestaurantViewModel() }
    RestaurantAppTheme {
        RestaurantDetailsScreen(
            viewModel = viewModel,
            onCartClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantDetailsScreenDarkPreview() {
    val viewModel = remember { RestaurantViewModel() }
    RestaurantAppTheme(darkTheme = true) {
        RestaurantDetailsScreen(
            viewModel = viewModel,
            onCartClick = {}
        )
    }
}