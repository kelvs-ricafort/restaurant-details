package com.kelvsricafort101.wordpress.restaurantdetails.utils

import java.text.NumberFormat
import java.util.Locale

fun formatPrice(amount: Double): String {
    val format = NumberFormat.getNumberInstance(Locale.US)
    format.minimumFractionDigits = 2
    format.maximumFractionDigits = 2
    return "PHP ${format.format(amount)}"
}