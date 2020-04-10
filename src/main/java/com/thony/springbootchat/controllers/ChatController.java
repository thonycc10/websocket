package com.thony.springbootchat.controllers;

import com.thony.springbootchat.models.documents.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ChatController {

     @MessageMapping("/mensaje")
     @SendTo("/chat/mensaje")
    public Mensaje reciberMensaje(Mensaje mens) {
        mens.setFecha(new Date().getTime());
        mens.setTexto("Recibido por el broker: " + mens.getTexto());
        return  mens;
     }

}
