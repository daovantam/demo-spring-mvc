package com.daovantam.dao.impl;

import java.util.List;

import com.daovantam.dao.INewDAO;
import com.daovantam.mapper.NewMapper;
import com.daovantam.model.NewModel;
import org.springframework.stereotype.Repository;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	

	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}


}
