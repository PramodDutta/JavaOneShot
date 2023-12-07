package src.projects;

public class GradeProcessor {
    public static void main(String[] args) {
        int[] grades = {85, 93, 67, 88, 94, 70, 79}; // Sample grades
        int sum = 0;
        int max = grades[0];
        int min = grades[0];

        for (int grade : grades) {
            sum += grade;
            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }

        double average = (double) sum / grades.length;

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade: " + min);
    }
}
