package com.kaltse.fashion.fashiontrend.model

import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clothes")
data class ClothingItem(
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
val id : Long,
val brand : String,
val type : String,
val item : String,
val color : String,
val size : String,
val gender : String )