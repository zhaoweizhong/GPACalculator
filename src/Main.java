import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Course> courses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the GPA calculator!!");
        System.out.println("1. Add Course   2. Calculate GPA");
        System.out.print("Please enter number to select: ");
        int input = scanner.nextInt();
        switch (input) {
            case 1: addCourse(); break;
            case 2: calculateGPA(); break;
            default: main(null);
        }
    }

    public static void addCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter course name: ");
        String courseName = scanner.nextLine();
        System.out.print("Please enter the credit: ");
        float credit = scanner.nextFloat();
        System.out.print("Please enter the score: ");
        float score = scanner.nextFloat();
        Course course = new Course(courseName, credit, score);
        courses.add(course);
        System.out.println("Added Successfully!!");
        main(null);
    }

    public static void calculateGPA() {
        float creditScores = 0;
        float credits = 0;
        for (Course course:courses) {
            creditScores = creditScores + course.getCreditScore();
            credits = credits + course.getCredit();
        }
        float GPA = creditScores / credits;
        System.out.println("Your GPA is " + GPA);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        main(null);
    }
}
