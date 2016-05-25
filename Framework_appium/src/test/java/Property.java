import libraries.utility.DataReader;

/**
 * Created by User on 5/17/2016.
 */
public class Property {
    public static void main(String[] args) {
        DataReader data = new DataReader("dbconfig.properties");

        String hostname = data.getProperty("mysql.hostname");
        String port = data.getProperty("mysql.port");
        String dbname = data.getProperty("mysql.dbname");
        String user = data.getProperty("mysql.user");
        String password = data.getProperty("mysql.password");
        System.out.println(hostname);
        System.out.println(port);
        System.out.println(dbname);
        System.out.println(user);
        System.out.println(password);


//        String device = data.getProperty("system.name.iOS");
//        String pathApp = data.getProperty("system.app.path");
//        String appPackage = data.getProperty("system.device.status");
//
//        System.out.println(device);
//        System.out.println(pathApp);
//        System.out.println(appPackage);
//
//        data.setProperty("system.device.status","simulator 1");

    }
}

