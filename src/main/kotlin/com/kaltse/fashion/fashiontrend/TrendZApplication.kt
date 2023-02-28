package com.kaltse.fashion.fashiontrend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import com.kaltse.fashion.fashiontrend.configuration.ClothingConfiguration


@SpringBootApplication
@EnableConfigurationProperties(ClothingConfiguration::class)

class fashiontrendApplication

fun main(args: Array<String>) {
	runApplication<fashiontrendApplication>(*args)
}