public class Main {

    public static void main(String[] args) {

        Person person = Person.newBuilder()
                .setToken("hello")
                .setUserId("Aleksey")
                .build();

        System.out.println(person.getUserId());
        System.out.println(person.getToken());
    }
}