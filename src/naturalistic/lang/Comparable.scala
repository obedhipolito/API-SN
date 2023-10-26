package naturalistic.lang

/**
@author Oscar Pulido Prieto.
*/

@naturalistic.lang.annotations.Adjective(name = "Comparable")
trait Comparable extends Adjective {
  @naturalistic.lang.annotations.Verb(name = ">", signature = "itself > naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
	def itself_$greater_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
	@naturalistic.lang.annotations.Verb(name = ">=", signature = "itself >= naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
	def itself_$greater$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "<", signature = "itself < naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
  def itself_$less_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "<=", signature = "itself <= naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
  def itself_$less$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "!=", signature = "itself != naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
  def itself_$bang$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "==", signature = "itself == naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
  def itself_$eq$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  
  @naturalistic.lang.annotations.Verb(name = "greaterThan", signature = "itself greaterThan naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
  def itself_greater_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
	//@naturalistic.lang.annotations.Verb(name = "greaterOrEqualThan", signature = "itself greaterOrEqualThan naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
	//def itself_greater_or_equal_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "lesserThan", signature = "itself lesserThan naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
  def itself_lesser_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "lesserOrEqualThan", signature = "itself lesserOrEqualThan naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable", container = "Comparable")
  def itself_lesser_or_equal_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  /*@naturalistic.lang.annotations.Verb(name = "distinct", signature = "itself distinct naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_distinct_to_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;*/
  /*@naturalistic.lang.annotations.Verb(name = "equal", signature = "itself equal naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_equal_to_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;*/ 
  
  //@naturalistic.lang.annotations.Verb(name = "", signature = "itself  naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
}