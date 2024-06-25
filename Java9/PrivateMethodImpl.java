package Java9;

class Person implements PrivateMethodInterface {
    // No need to override the default greet() method
}

public class PrivateMethodImpl {

    public static void main(String[] args) {
        PrivateMethodInterface person = new Person();
        person.sendNotifications(); // Will use the default method implementation
        //Output : Getting conncetions Send notification
    }
    
}
