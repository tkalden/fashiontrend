package com.kaltse.fashion.fashiontrend.service
import com.kaltse.fashion.fashiontrend.model.ClothingItem


interface ClosetService {
     fun getAllClothes() : MutableList<ClothingItem>
}