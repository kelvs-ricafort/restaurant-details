//
//  CartViewModel.swift
//  RestaurantDetails
//
//  Created by Kelvin Ricafort on 10/24/25.
//

import Foundation
import Observation

@Observable
class CartViewModel {
    var items: [MenuItem] = []
    
    var totalItems: Int {
        items.count
    }
    
    func addIten(_ item: MenuItem) {
        items.append(item)
    }
}
