package com.example.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发",348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + iCourse.getId() + " 课程名称:" + iCourse.getName() + " 课程原价:" + javaCourse.getOriginPrice() + "元" + " 课程折扣价格:" + iCourse.getPrice() + "元");
    }
}
