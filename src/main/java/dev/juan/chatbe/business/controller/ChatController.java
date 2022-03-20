package dev.juan.chatbe.business.controller;

import dev.juan.chatbe.model.dto.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/message")
    @SendTo("/chat/message")
    public Message toReceiveMessage(Message message){
        message.setDate(new Date().getTime());
        return message;
    }
}
