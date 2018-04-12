package net.iz.eshoppingbackend.dao;

import java.util.List;

import net.iz.eshoppingbackend.dto.Category;

public interface CategoryDAO {
	
	Category get(int id);
	List<Category> list();
	

}
