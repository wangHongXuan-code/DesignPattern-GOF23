package com.example.design.principle.demeter;

import java.util.ArrayList;

public class TeamLeader {
    public void checkNumberOfCourses() {
        ArrayList<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
