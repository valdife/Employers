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

    public static void main(String[] args) {
        Employer e1 = new Employer();
        Employer e2 = new Employer();
        Employer e3 = new Employer();
        Employer[] emps = {e1, e2, e3};
        String[] name = {"Piotr", "Lukas", "Mike"};
        String[] surname = {"Vazowsky", "Witczak", "Crycnyc"};
        Integer[] age = {26, 25, 30};
        int dig = 0;
        for (Employer e : emps) {
            e.name = name[dig];
            e.surname = surname[dig];
            e.age = age[dig];
            dig++;
            e.prezentacjaPostaci();
        }
    }
}
