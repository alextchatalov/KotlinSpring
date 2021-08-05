package com.srv.kotlin.entrypoint

import com.srv.kotlin.core.model.Message
import com.srv.kotlin.core.usecase.GetMessageUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource {

    @GetMapping
    fun index(): List<Message> = GetMessageUseCase().execute()
}