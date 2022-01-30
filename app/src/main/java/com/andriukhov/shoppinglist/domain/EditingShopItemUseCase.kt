package com.andriukhov.shoppinglist.domain

import com.andriukhov.shoppinglist.domain.pojo.ShopItem

class EditingShopItemUseCase(private val repository: ShopListRepository) {

    fun editingShopItem(item: ShopItem) {
        repository.editingShopItem(item)
    }
}