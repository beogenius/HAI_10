import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamineeManager examineeManager = new ExamineeManager();
        while (true) {
            System.out.println("Good morning Hai dz");
            System.out.println("1: To insert examinee");
            System.out.println("2: To show information of examinee: ");
            System.out.println("3: To search examinee by id");
            System.out.println("4: To exit !!");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Payattention Your Caplocks");
                    System.out.println("Enter a: to insert Candidate A");
                    System.out.println("Enter b: to insert Candidate B");
                    System.out.println("Enter c: to insert Candidate C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            examineeManager.add(createExaminee(scanner, "a"));
                            break;

                        }
                        case "b": {
                            examineeManager.add(createExaminee(scanner, "b"));
                            break;
                        }
                        case "c": {
                            examineeManager.add(createExaminee(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    examineeManager.showInfo();
                    break;
                }
                case "3": {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    Examinee examinee = examineeManager.searchByID(id);
                    if (examinee == null) {
                        System.out.println(" Examinee Not found");
                    } else {
                        System.out.println(examinee.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

    public static Examinee createExaminee(Scanner scanner, String choice) {
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter Piority Score: ");
        Integer Piority = scanner.nextInt();
        scanner.nextLine();
        if (choice == "a") {
            return new ExamineeA(id, name, address, Piority);
        } else if (choice == "b") {
            return new ExamineeB(id, name, address, Piority);
        } else {
            return new ExamineeC(id, name, address, Piority);
        }
    }
}
