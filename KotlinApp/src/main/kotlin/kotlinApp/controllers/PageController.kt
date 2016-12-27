package kotlinApp.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
open class PageController {
	@RequestMapping("/")
	open fun home() = ModelAndView("redirect:client-app/build/index.html")
}