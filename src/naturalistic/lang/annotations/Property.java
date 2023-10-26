package naturalistic.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Property {
	String name();
	String plural() default "";
	String value() default "";
	String noun();
}

/*class HouseProp {
	@Property(name = "room", plural = "rooms")
	private int room = 0;
	@Property(name = "bath", plural = "baths", value = "0")
	private int bath = 0;
}*/