package hqlplus.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//hibernate elements function

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Elements {
	String alias();

	String inAliasField();
}
