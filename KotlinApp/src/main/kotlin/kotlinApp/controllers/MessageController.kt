package kotlinApp.controllers

import kotlinApp.model.FormattedMessage
import kotlinApp.model.Message
import kotlinApp.repositories.MessageRepository
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
open class MessageController(val messageRepository: MessageRepository) {

	@GetMapping("/message")
	open fun getMessages(): List<FormattedMessage> = messageRepository.findAll().map { FormattedMessage(it) }

	@PostMapping("/message")
	open fun saveMessage(@RequestBody text: String) = messageRepository.save(Message(text))

	@PutMapping("/message")
	open fun updateMessage(@RequestBody message: FormattedMessage) = messageRepository.save(Message(message))

	@DeleteMapping("/message")
	open fun deleteMessage(@RequestParam id: String) = messageRepository.delete(UUID.fromString(id))
}