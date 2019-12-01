import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons  = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int ageTmp = 10 * i + 5;
            persons.add(Person.newBuilder().setName("Person").setAge(ageTmp).build());
        }

        for (Person person:persons) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }
}