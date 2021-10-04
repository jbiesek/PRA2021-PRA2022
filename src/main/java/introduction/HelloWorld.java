package introduction;

import java.util.logging.Logger;

public class HelloWorld {

    final static Logger logger = Logger.getLogger("HelloWorld.class");

    public static void main(String [ ] args) {
        System.out.println("Hello! Witaj!");
        logger.info("hahaha");
    }
}