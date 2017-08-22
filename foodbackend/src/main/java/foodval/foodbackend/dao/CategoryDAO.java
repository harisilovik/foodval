package foodval.foodbackend.dao;

import java.util.List;

import foodval.foodbackend.dto.Category;

public interface CategoryDAO {

	
	
	
	
	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean Update(Category category);
	boolean delete(Category category);




}
