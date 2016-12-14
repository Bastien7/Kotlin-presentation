package kotlinApp.controllers

import kotlinApp.model.Message
import kotlinApp.services.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class MessageController {
	@Autowired
	lateinit var messageService: MessageService

	@GetMapping("/messages")
	open fun getMessages(): List<Message> = messageService.getMessages()
}