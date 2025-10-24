//
//  MockData.swift
//  RestaurantDetails
//
//  Created by Kelvin Ricafort on 10/24/25.
//

import Foundation

struct MockData {
    static let sampleRestaurants: [Restaurant] = [
        Restaurant(
            name: "Sakura Japanese Dining",
            cuisine: "Japanese",
            type: "Casual Dining",
            rating: 4.6,
            menu: [
                MenuItem(name: "Sushi Player", price: 450),
                MenuItem(name: "Ramen Bowl", price: 300),
                MenuItem(name: "Tempura Set", price: 420),
                MenuItem(name: "Miso Soup", price: 120),
                MenuItem(name: "Green Tea Ice Cream", price: 150)
            ]
        ),
        Restaurant(
            name: "Casa Italia",
            cuisine: "Italian",
            type: "Fine Dining",
            rating: 4.8,
            menu: [
                MenuItem(name: "Margherita Pizza", price: 540),
                MenuItem(name: "Carbonara Pasta", price: 480),
                MenuItem(name: "Garlic Bread", price: 190),
                MenuItem(name: "Tiramisu", price: 260)
            ]
        ),
        Restaurant(
            name: "Taco Loco",
            cuisine: "Mexican",
            type: "Fast Food",
            rating: 4.3,
            menu: [
                MenuItem(name: "Beef Tacos (3pcs)", price: 220),
                MenuItem(name: "Chicken Quesadilla", price: 260),
                MenuItem(name: "Nachos Supreme", price: 300),
                MenuItem(name: "Churros", price: 150)
            ]
        ),
        Restaurant(
            name: "Brew & Brunch",
            cuisine: "Cafe",
            type: "Coffee Shop",
            rating: 4.5,
            menu: [
                MenuItem(name: "Iced Latte", price: 160),
                MenuItem(name: "Cappuccino", price: 150),
                MenuItem(name: "Avocado Toast", price: 240),
                MenuItem(name: "Blueberry Pancakes", price: 290)
            ]
        ),
        Restaurant(
            name: "Bangkok Bites",
            cuisine: "Thai",
            type: "Casual Dining",
            rating: 4.4,
            menu: [
                MenuItem(name: "Pad Thai", price: 340),
                MenuItem(name: "Tom Yum Soup", price: 280),
                MenuItem(name: "Green Curry", price: 360),
                MenuItem(name: "Mango Sticky Rice", price: 200)
            ]
        )
    ]
    
    static let sampleRestaurant = sampleRestaurants.first!
}
