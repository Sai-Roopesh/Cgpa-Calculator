import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //initialising scanner class
        Scanner in = new Scanner(System.in);

        //initialising hashmap of subjects and credits
        HashMap<String, Integer> subjects = new HashMap<>();
        subjects.put("Maths", 3);
        subjects.put("ds", 4);
        subjects.put("ade", 4);
        subjects.put("co", 3);
        subjects.put("java", 1);
        subjects.put("c++", 1);
        subjects.put("kannada", 1);
        subjects.put("scr", 1);


        Cgpa cgpa = new Cgpa("roopesh", subjects);

        System.out.println(cgpa.calculateCgpa(cgpa.input()));





    }
}
