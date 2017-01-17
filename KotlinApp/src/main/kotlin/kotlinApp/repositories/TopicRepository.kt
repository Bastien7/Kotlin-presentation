package kotlinApp.repositories

import kotlinApp.model.Topic
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.UUID

interface TopicRepository : MongoRepository<Topic, UUID>