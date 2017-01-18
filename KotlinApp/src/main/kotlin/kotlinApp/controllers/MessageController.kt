package kotlinApp.controllers

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
@RequestMapping("/message")
open class MessageController(val messageRepository: MessageRepository) {

	@GetMapping
	open fun getMessages(): List<Message> = messageRepository.findAll()

	@PostMapping
	open fun saveMessage(@RequestBody text: String) = messageRepository.save(Message(text))

	@PutMapping
	open fun updateMessage(@RequestBody message: Message) = messageRepository.save(message)

	@DeleteMapping
	open fun deleteMessage(@RequestParam id: String) = messageRepository.delete(id)
}