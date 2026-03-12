package org.example.task6AT;

public class PasswordChecker {

    //Параметризованный тест для проверки пароля
    //Напишите метод, который проверяет сложность пароля. Пароль должен быть не менее 8 символов, содержать хотя бы одну цифру, одну заглавную и одну строчную букву. Создайте параметризованный тест с JUnit 5, который проверит как валидные, так и невалидные пароли.

    public static boolean isPWDOk(String password) {
        //if no encrypted
        if (password == null) {
            System.out.println("pwd cannot be null");
            return false;
        }
        if (password.length() < 8) {
            System.out.println("pwd is too short");
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("pwd have to contains numbers");
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("pwd must contain uppercase letters");
            return false;
        }
        if ((!password.matches(".*[a-z].*"))) {
            System.out.println("pwd must contain  lowercase letters");
            return false;
        }
        return true;
    }
}
