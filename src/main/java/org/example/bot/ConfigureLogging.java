import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

/* Логирование https://stepik.org/lesson/12774/step/8?unit=3122
* */

public static void ConfigureLogging() {
    Logger LOGGER_A = Logger.getLogger("org.stepic.java.logging.ClassA");
    LOGGER_A.setLevel(Level.ALL);

    Logger LOGGER_B = Logger.getLogger("org.stepic.java.logging.ClassB");
    LOGGER_B.setLevel(Level.WARNING);

    Logger LOGGER_ALL = Logger.getLogger("org.stepic.java");
    ConsoleHandler consoleHandler = new ConsoleHandler();
    consoleHandler.setLevel(Level.ALL);
    consoleHandler.setFormatter(new XMLFormatter());
    
    LOGGER_ALL.addHandler(consoleHandler);
    LOGGER_ALL.setUseParentHandlers(false);
}

public void main() {
}
