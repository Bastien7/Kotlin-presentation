package kotlinApp.controllers

import kotlinApp.model.Message
import kotlinApp.services.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
open class MessageController {
	@Autowired
	lateinit var messageService: MessageService

	@GetMapping("/message")
	open fun getMessages(): List<Message> = messageService.getMessages()
	
	@PostMapping("/message")
	open fun saveMessage(@RequestBody text: String) {
		val message = Message(text, LocalDateTime.now())
		messageService.saveMessage(message)
	}
}