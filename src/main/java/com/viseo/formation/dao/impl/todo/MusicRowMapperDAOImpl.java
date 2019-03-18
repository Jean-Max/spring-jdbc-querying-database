package com.viseo.formation.dao.impl.todo;

import com.viseo.formation.dao.MusicRowMapperDAO;
import com.viseo.formation.model.Music;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MusicRowMapperDAOImpl implements MusicRowMapperDAO {

    @Override
    public Music findByName(String id, JdbcTemplate jdbcTemplate) {
        // TODO
        return null;
    }

}