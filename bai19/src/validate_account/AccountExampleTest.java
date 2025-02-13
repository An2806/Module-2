package validate_email;

public class AccountExampleTest {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[] {"123abc", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isVaid = accountExample.validate(account);
            System.out.println("Account is " + account + " is vaid: " + isVaid);
        }
        for (String account : invalidAccount) {
            boolean isVaid = accountExample.validate(account);
            System.out.println("Account is " + account + " is vaid: " + isVaid);
        }
    }
}
