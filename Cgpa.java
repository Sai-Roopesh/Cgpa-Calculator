import java.util.HashMap;
import java.util.Scanner;

public class Cgpa {
    //Scanner class
    Scanner in = new Scanner(System.in);

    //class for calculating cgpa

    String name; //name of the student

    //hashmap for storing the subject name and subject credits
    HashMap<String, Integer> subjects;

    //constructor for initializing the variables

    public Cgpa(String name, HashMap<String, Integer> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    //taking input for the marks of the subjects

    public HashMap<String,Integer> input(){
        HashMap<String,Integer> marks = new HashMap<>();
        for(String subject: subjects.keySet()){
            System.out.println("Enter the marks of " + subject);
            int mark = in.nextInt();
            marks.put(subject,mark);
        }
        return marks;
    }

    //calculating the cgpa

    //formula for calculating cgpa is
    //cgpa = (sum of (grade point * credits of each subject))/total credits

    //grade point is calculated using the marks of the subject

    //91-100 = 10
    //81-90 = 9
    //71-80 = 8
    //61-70 = 7
    //51-60 = 6
    //41-50 = 5
    //33-40 = 4
    //0-32 = 0

    //function for calculating grade point and taking marks as input

    public int gradePoint(int mark){
        if(mark>=91 && mark<=100){
            return 10;
        }
        else if(mark>=81 && mark<=90){
            return 9;
        }
        else if(mark>=71 && mark<=80){
            return 8;
        }
        else if(mark>=61 && mark<=70){
            return 7;
        }
        else if(mark>=51 && mark<=60){
            return 6;
        }
        else if(mark>=41 && mark<=50){
            return 5;
        }
        else if(mark>=33 && mark<=40){
            return 4;
        }
        else{
            return 0;
        }
    }

    //function for calculating cgpa

    public double calculateCgpa(HashMap<String,Integer> marks){
        double cgpa = 0;
        int totalCredits = 0;
        for(String subject: subjects.keySet()){
            int gradePoint = gradePoint(marks.get(subject));
            int credits = subjects.get(subject);
            cgpa += gradePoint*credits;
            totalCredits += credits;
        }
        cgpa = cgpa/totalCredits;
        return cgpa;
    }







}
