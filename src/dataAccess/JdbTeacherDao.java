package dataAccess;

import entities.Teacher;

public class JdbTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Jdb: "+teacher.getFirstName()+" "+teacher.getLastName());
    }
}
