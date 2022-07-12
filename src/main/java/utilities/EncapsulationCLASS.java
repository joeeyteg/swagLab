package utilities;

public class EncapsulationCLASS {

    // private variables declared here and they can only be accessed by public methods of the class
    private static int randomNumbers=0;

    // get method or GETTER

    public static int getRandomNumber() {return randomNumbers;}

    // set method  or SETTER

    public static void setRandomNumbers(int randomNumbers) {EncapsulationCLASS.randomNumbers= randomNumbers; }


}
