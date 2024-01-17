package gr.aueb.cf.exercises.ch14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StudentApp {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("gr.aueb.cf.exercises.ch14.Student");
            Constructor<?> defaultCtr = clazz.getDeclaredConstructor();
            defaultCtr.setAccessible(true);
            Student student1 = (Student) defaultCtr.newInstance();

            Method sayHello = clazz.getMethod("sayHello");
            sayHello.invoke(student1);

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
