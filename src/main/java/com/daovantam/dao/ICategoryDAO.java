package com.daovantam.dao;

import java.util.List;

import com.daovantam.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
	CategoryModel findOneByCode(String code);
}
