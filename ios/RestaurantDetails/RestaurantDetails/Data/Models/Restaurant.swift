//
//  Restaurant.swift
//  RestaurantDetails
//
//  Created by Kelvin Ricafort on 10/24/25.
//

import Foundation

struct Restaurant: Identifiable {
    var id = UUID().uuidString
    var name: String
    var cuisine: String
    var type: String
    var rating: Double
    var menu: [MenuItem]
}
