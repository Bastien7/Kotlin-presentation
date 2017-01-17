package kotlinApp.controllers

import kotlinApp.model.Topic
import kotlinApp.repositories.TopicRepository
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
@RequestMapping("/topic")
open class TopicController(val topicRepository: TopicRepository) {

	@GetMapping
	open fun getMessages(): List<Topic> = topicRepository.findAll()

	@PostMapping
	open fun saveMessage(@RequestBody topic: Topic) = topicRepository.save(topic)

	@PutMapping
	open fun updateMessage(@RequestBody topic: Topic) = topicRepository.save(topic)

	@DeleteMapping
	open fun deleteMessage(@RequestParam id: String) = topicRepository.delete(UUID.fromString(id))
}