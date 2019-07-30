package task1;

/**
 * This class we use instead of data base
 */


public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    /**
     * returns array of user's names
     */

    public String[] getUserNames() {
        String[] userNames = new String[users.length];

        for (int i = 0; i < users.length; i++) {

            userNames[i] = users[i].getName();

        }

        return userNames;
    }

    /**
     * returns array of user's ids
     */

    public long[] getUserIds() {
        long[] userIds = new long[users.length];

        for (int i = 0; i < users.length; i++) {
            userIds[i] = users[i].getId();


        }

        return userIds;
    }

    /**
     * returns name of user by id
     */

    public String getUserNameById(long id) {

        for (User user : users) {
            if (user.getId() == id) {
                return user.getName();
            }
        }
        return "User with id " + id + " doesn't exist";
    }


}
