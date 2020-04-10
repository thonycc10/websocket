package com.thony.springbootchat.models.service;

import com.thony.springbootchat.models.dao.ChatDao;
import com.thony.springbootchat.models.documents.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements IChatService {

    @Autowired
    private ChatDao chatDao;

    @Override
    public List<Mensaje> obteberUltimos10Mensajes() {
        return chatDao.findFirstByOrOrderByFechaDesc();
    }

    @Override
    public Mensaje guardar(Mensaje mensaje) {
        return chatDao.save(mensaje);
    }
}
