/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.jetsnack.ui.utils

import java.math.BigDecimal
import java.text.NumberFormat

/**
 * Helper function for formatting prices. [price] should be a non-negative value in cents.
 */
fun formatPrice(price: Long): String {
    if (price < 0) {
        throw IllegalArgumentException("Price must be non-negative")
    }
    return NumberFormat.getCurrencyInstance().format(
        BigDecimal(price).movePointLeft(2)
    )
}

/**
 * Enum class for supported currencies
 */
enum class Currency (val currencyName: String, val currencySymbol: String) {
    CAD("US Dollar", "$"),
    EUR("Euro", "€"),
    GBP("Great Britain Pound", "£"),
    USD("Canadian Dollar", "$")
}

/**
 * Helper function for formatting prices.
 * @param price Price in cents
 */
fun Currency.toString(price: Long): String {
    return currencySymbol + formatPrice(price)
}
