public class GradesApplication {
public static void main(String[] args) {
Grades grades = new Grades();
grades.add(3);
grades.add(2);
grades.add(1);
grades.add(5);
System.out.println(grades.averageGrades());
System.out.println(grades.getLastGrade());
}
}
