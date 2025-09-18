package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loggerload {
    private static Logger logger = LogManager.getLogger();

    public static void info(String message) {
        logger.info(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    // Optional: Add methods that include class name for better tracing
    public static void info(String className, String message) {
        logger.info("[" + className + "] " + message);
    }

    public static void error(String className, String message) {
        logger.error("[" + className + "] " + message);
    }
}
