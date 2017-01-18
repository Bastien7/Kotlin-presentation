package kotlinApp.controllers

import kotlinApp.model.Message
import kotlinApp.model.Topic
import kotlinApp.repositories.TopicRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
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
	open fun getTopics(): List<Topic> = topicRepository.findAll()

	@GetMapping("/{id}")
	open fun getTopics(@PathVariable("id") id: String): List<Topic> = topicRepository.findAll().filter { it.id == id }

	@PostMapping
	open fun createTopic(@RequestBody question: Question) = topicRepository.save(Topic(question = question.content))

	@PutMapping
	open fun updateTopic(@RequestBody topic: Topic) = topicRepository.save(topic)

	@DeleteMapping
	open fun deleteTopic(@RequestParam id: String) = topicRepository.delete(id)
	
	data class Question(val content: String = "")
}
