package kotlinApp.model

import java.time.LocalDateTime
import java.util.UUID

data class Message(val uuid: UUID, val content: String, val date: LocalDateTime) {
	constructor(content: String) : this(UUID.randomUUID(), content, LocalDateTime.now())
}