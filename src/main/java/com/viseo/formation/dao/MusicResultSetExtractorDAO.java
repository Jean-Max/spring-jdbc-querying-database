package com.viseo.formation.dao;

import com.viseo.formation.model.Music;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface MusicResultSetExtractorDAO {
    List<Music> findAllMusics(JdbcTemplate jdbcTemplate);
}
