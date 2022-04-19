package hw10.utils;

import hw10.App;
import hw10.Main;

import java.io.IOException;
import java.util.Properties;

public final class Utils {

    public static Properties getProp() {
        Properties prop = new Properties();
        try {
            prop.load(App.class.getClassLoader().getResourceAsStream("application.properties"));
            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
