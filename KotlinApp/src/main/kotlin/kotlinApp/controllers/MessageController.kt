package kotlinApp.controllers

import kotlinApp.model.FormattedMessage
import kotlinApp.model.Message
import kotlinApp.services.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
open class MessageController {
	@Autowired
	lateinit var messageService: MessageService

	@GetMapping("/message")
	open fun getMessages(): List<FormattedMessage> = messageService.getMessages().map { FormattedMessage(it) }

	@PostMapping("/message")
	open fun saveMessage(@RequestBody text: String) = messageService.saveMessage(Message(text))

	@PutMapping("/message")
	open fun updateMessage(@RequestBody message: FormattedMessage) = messageService.updateMessage(Message(message))

	@DeleteMapping("/message")
	open fun deleteMessage(@RequestParam id: String) = messageService.deleteMessage(UUID.fromString(id))
}