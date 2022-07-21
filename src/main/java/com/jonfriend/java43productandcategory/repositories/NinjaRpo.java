package com.jonfriend.java43productandcategory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonfriend.java43productandcategory.models.NinjaMdl;

@Repository
public interface NinjaRpo extends CrudRepository<NinjaMdl, Long> {
	List<NinjaMdl> findAll(); 
}
