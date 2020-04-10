package com.thony.springbootchat.controllers;

import com.thony.springbootchat.models.documents.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Random;

@Controller
public class ChatController {

    private String[] colores = {"red", "yellow", "green", "magenta", "purple", "orange"};

     @MessageMapping("/mensaje")
     @SendTo("/chat/mensaje")
    public Mensaje reciberMensaje(Mensaje mens) {
        mens.setFecha(new Date().getTime());

        if (mens.getTipo().equalsIgnoreCase("NUEVO_USUARIO")){
            mens.setColor(colores[new Random().nextInt(colores.length)]);
            mens.setTexto("nuevo usuario");
        }
        return  mens;
     }

     @MessageMapping("/escribiendo")
    @SendTo("/chat/escribiendo")
    public String estaEscribiendo(String username) {
         return username.concat(" está escribiendo...");

     }
}
