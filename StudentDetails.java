import java.util.*;
import java.awt.*;

public class StudentDetails extends Frame{
    Frame myFrame;
    TextArea txt;

    private int sub1;
    private int sub2;
    private int sub3;
    private int sub4;
    private int sub5;
    private static int index = 0;
    private static StudentDetails[] arr = new StudentDetails[20];

    StudentDetails(int s1, int s2, int s3, int s4, int s5) {

        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
        sub5 = s5;
        addToArray(this);

    }

    void printMarks() {
        StringBuilder strb = new StringBuilder();
        strb.append(this.sub1+" ");        
        strb.append(this.sub2+" ");        
        strb.append(this.sub3+" ");        
        strb.append(this.sub4+" ");        
        strb.append(this.sub5+" ");
        String str = strb.toString();

        if(myFrame == null) {
            myFrame = new Frame("Student Details");
            myFrame.setSize(500,500);
            myFrame.setLayout(new BorderLayout());
        }


        // txt.setText(str);
        // add(txt);

        setVisible(true);

    }

    static void addToArray(StudentDetails obj) {
        arr[index] = obj;
        index++;
    }

    void sub1() {
        for(int i=0; i<index; i++) {
            if(this == arr[i]) {
                if(arr[i].sub1 < 50)
                    System.out.println("Your mark in subject1 is: "+arr[i].sub1+" and you failed the exam");
                else
                System.out.println("Your mark in subject1 is: "+arr[i].sub1+" and you passed the exam");
            }
        }
    }

    void sub2() {
        for(int i=0; i<index; i++) {
            if(this == arr[i]) {
                if(arr[i].sub2 < 50)
                    System.out.println("Your mark in subject2 is: "+arr[i].sub2+" and you failed the exam");
                else
                System.out.println("Your mark in subject2 is: "+arr[i].sub2+" and you passed the exam");
            }
        }
    }

    void sub3() {
        for(int i=0; i<index; i++) {
            if(this == arr[i]) {
                if(arr[i].sub3 < 50)
                    System.out.println("Your mark in subject3 is: "+arr[i].sub3+" and you failed the exam");
                else
                System.out.println("Your mark in subject3 is: "+arr[i].sub3+" and you passed the exam");
            }
        }
    }

    void sub4() {
        for(int i=0; i<index; i++) {
            if(this == arr[i]) {
                if(arr[i].sub4 < 50)
                    System.out.println("Your mark in subject4 is: "+arr[i].sub4+" and you failed the exam");
                else
                System.out.println("Your mark in subject4 is: "+arr[i].sub4+" and you passed the exam");
            }
        }
    }

    void sub5() {
        for(int i=0; i<index; i++) {
            if(this == arr[i]) {
                if(arr[i].sub5 < 50)
                    System.out.println("Your mark in subject5 is: "+arr[i].sub5+" and you failed the exam");
                else
                System.out.println("Your mark in subject5 is: "+arr[i].sub5+" and you passed the exam");
            }
        }
    }

    static void studentsResults() {
        passedStudents();
        passedStudentsSub();
        failedStudents();
        topper();
    }

    static void passedStudents() {
        int count = 0;

        for(int i=0; i<index; i++) {
            if(arr[i].sub1 >= 50 && arr[i].sub2 >= 50 && arr[i].sub3 >= 50 && arr[i].sub4 >= 50 && arr[i].sub5 >= 50)
                count++;
        }

        System.out.println("The total no.of students passed in all exams are: "+count);
    }

    static void passedStudentsSub() {
        int sub1 = 0;
        int sub2 = 0;
        int sub3 = 0;
        int sub4 = 0;
        int sub5 = 0;

        for(int i=0; i<index; i++) {
            if(arr[i].sub1 >= 50)
                sub1++;
            if(arr[i].sub2 >= 50)
                sub2++;
            if(arr[i].sub3 >= 50)
                sub3++;
            if(arr[i].sub4 >= 50)
                sub4++;
            if(arr[i].sub5 >= 50)
                sub5++;
        }

        System.out.println("The total no.of students passed in subject 1 exam are: "+sub1);
        System.out.println("The total no.of students passed in subject 2 exam are: "+sub2);
        System.out.println("The total no.of students passed in subject 3 exam are: "+sub3);
        System.out.println("The total no.of students passed in subject 4 exam are: "+sub4);
        System.out.println("The total no.of students passed in subject 5 exam are: "+sub5);
    }

    static void failedStudents() {
        int count = 0;

        for(int i=0; i<index; i++) {
            if(arr[i].sub1 < 50 && arr[i].sub2 < 50 && arr[i].sub3 < 50 && arr[i].sub4 < 50 && arr[i].sub5 < 50)
                count++;
        }

        System.out.println("The total no.of students failed in all exams are: "+count);
    }

    static void topper() {
        int sub1Student = 0;
        int sub2Student = 0;
        int sub3Student = 0;
        int sub4Student = 0;
        int sub5Student = 0;
        int sub1HighScore = 0;
        int sub2HighScore = 0;
        int sub3HighScore = 0;
        int sub4HighScore = 0;
        int sub5HighScore = 0;

        for(int i=0; i<index; i++) {
            if(sub1HighScore < arr[i].sub1) {
                sub1HighScore = arr[i].sub1;
                sub1Student = i+1;
            }
            if(sub2HighScore < arr[i].sub2) {
                sub2HighScore = arr[i].sub2;
                sub2Student = i+1;
            }
            if(sub3HighScore < arr[i].sub3) {
                sub3HighScore = arr[i].sub3;
                sub3Student = i+1;
            }
            if(sub4HighScore < arr[i].sub4) {
                sub4HighScore = arr[i].sub4;
                sub4Student = i+1;
            }
            if(sub5HighScore < arr[i].sub5) {
                sub5HighScore = arr[i].sub5;
                sub5Student = i+1;
            }
        }

        System.out.println("The student"+sub1Student+" scored highest mark in sub1 is: "+sub1HighScore);
        System.out.println("The student"+sub2Student+" scored highest mark in sub1 is: "+sub2HighScore);
        System.out.println("The student"+sub3Student+" scored highest mark in sub1 is: "+sub3HighScore);
        System.out.println("The student"+sub4Student+" scored highest mark in sub1 is: "+sub4HighScore);
        System.out.println("The student"+sub5Student+" scored highest mark in sub1 is: "+sub5HighScore);
    }

    static void avg() {
        int sub1Sum = 0;
        int sub2Sum = 0;
        int sub3Sum = 0;
        int sub4Sum = 0;
        int sub5Sum = 0;
        int count = index;

        for(int i=0; i<index; i++) {
            sub1Sum += arr[i].sub1;
            sub2Sum += arr[i].sub2;
            sub3Sum += arr[i].sub3;
            sub4Sum += arr[i].sub4;
            sub5Sum += arr[i].sub5;
        }

        System.out.println("The average of sub1 is: "+sub1Sum/count);
        System.out.println("The average of sub2 is: "+sub2Sum/count);
        System.out.println("The average of sub3 is: "+sub3Sum/count);
        System.out.println("The average of sub4 is: "+sub4Sum/count);
        System.out.println("The average of sub5 is: "+sub5Sum/count);
        System.out.println("The average of all subjects is: "+((sub1Sum/count)+(sub2Sum/count)+(sub3Sum/count)+(sub4Sum/count)+(sub5Sum/count))/5);
    }

}