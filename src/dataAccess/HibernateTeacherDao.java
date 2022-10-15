package dataAccess;

import entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("hibernate: "+teacher.getFirstName()+" "+teacher.getLastName());
    }
}
