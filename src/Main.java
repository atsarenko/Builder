public class Main {

    public static void main(String[] args) {

        Person person = Person.newBuilder()
                .setName("Aleksey")
                .setAge(44)
                .build();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}