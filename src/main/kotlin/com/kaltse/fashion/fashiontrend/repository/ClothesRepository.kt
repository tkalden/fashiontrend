package com.kaltse.fashion.fashiontrend.repository

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kaltse.fashion.fashiontrend.model.ClothingItem;

@Repository
interface ClothesRepository : JpaRepository<ClothingItem, Long>{}
 