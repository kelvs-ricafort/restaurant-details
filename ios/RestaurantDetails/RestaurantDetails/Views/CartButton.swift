//
//  CartButton.swift
//  RestaurantDetails
//
//  Created by Kelvin Ricafort on 10/24/25.
//

import SwiftUI

struct CartButton: View {
    var count: Int
    
    var body: some View {
        ZStack(alignment: .topTrailing) {
            Image(systemName: "cart.fill")
                .font(.title)
                .foregroundStyle(.blue)
            
            if count > 0 {
                Text("\(count)")
                    .font(.caption2)
                    .foregroundStyle(.white)
                    .padding(5)
                    .background(Circle().fill(.red))
                    .offset(x: 10, y: -8)
            }
        }
        .animation(.spring, value: count)
    }
}

#Preview(traits: .sizeThatFitsLayout) {
    CartButton(count: 3)
        .padding()
}
