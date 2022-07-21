package com.jonfriend.java43productandcategory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java43productandcategory.models.PublicationMdl;

@Repository
public interface PublicationRpo extends CrudRepository<PublicationMdl, Long> {
	List<PublicationMdl> findAll(); 
}
