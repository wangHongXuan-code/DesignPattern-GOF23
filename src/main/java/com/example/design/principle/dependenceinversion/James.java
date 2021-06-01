package com.example.design.principle.dependenceinversion;

public class James {
    // v1.0
    // public void studyJavaCourse() {
    //     System.out.println("James在学习Java课程");
    // }
    //
    // public void studyPythonCourse() {
    //     System.out.println("James在学习Python课程");
    // }

    // v2.0 方法注入
    // public void studyImoocCourse(ICourse iCourse) {
    //     iCourse.studyCourse();
    // }

    // v3.0 构造器注入
    // private ICourse iCourse;
    //
    // public James(ICourse iCourse) {
    //     this.iCourse = iCourse;
    // }
    //
    // public void studyImoocCourse() {
    //     iCourse.studyCourse();
    // }

    // v4.0 Setter注入
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
