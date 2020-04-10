package com.thony.springbootchat.models.dao;

import com.thony.springbootchat.models.documents.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatDao extends MongoRepository<Mensaje, String> {

    public List<Mensaje> findFirstByOrOrderByFechaDesc();

}
