package com.kaltse.fashion.fashiontrend

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus
import com.kaltse.fashion.fashiontrend.configuration.ClothingConfiguration



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner
import  org.junit.jupiter.api.Assertions.*;
import org.springframework.context.annotation.PropertySource;


@SpringBootTest(classes = arrayOf(fashiontrendApplication::class), webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)

class fashiontrendApplicationTests( ) {
    
	@Autowired
	lateinit var testRestTemplate : TestRestTemplate
	
	@Autowired
	lateinit var clothingConfiguration: ClothingConfiguration 
	
	@Test
	fun whenCalled_ShouldReturnRunning() {
		println("HERE")
		var result = testRestTemplate.getForEntity("/trending-clothes",String::class.java)
		assertNotNull(result)
		/* println("Result++++" + result)
		assertEquals(result?.statusCode,HttpStatus.OK)
		assertEquals(result?.body,"RUNNING") */
	}

}
