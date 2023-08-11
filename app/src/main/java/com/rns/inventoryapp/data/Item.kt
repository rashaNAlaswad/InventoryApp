package com.rns.inventoryapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.NumberFormat

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int,
)

fun Item.getFormattedPrice(): String =
    NumberFormat.getCurrencyInstance().format(price)