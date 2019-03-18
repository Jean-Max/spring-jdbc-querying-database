package com.viseo.formation.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface MusicRowCallBackHandlerDAO {
    List<String> processAllMusics(JdbcTemplate jdbcTemplate);
}
