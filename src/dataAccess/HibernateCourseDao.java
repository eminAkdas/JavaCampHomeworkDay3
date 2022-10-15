package dataAccess;

import entities.Category;

public class HibernateCourseDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("hibernate: "+category.getName());
    }
}
