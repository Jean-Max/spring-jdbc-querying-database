package com.viseo.formation.dao.impl;

import com.viseo.formation.dao.MusicDao;
import com.viseo.formation.dao.MusicResultSetExtractorDAO;
import com.viseo.formation.dao.MusicRowCallBackHandlerDAO;
import com.viseo.formation.dao.MusicRowMapperDAO;
import com.viseo.formation.dao.impl.todo.MusicResultSetExtractorDAOImpl;
import com.viseo.formation.dao.impl.todo.MusicRowCallBackHandlerDAOImpl;
import com.viseo.formation.dao.impl.todo.MusicRowMapperDAOImpl;
import com.viseo.formation.dao.utils.MusicDAOUtils;
import com.viseo.formation.model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MusicDaoImpl implements MusicDao {

	JdbcTemplate jdbcTemplate;

	@Autowired
	private MusicRowMapperDAO musicRowMapperDAO;

	@Autowired
	private MusicRowCallBackHandlerDAO musicRowCallBackHandlerDAO;

	@Autowired
	private MusicResultSetExtractorDAO musicResultSetExtractorDAO;

	@Autowired
	public void setMusicRowMapperDAO(MusicRowMapperDAOImpl musicRowMapperDAO){
		this.musicRowMapperDAO = musicRowMapperDAO;
	}

	@Autowired
	public void setMusicResultSetExtractorDAO(MusicResultSetExtractorDAOImpl musicResultSetExtractorDAO) {
		this.musicResultSetExtractorDAO = musicResultSetExtractorDAO;
	}

	@Autowired
	public void setMusicRowCallBackHandlerDAO(MusicRowCallBackHandlerDAOImpl musicRowCallBackHandlerDAO) {
		this.musicRowCallBackHandlerDAO = musicRowCallBackHandlerDAO;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Music findByName(String name) {
		return musicRowMapperDAO.findByName(MusicDAOUtils.U2, jdbcTemplate);
	}

	@Override
	public List<String> generateAllMusics () {
		return musicRowCallBackHandlerDAO.processAllMusics(jdbcTemplate);
	}

	@Override
	public List<Music> findAllMusics() {
		return musicResultSetExtractorDAO.findAllMusics(jdbcTemplate);
	}

}