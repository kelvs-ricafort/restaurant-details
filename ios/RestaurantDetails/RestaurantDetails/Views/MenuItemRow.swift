//
//  MenuItemRow.swift
//  RestaurantDetails
//
//  Created by Kelvin Ricafort on 10/24/25.
//

import SwiftUI

struct MenuItemRow: View {
    let item: MenuItem
    let onAdd: () -> Void
    
    var body: some View {
        HStack {
            VStack(alignment: .leading, spacing: 4) {
                Text(item.name)
                    .font(.headline)
                Text("₱\(String(format: "%.2f", item.price))")
                    .font(.subheadline)
                    .foregroundStyle(.secondary)
            }
            
            Spacer()
            
            Button(action: onAdd) {
                Image(systemName: "plus.circle.fill")
                    .font(.title2)
                    .foregroundStyle(.blue)
            }
            .buttonStyle(.plain)
        }
        .padding(.vertical, 8)
    }
}

#Preview {
    MenuItemRow(item: MenuItem(name: "Ramen Bowl", price: 300)) {}
        .padding()
}
