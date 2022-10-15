package dataAccess;

import entities.Category;

public class JdbCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Jdb: "+category.getName());
    }
}
