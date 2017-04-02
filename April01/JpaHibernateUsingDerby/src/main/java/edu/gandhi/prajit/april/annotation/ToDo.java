package edu.gandhi.prajit.april.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.TYPE, ElementType.LOCAL_VARIABLE,
		ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.SOURCE)
public @interface ToDo {
	String value() default "Too Much Relax To Make,Too Few Pressure To Take-Pl";
}
