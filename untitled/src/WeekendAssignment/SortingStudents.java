package WeekendAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudents  {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2,"sunil",25));
        students.add(new Student(4,"vinod",24));
        students.add(new Student(10,"arun",32));
        students.add(new Student(1,"sahana",26));

        students.sort((p1,p2)->Integer.compare(p1.age,p2.age));
        for(Student s:students){
            System.out.println(s.age+" "+s.name+" "+s.id);
        }


    }


}
