package naturalistic.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Parameter {
	String name();
	String parameterType();
}

/*class House3 {
@Verb(name = "verbo", signature = "verbo itself", returnType = "House")
public void verbo(){}

@Verb(name = "sell", signature = "sell itself to String", preposition = "to", returnType = "House")
public Object sell(@Parameter(name = "owner", type = "String") String owner) {
	return null;
}

@Verb(name = "sell", signature = "sell itself to String", preposition = "to", returnType = "Object")
public Object changeState(@Parameter(name = "number", type = "int") int number, @Parameter(name = "age", type = "float") float age) {
	return null;
}
}*/