package utilities;

import java.util.Random;

public class Utility {

public static int generateFiveRandomNumbers(){

    Random rand = new Random();
    int fiveRandomNumbers=rand.nextInt(1000);
    return fiveRandomNumbers;

}



}
