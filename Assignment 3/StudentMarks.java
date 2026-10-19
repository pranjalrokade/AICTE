import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks: ");
            int m = sc.nextInt();
            marks.add(m);
        }

        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int i = 0; i < marks.size(); i++) {
            int m = marks.get(i);

            if (m > highest) {
                highest = m;
            }

            if (m < lowest) {
                lowest = m;
            }
        }

        System.out.println("All Marks: " + marks);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
