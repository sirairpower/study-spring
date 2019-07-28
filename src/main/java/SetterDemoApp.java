import features.Feature;
import items.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;

public class SetterDemoApp {

    private static Logger logger = LoggerFactory.getLogger(SetterDemoApp.class);


    public static void main(final String[] args) {
        testBean();
        testJDBC();
    }

    private static void testBean() {
        logger.info("\n start testBean ----- ");
        final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        final Item toyItem = applicationContext.getBean("toy", Item.class);
        final Feature feature = applicationContext.getBean("saftyFeature", Feature.class);
        logger.info("{} is good , because of {}", toyItem.getName(), toyItem.showFeatures(feature));
        logger.info(" end testBean ----- \n");
        applicationContext.close();

    }

    private static void testJDBC() {
        logger.info("\n start testJDBC ----- ");
        final String jdbcURL = "jdbc:mysql://localhost:3306/fu?useSSL=false&serverTimezone=UTC";
        final String username = "fgw_util";
        final String password = "sir_apow995";

        try {
            final Connection myConn = DriverManager.getConnection(jdbcURL, username, password);
        } catch (final Exception e) {
            logger.error(e.getMessage(), e);
        }
        logger.info(" end testJDBC ----- \n");
    }
}
