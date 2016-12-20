package kotlinApp.servicesImpl

import kotlinApp.model.Message
import kotlinApp.services.MessageService
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class MessageServiceImpl() : MessageService {
	var storedMessages: List<Message> = listOf(Message("Hey"), Message("Oh"))

	override fun getMessages(): List<Message> = storedMessages

	override fun saveMessage(message: Message) {
		storedMessages = storedMessages.plus(message)
	}

	override fun updateMessage(message: Message) {
		storedMessages = storedMessages.filter { it.id != message.id }.plus(message)
	}

	override fun deleteMessage(id: UUID) {
		storedMessages = storedMessages.filter { it.id != id }
	}
}