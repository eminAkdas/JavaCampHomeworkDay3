package dataAccess;

import entities.Course;

public class JdbCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdb: "+course.getName());
    }
}
