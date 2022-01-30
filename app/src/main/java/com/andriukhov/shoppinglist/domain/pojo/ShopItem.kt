package com.andriukhov.shoppinglist.domain.pojo

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val visibility: Boolean
)
