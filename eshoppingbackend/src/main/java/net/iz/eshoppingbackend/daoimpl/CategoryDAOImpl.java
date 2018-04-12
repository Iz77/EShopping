package net.iz.eshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.iz.eshoppingbackend.dao.CategoryDAO;
import net.iz.eshoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// Second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile");
		category.setImageURL("CAT_2.png");

		categories.add(category);
		
		// Third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop");
		category.setImageURL("CAT_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//enhanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
			
		}
		
		return null;
	}

}
