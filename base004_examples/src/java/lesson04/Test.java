package lesson04;

/**
 * Created by nucleos on 04.09.16.
 */
public class Test {
    public static void main(String[] args) {
        User user =
                new User("NAME", "SURNAME", 100, "LOGIN", "PASS");
        System.out.println(user);
        System.out.println(user.hashCode());
//        user.setName("Василий");
//        user.setSurname("Васильев");
        System.out.println(user.hashCode());
        User user2 =
                new User("NAME", "SURNAME", 100, "LOGIN", "PASS");
        System.out.println(user.equals(user2));
        System.out.println(user == user2);
        System.out.println(user.hashCode() == user2.hashCode());
    }
}
