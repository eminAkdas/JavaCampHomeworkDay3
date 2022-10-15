package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDaoMng;
    private Logger[] loggersMng;

    public CourseManager(CourseDao courseDaoMng, Logger[] loggersMng) {
        this.courseDaoMng = courseDaoMng;
        this.loggersMng = loggersMng;
    }


    public void add(Course newCourse) throws Exception {

        Course[] courses =
                {
                        new Course(1, "Java kursu", "Java kursu açıklaması", 50),
                        new Course(1, "C# kursu", "C# kursu açıklaması", 100)
                };
        for (Course course : courses) {
            if (course.getName().equals(newCourse.getName())) {
                throw new Exception("Aynı isimde kurs girilemez");
            }
            if (newCourse.getPrice() < 0) {
                throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
            }
        }
        for (Logger log : loggersMng) {
            log.logMesaji(newCourse.getName());
        }
    }
}


