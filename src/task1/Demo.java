package task1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        System.out.println("First test data ");
        System.out.println("*****************************");


        User[] users1 = {
                new User(0L, "John", "fb2e77d"),
                new User(1L, "Ivan", "df20g36"),
                new User(2L, "Katy", "ts55s57")
        };
        UserRepository userRepository1 = new UserRepository(users1);

        String[] userNames1 = userRepository1.getUserNames();

        System.out.println("Array of user's names " + Arrays.toString(userNames1));

        long[] userIds1 = userRepository1.getUserIds();

        System.out.println("Array of user's ids " + Arrays.toString(userIds1));

        for (int i = 0; i < users1.length + 3; i++) {

            String name = userRepository1.getUserNameById(i);

            System.out.println(name + "\n");

        }


        System.out.println("Second test data");
        System.out.println("*****************************");

        User[] users2 = {
                new User(13324L, "Leo", "fb2e88d"),
                new User(879654L, "Barry", "df10g99"),
                new User(3544687L, "Sara", "ts45s66")
        };
        UserRepository userRepository2 = new UserRepository(users2);

        String[] userNames2 = userRepository2.getUserNames();

        System.out.println("Array of user's names " + Arrays.toString(userNames2));

        long[] userIds2 = userRepository2.getUserIds();

        System.out.println("Array of user's ids " + Arrays.toString(userIds2));
        for (long id : userIds2) {
            String nameById = userRepository2.getUserNameById(id);

            System.out.println(nameById);

        }


    }
}
