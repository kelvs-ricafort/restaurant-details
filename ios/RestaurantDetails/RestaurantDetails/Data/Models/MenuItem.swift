//
//  MenuItem.swift
//  RestaurantDetails
//
//  Created by Kelvin Ricafort on 10/24/25.
//

import Foundation

struct MenuItem: Identifiable {
    var id = UUID().uuidString
    var name: String
    var price: Double
}
