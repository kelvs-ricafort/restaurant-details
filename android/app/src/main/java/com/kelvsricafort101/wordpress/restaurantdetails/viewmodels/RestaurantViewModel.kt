package com.kelvsricafort101.wordpress.restaurantdetails.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.kelvsricafort101.wordpress.restaurantdetails.data.mock.MockData
import com.kelvsricafort101.wordpress.restaurantdetails.data.models.MenuItem

class RestaurantViewModel: ViewModel() {
    val restaurant = mutableStateOf(MockData.sampleRestaurant)
    val cartItems = mutableStateOf<List<MenuItem>>(emptyList())

    fun addToCart(item: MenuItem) {
        cartItems.value = cartItems.value + item
    }

    fun getCartCount(): Int = cartItems.value.size
}