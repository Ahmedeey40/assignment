public class Main {
    public static void main(String[] args) {

        // Exercise 2.0: Loan
        Loan loan = new Loan();
        System.out.println("=== Exercise 2.0: Loan ===");
        System.out.printf("Annual Interest Rate: %.2f%%%n", loan.getAnnualInterestRate());
        System.out.println("Number of Years: " + loan.getNumberOfYears());
        System.out.printf("Loan Amount: %.2f%n", loan.getLoanAmount());
        System.out.printf("Monthly Payment: %.2f%n", loan.getMonthlyPayment());
        System.out.printf("Total Payment: %.2f%n", loan.getTotalPayment());

        // Exercise 2.1: BMI
        BMI bmi = new BMI("Ahmed", 25, 154, 70);
        System.out.println("\n=== Exercise 2.1: BMI ===");
        System.out.println("Name: " + bmi.getName());
        System.out.println("Age: " + bmi.getAge());
        System.out.println("Weight: " + bmi.getWeight());
        System.out.println("Height: " + bmi.getHeight());
        System.out.printf("BMI: %.2f%n", bmi.getBMI());
        System.out.println("Status: " + bmi.getStatus());

        // Exercise 2.2: Course
        Course course = new Course("Java Programming");
        course.addStudent("Ahmed");
        course.addStudent("Ali");
        course.addStudent("Hassan");
        course.addStudent("Omar");
        course.addStudent("Mohamed");

        System.out.println("\n=== Exercise 2.2: Course ===");
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Number of Students: " + course.getNumberOfStudents());

        System.out.println("Students:");
        for (String student : course.getStudents()) {
            System.out.println("- " + student);
        }

        course.dropStudent("Omar");

        System.out.println("\nAfter dropping Omar:");
        System.out.println("Number of Students: " + course.getNumberOfStudents());

        for (String student : course.getStudents()) {
            System.out.println("- " + student);
        }
    }
}
