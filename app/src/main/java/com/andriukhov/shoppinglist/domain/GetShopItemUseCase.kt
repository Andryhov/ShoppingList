package com.andriukhov.shoppinglist.domain

import com.andriukhov.shoppinglist.domain.pojo.ShopItem

class GetShopItemUseCase(private val repository: ShopListRepository) {

    fun getShopItemById(id: Int): ShopItem  = repository.getShopItemById(id)
}