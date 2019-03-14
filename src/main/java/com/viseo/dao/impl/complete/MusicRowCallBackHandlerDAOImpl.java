package com.viseo.dao.impl.complete;

import com.viseo.dao.MusicRowCallBackHandlerDAO;
import com.viseo.dao.utils.MusicDAOUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MusicRowCallBackHandlerDAOImpl implements MusicRowCallBackHandlerDAO {

    // Each line/string contains a music (id,name,category)
    private static final List<String> LINES = new ArrayList();

    @Override
    public List<String> processAllMusics(JdbcTemplate jdbcTemplate) {

        processAllMusicsWithLambda(jdbcTemplate);
        try {
            MusicDAOUtils.writeMusicToTextFile(LINES);
        } catch (IOException e) {
            System.out.println("problem while writing result to text file");
        }
        return LINES;
    }

    private void processAllMusicsWithLambda(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.query(MusicDAOUtils.SELECT_ALL_MUSIC, new Object[]{},
                (rs) -> {
                    LINES.add(
                            rs.getInt(MusicDAOUtils.COLUMN_ID)
                            + "," + rs.getString(MusicDAOUtils.COLUMN_NAME)
                            + ","+ rs.getString(MusicDAOUtils.COLUMN_CATEGORY)
                    );
                }
        );
    }



}
