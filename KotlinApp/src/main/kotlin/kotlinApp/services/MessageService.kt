package kotlinApp.services

import kotlinApp.model.Message
import org.springframework.stereotype.Service
import java.util.UUID

@Service
interface MessageService {
	fun getMessages(): List<Message>
	fun saveMessage(message: Message)
	fun updateMessage(message: Message)
	fun deleteMessage(id: UUID)
}