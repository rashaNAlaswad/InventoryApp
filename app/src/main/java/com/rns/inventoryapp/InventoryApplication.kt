package com.rns.inventoryapp

import android.app.Application
import com.rns.inventoryapp.data.ItemRoomDatabase

class InventoryApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}
