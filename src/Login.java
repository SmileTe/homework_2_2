public class Login {
String login;
String password;

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException {

        if (login == null || login.isBlank() || login.isEmpty()
                ||login.length()<1 ||login.length()>20 ||!isAlphaNumericFast(login)) {
            throw new WrongLoginException();
        }

        if(password == null || password.isEmpty() || password.isEmpty()
                || password.length() < 1 || password.length() > 20 || !isAlphaNumericFast(password) || password != confirmPassword) {
            throw new WrongPasswordException();
        }
    }

    private static boolean isAlphaNumericFast(String s)
    {
        boolean valid = true;
        char[] a = s.toCharArray();
        for (char c: a)
        {
            valid = ((c >= 'a') && (c <= 'z')) ||
                    ((c >= 'A') && (c <= 'Z')) ||
                    ((c >= '0') && (c <= '9'));
            if (!valid)
            {
                return false;
            }
        }
        return true;
    }
}
