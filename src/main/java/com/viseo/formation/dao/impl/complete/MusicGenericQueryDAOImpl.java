package com.viseo.formation.dao.impl.complete;

import com.viseo.formation.dao.MusicGenericQueryDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class MusicGenericQueryDAOImpl implements MusicGenericQueryDAO {

    @Override
    public String findCategoryWithGenericQuery(String name, JdbcTemplate jdbcTemplate) {
        String sql = "SELECT CATEGORY FROM MUSICS WHERE NAME = ?";
        String result = jdbcTemplate.queryForObject(sql, new Object[]{name}, String.class);
        return result;
    }
}
