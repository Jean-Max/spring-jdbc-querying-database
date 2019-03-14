package com.viseo.dao.impl.initial;

import com.viseo.dao.MusicRowMapperDAO;
import com.viseo.dao.utils.MusicDAOUtils;
import com.viseo.model.Music;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class MusicRowMapperDAOImpl implements MusicRowMapperDAO {

    @Override
    public Music findByName(String id, JdbcTemplate jdbcTemplate) {
        // TODO
        return null;
    }

}