
package com.kaltse.fashion.fashiontrend.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import com.kaltse.fashion.fashiontrend.service.ClosetService
import org.springframework.web.servlet.ModelAndView;




@Controller
class WebController(val closetService: ClosetService) {

    @RequestMapping("/clothing-list")
    fun getAllClothes():ModelAndView {
        val nav =  ModelAndView("list-clothes")
        nav.addObject("clothes", closetService.getAllClothes())
        return nav
    }


}