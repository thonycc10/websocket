package com.thony.springbootchat.models.service;

import com.thony.springbootchat.models.documents.Mensaje;

import java.util.List;

public interface IChatService {
    public List<Mensaje> obteberUltimos10Mensajes();
    public Mensaje guardar(Mensaje mensaje);
}
