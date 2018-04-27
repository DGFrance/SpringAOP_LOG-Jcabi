package com.javabootcamp.spring.aspect;



import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Documented
@Retention(value=RUNTIME)
@Target(value={METHOD,TYPE})
public @interface Loggable{

}
