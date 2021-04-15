package com.jkoh.notebook.domain;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemoRepository{
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public void insertMemo(String content) {
		String SQL = "INSERT INTO memo (content) values (:content)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("content", content);
		jdbcTemplate.update(SQL, params);
	}



}
