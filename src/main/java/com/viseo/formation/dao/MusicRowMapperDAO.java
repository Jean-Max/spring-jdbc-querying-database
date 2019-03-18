package com.viseo.formation.dao;

import com.viseo.formation.model.Music;
import org.springframework.jdbc.core.JdbcTemplate;

public interface MusicRowMapperDAO {
    Music findByName(String id, JdbcTemplate jdbcTemplate);
}