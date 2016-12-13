package kotlinApp.services

import org.springframework.stereotype.Service

@Service
interface MessageService {
	fun getMessages(): Array<String>
}