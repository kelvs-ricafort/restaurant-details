package com.kelvsricafort101.wordpress.restaurantdetails.data.mock

import com.kelvsricafort101.wordpress.restaurantdetails.data.models.MenuItem
import com.kelvsricafort101.wordpress.restaurantdetails.data.models.Restaurant

object MockData {
    val sampleRestaurants = listOf(
        Restaurant(
            name = "Sakura Japanese Dining",
            cuisine = "Japanese",
            type = "Casual Dining",
            rating = 4.6,
            menu = listOf(
                MenuItem(name = "Sushi Platter", price = 450.0),
                MenuItem(name = "Ramen Bowl", price = 380.0),
                MenuItem(name = "Tempura Set", price = 420.0),
                MenuItem(name = "Miso Soup", price = 120.0),
                MenuItem(name = "Green Tea Ice Cream", price = 150.0)
            )
        ),
        Restaurant(
            name = "Casa Italia",
            cuisine = "Italian",
            type = "Fine Dining",
            rating = 4.8,
            menu = listOf(
                MenuItem(name = "Margherita Pizza", price = 540.0),
                MenuItem(name = "Carbonara Pasta", price = 480.0),
                MenuItem(name = "Garlic Bread", price = 190.0),
                MenuItem(name = "Tiramisu", price = 260.0)
            )
        ),
        Restaurant(
            name = "Taco Loco",
            cuisine = "Mexican",
            type = "Fast Food",
            rating = 4.3,
            menu = listOf(
                MenuItem(name = "Beef Tacos (3pcs)", price = 220.0),
                MenuItem(name = "Chicken Quesadilla", price = 260.0),
                MenuItem(name = "Nachos Supreme", price = 300.0),
                MenuItem(name = "Churros", price = 150.0)
            )
        ),
        Restaurant(
            name = "Brew & Brunch",
            cuisine = "Cafe",
            type = "Coffee Shop",
            rating = 4.5,
            menu = listOf(
                MenuItem(name = "Iced Latte", price = 160.0),
                MenuItem(name = "Cappuccino", price = 150.0),
                MenuItem(name = "Avocado Toast", price = 240.0),
                MenuItem(name = "Blueberry Pancakes", price = 290.0)
            )
        ),
        Restaurant(
            name = "Bangkok Bites",
            cuisine = "Thai",
            type = "Casual Dining",
            rating = 4.4,
            menu = listOf(
                MenuItem(name = "Pad Thai", price = 340.0),
                MenuItem(name = "Tom Yum Soup", price = 280.0),
                MenuItem(name = "Green Curry", price = 360.0),
                MenuItem(name = "Mango Sticky Rice", price = 200.0)
            )
        )
    )
    val sampleRestaurant = sampleRestaurants.first()
}