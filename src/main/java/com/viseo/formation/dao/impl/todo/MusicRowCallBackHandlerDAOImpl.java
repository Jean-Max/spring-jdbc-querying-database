package com.viseo.formation.dao.impl.todo;

import com.viseo.formation.dao.MusicRowCallBackHandlerDAO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicRowCallBackHandlerDAOImpl implements MusicRowCallBackHandlerDAO {

    @Override
    public List<String> processAllMusics(JdbcTemplate jdbcTemplate) {
        // TODO
        return null;
    }


}
