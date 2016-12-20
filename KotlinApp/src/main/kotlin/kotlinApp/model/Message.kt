package kotlinApp.model

import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.UUID

import org.springframework.data.annotation.Id;

data class Message(@Id val id: UUID, val content: String, val date: LocalDateTime) {
	constructor(content: String) : this(UUID.randomUUID(), content, LocalDateTime.now())
	constructor(message: FormattedMessage) : this(message.id, message.content, message.timestamp.toLocalDateTime())
}

data class FormattedMessage(val id: UUID = UUID.randomUUID(), val content: String = "", val timestamp: Timestamp = Timestamp.valueOf(LocalDateTime.now())) {
	constructor(message: Message) : this(message.id, message.content, Timestamp.valueOf(message.date))
}