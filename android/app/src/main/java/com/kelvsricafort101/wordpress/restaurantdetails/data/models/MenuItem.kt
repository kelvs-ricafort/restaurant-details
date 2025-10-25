package com.kelvsricafort101.wordpress.restaurantdetails.data.models

import java.util.UUID

data class MenuItem(
    val id: String? = UUID.randomUUID().toString(),
    val name: String,
    val price: Double
)