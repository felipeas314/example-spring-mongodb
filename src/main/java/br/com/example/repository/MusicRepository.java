package br.com.example.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.example.model.Music;

public interface MusicRepository extends MongoRepository<Music, ObjectId>{

}
