package gr.aueb.cf.exercises.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordApp {

    public static void main(String[] args) {
        String pw = "Tar01!@8";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[\\W])^.{8,}$");
        Matcher matcher = pattern.matcher(pw);

        if (matcher.matches()) {
            System.out.println("Ο κωδικός πρόσβασης είναι έγκυρος.");
        } else {
            System.out.println("Ο κωδικός πρόσβασης δεν είναι έγκυρος.");
        }
    }
}
