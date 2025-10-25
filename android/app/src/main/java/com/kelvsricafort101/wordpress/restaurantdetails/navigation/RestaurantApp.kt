package com.kelvsricafort101.wordpress.restaurantdetails.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.kelvsricafort101.wordpress.restaurantdetails.R
import com.kelvsricafort101.wordpress.restaurantdetails.data.mock.MockData
import com.kelvsricafort101.wordpress.restaurantdetails.ui.screens.CartScreen
import com.kelvsricafort101.wordpress.restaurantdetails.ui.screens.RestaurantDetailsScreen
import com.kelvsricafort101.wordpress.restaurantdetails.ui.screens.RestaurantListScreen
import com.kelvsricafort101.wordpress.restaurantdetails.viewmodels.RestaurantViewModel

@Composable
fun RestaurantApp() {
    val navController = rememberNavController()
    val viewModel: RestaurantViewModel = viewModel()
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.app_name)) },
                navigationIcon = {
                    if (currentDestination?.route != "restaurantList") {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = stringResource(R.string.back)
                            )
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "restaurantList",
            modifier = Modifier.padding(innerPadding)
        ) {
            // Restaurant list screen
            composable("restaurantList") {
                RestaurantListScreen(
                    restaurants = MockData.sampleRestaurants,
                    onRestaurantClick = { restaurant ->
                        navController.navigate("details/${restaurant.name}")
                    }
                )
            }

            // Restaurant Details Screen
            composable(
                route = "details/{restaurantName}",
                arguments = listOf(navArgument("restaurantName") { type = NavType.StringType})
            ) { backStackEntry ->
                val restaurantName = backStackEntry.arguments?.getString("restaurantName") ?: return@composable
                val restaurant = MockData.sampleRestaurants.first { it.name == restaurantName }

                // Update viewModel with the selected restaurant
                viewModel.restaurant.value = restaurant

                RestaurantDetailsScreen(
                    viewModel = viewModel,
                    onCartClick = { navController.navigate("cart")}
                )
            }

            composable("cart") {
                CartScreen(
                    viewModel = viewModel,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}