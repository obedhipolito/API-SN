package naturalistic.lang;

/**
@author Oscar Pulido Prieto.
*/

@naturalistic.lang.annotations.Noun(name = "Number", plural = "Numbers")
abstract class Number extends Thing with naturalistic.lang.Comparable/*with naturalistic.lang.NumberProperty with naturalistic.lang.Comparable*/ {
  
  @naturalistic.lang.annotations.Verb(name = "string", signature = "string of itself", returnType = "String", container = "Number")
  override def string_of_itself : naturalistic.lang.String = {
    //val it = new ItMethodCompanion;
    naturalistic.lang.String.instance(this.getClass.getMethod("getValue").invoke(this).toString);
  }
  
  def value_of_itself = this;
  
  /*@naturalistic.lang.annotations.Verb(name = ">", signature = "itself > naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
	def itself_$greater_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
	@naturalistic.lang.annotations.Verb(name = ">=", signature = "itself >= naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
	def itself_$greater$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "<", signature = "itself < naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_$less_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "<=", signature = "itself <= naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_$less$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "!=", signature = "itself != naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_$bang$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "==", signature = "itself == naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_$eq$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  
  @naturalistic.lang.annotations.Verb(name = "greaterThan", signature = "itself greaterThan naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_greater_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "lesserThan", signature = "itself lesserThan naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_lesser_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;
  @naturalistic.lang.annotations.Verb(name = "lesserOrEqualThan", signature = "itself lesserOrEqualThan naturalistic.lang.Comparable", returnType = "naturalistic.lang.Comparable")
  def itself_lesser_or_equal_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.Comparable") num : naturalistic.lang.Comparable) : naturalistic.lang.Boolean;*/
  
	/**
	@naturalistic.lang.annotations.Verb(name = "plus", signature = "itself plus naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_plus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
	
	@naturalistic.lang.annotations.Verb(name = "minus", signature = "itself minus naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_minus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
  
	@naturalistic.lang.annotations.Verb(name = "times", signature = "itself times naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_times_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
	
	@naturalistic.lang.annotations.Verb(name = "by", signature = "itself by naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_by_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "add", signature = "add naturalistic.lang.NumberProperty to itself", preposition = "to", returnType = "naturalistic.lang.NumberProperty")
	def add_arg_to_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "multiply", signature = "multiply naturalistic.lang.NumberProperty by itself", preposition = "by", returnType = "naturalistic.lang.NumberProperty")
	def multiply_arg_by_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "divide", signature = "divide naturalistic.lang.NumberProperty by itself", preposition = "by", returnType = "naturalistic.lang.NumberProperty")
	def divide_arg_by_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
	
	@naturalistic.lang.annotations.Verb(name = "subtract", signature = "subtract NumberProperty from itself", preposition = "from", returnType = "NumberProperty")
	def subtract_arg_from_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "NumberProperty") num : NumberProperty) : NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "+", signature = "itself + naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_$plus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "-", signature = "itself - naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_$minus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "*", signature = "itself * naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_$times_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "/", signature = "itself / naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_$div_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;

	@naturalistic.lang.annotations.Verb(name = "%", signature = "itself % naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_$percent_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : naturalistic.lang.NumberProperty;
	*/
}
class Numbers/*[T <: Number]*/ extends naturalistic.lang.Things/*[Number]*/ {
  
  @naturalistic.lang.annotations.Verb(name = "pivot", signature = "pivot of itself", returnType = "naturalistic.lang.Number", container = "Number")
	def pivot_of_itself : naturalistic.lang.Number = {
		return this.head_of_itself.asInstanceOf[naturalistic.lang.Number];
	}
  
  @naturalistic.lang.annotations.Verb(name = "sorted", signature = "itself sorted", returnType = "naturalistic.lang.Boolean", container = "Number")
	def itself_sorted : naturalistic.lang.Boolean = {
    var aux0 : naturalistic.lang.Number = null;
    var listAux : scala.List[_ <: naturalistic.lang.Number] = pluralAux.asInstanceOf[scala.List[naturalistic.lang.Number]];
    if(listAux.isEmpty) {
      naturalistic.lang.Boolean.instance(false);
    } else {
      aux0 = listAux.head;
      listAux = listAux.tail;
      while(!listAux.isEmpty) {
        if(aux0.itself_greater_than_arg(listAux.head).isTrue) {
          naturalistic.lang.Boolean.instance(false);
        }
        aux0 = listAux.head;
        listAux = listAux.tail;
      }
      naturalistic.lang.Boolean.instance(true);
    }
  }
  
	/*def itself_plus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_plus_arg(num);
		}
		return this;
	}
	
	@naturalistic.lang.annotations.Verb(name = "minus", signature = "itself minus naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_minus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
	  for(aux <- this.pluralAux) {
			aux.itself_minus_arg(num);
		}
		return this;
	}
  
	@naturalistic.lang.annotations.Verb(name = "times", signature = "itself times naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_times_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
	  for(aux <- this.pluralAux) {
			aux.itself_times_arg(num);
		}
		return this;
	}
	
	@naturalistic.lang.annotations.Verb(name = "by", signature = "itself by naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_by_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
	  for(aux <- this.pluralAux) {
			aux.itself_by_arg(num);
		}
		return this;
	}
	
	def add_arg_to_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.add_arg_to_itself(num);
		}
		return this;
	}
	def multiply_arg_by_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.multiply_arg_by_itself(num);
		}
		return this;
	}
	def divide_arg_by_itself( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.divide_arg_by_itself(num);
		}
		return this;
	}
	def itself_$plus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$plus_arg(num);
		}
		return this;
	}
	def itself_$minus_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$minus_arg(num);
		}
		return this;
	}
	def itself_$times_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$times_arg(num);
		}
		return this;
	}
	def itself_$div_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$div_arg(num);
		}
		return this;
	}
	def itself_$percent_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$percent_arg(num);
		}
		return this;
	}
	
	
	
	@naturalistic.lang.annotations.Verb(name = ">", signature = "itself > naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_$greater_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$greater_arg(num);
		}
		return this;
	}
	@naturalistic.lang.annotations.Verb(name = ">=", signature = "itself >= naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_$greater$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$greater$eq_arg(num);
		}
		return this;
	}
  @naturalistic.lang.annotations.Verb(name = "<", signature = "itself < naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_$less_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$less_arg(num);
		}
		return this;
	}
  @naturalistic.lang.annotations.Verb(name = "<=", signature = "itself <= naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_$less$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$less$eq_arg(num);
		}
		return this;
	}
  @naturalistic.lang.annotations.Verb(name = "!=", signature = "itself != naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_$bang$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$bang$eq_arg(num);
		}
		return this;
	}
  @naturalistic.lang.annotations.Verb(name = "==", signature = "itself == naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_$eq$eq_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_$eq$eq_arg(num);
		}
		return this;
	}
  
  @naturalistic.lang.annotations.Verb(name = "greaterThan", signature = "itself greaterThan naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_greater_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_greater_than_arg(num);
		}
		return this;
	}
	@naturalistic.lang.annotations.Verb(name = "greaterOrEqualThan", signature = "itself greaterOrEqualThan naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
	def itself_greater_or_equal_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_greater_or_equal_than_arg(num);
		}
		return this;
	}
  @naturalistic.lang.annotations.Verb(name = "lesserThan", signature = "itself lesserThan naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_lesser_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_lesser_than_arg(num);
		}
		return this;
	}
  @naturalistic.lang.annotations.Verb(name = "lesserOrEqualThan", signature = "itself lesserOrEqualThan naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_lesser_or_equal_than_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_lesser_or_equal_than_arg(num);
		}
		return this;
	}
  @naturalistic.lang.annotations.Verb(name = "distinct", signature = "itself distinct naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_distinct_to_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_distinct_to_arg(num);
		}
		return this;
	}
  @naturalistic.lang.annotations.Verb(name = "equal", signature = "itself equal naturalistic.lang.NumberProperty", returnType = "naturalistic.lang.NumberProperty")
  def itself_equal_to_arg( @naturalistic.lang.annotations.Parameter(name = "num", parameterType = "naturalistic.lang.NumberProperty") num : naturalistic.lang.NumberProperty) : Numbers[T] = {
		for(aux <- this.pluralAux) {
			aux.itself_equal_to_arg(num);
		}
		return this;
	}
	
	
	/*******************/
  def length_of_itself = naturalistic.lang.Number.instance(pluralAux.size);
  
  def head_of_itself = {
    if(pluralAux.size > 0) {
      pluralAux.head;
    } else {
      null;
    }
  }
  
  def tail_of_itself : naturalistic.lang.Numbers[naturalistic.lang.Number] = {
    if(pluralAux.size > 1) {
      val aux = naturalistic.lang.Numbers.instance(scala.Array());
      aux.pluralAux = pluralAux.tail;
      aux.interfaces = this.interfaces;
      aux;
    } else {
      null;
    }
  }
  
  def pivot_of_itself = naturalistic.lang.Number.instance(0);
  /*******************/
*/
}
object Numbers extends naturalistic.lang.Things/*[Thing]*/ {
  
  override val singular : java.lang.Class[_ <: Adjective] = classOf[naturalistic.lang.Number];
  
	def instance(itfs : Array[java.lang.Class[_]]) = {
		val t = new Numbers/*[naturalistic.lang.Number]*/;
		t.parentClass = classOf[naturalistic.lang.Number];
		t.interfaces = itfs;
		t;
	}
}


object Number {
  
  //var numbers : scala.List[Number] = List[Number]();
  
  def instance(int : Int) : Number with Integer = {
    /*var aux : scala.List[Number with Integer] = numbers.collect {case a : Number with Integer => a};
    aux = aux.filter(_.value == int)
    
    if(aux.length == 1) {
      return aux.head;
    } else {
	    val inst = new naturalistic.lang.Number with naturalistic.lang.Integer {};
	    inst.value = int;
	    numbers = numbers ::: scala.List(inst);
	    inst;
    }*/
    val inst = new naturalistic.lang.Number with naturalistic.lang.Integer /*{}*/;
    inst.setValue(int);
    //numbers = numbers ::: scala.List(inst);
    inst;
  }
  def instance(float : Float) : Number with Real = {
    /*var aux : scala.List[Number with Real] = numbers.collect {case a : Number with Real => a};
    aux = aux.filter(_.value == float)
    
    if(aux.length == 1) {
      return aux.head;
    } else {
	    val inst = new naturalistic.lang.Number with naturalistic.lang.Real {};
	    inst.value = float;
	    numbers = numbers ::: scala.List(inst);
	    inst;
    }*/
    val inst = new naturalistic.lang.Number with naturalistic.lang.Real /*{}*/;
    inst.setValue(float);
    //numbers = numbers ::: scala.List(inst);
    inst;
  }
  
  def instance(double : Double) : Number with Real = {
    return instance(double.floatValue())
  }
  
  def instance(long : Long) : Number with Integer = {
    return instance(long.intValue())
  }
  
  def instance(char : Char) : Number with Character = {
    /*var aux : scala.List[Number with Character] = numbers.collect {case a : Number with Character => a};
    aux = aux.filter(_.value == char)
    
    if(aux.length == 1) {
      return aux.head;
    } else {
	    val inst = new naturalistic.lang.Number with naturalistic.lang.Character {};
	    inst.value = char;
	    numbers = numbers ::: scala.List(inst);
	    inst;
    }*/
    val inst = new naturalistic.lang.Number with naturalistic.lang.Character /*{}*/;
    inst.setValue(char);
    //numbers = numbers ::: scala.List(inst);
    inst;
  }
}
/** */

/*object Numbers extends Numbers[Number] {
  def instance(itfs : Array[java.lang.Class[_]]) = {
    val t = new Numbers[Number];
    t.interfaces = itfs;
    t;
  }
}*/