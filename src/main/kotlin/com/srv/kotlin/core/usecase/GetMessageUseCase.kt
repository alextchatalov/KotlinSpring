package com.srv.kotlin.core.usecase

import com.srv.kotlin.core.model.Message

class GetMessageUseCase {

    fun execute(): List<Message> = createMessages()

    private fun createMessages(): List<Message> {

        var messages: MutableList<Message> = mutableListOf()
        (1..5).forEach {  messages.add(Message("$it", "Hello $it")) }
        return messages
    }
}