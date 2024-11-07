package main.java.com.fabulousnesss.myproject.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class AnnotationUtils {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface NullableWarning {
    }

    public static void printNullableWarnings(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NullableWarning.class)) {
                System.out.println("Variable [" + field.getName() + "] is null in [" + obj.getClass().getSimpleName() + "]!");
            }
        }
    }
}
