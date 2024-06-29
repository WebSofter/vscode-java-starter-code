import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {
    private final static Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        logger.error("Info log message");
    }
}
