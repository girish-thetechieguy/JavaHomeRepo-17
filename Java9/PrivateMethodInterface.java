package Java9;

public interface PrivateMethodInterface {
    default void sendNotifications() {
        getConnection();
        System.out.println("Send notification");
    }

    static void createNotifications() {
        getConnection();
        System.out.println("create notification");
        }
        
    private static void getConnection() {
            System.out.println("Getting conncetions");
    }
}



