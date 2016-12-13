package kotlinApp.controllers

import kotlinApp.services.MessageService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class MessageController {
	@Autowired
	lateinit var messageService: MessageService
	
	@RequestMapping("/messages")
	open fun getMessages(): List<String> = messageService.getMessages().toList()
}