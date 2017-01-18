package kotlinApp.model

import org.springframework.data.annotation.Id
import java.time.LocalDateTime

data class Topic(
		@Id val id: String? = null,
		val question: String = "",
		val answers: List<Message> = listOf(),
		val date: LocalDateTime = LocalDateTime.now()
)