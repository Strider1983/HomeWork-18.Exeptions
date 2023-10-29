import Exeption.WrongLoginExeption;
import Exeption.WrongPasswordExeption;

public class Main {
    public static void main(String[] args) {
       String login = "qwerty123jkdhsfkjhdskjhfkjdshfkjdshfkjdshfkjdshfkjdshfkjsdhfkdsjhfkjsdhfkdjsh";
       String password = "qwert+y123";
       String confirmPass = "qwerty123";
       try {
           Validator.validate(login, password, confirmPass);}
       catch (WrongLoginExeption exeption) {
           exeption.printStackTrace();
       }
       catch (WrongPasswordExeption exeption) {
           exeption.printStackTrace();
       }
        System.out.println("Процесс валидации завершен");
       }
    }