package naturalistic.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Verb {
	String name();
	String signature();
	String preposition() default "";
	String returnType();
	String container();
}

/*class House2 {
	@Verb(name = "verbo", signature = "verbo itself", returnType = "House")
	public void verbo(){}
	
	@Verb(name = "sell", signature = "sell itself to String", preposition = "to", returnType = "House")
	public Object sell(String owner) {
		return null;
	}
	
	@Verb(name = "sell", signature = "sell itself to String", preposition = "to", returnType = "Object")
	public Object changeState(int number, float age) {
		return null;
	}
}*/