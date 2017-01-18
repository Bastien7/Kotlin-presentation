package kotlinApp.model

import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.UUID

import org.springframework.data.annotation.Id;

data class Message(@Id val id: String? = null, val content: String = "", val date: LocalDateTime = LocalDateTime.now()) {
	constructor(messageContent: String) : this(content = messageContent)
}
