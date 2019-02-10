import java.util.ArrayList;
import java.util.List;

class Employer {
    String name;
    String surname;
    int age;

    void prezentacjaPostaci() {          // i had to name it like that
        System.out.println(name + " " + surname + " " + age);
    }
}

//testing commit
public class Firm {

    public static void main(String[] args){
        List<Employer> emps = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            emps.add(new Employer());
        }
        String[] name = {"Piotr", "Lukas", "Mike"};
        String[] surname = {"Vazowsky", "Witczak", "Crycnyc"};
        Integer[] age = {26, 25, 30};
        int dig = 0;
        for (Employer emp : emps) {
            emp.name = name[dig];
            emp.surname = surname[dig];
            emp.age = age[dig];
            dig++;
            emp.prezentacjaPostaci();
        }
    }
}
