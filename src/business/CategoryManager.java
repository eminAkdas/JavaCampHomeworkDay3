package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao categoryDaoMng;
    private Logger[] loggersMng;

    public CategoryManager(Logger[] loggersMng, CategoryDao categoryDaoMng) {
        this.categoryDaoMng = categoryDaoMng;
        this.loggersMng = loggersMng;
    }

    public void add(Category newCategory) throws Exception {
        Category[] categories = {
                new Category(1, "Java"),
                new Category(2, "C#")
        };
        for (Category category : categories) {
            if (newCategory.getName().equals((category.getName()))) {
                throw new Exception("Aynı isimde category eklenemez");
            }
        }
        categoryDaoMng.add(newCategory);
        {
            for (Logger log : loggersMng) {
                log.logMesaji(newCategory.getName());
            }
        }


    }

}
