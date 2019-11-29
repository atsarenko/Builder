
public class Person {

    private String name;
    private Integer age;

    private Person() {
        // private constructor
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public static Builder newBuilder() {
        return new Person().new Builder();
    }

    public class Builder {

        private Builder() {
            // private constructor
        }

        public Builder setName(String name) {
            Person.this.name = name;

            return this;
        }

        public Builder setAge(Integer age) {
            Person.this.age = age;

            return this;
        }

        public Person build() {
            return Person.this;
        }
    }
}