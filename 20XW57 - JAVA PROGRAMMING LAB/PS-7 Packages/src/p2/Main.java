package p2;
import java.lang.*;
import java.util.*;


// Can add the sending and receiving messages as Message, Inbox classes. If I have time, i.e..
public class Main {
    public static void main(String[] args) {
        // Making three people
        Person p1 = new Person("p1", "M", new Date(1,1,1), "phn1", "email1");
        Person p2 = new Person("p2", "F", new Date(2,2,2), "phn2", "email2");
        Person p3 = new Person("p3", "F", new Date(3,3,3), "phn3", "email3");

        // Making accounts for the three people
        Account a1 = new Account(p1, "u1", "pass1");
        Account a2 = new Account(p2, "u2", "pass2");
        Account a3 = new Account(p3, "u3", "pass3");

        // Adding friends to a1's list
        a1.addFriend(a2);
        a1.addFriend(a3);

        // Display the details a1 account.
        a1.toString();

        // Displaying info for all of a1's friends.
        a1.displayFriendInfo();

        System.exit(0); // EXIT_SUCCESS, I think.
    }
}
