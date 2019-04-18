package com.viseo.formation.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public interface MusicGenericQueryDAO {
    public String findCategoryWithGenericQuery(String name, JdbcTemplate jdbcTemplate);

}
