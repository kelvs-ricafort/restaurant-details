package com.kelvsricafort101.wordpress.restaurantdetails.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kelvsricafort101.wordpress.restaurantdetails.R
import com.kelvsricafort101.wordpress.restaurantdetails.ui.theme.RestaurantAppTheme
import com.kelvsricafort101.wordpress.restaurantdetails.viewmodels.RestaurantViewModel
import java.util.Locale

@Composable
fun CartScreen(
    viewModel: RestaurantViewModel,
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    val items = viewModel.cartItems.value
    val total = items.sumOf { it.price }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.cart))},
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back)
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier
            .padding(innerPadding)
        ) {
            LazyColumn(modifier = Modifier.weight(1f)) {
                items(items) {
                    Text(
                        text = "${it.name} - PHP ${it.price}",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
            HorizontalDivider()
            Text(
                text = "Total: PHP ${String.format(Locale.US, "%.2f", total)}",
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartScreenPreview() {
    val viewModel = remember { RestaurantViewModel() }
    RestaurantAppTheme {
        CartScreen(
            viewModel = viewModel,
            onBack = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CartScreenDarkPreview() {
    val viewModel = remember { RestaurantViewModel() }
    RestaurantAppTheme(darkTheme = true) {
        CartScreen(
            viewModel = viewModel,
            onBack = {}
        )
    }
}