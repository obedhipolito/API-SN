package naturalistic.lang

/**
@author Oscar Pulido Prieto.
*/

//@naturalistic.lang.annotations.Verb(name = "", preposition = "", signature = "", returnType = "")

object String {
  //var strings : scala.List[String] = List[String]();
  
  def instance(string : java.lang.String) : naturalistic.lang.String = {
    /*var aux : scala.List[String] = strings.collect {case a : String => a};
    aux = aux.filter(_.value == string)
    
    if(aux.length == 1) {
      return aux.head;
    } else {
	    val inst = new naturalistic.lang.String{};
	    inst.value = string;
	    strings = strings ::: List(inst);
	    inst;
    }*/
    val inst = new naturalistic.lang.String/*{}*/;
    inst.contained = string;
    //strings = strings ::: List(inst);
    inst;
  }
}


object newline extends naturalistic.lang.String {
  {
    this.setContained("\n");
  }
}

@naturalistic.lang.annotations.Noun(name = "String", plural = "Strings")
/*abstract*/ class String extends naturalistic.lang.Thing {
  
  private var contained : java.lang.String = "";
  def setContained(value : java.lang.String) {
    this.contained = value
  }
  def getContained = contained
  
  //value_$eq asigna
  def value_$eq(str : naturalistic.lang.String) {
    this.contained = str.contained;
  }
  //value devuelve
  def value = this;
  
  def setContainerValue(value : naturalistic.lang.String) {
    this.contained = value.asInstanceOf[java.lang.String];
  }
  
  //override def toString = value;
  //def string_of_itself = naturalistic.lang.String.instance(value.toString);
  
  @naturalistic.lang.annotations.Verb(name = "equal", preposition = "to", signature = "itself equal to Thing", returnType = "naturalistic.lang.Boolean", container = "String")
  override def itself_equal_to_arg(thing : naturalistic.lang.Adjective) : naturalistic.lang.Boolean = {
		//java.lang.System.out.println("DDD " + this.hashCode() + " ::: " + thing.hashCode() + " +++ " + this.equals(thing));
    if(!thing.isInstanceOf[String]) {
      return False;
    }
    if(thing.asInstanceOf[String].contained.equals(this.contained)) {
      return True;
    }
    return False;
  }
  
  @naturalistic.lang.annotations.Verb(name = "distinct", preposition = "to", signature = "itself distinct to naturalistic.lang.Comparable", returnType = "naturalistic.lang.Boolean", container = "String")
  override def itself_distinct_to_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Adjective") str : naturalistic.lang.Adjective) : naturalistic.lang.Boolean = {
    if(str.isInstanceOf[naturalistic.lang.String]) {
      if(this.equals(str)) {
        return naturalistic.lang.Boolean.instance(false);
      }
      if(str.isInstanceOf[naturalistic.lang.String]) {
        return naturalistic.lang.Boolean.instance(!this.contained.equals(str.asInstanceOf[naturalistic.lang.String].contained));
      }
      return naturalistic.lang.Boolean.instance(true);
    } else {
      return naturalistic.lang.Boolean.instance(true);
    }
    //return naturalistic.lang.Boolean.instance(true);
  }
  
  //itself equal to String
  /*@naturalistic.lang.annotations.Verb(name = "equal", preposition = "to", signature = "itself equal to String", returnType = "Boolean")
  def itself_equal_to_arg(str : naturalistic.lang.Thing) : naturalistic.lang.Boolean = {
    if(this.equals(str)) {
      return naturalistic.lang.Boolean.instance(true);
    }
    if(str.isInstanceOf[naturalistic.lang.String]) {
      return naturalistic.lang.Boolean.instance(this.contained.equals(str.asInstanceOf[naturalistic.lang.String].contained));
    }
    return naturalistic.lang.Boolean.instance(false);
  }*/
  
  //string of itself
  @naturalistic.lang.annotations.Verb(name = "string", signature = "string of itself", returnType = "String", container = "String")
  override def string_of_itself : naturalistic.lang.String = naturalistic.lang.String.instance(contained);
  
  //hash of itself
  @naturalistic.lang.annotations.Verb(name = "hash", preposition = "hash of itself", signature = "", returnType = "Number", container = "String")
  def hash_of_itself : naturalistic.lang.Number with NumberProperty = naturalistic.lang.Number.instance(this.contained.hashCode);
  
  //compares String with itself
  @naturalistic.lang.annotations.Verb(name = "compare", preposition = "with", signature = "compare String with itself", returnType = "Integer", container = "String")
  def compare_arg_with_itself(arg0 : naturalistic.lang.String) : naturalistic.lang.Number with NumberProperty = {
    naturalistic.lang.Number.instance(this.contained.compareTo(arg0.contained));
  }
  
  //position Integer in itself
  @naturalistic.lang.annotations.Verb(name = "position", preposition = "in", signature = "position Integer in itself", returnType = "naturalistic.lang.String", container = "String")
  def position_arg_in_itself(arg0 : naturalistic.lang.Integer) : naturalistic.lang.Number with naturalistic.lang.Character = {
    naturalistic.lang.Number.instance(contained.charAt(arg0.__intValue));
  }
  
  /*def compareTo(arg0 : naturalistic.lang.Thing) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.contained.compareTo(arg0.contained));
  }*/
  
  /*
  private var selectedIndex : scala.Int = value.length;
  
  //index of itself
  @naturalistic.lang.annotations.Verb(name = "index", signature = "index of itself", returnType = "Integer")
  def index_of_itself : naturalistic.lang.Number with naturalistic.lang.Integer = {
    naturalistic.lang.Number.instance(selectedIndex.asInstanceOf[scala.Int]);
  }
  
  private var selectedChar : scala.Char = value.charAt(value.length);
  //search Character in itself
  @naturalistic.lang.annotations.Verb(name = "search", preposition = "in", signature = "search Character in itself", returnType = "String")
  def search_arg_in_itself(arg0 : naturalistic.lang.Character) : naturalistic.lang.String = {
    selectedChar = arg0.contained.asInstanceOf[scala.Char]
    this
  }
  
  //char of itself 
  @naturalistic.lang.annotations.Verb(name = "character", signature = "character of itself", returnType = "Character")
  def character_of_itself : naturalistic.lang.Number with naturalistic.lang.Character = {
    //naturalistic.lang.Character.instance(selectedChar.asInstanceOf[scala.Char]);
    naturalistic.lang.Character.instance(value.charAt(selectedIndex));
  }
  */
  
  //integer of itself
  @naturalistic.lang.annotations.Verb(name = "integer", signature = "integer of itself", returnType = "Character", container = "String")
  def integer_of_itself : naturalistic.lang.Number with naturalistic.lang.NumberProperty = {
    naturalistic.lang.Number.instance(contained.toInt);
  }
  
  //real of itself
  @naturalistic.lang.annotations.Verb(name = "real", signature = "real of itself", returnType = "Character", container = "String")
  def real_of_itself : naturalistic.lang.Number with naturalistic.lang.NumberProperty = {
    naturalistic.lang.Number.instance(contained.toFloat);
  }
  
  //concat String with itself
  @naturalistic.lang.annotations.Verb(name = "concat", preposition = "with", signature = "concat String with itself", returnType = "String", container = "String")
  def concat_arg_with_itself(arg0 : naturalistic.lang.String) : naturalistic.lang.String = {
    naturalistic.lang.String.instance(this.contained.concat(arg0.contained));
  }
  
  //itself contains String
  @naturalistic.lang.annotations.Verb(name = "contains", preposition = "itself contains String", signature = "", returnType = "Boolean", container = "String")
  def itself_contains_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean.instance(this.contained.contains(arg0.contained));
  }
  
  //itself ends with String
  @naturalistic.lang.annotations.Verb(name = "ends", preposition = "with", signature = "itself ends with String", returnType = "Boolean", container = "String")
  def itself_ends_with_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean.instance(this.contained.endsWith(arg0.contained));
  }
  
  //empty of itself
  @naturalistic.lang.annotations.Verb(name = "empty", signature = "empty of itself", returnType = "Boolean", container = "String")
  def empty_of_itself : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean.instance(this.contained.isEmpty);
  }
  
  //length of itself
  @naturalistic.lang.annotations.Verb(name = "length", signature = "length of itself", returnType = "Integer", container = "String")
  def length_of_itself : naturalistic.lang.Number with NumberProperty = {
    naturalistic.lang.Number.instance(this.contained.length);
  }
  
  //itself split with String
  @naturalistic.lang.annotations.Verb(name = "splits", preposition = "with", signature = "itself splits with String", returnType = "Strings", container = "String")
  def itself_splits_with_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Strings/*[naturalistic.lang.String]*/ = {
    val strings = Strings.instance(null);
    val aux = this.contained.split(arg0.contained)
    for(str <- aux) {
      strings.add_arg_to_itself(naturalistic.lang.String.instance(str))
    }
    strings;
  }
  
  //itself starts with String
  @naturalistic.lang.annotations.Verb(name = "starts", preposition = "with", signature = "itself starts with String", returnType = "Boolean", container = "String")
  def itself_starts_with_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean.instance(this.contained.startsWith(arg0.contained));
  }
  
  //array of itself
  @naturalistic.lang.annotations.Verb(name = "array", signature = "array of itself", returnType = "Numbers", container = "String")
  def array_of_itself : naturalistic.lang.Characters/*[Character]*/ = {
    val aux = naturalistic.lang.Characters.instance(Array(classOf[naturalistic.lang.Character]));
      for(char <- this.contained.toCharArray) {
        aux.add_arg_to_itself(naturalistic.lang.Character.instance(char));
      }
    return aux;
  }
  
  //chars of itself
  @naturalistic.lang.annotations.Verb(name = "characters", signature = "characters of itself", returnType = "Numbers", container = "String")
  def characters_of_itself : naturalistic.lang.Characters/*[_]*/ = {
    val aux : naturalistic.lang.Characters/*[naturalistic.lang.Character]*/ = naturalistic.lang.Characters.instance(Array(classOf[naturalistic.lang.Character]));
    for(char <- this.contained.toCharArray) {
      aux.add_arg_to_itself(naturalistic.lang.Character.instance(char));
    }
    aux;
  }
  
  //uppercase of itself
  @naturalistic.lang.annotations.Verb(name = "uppercase", signature = "uppercase of itself", returnType = "String", container = "String")
  def uppercase_of_itself : naturalistic.lang.String = {
    naturalistic.lang.String.instance(this.contained.toUpperCase());
  }
  
  //lowercase of itself
  @naturalistic.lang.annotations.Verb(name = "lowercase", signature = "lowercase of itself", returnType = "String", container = "String")
  def lowercase_of_itself : naturalistic.lang.String = {
    naturalistic.lang.String.instance(this.contained.toLowerCase());
  }
  
  //add String to itself
  @naturalistic.lang.annotations.Verb(name = "add", preposition = "to", signature = "add String to itself", returnType = "String", container = "String")
  def add_arg_to_itself(arg0 : naturalistic.lang.Adjective) : naturalistic.lang.String = {
    if(arg0 != null) this.contained = this.contained + arg0.string_of_itself.contained;
    else this.contained = this.contained + null
    this;
  }
  
  @naturalistic.lang.annotations.Verb(name = "matches", signature = "itself matches String", returnType = "Boolean", container = "String")
  def itself_matches_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean.instance(this.contained.matches(arg0.contained));
  }
  
  private var marked : scala.Char = _;
  /*def getMarked : scala.Char = marked;
  def dismark {
    marked = 0.toChar;
  }*/
  
  @naturalistic.lang.annotations.Verb(name = "mark", preposition = "in",  signature = "mark Character in itself", returnType = "String", container = "String")
  def mark_arg_in_itself(arg0 : naturalistic.lang.Character) : naturalistic.lang.String = {
    if(this.contained.contains(arg0.__charValue)) {
      marked = arg0.__charValue;
    }
    this;
    //naturalistic.lang.Boolean.instance(this.contained.matches(arg0.contained));
  }
  
  @naturalistic.lang.annotations.Verb(name = "replace", preposition = "into",  signature = "replace Character into itself", returnType = "String", container = "String")
  def replace_arg_into_itself(arg0 : naturalistic.lang.Character) : naturalistic.lang.String = {
    this.contained = this.contained.replace(marked, arg0.__charValue);
    marked = 0.toChar;
    //println(this.__charValue + " :::: " + arg0.getMarked);
    this;
  }
}


class Strings/*[T <: naturalistic.lang.String]*/ extends naturalistic.lang.Things/*[naturalistic.lang.String]*/ {
  
	/*def equal(str : naturalistic.lang.Thing) : naturalistic.lang.Strings[T] = {
	  for(aux <- this.pluralAux) {
	    aux.equals(str);
	  }
    return this
  }
  
  //hash of itself
	@naturalistic.lang.annotations.Verb(name = "hash", signature = "hash of itself", returnType = "Numbers")
  def hash_of_itself : naturalistic.lang.Numbers[_] = {
	  val ret = naturalistic.lang.Numbers.instance(scala.Array(classOf[naturalistic.lang.Integer]));
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.hash_of_itself);
	  }
	  return ret;
  }
  
  //itself compares with
	/**@naturalistic.lang.annotations.Verb(name = "", preposition = "", signature = "", returnType = "")*/
  @naturalistic.lang.annotations.Verb(name = "compare", preposition = "with", signature = "compare String with itself", returnType = "Numbers")
  def compare_arg_with_itself(arg0 : naturalistic.lang.String) : naturalistic.lang.Numbers[_] = {
    val ret = naturalistic.lang.Numbers.instance(scala.Array(classOf[naturalistic.lang.Integer]));
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.compare_arg_with_itself(arg0));
	  }
    return ret;
  }
  
  @naturalistic.lang.annotations.Verb(name = "choose", preposition = "from", signature = "choose Integer from itself", returnType = "Strings")
  def choose_arg_from_itself(arg0 : naturalistic.lang.Integer) : naturalistic.lang.Strings[T] = {
	  for(aux <- this.pluralAux) {
	    aux.choose_arg_from_itself(arg0);
	  }
    return this
  }
  
  @naturalistic.lang.annotations.Verb(name = "index", signature = "index of itself", returnType = "Numbers")
  def index_of_itself : naturalistic.lang.Numbers[_] = {
    val ret = naturalistic.lang.Numbers.instance(Array(classOf[naturalistic.lang.Integer]));
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.index_of_itself);
	  }
    return ret
  }
  
  /*@naturalistic.lang.annotations.Verb(name = "search", preposition = "in", signature = "search Character in itself", returnType = "Strings")
  def search_arg_in_itself(arg0 : naturalistic.lang.Character) : naturalistic.lang.Numbers[_] = {
    val ret = 
	  for(aux <- this.pluralAux) {
	    aux.search_in_itself(arg0);
	  }
    return this
  }*/
  
  @naturalistic.lang.annotations.Verb(name = "character", signature = "character of itself", returnType = "Character")
  def character_of_itself : naturalistic.lang.Numbers[_] = {
    val ret = naturalistic.lang.Numbers.instance(scala.Array(classOf[naturalistic.lang.Character]))
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.character_of_itself);
	  }
    return ret;
  }
  
  @naturalistic.lang.annotations.Verb(name = "concat", preposition = "with", signature = "concat with itself", returnType = "Strings")
  def concat_arg_with_itself(arg0 : naturalistic.lang.String) : naturalistic.lang.Strings[_] = {
    val ret = naturalistic.lang.Strings.instance(scala.Array());
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.concat_arg_with_itself(arg0));
	  }
    return ret;
  }
  
  @naturalistic.lang.annotations.Verb(name = "contains", signature = "itself contains String", returnType = "Booleans")
  def itself_contains_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Booleans = {
    val ret = naturalistic.lang.Booleans.instance(Array())
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.itself_contains_arg(arg0));
	  }
    return ret
  }
  
  @naturalistic.lang.annotations.Verb(name = "ends", preposition = "with", signature = "itself ends with String", returnType = "Strings")
  def itself_ends_with_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Booleans = {
    val ret = naturalistic.lang.Booleans.instance(Array())
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.itself_ends_with_arg(arg0));
	  }
    return ret
  }
  
  @naturalistic.lang.annotations.Verb(name = "empty", signature = "empty of itself", returnType = "Strings")
  def empty_of_itself : naturalistic.lang.Booleans = {
    val ret = naturalistic.lang.Booleans.instance(Array());
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.empty_of_itself);
	  }
    return ret
  }
  
  @naturalistic.lang.annotations.Verb(name = "length", signature = "length of itself", returnType = "Numbers")
  def length_of_itself : naturalistic.lang.Numbers[_] = {
    val ret = naturalistic.lang.Numbers.instance(scala.Array(classOf[Integer]))
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.length_of_itself);
	  }
    return ret;
  }
  
  @naturalistic.lang.annotations.Verb(name = "splits", preposition = "with", signature = "itself splits with String", returnType = "Things")
  def itself_splits_with_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Things[_] = {
    val ret = naturalistic.lang.Things.instance(scala.Array())
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.itself_splits_with_arg(arg0));
	  }
    return ret
  }
  
  @naturalistic.lang.annotations.Verb(name = "starts", preposition = "with", signature = "itself starts with String", returnType = "Booleans")
  def itself_starts_with_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.Booleans = {
	  val ret = naturalistic.lang.Booleans.instance(Array())
	  for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.itself_starts_with_arg(arg0));
	  }
    return ret
  }
  
  @naturalistic.lang.annotations.Verb(name = "array", signature = "array of itself", returnType = "")
  def array_of_itself : naturalistic.lang.Things[_] = {
    val ret = naturalistic.lang.Things.instance(scala.Array())
    for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.array_of_itself);
	  }
    return ret
  }
  
  @naturalistic.lang.annotations.Verb(name = "uppercase", signature = "uppercase of itself", returnType = "String")
  def uppercase_of_itself : naturalistic.lang.Strings[_] = {
    val ret = naturalistic.lang.Strings.instance(scala.Array());
    for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.uppercase_of_itself);
	  }
    return ret;
  }
  
  @naturalistic.lang.annotations.Verb(name = "lowercase", signature = "lowercase of itself", returnType = "String")
  def lowercase_of_itself : naturalistic.lang.Strings[_] = {
    val ret = naturalistic.lang.Strings.instance(scala.Array());
    for(aux <- this.pluralAux) {
	    ret.add_arg_to_itself(aux.lowercase_of_itself);
	  }
    return ret;
  }*/
	
}
object Strings /*extends naturalistic.lang.Things*//*[Thing]*/ {
  
  val singular : java.lang.Class[_ <: Adjective] = classOf[naturalistic.lang.String];
  
	def instance(itfs : Array[java.lang.Class[_]]) = {
		val t = new Strings/*[String]*/;
		t.parentClass = singular//t.parentClass = classOf[naturalistic.lang.String];
		t.interfaces = itfs;
		t;
	}
}

/*
  
  **def equals(arg0 : naturalistic.lang.Thing) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.contained.equals(arg0.contained));
  }
  **def toString : naturalistic.lang.String = {
    naturalistic.lang.String(this.contained.toString);
  }
  **def hashCode : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.contained.hashCode);
  }
  **def compareTo(arg0 : naturalistic.lang.String) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.contained.compareTo(arg0.contained));
  }
  ++def compareTo(arg0 : naturalistic.lang.Thing) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.compareTo(arg0.value));
  }
  **def indexOf(arg0 : naturalistic.lang.String, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.indexOf(arg0.value, arg1.value));
  }
  **def indexOf(arg0 : naturalistic.lang.String) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.indexOf(arg0.value));
  }
  **def indexOf(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.indexOf(arg0.value, arg1.value));
  }
  **def indexOf(arg0 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.indexOf(arg0.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Number with Integer) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Number with Long) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Number with Float) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Boolean) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Characters) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Characters, arg1 : naturalistic.lang.Number with Integer, arg2 : naturalistic.lang.Number with Integer) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value, arg1.value, arg2.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Thing) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Character) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value));
  }
  --def valueOf(arg0 : naturalistic.lang.Number with Double) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.valueOf(arg0.value));
  }
  **def charAt(arg0 : naturalistic.lang.Number with Integer) : naturalistic.lang.Character = {
    naturalistic.lang.Character(this.value.charAt(arg0.value));
  }
  def codePointAt(arg0 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.codePointAt(arg0.value));
  }
  def codePointBefore(arg0 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.codePointBefore(arg0.value));
  }
  def codePointCount(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.codePointCount(arg0.value, arg1.value));
  }
  def compareToIgnoreCase(arg0 : naturalistic.lang.String) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.compareToIgnoreCase(arg0.value));
  }
  **def concat(arg0 : naturalistic.lang.String) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.concat(arg0.value));
  }
  **def contains(arg0) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.contains(arg0.value));
  }
  def contentEquals(arg0) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.contentEquals(arg0.value));
  }
  def contentEquals(arg0) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.contentEquals(arg0.value));
  }
  def copyValueOf(arg0 : naturalistic.lang.Characters) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.copyValueOf(arg0.value));
  }
  def copyValueOf(arg0 : naturalistic.lang.Characters, arg1 : naturalistic.lang.Number with Integer, arg2 : naturalistic.lang.Number with Integer) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.copyValueOf(arg0.value, arg1.value, arg2.value));
  }
  **def endsWith(arg0 : naturalistic.lang.String) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.endsWith(arg0.value));
  }
  def equalsIgnoreCase(arg0 : naturalistic.lang.String) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.equalsIgnoreCase(arg0.value));
  }
  def format(arg0, arg1 : naturalistic.lang.String, arg2 : naturalistic.lang.Things) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.format(arg0.value, arg1.value, arg2.value));
  }
  def format(arg0 : naturalistic.lang.String, arg1 : naturalistic.lang.Things) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.format(arg0.value, arg1.value));
  }
  def getBytes(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.Number with Integer, arg2 : naturalistic.lang.Numbers[Byte], arg3 : naturalistic.lang.Number with Integer) {
    this.value.getBytes(arg0.value, arg1.value, arg2.value, arg3.value);}
  }
  def getBytes(arg0) : naturalistic.lang.Numbers[naturalistic.lang.Byte] = {
  def getBytes(arg0 : naturalistic.lang.String) : naturalistic.lang.Numbers[naturalistic.lang.Byte] = {
  def getBytes : naturalistic.lang.Numbers[naturalistic.lang.Byte] = {
  def getChars(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.Number with Integer, arg2 : naturalistic.lang.Characters, arg3 : naturalistic.lang.Number with Integer) {
    this.value.getChars(arg0.value, arg1.value, arg2.value, arg3.value);}
  }
  def intern : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.intern);
  }
  **def isEmpty : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.isEmpty);
  }
  def join(arg0, arg1) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.join(arg0.value, arg1.value));
  }
  def join(arg0, arg1) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.join(arg0.value, arg1.value));
  }
  def lastIndexOf(arg0 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.lastIndexOf(arg0.value));
  }
  def lastIndexOf(arg0 : naturalistic.lang.String) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.lastIndexOf(arg0.value));
  }
  def lastIndexOf(arg0 : naturalistic.lang.String, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.lastIndexOf(arg0.value, arg1.value));
  }
  def lastIndexOf(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.lastIndexOf(arg0.value, arg1.value));
  }
  **def length : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.length);
  }
  def matches(arg0 : naturalistic.lang.String) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.matches(arg0.value));
  }
  def offsetByCodePoints(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.Number with Integer = {
    naturalistic.lang.Number(this.value.offsetByCodePoints(arg0.value, arg1.value));
  }
  def regionMatches(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.String, arg2 : naturalistic.lang.Number with Integer, arg3 : naturalistic.lang.Number with Integer) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.regionMatches(arg0.value, arg1.value, arg2.value, arg3.value));
  }
  def regionMatches(arg0 : naturalistic.lang.Boolean, arg1 : naturalistic.lang.Number with Integer, arg2 : naturalistic.lang.String, arg3 : naturalistic.lang.Number with Integer, arg4 : naturalistic.lang.Number with Integer) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.regionMatches(arg0.value, arg1.value, arg2.value, arg3.value, arg4.value));
  }
  def replace(arg0 : naturalistic.lang.Character, arg1 : naturalistic.lang.Character) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.replace(arg0.value, arg1.value));
  }
  def replace(arg0, arg1) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.replace(arg0.value, arg1.value));
  }
  def replaceAll(arg0 : naturalistic.lang.String, arg1 : naturalistic.lang.String) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.replaceAll(arg0.value, arg1.value));
  }
  def replaceFirst(arg0 : naturalistic.lang.String, arg1 : naturalistic.lang.String) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.replaceFirst(arg0.value, arg1.value));
  }
  **def split(arg0 : naturalistic.lang.String) : naturalistic.lang.Strings = {
  **def split(arg0 : naturalistic.lang.String, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.Strings = {
  **def startsWith(arg0 : naturalistic.lang.String, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.startsWith(arg0.value, arg1.value));
  }
  **def startsWith(arg0 : naturalistic.lang.String) : naturalistic.lang.Boolean = {
    naturalistic.lang.Boolean(this.value.startsWith(arg0.value));
  }
/*  def subSequence(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.Number with Integer)*/
  def substring(arg0 : naturalistic.lang.Number with Integer) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.substring(arg0.value));
  }
  def substring(arg0 : naturalistic.lang.Number with Integer, arg1 : naturalistic.lang.Number with Integer) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.substring(arg0.value, arg1.value));
  }
  **def toCharArray : naturalistic.lang.Characters = {
  def toLowerCase(arg0) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.toLowerCase(arg0.value));
  }
  def toLowerCase : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.toLowerCase);
  }
  def toUpperCase : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.toUpperCase);
  }
  def toUpperCase(arg0) : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.toUpperCase(arg0.value));
  }
  def trim : naturalistic.lang.String = {
    naturalistic.lang.String(this.value.trim);
  }
/*  def chars*/
/*  def codePoints*/



*/