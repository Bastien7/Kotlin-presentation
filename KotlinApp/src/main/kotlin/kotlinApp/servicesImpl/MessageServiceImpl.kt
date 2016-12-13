package kotlinApp.servicesImpl

import org.springframework.stereotype.Component
import kotlinApp.services.MessageService

@Component
class MessageServiceImpl(): MessageService {
	override fun getMessages(): Array<String> = arrayOf("Hey", "Oh")
}