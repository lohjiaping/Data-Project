import java.util.Scanner;

public class ImplementList {
    public static void main(String[] args) {
        List studentList = new List();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student(s)");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nHow many students do you want to add : ");
                    int numStudents = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    for (int i = 1; i <= numStudents; i++) {
                        System.out.println("\nEnter details for student " + i);
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter metric number: ");
                        String metricNumber = scanner.nextLine();
                        System.out.print("Enter CGPA: ");
                        double cgpa = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter ICT skill (advance/intermediate/basic): ");
                        String ictSkill = scanner.nextLine();
                        studentList.addStudent(new Student(name, metricNumber, cgpa, ictSkill));
                        System.out.println("Added student " + i + " successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter metric number: ");
                    String delMetricNumber = scanner.nextLine();
                    studentList.deleteStudent(delMetricNumber);
                    System.out.println("The student record has been deleted successfully.");
                    break;

                case 3:
                    System.out.print("Enter metric number: ");
                    String updMetricNumber = scanner.nextLine();
                    Student studentToUpdate = studentList.searchStudent(updMetricNumber);
                    if (studentToUpdate != null) {
                        System.out.println("What data do you want to update?");
                        System.out.println("1. Metric Number");
                        System.out.println("2. Name");
                        System.out.println("3. CGPA");
                        System.out.println("4. ICT Skill");
                        System.out.print("Please enter your choice: ");
                        int updateChoice = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        switch (updateChoice) {
                            case 1:
                                System.out.print("Enter new metric number: ");
                                String newMetricNumber = scanner.nextLine();
                                studentToUpdate.setMetricNumber(newMetricNumber);
                                break;
                            case 2:
                                System.out.print("Enter new name: ");
                                String newName = scanner.nextLine();
                                studentToUpdate.setName(newName);
                                break;
                            case 3:
                                System.out.print("Enter new CGPA: ");
                                double newCgpa = scanner.nextDouble();
                                scanner.nextLine(); // consume newline
                                studentToUpdate.setCgpa(newCgpa);
                                break;
                            case 4:
                                System.out.print("Enter new ICT skill (advance/intermediate/basic): ");
                                String newIctSkill = scanner.nextLine();
                                studentToUpdate.setIctSkill(newIctSkill);
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                        System.out.println("Updated student information: " + studentToUpdate);
                        System.out.println("Data has been updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter metric number: ");
                    String searchMetricNumber = scanner.nextLine();
                    Student foundStudent = studentList.searchStudent(searchMetricNumber);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    studentList.displayStudents();
                    break;

                case 6:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

