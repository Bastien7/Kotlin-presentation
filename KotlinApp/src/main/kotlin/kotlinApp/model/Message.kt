package kotlinApp.model

import java.sql.Timestamp
import java.time.LocalDateTime
import java.util.UUID

data class Message(val id: UUID, val content: String, val date: LocalDateTime) {
	constructor(content: String) : this(UUID.randomUUID(), content, LocalDateTime.now())
	constructor(message: MessageFormatted) : this(message.id, message.content, message.timestamp.toLocalDateTime())
	constructor() : this("")

	fun formatted(): MessageFormatted = MessageFormatted(this.id, this.content, Timestamp.valueOf(this.date))
}

data class MessageFormatted(val id: UUID, val content: String, val timestamp: Timestamp) {
	constructor() : this(UUID.randomUUID(), "", Timestamp.valueOf(LocalDateTime.now()))
}