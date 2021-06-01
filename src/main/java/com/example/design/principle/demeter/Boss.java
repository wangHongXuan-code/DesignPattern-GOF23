package com.example.design.principle.demeter;

public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
        // v1.0
        // ArrayList<Course> courseList = new ArrayList<>();
        // for (int i = 0; i < 20; i++) {
        //     courseList.add(new Course());
        // }
        // teamLeader.checkNumberOfCourses(courseList);

        teamLeader.checkNumberOfCourses();
    }
}
