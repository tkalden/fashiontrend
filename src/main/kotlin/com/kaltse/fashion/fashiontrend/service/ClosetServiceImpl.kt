
package com.kaltse.fashion.fashiontrend.service

import org.springframework.stereotype.Service
import com.kaltse.fashion.fashiontrend.model.ClothingItem
import com.kaltse.fashion.fashiontrend.model.ClothingTypeEnum
import com.kaltse.fashion.fashiontrend.configuration.ClothingConfiguration
import com.kaltse.fashion.fashiontrend.repository.ClothesRepository





@Service
class ClosetServiceImpl(val clothesRepository: ClothesRepository):ClosetService {

override fun getAllClothes(): MutableList<ClothingItem>{

    return clothesRepository.findAll()
}
}
