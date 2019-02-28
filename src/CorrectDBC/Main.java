package CorrectDBC;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int id;
        String name;
        int age;

        MySqlConnector mySqlConnector = new MySqlConnector();
        List<Student> studentList = new LinkedList<>();

        // Created three new student objects
        Student studTen = new Student(1222, "'Johnny'", 10);
        Student studTwooo = new Student(12, "'Max'", 40);
        Student studThreooe = new Student(13, "'Joe'", 60);

        // Added the three new student objects into the student list
        studentList.add(studTen);
        studentList.add(studTwooo);
        studentList.add(studThreooe);

        try {
            // Inserting students into DB using FOR LOOP
            for (Student stud : studentList) {
                id = stud.getId();
                name = stud.getName();
                age = stud.getAge();

                String sql = "INSERT INTO Student(id, name, age) " +
                        "VALUES(" + id + ", " + name  + ", " + age + ");";
                mySqlConnector.executeSql(sql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Inserted the students into the DB ...");
            mySqlConnector.closeConnections();
        }

    }

}
