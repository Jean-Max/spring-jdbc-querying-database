package com.viseo.dao.impl.initial;

import com.viseo.dao.MusicResultSetExtractorDAO;
import com.viseo.dao.utils.MusicDAOUtils;
import com.viseo.model.Music;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MusicResultSetExtractorDAOImpl implements MusicResultSetExtractorDAO {

    @Override
    public List<Music> findAllMusics(JdbcTemplate jdbcTemplate) {
        // TODO
        return null;
    }

}
