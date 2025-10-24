//
//  ResturantListView.swift
//  RestaurantDetails
//
//  Created by Kelvin Ricafort on 10/24/25.
//

import SwiftUI

struct ResturantListView: View {
    let restaurants: [Restaurant]
    
    var body: some View {
        NavigationStack {
            List(restaurants) { restaurant in
                NavigationLink {
                    RestaurantDetailView(restaurant: restaurant)
                } label: {
                    VStack(alignment: .leading) {
                        Text(restaurant.name)
                            .font(.headline)
                        Text("\(restaurant.cuisine) • \(restaurant.type)")
                            .font(.subheadline)
                            .foregroundStyle(.secondary)
                        
                        HStack {
                            Image(systemName: "star.fill")
                                .foregroundColor(.yellow)
                                .font(.caption)
                            Text(String(format: "%.1f", restaurant.rating))
                                .font(.caption)
                        }
                    }
                    .padding(.vertical, 8)
                }
            }
            .navigationTitle("Restaurants")
        }
    }
}

#Preview {
    ResturantListView(restaurants: MockData.sampleRestaurants)
}
