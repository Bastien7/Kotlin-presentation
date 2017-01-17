package kotlinApp.model

import java.sql.Timestamp
import java.time.LocalDateTime

data class Topic(val question: String = "", val messages: List<Message> = listOf(), val date: Timestamp = Timestamp.valueOf(LocalDateTime.now()))