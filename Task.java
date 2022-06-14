package sree;

public class Task {
    public static void checkForAdult(int age) {
        if (age >= 18) {
            System.out.println("srirama is an Adult");
        } else {
            System.out.println("sree is not an Adult");
        }
    }
    
    public static void main(String[] args) {
        checkForAdult(24);
    }
}
