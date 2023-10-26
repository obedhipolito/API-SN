// Generated with a naturalistic language
// Filename: D:\RESPALDOS DE ESCRITORIO CORTADOS\lenguaje\naturalistic\lang\NumberProperty.sn
package naturalistic.lang
@naturalistic.lang.annotations.Adjective(name = "NumberProperty")
trait NumberProperty extends naturalistic.lang.Adjective with naturalistic.lang.Comparable {
  
  //def string : naturalistic.lang.String = naturalistic.lang.String.instance(value.toString);
  def string_of_itself : naturalistic.lang.String;
  
  def getValue[T >: scala.AnyVal] : T
  //def setValue[T >: scala.AnyVal](value : T) : Unit
  
  /** value *
	var value : scala.AnyVal = _;
	def setContainerValue(value : NumberProperty)
	
	override def toString : java.lang.String = this.value.toString;
	*/
	
  @naturalistic.lang.annotations.Verb(name = "negative", signature = "negative of itself", returnType = "NumberProperty", container = "NumberProperty")
  def negative_of_itself : naturalistic.lang.Number with NumberProperty;
  
	@naturalistic.lang.annotations.Verb(name = "plus", signature = "itself plus naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_plus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
	
	@naturalistic.lang.annotations.Verb(name = "minus", signature = "itself minus naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_minus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
  
	@naturalistic.lang.annotations.Verb(name = "times", signature = "itself times naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_times_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
	
	@naturalistic.lang.annotations.Verb(name = "by", signature = "itself by naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_by_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "add", signature = "add naturalistic.lang.NumberProperty to itself", preposition = "to", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def add_arg_to_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "multiply", signature = "multiply naturalistic.lang.NumberProperty by itself", preposition = "by", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def multiply_arg_by_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "divide", signature = "divide naturalistic.lang.NumberProperty by itself", preposition = "by", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def divide_arg_by_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
	
	@naturalistic.lang.annotations.Verb(name = "subtract", signature = "subtract NumberProperty from itself", preposition = "from", returnType = "NumberProperty", container = "NumberProperty")
	def subtract_arg_from_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "NumberProperty") num : NumberProperty) : NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "+", signature = "itself + naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_$plus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "-", signature = "itself - naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_$minus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "*", signature = "itself * naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_$times_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "/", signature = "itself / naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_$div_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "%", signature = "itself % naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty", container = "NumberProperty")
	def itself_$percent_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
  
  /*@naturalistic.lang.annotations.Verb(name = "receives", signature = "itself receives naturalistic.lang.String", returnType = "naturalistic.lang.NumberProperty")
  def itself_receives_arg(arg0 : naturalistic.lang.String) : naturalistic.lang.NumberProperty;*/
	
}
