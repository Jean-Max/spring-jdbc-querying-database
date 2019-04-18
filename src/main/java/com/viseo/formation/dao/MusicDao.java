package com.viseo.formation.dao;

import com.viseo.formation.model.Music;

import java.util.List;

public interface MusicDao {

	Music findByName(String name);

	List<Music> findAllMusics();

	List<String> generateAllMusics ();

	String findCategory (String name);
}