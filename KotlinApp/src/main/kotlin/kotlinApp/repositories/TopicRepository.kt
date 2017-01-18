package kotlinApp.repositories

import kotlinApp.model.Topic
import org.springframework.data.mongodb.repository.MongoRepository

interface TopicRepository : MongoRepository<Topic, String>