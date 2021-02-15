package me.tecnio.anticheat.check.api;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CheckInfo {
    String name();
    String type();

    boolean experimental() default false;
}
