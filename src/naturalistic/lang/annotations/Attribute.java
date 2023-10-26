package naturalistic.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Attribute {
	String name();
	String value() default "";
	String container();
}

/*class HouseAttr {
	@Attribute(name = "room")
	private int room = 0;
	@Attribute(name = "bath", value = "0")
	private int bath = 0;
}*/