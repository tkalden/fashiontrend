package com.kaltse.fashion.fashiontrend.configuration

import org.springframework.context.annotation.PropertySource;
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding


@ConfigurationProperties(prefix="clothing")
@ConstructorBinding
data class ClothingConfiguration (
   val color : String
)