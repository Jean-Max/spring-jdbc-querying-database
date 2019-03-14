package com.viseo.dao.impl.initial;

import com.viseo.dao.MusicRowCallBackHandlerDAO;
import com.viseo.dao.utils.MusicDAOUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MusicRowCallBackHandlerDAOImpl implements MusicRowCallBackHandlerDAO {

    @Override
    public List<String> processAllMusics(JdbcTemplate jdbcTemplate) {
        // TODO
        return null;
    }


}
