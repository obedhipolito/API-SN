package naturalistic.lang;

/**
@author Oscar Pulido Prieto.
*/

object Boolean {
  def instance(b : scala.Boolean) : Boolean = {
    //java.lang.System.out.println("+++ " + b);
    if(b) {
      True
    } else {
      False
    }
  }
}

class Booleans/*[T]*/ extends naturalistic.lang.Things/*[Boolean]*/ {
  
}

object Booleans /*extends naturalistic.lang.Things*//*[Boolean]*/ {
  
  val singular : java.lang.Class[_ <: Adjective] = classOf[naturalistic.lang.Boolean];
  
	def instance(itfs : Array[java.lang.Class[_]]) = {
		val t = new Booleans;
		t.parentClass = singular//t.parentClass = classOf[naturalistic.lang.Boolean];
		t.interfaces = itfs;
		t;
	}
}

abstract class Boolean extends naturalistic.lang.Thing {
  
  private var bool : scala.Boolean = false;
  def setBool(value : scala.Boolean) {
    this.bool = value
  }
  def getBool : scala.Boolean = bool
  
  //value_$eq asigna
  def value_$eq(bl : naturalistic.lang.Boolean) {
    this.bool = bl.getBool;
  }
  //value devuelve
  def value = this;
  
  //override def toString = string.toString;
  
  def setContainerValue(value : naturalistic.lang.Boolean) {
    this.bool = value.getBool.asInstanceOf[scala.Boolean];
  }
  
  def isFalse() : scala.Boolean /*= !this.getBool*/
  def isTrue() : scala.Boolean /*= this.getBool*//* = {
    println("isTrue : " + value);
    value
  }*/
  
  def not() : naturalistic.lang.Boolean /*= Boolean.instance(!this.getBool)*//* = {
    println("not : " + value);
    println("!not : " + !value);
    Boolean.instance(!value)
  }*/
  
  def string_of_itself : naturalistic.lang.String;
  
  //def unary_! : naturalistic.lang.Boolean = Boolean.instance(!value)
  
  @naturalistic.lang.annotations.Verb(name = "equal", preposition = "to", signature = "itself equal to Thing", returnType = "naturalistic.lang.Thing", container = "Boolean")
  override def itself_equal_to_arg(thing : Adjective) : naturalistic.lang.Boolean = {
    if(thing.isInstanceOf[naturalistic.lang.Boolean]) {
      if(thing.asInstanceOf[naturalistic.lang.Boolean].bool == this.bool) {
        True;
      } else {
        False;
      }
    } else {
      False;
    }
  }
}

object True extends naturalistic.lang.Boolean {
  // /*private*/ val value = true;
  
  {
    setBool(true);
  }
  
  def isFalse : scala.Boolean = !this.getBool
  def isTrue : scala.Boolean = this.getBool
  
  def not : naturalistic.lang.Boolean = Boolean.instance(!this.getBool)
  
  override def string_of_itself : naturalistic.lang.String = naturalistic.lang.String.instance(/*value.toString*/"true");
}

object False extends naturalistic.lang.Boolean {
  // private val value = false;
  
  def isFalse : scala.Boolean = !this.getBool
  def isTrue : scala.Boolean = this.getBool
  
  def not : naturalistic.lang.Boolean = Boolean.instance(!this.getBool)
  
  override def string_of_itself : naturalistic.lang.String = naturalistic.lang.String.instance(/*value.toString*/"false");
}