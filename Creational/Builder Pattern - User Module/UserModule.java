/**
 * @author DINESH KUMAR
 */

public class UserModule {

    public static void main(String[] str){

        //USER 1
        User user1 = new User.Builder("Tony").setEmail("tony@gmail.com").build();

        //USER 1
        User user2 = new User.Builder("Bruce").setEmail("bruce@outlook.com").setMobile("67890").setCity("Gotham").build();

        System.out.println(user1);

        System.out.println(user2);
    }
}
