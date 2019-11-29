
public class Person {

    private String userId;
    private String token;

    private Person() {
        // private constructor
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public static Builder newBuilder() {
        return new Person().new Builder();
    }

    public class Builder {

        private Builder() {
            // private constructor
        }

        public Builder setUserId(String userId) {
            Person.this.userId = userId;

            return this;
        }

        public Builder setToken(String token) {
            Person.this.token = token;

            return this;
        }

        public Person build() {
            return Person.this;
        }
    }
}