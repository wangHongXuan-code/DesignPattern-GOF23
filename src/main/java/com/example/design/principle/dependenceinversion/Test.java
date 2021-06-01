package com.example.design.principle.dependenceinversion;

/**
 * 如果James还要学习PHP课程
 * 一种方法是在James类中添加studyPhpCourse()方法，这种便是面向实现编程，因为James是实现类
 * 可以发现这样的方法会导致James实现类经常修改，扩展性极差，也就是说我们应用层的函数(main)依赖于底层实现
 *
 * 而依赖导致原则则要求高层模块(Test)不要依赖于低层模块(James),二者都应该依赖于抽象(ICourse)
 */
public class Test {
    public static void main(String[] args) {
        // v1.0
        // James james = new James();
        // james.studyJavaCourse();
        // james.studyPythonCourse();

        // v2.0 方法注入
        // James james = new James();
        // james.studyImoocCourse(new JavaCourse());
        // james.studyImoocCourse(new PythonCourse());

        // v3.0 构造器注入
        // James james = new James(new JavaCourse());
        // james.studyImoocCourse();

        // v4.0 Setter注入
        James james = new James();
        james.setiCourse(new JavaCourse());
        james.studyImoocCourse();
        james.setiCourse(new PythonCourse());
        james.studyImoocCourse();
    }
}
