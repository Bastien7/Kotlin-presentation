package kotlinApp.repositories

import kotlinApp.model.Message
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.UUID

interface MessageRepository : MongoRepository<Message, UUID> {
	fun findByContent(content: String) : Message
}