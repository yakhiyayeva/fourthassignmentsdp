package proxy;

// Interface: VideoLecture
// Demonstration: LearningPlatformApp
import java.util.Scanner;

public class LearningPlatformApp {

    public static void main(String[] args) {
        // Create an online course with proxy video lectures
        OnlineCourse course = new OnlineCourse();
        course.addLecture(new ProxyVideoLecture("Introduction to Java"));
        course.addLecture(new ProxyVideoLecture("Design Patterns in Java"));
        course.addLecture(new ProxyVideoLecture("Advanced Java Topics"));

        // Display the list of lectures
        course.showLectureList();

        // Simulate a student playing some lectures
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the lecture number to play (or -1 to exit): ");
        int choice = scanner.nextInt();
        while (choice != -1) {
            course.playLecture(choice - 1);
            System.out.println("\nEnter the lecture number to play (or -1 to exit): ");
            choice = scanner.nextInt();
        }
    }
}

