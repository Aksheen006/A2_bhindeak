package ca.sheridancollege.bhindeak.passwordstorebhindeak.utilities;

import java.util.Random;

/* Name: Aksheen Bhinder
student id : 991762812
 */

public class RandomNumberGenerator {

    public static Long generateId() {
        Random random = new Random();
        return 100000000L + random.nextInt(900000000);
    }
}
