package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {


    //"file" gets the location of the Configuration.properties files
    File file = new File("src/main/resources/Configuration.properties");
    //"fis" reads the contents of the file
    FileInputStream fis = new FileInputStream(file);

    public Properties prop = null;

    public PropertiesReader() throws IOException {
        prop = new Properties();
        //"prop" stores the fis object
        prop.load(fis);
    }

    public String getNewToursURL(){return prop.getProperty("NewToursURL");}

    public String getComputerDatabaseURL(){return prop.getProperty("ComputerDatabaseURL");}


    public String getSwagLabsURL(){return prop.getProperty("SwagLabsURL");}


}
