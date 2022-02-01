package com.andriukhov.shoppinglist.domain

import com.andriukhov.shoppinglist.domain.pojo.ShopItem

interface ShopListRepository {

    fun addShopItem(item: ShopItem)

    fun deleteShopItem(id: Int)

    fun editingShopItem(item: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getShopItemById(id: Int): ShopItem
}