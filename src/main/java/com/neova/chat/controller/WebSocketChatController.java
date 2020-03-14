package com.neova.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketChatController {
	@MessageMapping("/news")
	@SendTo("/topic/news")
	public String broadcastNews(@Payload String message) {
		return message;
	}
}
