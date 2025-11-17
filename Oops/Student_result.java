public class Student_result {
    public static void main(String[] args) {
        College Student1 = new College("MD TAKDISH ", 2411131,
                new String[] { "MATHS :", "EM :", "ET :", "MP :", "PHYSICS :" },
                new int[] { 79, 50, 65, 65, 40 });
        College Student2 = new College("MD SHAQUIB ", 2411130,
                new String[] { "MATHS :", "EM :", "ET :", "MP :", "PHYSICS :" },
                new int[] { 79, 50, 65, 65, 40 });
        College Student3 = new College("ANSHU", 2411132,
                new String[] { "MATHS :", "EM :", "ET :", "MP :", "PHYSICS :" },
                new int[] { 70, 60, 68, 66, 55 });
        Student1.display();
        System.out.println();
        Student2.display();
        System.out.println();
        Student3.display();
    }
}

class College {
    static String collegeName = "UCET";
    String studentName;
    double rollNO;
    String[] subjectName;
    int[] marks;

    College(String names, double studROLL, String[] sub, int[] number) {
        studentName = names;
        rollNO = studROLL;
        subjectName = sub;
        marks = number;
    }

    void display() {
        System.out.println("college name : " + collegeName + "\n" + "StudentName : " +
                studentName + "\n" + "SpecialNO  : " + rollNO + "\n" + "subjects_grades");
        for (int i = 0; i < subjectName.length; i++) {
            System.out.println(" " + subjectName[i] + " " + marks[i]);
        }
    }
}
