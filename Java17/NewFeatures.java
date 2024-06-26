package Java17;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class NewFeatures {

    public static void main(String[] args) {
        // 1:

        SecureRandom random;
        try {
            random = SecureRandom.getInstanceStrong();
            int randomNumber = random.nextInt();
            System.out.println(randomNumber);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
