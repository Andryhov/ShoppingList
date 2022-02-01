package com.andriukhov.shoppinglist.domain

import com.andriukhov.shoppinglist.domain.pojo.ShopItem

class GetShopItemListUseCase(private val repository: ShopListRepository) {

    fun getShopList(): List<ShopItem> = repository.getShopList()
}