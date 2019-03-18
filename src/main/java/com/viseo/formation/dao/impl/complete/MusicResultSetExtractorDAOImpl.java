package com.viseo.formation.dao.impl.complete;

import com.viseo.formation.dao.MusicResultSetExtractorDAO;
import com.viseo.formation.dao.utils.MusicDAOUtils;
import com.viseo.formation.model.Music;
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
        return findAllMusicsWithInnerClass(jdbcTemplate);
    }

    private List<Music> findAllMusicsWithInnerClass(JdbcTemplate jdbcTemplate) {
        return jdbcTemplate.query(MusicDAOUtils.SELECT_ALL_MUSIC, new ResultSetExtractor<List<Music>>() {
            @Override
            public List<Music> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Music> list = new ArrayList<>();
                while (rs.next()) {                    ;
                    list.add(new Music(rs.getInt(MusicDAOUtils.COLUMN_ID), rs.getString(MusicDAOUtils.COLUMN_NAME), rs.getString(MusicDAOUtils.COLUMN_CATEGORY)));
                }
                return list;
            }
        });
    }

    private List<Music> findAllMusicsWithLambda(JdbcTemplate jdbcTemplate) {
        return jdbcTemplate.query(MusicDAOUtils.SELECT_ALL_MUSIC,
                (rs) -> {
                    List<Music> list = new ArrayList<>();
                    while (rs.next()) {
                        list.add(new Music(rs.getInt(MusicDAOUtils.COLUMN_ID), rs.getString(MusicDAOUtils.COLUMN_NAME), rs.getString(MusicDAOUtils.COLUMN_CATEGORY)));
                    }
                    return list;
                }
        );
    }
}
