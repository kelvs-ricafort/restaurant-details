//
//  RestaurantDetailView.swift
//  RestaurantDetails
//
//  Created by Kelvin Ricafort on 10/24/25.
//

import SwiftUI

struct RestaurantDetailView: View {
    let restaurant: Restaurant
    @State private var cart = CartViewModel()
    
    var body: some View {
        NavigationStack {
            List {
                Section {
                    VStack(alignment: .leading, spacing: 6) {
                        Text(restaurant.name)
                            .font(.title)
                            .bold()
                        Text("\(restaurant.cuisine) • \(restaurant.type)")
                            .foregroundStyle(.secondary)
                        
                        HStack {
                            Image(systemName: "star.fill")
                                .foregroundStyle(.yellow)
                            Text(String(format: "%.1f", restaurant.rating))
                        }
                        .font(.subheadline)
                    }
                    .padding(.vertical, 4)
                }
                
                Section("Menu") {
                    ForEach(restaurant.menu) { item in
                        MenuItemRow(item: item) {
                            cart.addItem(item)
                        }
                    }
                }
            }
            .listStyle(.insetGrouped)
            .navigationTitle("Restaurant Details")
            .toolbar {
                ToolbarItem(placement: .topBarTrailing) {
                    CartButton(count: cart.totalItems)
                }
            }
        }
    }
}

#Preview {
    RestaurantDetailView(restaurant: MockData.sampleRestaurant)
}
