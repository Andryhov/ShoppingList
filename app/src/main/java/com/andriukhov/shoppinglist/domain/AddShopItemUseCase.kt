package com.andriukhov.shoppinglist.domain

import com.andriukhov.shoppinglist.domain.pojo.ShopItem

class AddShopItemUseCase(private val repository: ShopListRepository) {

    fun addShopItem(item: ShopItem) {
        repository.addShopItem(item)
    }
}