package com.javabootcamp.spring.Example.dao;



import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j; // Lombok
import com.jcabi.log.Logger; //jCabi


@Component(AccountDAO.ACCOUNT_DAO)
//@Slf4j Lombok
public class AccountDAO {
    //    @Loggable(Loggable.DEBUG)
    public static final String ACCOUNT_DAO = "accountDAO";

    //        Logger logger = LoggerFactory.getLogger(AccountDAO.class); // ------------------> Slf4j & Lombok
    public void Test() {
        Integer temperature, t, oldT;
        temperature = 60;
        t = 10;
        oldT = t;
        t = temperature;
        try {

//            if (logger.isInfoEnabled()) {// -------------------->  Slf4j
//                logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);
//            }

            Logger.debug(this, "Temperature set to %s. Old temperature was %s", t, oldT); // --> jCabi

            if (temperature.intValue() > 50) { // -------------------------> Slf4j
//                try {
//                    if (logger.isInfoEnabled()) {
//                        logger.warn("Temperature has risen above 50 degrees.");
            }

            Logger.warn(this, "Temperature has risen above 50 degrees."); // --> jCabi

        } catch (Exception ex) {

//                }
        }
//        }finally {
//
//        }
//    }
    }
}