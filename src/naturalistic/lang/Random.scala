package naturalistic.lang

/**
@author Oscar Pulido Prieto.
*/

/*@naturalistic.lang.annotations.Adjective(name = "Random")
trait Random extends NumberProperty with naturalistic.lang.Comparable {*/
@naturalistic.lang.annotations.Noun(name = "Random")
class Random extends naturalistic.lang.Thing {
  
  
  @naturalistic.lang.annotations.Attribute(name = "min", container = "Random")
	var min : naturalistic.lang.NumberProperty = _;
	@naturalistic.lang.annotations.Verb(name = "min", signature = "min of itself", returnType = " : naturalistic.lang.NumberProperty", container = "Random")
	def min_of_itself : naturalistic.lang.NumberProperty = min;
	
	
	@naturalistic.lang.annotations.Attribute(name = "max", container = "Random")
	var max : naturalistic.lang.NumberProperty = _;
	@naturalistic.lang.annotations.Verb(name = "min", signature = "max of itself", returnType = " : naturalistic.lang.NumberProperty", container = "Random")
	def max_of_itself : naturalistic.lang.NumberProperty = max;
	
	@naturalistic.lang.annotations.Verb(name = "integer", signature = "integer of itself", returnType = "Number with Integer", container = "Random")
	def integer_of_itself : naturalistic.lang.Integer = {
	  
	  if(min == null && max == null) {
	    return Number.instance(scala.util.Random.nextInt(scala.Int.MaxValue))
	  }
	  
	  var localMin : scala.Int = 0;//min.getValue.asInstanceOf[scala.Int]
	  var localMax : scala.Int = 0;//max.getValue.asInstanceOf[scala.Int]
	  
	  if(min == null) {
	    localMin = 0
	  } else {
	    localMin = min.getValue.asInstanceOf[scala.Int]
	  }
	  
	  if(max == null) {
	    localMax = scala.Int.MaxValue
	  } else {
	    localMax = max.getValue.asInstanceOf[scala.Int]
	  }
	  
	  if(localMin > localMax) {
	    throw new RuntimeException("min greater than max");
	  } else if(localMin == localMax) {
	    throw new RuntimeException("min equal to max");
	  }
	  
	  Number.instance(localMin + scala.util.Random.nextInt(localMax-localMin+1))
	  
	}
	
	@naturalistic.lang.annotations.Verb(name = "real", signature = "real of itself", returnType = "Number with Real", container = "Random")
	def real_of_itself : naturalistic.lang.Real = {
	  
	  /*if(min == null && max == null) {
	    return Number.instance(scala.util.Random.nextFloat)
	  }
	  
	  var localMin : scala.Float = 0;//min.getValue.asInstanceOf[scala.Int]
	  var localMax : scala.Float = 0;//max.getValue.asInstanceOf[scala.Int]
	  
	  if(min == null) {
	    localMin = 0
	  } else {
	    localMin = min.getValue.asInstanceOf[scala.Float]
	  }
	  
	  if(max == null) {
	    localMax = 1
	  } else {
	    localMax = max.getValue.asInstanceOf[scala.Float]
	  }
	  
	  if(localMin > localMax) {
	    throw new RuntimeException("min greater than max");
	  } else if(localMin == localMax) {
	    throw new RuntimeException("min equal to max");
	  } else if(localMin > 1 && localMin < 0 && localMax > 1 && localMin < 0) {
	    throw new RuntimeException("limits must be between 0 and 1");
	  }
	  
	  Number.instance((localMin + scala.util.Random.nextFloat(localMax-localMin)).asInstanceOf[scala.Float])*/
	  
	  Number.instance(scala.util.Random.nextFloat)
	  
	  
	}
	
	/*@naturalistic.lang.annotations.Verb(name = "random", signature = "random of itself", returnType = " : naturalistic.lang.NumberProperty", container = "Random")
	def random_of_itself : naturalistic.lang.NumberProperty = {
	  
	  
	  if(min == null) {
	    
	    if(this.isInstanceOf[naturalistic.lang.Integer]) {
	      min = naturalistic.lang.Number.instance(0);
	    }  else if(this.isInstanceOf[naturalistic.lang.Real]) {
	      min = naturalistic.lang.Number.instance(0.0F);
	    }
    } else {
      
    }
    
    if(max == null) {
      throw new RuntimeException("Max value undefined");
    }
    
    if(this.isInstanceOf[naturalistic.lang.Integer] || this.isInstanceOf[naturalistic.lang.Character]) {
      obtainIntegerRandom()
    } else if(this.isInstanceOf[naturalistic.lang.Real]) {
	    obtainRealRandom()	    
	  } else {
	    throw new RuntimeException("Illegal type conversion");
	  }
	}*/
	
	/*private def obtainIntegerRandom() : NumberProperty = {
	  
	  if(min.isInstanceOf[naturalistic.lang.Real]) {
	    min = min.asInstanceOf[naturalistic.lang.Real].integer_of_itself
	  }
	  
	  if(max.isInstanceOf[naturalistic.lang.Real]) {
	    max = max.asInstanceOf[naturalistic.lang.Real].integer_of_itself
	  }
	  
	  var auxMin = min.getValue.asInstanceOf[scala.Int]
    var auxMax = max.getValue.asInstanceOf[scala.Int]
    
	  val auxRandom = java.util.concurrent.ThreadLocalRandom.current().nextInt(auxMin, auxMax)
	  val auxRes = naturalistic.lang.Number.instance(auxRandom);
	  
	  if(auxRes.isInstanceOf[naturalistic.lang.Integer]) {
	    auxRes
	  } else if(auxRes.isInstanceOf[naturalistic.lang.Character]) {
	    auxRes.character_of_itself
	  } else {
	    throw new RuntimeException("Illegal type conversion");
	  }
	    
	}
	
	private def obtainRealRandom() : NumberProperty = {
	  
	  if(min.isInstanceOf[naturalistic.lang.Integer] || min.isInstanceOf[naturalistic.lang.Character]) {
	    min = min.asInstanceOf[naturalistic.lang.Integer].real_of_itself
	  }
	  
	  if(max.isInstanceOf[naturalistic.lang.Integer] || max.isInstanceOf[naturalistic.lang.Character]) {
	    max = max.asInstanceOf[naturalistic.lang.Integer].real_of_itself
	  }
	  
	  
	  var auxMin = min.getValue.asInstanceOf[scala.Float].toDouble
    var auxMax = max.getValue.asInstanceOf[scala.Float].toDouble
    
	  val auxRandom = java.util.concurrent.ThreadLocalRandom.current().nextDouble(auxMin, auxMax)
	  naturalistic.lang.Number.instance(auxRandom);
	}*/
  
}