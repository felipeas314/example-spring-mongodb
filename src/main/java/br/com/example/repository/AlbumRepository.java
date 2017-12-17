package br.com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.example.model.Album;

@RestResource(exported = true)
public interface AlbumRepository extends MongoRepository<Album, String> {

}
