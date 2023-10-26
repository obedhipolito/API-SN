package naturalistic.lang

@naturalistic.lang.annotations.Noun(name = "Number", plural = "Numbers")
abstract class Ordinal extends Thing {
  
  private var primitive : scala.Int = 0;
  def getValue[T >: scala.AnyVal] = primitive;
  def setValue(value : scala.Int) {
    this.primitive = value;
  }
  def setValue(value : scala.Long) {
    this.primitive = value.toInt;
  }
  
  def value_$eq(num : Number with Integer) {
    this.primitive = num.getValue.toInt;
  }
  
  def value = this;
	
  def __intValue : scala.Int = primitive.asInstanceOf[scala.Int];
  
  def setContainerValue(value : NumberProperty) {
    this.primitive = value.getValue.asInstanceOf[scala.Int];
  }
  
  /*override def string_of_itself: String = {
    val cad = primitive.toString.charAt(primitive.toString.length()-1) match {
      case '0' => (primitive+1).toString + "st"
      case '1' => (primitive+1).toString + "nd"
      case '2' => (primitive+1).toString + "rd"
      case _ => (primitive+1).toString + "th"
    }
    return String.instance(cad);
    
  }*/
  
  
}

object Ordinal {
  def instance(ordinal : Int) : Ordinal = {
    val inst = new Ordinal{};
    inst.setValue(ordinal);
    
    inst;
  }
}

object test extends App {
  
  //new Ordinal(Number.instance(4))
}