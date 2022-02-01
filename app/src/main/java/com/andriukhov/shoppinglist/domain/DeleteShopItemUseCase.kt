package com.andriukhov.shoppinglist.domain

class DeleteShopItemUseCase(private val repository: ShopListRepository) {

    fun deleteShopItem(id: Int) {
        repository.deleteShopItem(id)
    }
}