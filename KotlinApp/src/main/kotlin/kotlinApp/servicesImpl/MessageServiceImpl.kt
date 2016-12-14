package kotlinApp.servicesImpl

import kotlinApp.model.Message
import kotlinApp.services.MessageService
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.Month

@Component
class MessageServiceImpl() : MessageService {
	override fun getMessages(): List<Message> = listOf(
			Message("Hey", LocalDateTime.of(10, Month.DECEMBER, 2016, 20, 30)),
			Message("Oh", LocalDateTime.of(15, Month.DECEMBER, 2016, 21, 18))
	)
}