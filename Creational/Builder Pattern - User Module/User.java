/**
 * @author DINESH KUMAR
 */

public class User {

    private final String name;
    private final String email;
    private final String mobile;
    private final String city;

    User(Builder builder){
        name = builder.name;
        email = builder.email;
        mobile = builder.mobile;
        city = builder.city;
    }

    public static class Builder{


        private String name;
        private String email;
        private String mobile;
        private String city;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setCity(String city){
            this.city = city;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString(){
        return name + " => " + email + " => " + mobile + " => " + city;
    }
}
