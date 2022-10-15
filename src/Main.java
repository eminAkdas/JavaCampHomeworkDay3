import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateTeacherDao;
import dataAccess.JdbCourseDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher(1, "Engin", "Demiroğ");
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);
        teacherManager.add(teacher);

        Category category=new Category(1,"yeni kategori");
        CategoryManager categoryManager=new CategoryManager(loggers,new HibernateCategoryDao());
        categoryManager.add(category);

        Course course=new Course(1,"Java kursu2","java açıklama",200);
        CourseManager courseManager=new CourseManager(new JdbCourseDao(),loggers);
        courseManager.add(course);
    }
}