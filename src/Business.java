import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Human {
    private String name;
    private String surname;
    private Integer age;

    Human(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void showFullName() {
        System.out.println(name + " " + surname);
    }

    String getSurname(){
        return surname;
    }

    int getAge() {
        return age;
    }
}

public class Business {
    private static String corrSurname(String inputSur) {
        return inputSur.substring(0, 1).toUpperCase() + inputSur.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        Scanner readFileName = new Scanner(System.in);
        System.out.println("Enter database name: ");
        String fName = readFileName.nextLine();
        try {
            Scanner read = new Scanner(new File("src/" + fName));
            List<Human> emps = new ArrayList<>();
            try {
                while (read.hasNextLine()) {
                    String[] fileCell = read.nextLine().split(" ");
                    emps.add(new Human(fileCell[0], fileCell[1], Integer.parseInt(fileCell[2])));
                }

                read = new Scanner(System.in);
                System.out.println("Enter a surname: ");
                String inputSur = read.nextLine();
                String propSur = corrSurname(inputSur);

                boolean found = false;
                for (Human emp : emps) {
                    if (propSur.equals(emp.getSurname())) {
                        emp.showFullName();
                        System.out.println("This person is " + emp.getAge() + " years old.");
                        found = true;
                    }
                }
                if (!found) System.out.println("There is no person with this surname in database.");
            } catch (NumberFormatException b) {
                System.out.println("Error during reading a file. Corrupted?");
            }
        } catch (FileNotFoundException a) {
            System.out.println("Invalid file path.");
        }
    }
}