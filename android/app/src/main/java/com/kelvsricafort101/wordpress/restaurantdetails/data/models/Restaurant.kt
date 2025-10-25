package com.kelvsricafort101.wordpress.restaurantdetails.data.models

data class Restaurant(
    var name: String,
    val cuisine: String,
    val type: String,
    val rating: Double,
    val menu: List<MenuItem>
)