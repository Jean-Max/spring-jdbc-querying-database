package com.viseo.formation.dao.impl.todo;

import com.viseo.formation.dao.MusicResultSetExtractorDAO;
import com.viseo.formation.model.Music;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicResultSetExtractorDAOImpl implements MusicResultSetExtractorDAO {

    @Override
    public List<Music> findAllMusics(JdbcTemplate jdbcTemplate) {
        // TODO
        return null;
    }

}
