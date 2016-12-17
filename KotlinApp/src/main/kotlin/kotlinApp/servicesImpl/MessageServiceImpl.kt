package kotlinApp.servicesImpl

import kotlinApp.model.Message
import kotlinApp.services.MessageService
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.Month

@Component
class MessageServiceImpl() : MessageService {
	var storedMessages: List<Message> = listOf(
			Message("Hey", LocalDateTime.of(2016, Month.DECEMBER, 10, 20, 30)),
			Message("Oh", LocalDateTime.of(2016, Month.DECEMBER, 15, 21, 18))
	)
	
	override fun getMessages(): List<Message> = storedMessages

	override fun saveMessage(message: Message) {
		storedMessages = storedMessages.plus(message)
	}
}