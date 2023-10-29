import Exeption.WrongLoginExeption;
import Exeption.WrongPasswordExeption;

import java.util.regex.Pattern;

public class Validator {
    private static final Pattern LOGOPASS_PATTERN = Pattern.compile("[a-zA-Z0-9_]+");
    private static final int MAX_LENGTH = 20;

    public static void validate(
            String login,
            String password,
            String confirmPass
            ) {
        validatelogin(login);
        validatePassword(password, confirmPass);
    }
    private static void validatelogin(String login) {
        if (!LOGOPASS_PATTERN.matcher(login).matches()) {
            throw new WrongLoginExeption("Логин содержит недопустимые символы");
        }
        if (login.length() > MAX_LENGTH) {
            throw new WrongLoginExeption("Длина логина превышает " + MAX_LENGTH + " символов");
        }
    }
    private static void validatePassword(String password, String confirmPass) {
        if (!LOGOPASS_PATTERN.matcher(password).matches()) {
            throw new WrongPasswordExeption("Пароль содержит недопустимые символы");
        }
        if (password.length() > MAX_LENGTH) {
            throw new WrongPasswordExeption("Длина пароля превышает " + MAX_LENGTH + " символов");
        }
        if (!password.equals(confirmPass)) {
            throw new WrongPasswordExeption("Пароли не совпадают");
        }
    }
}

