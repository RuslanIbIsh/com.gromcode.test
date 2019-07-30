package task2;

public class Solution {


    public static void main(String[] args) {


        String[] clients1 = {"Mark", "Judy", "Saimon", "Valery"};
        int[] balances1 = {100_000, 150_000, 78_000, -33_000};


        int result1 = withdraw(clients1, balances1, "Mark", 100_000);
        System.out.println(" Result1  " + result1);

        int result2 = withdraw(clients1, balances1, "judy", 160_000);
        System.out.println(" Result2  " + result2);

        int result3 = withdraw(clients1, balances1, "Valery", 10_000);
        System.out.println(" Result3  " + result3);

        int result4 = withdraw(clients1, balances1, "saimon", 77_000);
        System.out.println(" Result4  " + result4);

        int result5 = withdraw(clients1, balances1, "pasha", 10_000);
        System.out.println(" Result5  " + result5);

    }


    /**
     * returns positive balance after withdraw or
     * -1 if client doesn't exist or
     * -1 if client doesn't have enough money
     * */


    public static int withdraw(String[] clients, int[] balances, String client, int amount) {

        for (int i = 0; i < clients.length; i++) {
            if (clients[i].equalsIgnoreCase(client)) {
                int sumAfterWithdraw = balances[i] - amount;
                if (sumAfterWithdraw >= 0) {
                    return sumAfterWithdraw;
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }


}
