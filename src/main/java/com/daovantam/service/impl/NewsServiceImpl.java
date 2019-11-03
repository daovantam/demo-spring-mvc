package com.daovantam.service.impl;


import java.util.List;


import com.daovantam.dao.INewDAO;
import com.daovantam.model.NewModel;
import com.daovantam.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewService {
	
	@Autowired
	private INewDAO newDao;

	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}

}
