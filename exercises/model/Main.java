<<<<<<< HEAD
package gr.aueb.cf.exercises.model;

public class Main {

    public static void main(String[] args) {
        User user = new User(124525859L, "Antonia", "T.");
        UserCredentials userCredentials = new UserCredentials(25252525L, "anto", "AntTsa");

        System.out.println("User id is: " + user.getId() + " , firstname is: " + user.getFirstname() + " , lastname is: "
        + user.getLastname());
        System.out.println("Credential id is: " + userCredentials.getId() + " username is: " + userCredentials.getUserName()
                + " and password is: " + userCredentials.getPassword());
    }

}
=======
package gr.aueb.cf.exercises.model;

public class Main {

    public static void main(String[] args) {
        User user = new User(124525859L, "Antonia", "T.");
        UserCredentials userCredentials = new UserCredentials(25252525L, "anto", "AntTsa");

        System.out.println("User id is: " + user.getId() + " , firstname is: " + user.getFirstname() + " , lastname is: "
        + user.getLastname());
        System.out.println("Credential id is: " + userCredentials.getId() + " username is: " + userCredentials.getUserName()
                + " and password is: " + userCredentials.getPassword());
    }

}
>>>>>>> d5544524851e3e881f020f73f789d61cf060d752
