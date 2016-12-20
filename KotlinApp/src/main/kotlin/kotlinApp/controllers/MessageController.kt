package kotlinApp.controllers

import kotlinApp.model.FormattedMessage
import kotlinApp.model.Message
import kotlinApp.repositories.MessageRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/messages")
open class MessageController(val messageRepository: MessageRepository) {

	@GetMapping
	open fun getMessages(): List<FormattedMessage> = messageRepository.findAll().map { FormattedMessage(it) }

	@PostMapping
	open fun saveMessage(@RequestBody text: String) = messageRepository.save(Message(text))

	@PutMapping
	open fun updateMessage(@RequestBody message: FormattedMessage) = messageRepository.save(Message(message))

	@DeleteMapping
	open fun deleteMessage(@RequestParam id: String) = messageRepository.delete(UUID.fromString(id))
}