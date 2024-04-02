package ru.gb.oseminar.data;

import java.util.List;

import ru.gb.oseminar.view.UserView;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}