package kotlinApp.services

import kotlinApp.model.Message
import org.springframework.stereotype.Service

@Service
interface MessageService {
	fun getMessages(): List<Message>
}