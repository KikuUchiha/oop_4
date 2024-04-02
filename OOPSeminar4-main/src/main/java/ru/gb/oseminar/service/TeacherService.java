package ru.gb.oseminar.service;

import java.time.LocalDate;
import java.util.List;

import ru.gb.oseminar.data.Teacher;

public class TeacherService implements UserService<Teacher>{

    private List<Teacher> teacherList;
    private Integer maxTeacherId = 0;

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }


    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teacherList.add(teacher);
    }

    @SuppressWarnings("unlikely-arg-type")
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId().equals(teacherId)){
                teacher.setFirstName(surname);
                teacher.setFirstName(firstname);
                teacher.setPatronymic(patronymic);
            }
    }   }
}