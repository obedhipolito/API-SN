package naturalistic.lang

/**
@author Oscar Pulido Prieto.
*/

class ItMethodCompanion {
		
		/**
		 *  it indica la ultima instancia que se utilizo
		 */
	    private var it : Adjective = _
	    
	    /**
	     *  these indica el ultimo grupo de instancias que se utilizo
	     */
	    private var these : Things = null
	    
	    /**
	     *  pila de instancias de que se crean en la funcion
	     */
	    private var varList : scala.List[Adjective] = List[Adjective]()
	    
	    def setVarList(varList : scala.List[Adjective]) {
	      this.varList = varList;
	    }
	    
	    //def getVarList = varList;
	    
	    
	    /**
	     * PROTOTIPO PARA EVALUAR POR MEDIO DE HASHCODE
	     */
	    private def contains(element : Adjective) : scala.Boolean = {
	      if(varList.size == 0) {
	        return false;
	      } else {
	        for(elem <- varList) {
	          if(elem.hashCode == element.hashCode) {
	            return true;
	          }
	        }
	        return false;
	      }
	    }
	    /**
	     *  Agregada para corregir error en instrucciones similares a la siguiente:
	     *  
	     *  170 mod 9; and an Integer Number with it as value.
	     *  
	     *  Donde "it" debe hacer referencia a la instancia anterior.
	     */
	    private var singularInstanceAux : Adjective = null
	    private var pluralInstanceAux : Things = null
	    
	    def addInstanceAux(element : Adjective) = {
	      if(element.isInstanceOf[Things/*[T]*/]) {
	        pluralInstanceAux = element.asInstanceOf[Things/*[T]*/]
	      } else {
	        singularInstanceAux = element
	      }
	    }
	    def setReferenceAux {
	      if(singularInstanceAux == null && pluralInstanceAux != null) {
	        addElem(pluralInstanceAux)
	      } else if(singularInstanceAux != null && pluralInstanceAux == null) {
	        addElem(singularInstanceAux)
	      }
	      singularInstanceAux = null;
        pluralInstanceAux = null;
	    }
	    def getSingularReferenceAux = singularInstanceAux;
	    def getPluralReferenceAux = pluralInstanceAux;
	    
	    
	    /**
	     *  Agrega un elemento a la pila de instancias
	     */
	    def addElem(element : Adjective) = {
	      //println(varList.contains(element));
	      if(!varList.contains(element)) {
	        varList = varList ::: List(element)
	        }
	      if(element.isInstanceOf[Things/*[T]*/]) {
	        these = element.asInstanceOf[Things/*[T]*/]
	        singularInstanceAux = null;
	        pluralInstanceAux = null;
	      } else {
	        it = element
	        singularInstanceAux = null;
	        pluralInstanceAux = null;
	      }
	    }
	    
	    def getIt = it.asInstanceOf[naturalistic.lang.Thing]
	    def getThese = these.asInstanceOf[naturalistic.lang.Things]
	    
	    def getAll(reverse : scala.Boolean) : Things/*[T]*/ = {
	      val things : Things/*[T]*/ = new Things/*[T]*/ {}
	      if(reverse) {
	        things.setContained(varList.reverse)
	      } else {
	        things.setContained(varList)
	      }
	      things;
	    }
	    
	    private def decomposeName(name : java.lang.String) : java.lang.String = {
	      var ret = ""
	      for(c <- name) {
	        ret = ret + (c match {
	          case '|' => "$bar"
	          case '!' => "$bang"
	          case '%' => "$percent"
	          case '&' => "$amp"
	          case '/' => "$div"
	          case '?' => "$qmark"
	          case '<' => "$less"
	          case '>' => "$greater"
	          case '=' => "$eq"
	          case '*' => "$times"
	          case '-' => "$minus"
	          case '+' => "$plus"
	          case _ => c.toString
	        })
	      }
	      //println(ret)
	      ret
	    }
	    
	    def invokeVar(invoker : Adjective, varName : java.lang.String, arguments : Adjective*) : java.lang.reflect.Method = {
	      
	      var toInvoke : java.lang.reflect.Method = null
	      var assignable = true
	      
	      var name = varName;
	      
	      for(method <- invoker.getClass.getMethods) {
	        if(method.getName.equals(name)) {
	          var paramTypes = method.getParameterTypes
	          if(arguments == null && paramTypes == null) {
	            toInvoke = method
	          } else if(arguments != null && paramTypes != null && (arguments.length == paramTypes.length)) {
	            for(i <- 0 to arguments.length-1) {
	              if(!paramTypes(i).isAssignableFrom(arguments(i).getClass)) {
	                assignable = false
	              }
	            }
	            if(assignable) {
	              toInvoke = method
	            }
	          }
	        }
	      }
	      
	      if(toInvoke != null) {
	        return toInvoke
	      } else {
	        return null
	      }
	    }
	    
	    def invokeMethod(invoker : Adjective, methodName : java.lang.String, arguments : Object*) : java.lang.reflect.Method = {
	      var listAux = List[Adjective]()
	      if(arguments != null || arguments.size > 0) {
	        if(arguments.size == 1 && arguments(0) == NullAux) {
	          return callMethod(invoker, methodName, listAux.toArray);
	        } else if(arguments.size > 1 && arguments(0) == NullAux) {
	          return null;
	        }
  	      for(obj <- arguments) {
    	      if(obj == null) {
    	        listAux = listAux ::: List(null)
    	      } else if(obj.isInstanceOf[Adjective]) {
    	        listAux = listAux ::: List(obj.asInstanceOf[Adjective])
    	      } else {
    	        return null;
    	      }
  	      }
  	      if(arguments != null && listAux.size != arguments.size) {
  	        return null;
  	      } else {
  	        return callMethod(invoker, methodName, listAux.toArray);
  	      }
	      } else {
	        return callMethod(invoker, methodName, listAux.toArray);
	      }
	    }
	    private def callMethod(invoker : Adjective, methodName : java.lang.String, arguments : scala.Array[Adjective]) : java.lang.reflect.Method = { //Thing = {
	      /** INVOCAR PLURALES */
	      if(invoker.isInstanceOf[Things/*[_]*/]) {
	        var pi : java.lang.reflect.Method = null; //<--- 20200622
	        /**var pi : java.lang.reflect.Method = null;*/ //<--- 20200622
	        var aux : java.lang.reflect.Method = null;
	        for(m <- invoker.getClass.getMethods) {
	          if(m.getName.equals(methodName) && m.getParameterCount == arguments.length) {
	            aux = m
	          } else if(m.getName.equals("pluralInvoker") && m.getParameterCount == arguments.length) {
	            pi = m;
	            /**pi = m;*/ //<--- 20200622
	            invoker.asInstanceOf[Things/*[_]*/].singularMethod = methodName;
	            /**invoker.asInstanceOf[Things/*[_]*/].singularMethod = methodName;*/ //<--- 20200622
	          }
	        }
	        if(aux == null) {
	          //throw new RuntimeException("Illegal sentence")
	          return pi; //<--- 20200622
	          /**return pi;*/ //<--- 20200622
	        }
	      }
	      var assignable = true
	      var methodList = List[java.lang.reflect.Method]();
	      var name = decomposeName(methodName)
	      for(method <- invoker.getClass.getMethods) {
	        assignable = true;
	        if(method.getName.equals(name)) {
	          var paramTypes = method.getParameterTypes
	          if(arguments == null && paramTypes == null) {
	            return method;
	          } else if(arguments != null && paramTypes != null && (arguments.length == paramTypes.length)) {
	            for(i <- 0 to arguments.length-1) {
	              if(arguments(i) != null && !paramTypes(i).isAssignableFrom(arguments(i).getClass)) {
	                assignable = false
	              }
	            }
	            if(assignable) {
	              methodList = methodList ::: List(method)
	            }
	          }
	        }
	      }
	      if(methodList.size == 1) {
	        return methodList.head;
	      } else {
	        return null;
	      }
	      
	      
	    }
	    
	    
	    /**
	     * Busca una instancia sin considerar filtros
	     */
	    def getManyThings(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], pos : Int, reverse : scala.Boolean) : Adjective = {
	      var list = List[Adjective/*T*/ => scala.Boolean]();
	      if(cls != null) {
	        list = list ::: List[Adjective/*T*/ => scala.Boolean](_.validateSuperclass(cls))
	      }
	      if(adjectives != null && adjectives.length > 0) {
	        for(adj <- adjectives) {
	          list = list ::: List[Adjective/*T*/ => scala.Boolean](_.validateInterfaces(adj))
	        }
	      }
	      getListMany(list, pos, reverse)
	    }
	    
	    /**
	     * Busca una instancia agregando filtros
	     */
	    def getManyThings(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], filters: scala.List[_ <: Adjective => scala.Boolean], pos : Int, reverse : scala.Boolean) : Adjective = {
	      var list = List[Adjective => scala.Boolean]();
	      if(cls != null) {
	        list = list ::: List[Adjective => scala.Boolean](_.validateSuperclass(cls))
	      }
	      if(adjectives != null && adjectives.length > 0) {
	        for(adj <- adjectives) {
	          list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(adj))
	        }
	      }
	      list = list ::: filters
	      getListMany(list, pos, reverse)
	    }
	    
	    private def getListMany(filters: scala.List[_ <: Adjective => scala.Boolean], pos : Int, reverse : scala.Boolean) : Things = {
	      var these : Things = null
	      for(f <- filters) {
	    	  if(these == null) {
	    	    these = new Things{}
	    	    these.setContained(varList.filter(f))
	    	  } else {
	    	    these.setContained(these.getContained.filter(f))
	    	  }
	      }
	      
	      if(pos > these.___plural_size)
	        throw new RuntimeException("Adjective list out of bounds.")
	      
	      /**
	       * Como se resta 1 a pos, la comparaci�n es "pos > 0" y no "pos >= 0"
	       */
	      if(pos > 0) {
	        if(reverse) {
	          these.setContained(these.getContained.takeRight(pos))
	        } else {
	          these.setContained(these.getContained.take(pos))
	        }
	      }
	      these
	    }
	    
	    /**
	     * Busca una instancia sin considerar filtros
	     */
	    def getOneThing(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], pos : Int) : Adjective = {
	      var list = List[Adjective => scala.Boolean]()
	      if(cls != null && !cls.isInterface) {
	        list = list ::: List[Adjective => scala.Boolean](_.validateSuperclass(cls))
	      } else if(cls.isInterface) {
	        list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(cls))
	      }
	      if(adjectives != null && adjectives.length > 0) {
	        for(adj <- adjectives) {
	          list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(adj))
	        }
	      }
	      getListOne(list, pos)
	    }
	    
	    /**
	     * Busca una instancia agregando filtros
	     */
	    def getOneThing(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], filters: scala.List[Adjective => scala.Boolean], pos : Int) : Adjective = {
	      var list = List[Adjective => scala.Boolean]()
	      if(cls != null && !cls.isInterface) {
	        list = list ::: List[Adjective => scala.Boolean](_.validateSuperclass(cls))
	      } else if(cls.isInterface) {
	        list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(cls))
	      }
	      if(adjectives != null && adjectives.length > 0) {
	        for(adj <- adjectives) {
	          list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(adj))
	        }
	      }
	      list = list ::: filters
	      getListOne(list, pos/*, reverse*/)
	    }
	    
	    /**
	     * Devuelve la instancia que se encuentre en la posicion "pos" filtrando los tipos, en caso de que pos sea 0
	     * el programa devuelve el �ltimo
	     */
	    private def getListOne(filters: scala.List[Adjective => scala.Boolean], pos : Int) : Adjective = {
	      var aux : scala.List[Adjective] = null
	      for(f <- filters) {
	    	  if(aux == null) {
	    	    aux = varList.filter(f)
	    	  } else {
	    	    aux = aux.filter(f)
	    	    //aux = aux ::: aux.filter(f)
	    	  }
	      }
	      if(pos > aux.size) {
	        throw new RuntimeException("Thing list out of bounds.")
	      }
	      
	      var i = 0
	      if(pos < 0) {
	        aux = aux.reverse
	        i = (pos * -1)-1
	      } else {
	        i = pos-1
	      }
        if(i == 0) {
          aux.head;
        } else {
	        for(ii <- 0 to i-1) {
            aux = aux.tail;
	        }
	        aux.head;
        }
	    }
	    
	    /*def getListOne(filters: scala.List[Adjective => scala.Boolean], pos : Int) : Adjective = {
	      var aux : scala.List[Adjective] = null
	      for(f <- filters) {
	    	  if(aux == null) {
	    	    aux = varList.filter(f)
	    	  } else {
	    	    aux = aux.filter(f)
	    	  }
	      }
	      
	      if(pos > aux.size) {
	        throw new RuntimeException("Thing list out of bounds.")
	      }
	      
	      /**
	       * Como se resta 1 a pos, la comparaci�n es "pos > 0" y no "pos >= 0"
	       */
	      if(pos >= 0) {
	        if(pos == 0) {
	          aux.head;
	        } else {
  	        for(i <- 0 to pos-1) {
              aux = aux.tail;
  	        }
	        }
	        aux.head;
	      } else {
  	       aux.reverse.head
	      }
	    }*/
}


/**
 *  RESPALDO
 */

//package naturalistic.lang
//
///**
//@author Oscar Pulido Prieto.
//*/
//
//class ItMethodCompanion[T <: Adjective] {
//	    //private var listTypes : List[String] = List[String]()
//		
//		/**
//		 *  it indica la ultima instancia que se utilizo
//		 */
//	    private var it : T = _
//	    
//	    /**
//	     *  these indica el ultimo grupo de instancias que se utilizo
//	     */
//	    private var these : Things/*[T]*/ = null//List[Thing] = null
//	    
//	    /**
//	     *  pila de instancias de que se crean en la funcion
//	     */
//	    private var varList : scala.List[T] = List[T]()
//	    
//	    /**
//	     * PROTOTIPO PARA EVALUAR POR MEDIO DE HASHCODE
//	     */
//	    private def contains(element : T) : scala.Boolean = {
//	      if(varList.size == 0) {
//	        return false;
//	      } else {
//	        for(elem <- varList) {
//	          if(elem.hashCode == element.hashCode) {
//	            return true;
//	          }
//	        }
//	        return false;
//	      }
//	    }
//	    /**
//	     *  Agregada para corregir error en instrucciones similares a la siguiente: 170 mod 9; and an Integer Number with it as value. Donde "it" debe hacer referencia a la instancia anterior
//	     */
//	    private var singularInstanceAux : T = _
//	    private var pluralInstanceAux : Things = null
//	    private var isPluralAux = false
//	    
//	    def addInstanceAux(element : T) = {
//	      if(element.isInstanceOf[Things/*[T]*/]) {
//	        pluralInstanceAux = element.asInstanceOf[Things/*[T]*/]
//	      } else {
//	        singularInstanceAux = element
//	      }
//	    }
//	    def setReferenceAux {
//	      addElem(instanceAux)
//	    }
//	    
//	    
//	    /**
//	     *  Agrega un elemento a la pila de instancias
//	     */
//	    def addElem(element : T) = {
//	      if(!varList.contains(element)) {
//	        varList = varList ::: List(element)
//	        }
//	      if(element.isInstanceOf[Things/*[T]*/]) {
//	        these = element.asInstanceOf[Things/*[T]*/]
//	      } else {
//	        it = element
//	      }
//	    }
//	    
//	    def getIt = it
//	    def getThese = these
//	    
//	    def getAll(reverse : scala.Boolean) : Things/*[T]*/ = {
//	      val things : Things/*[T]*/ = new Things/*[T]*/ {}
//	      if(reverse) {
//	        things.setContained(varList.reverse)
//	      } else {
//	        things.setContained(varList)
//	      }
//	      things;
//	    }
//	    
//	    private def decomposeName(name : java.lang.String) : java.lang.String = {
//	      var ret = ""
//	      for(c <- name) {
//	        ret = ret + (c match {
//	          case '|' => "$bar"
//	          case '!' => "$bang"
//	          case '%' => "$percent"
//	          case '&' => "$amp"
//	          case '/' => "$div"
//	          case '?' => "$qmark"
//	          case '<' => "$less"
//	          case '>' => "$greater"
//	          case '=' => "$eq"
//	          case '*' => "$times"
//	          case '-' => "$minus"
//	          case '+' => "$plus"
//	          case _ => c.toString
//	        })
//	      }
//	      //println(ret)
//	      ret
//	    }
//	    
//	    def invokeVar(invoker : naturalistic.lang.Adjective, varName : java.lang.String, arguments : naturalistic.lang.Adjective*) : java.lang.reflect.Method = {
//	      
//	      var toInvoke : java.lang.reflect.Method = null
//	      var assignable = true
//	      
//	      var name = varName;
//	      
//	      for(method <- invoker.getClass.getMethods) {
//	        if(method.getName.equals(name)) {
//	          var paramTypes = method.getParameterTypes
//	          if(arguments == null && paramTypes == null) {
//	            toInvoke = method
//	          } else if(arguments != null && paramTypes != null && (arguments.length == paramTypes.length)) {
//	            for(i <- 0 to arguments.length-1) {
//	              if(!paramTypes(i).isAssignableFrom(arguments(i).getClass)) {
//	                assignable = false
//	              }
//	            }
//	            if(assignable) {
//	              toInvoke = method
//	            }
//	          }
//	        }
//	      }
//	      
//	      if(toInvoke != null) {
//	        return toInvoke
//	      } else {
//	        return null
//	      }
//	    }
//	    
//	    def invokeMethod(invoker : naturalistic.lang.Adjective, methodName : java.lang.String, arguments : Object*) : java.lang.reflect.Method = {
//	      var listAux = List[naturalistic.lang.Adjective]()
//	      if(arguments != null || arguments.size > 0) {
//	        if(arguments.size == 1 && arguments(0) == NullAux) {
//	          return callMethod(invoker, methodName, listAux.toArray);
//	        } else if(arguments.size > 1 && arguments(0) == NullAux) {
//	          return null;
//	        }
//  	      for(obj <- arguments) {
//    	      if(obj == null) {
//    	        listAux = listAux ::: List(null)
//    	      } else if(obj.isInstanceOf[naturalistic.lang.Adjective]) {
//    	        listAux = listAux ::: List(obj.asInstanceOf[naturalistic.lang.Adjective])
//    	      } else {
//    	        return null;
//    	      }
//  	      }
//  	      if(arguments != null && listAux.size != arguments.size) {
//  	        return null;
//  	      } else {
//  	        return callMethod(invoker, methodName, listAux.toArray);
//  	      }
//	      } else {
//	        return callMethod(invoker, methodName, listAux.toArray);
//	      }
//	    }
//	    private def callMethod(invoker : naturalistic.lang.Adjective, methodName : java.lang.String, arguments : scala.Array[naturalistic.lang.Adjective]) : java.lang.reflect.Method = { //Thing = {
//	      /** INVOCAR PLURALES */
//	      if(invoker.isInstanceOf[naturalistic.lang.Things/*[_]*/]) {
//	        var pi : java.lang.reflect.Method = null;
//	        var aux : java.lang.reflect.Method = null;
//	        for(m <- invoker.getClass.getMethods) {
//	          if(m.getName.equals(methodName) && m.getParameterCount == arguments.length) {
//	            aux = m
//	          } else if(m.getName.equals("pluralInvoker") && m.getParameterCount == arguments.length) {
//	            pi = m;
//	            invoker.asInstanceOf[naturalistic.lang.Things/*[_]*/].singularMethod = methodName;
//	          }
//	        }
//	        if(aux == null) {
//	          return pi;
//	        }
//	      }
//	      var assignable = true
//	      var methodList = List[java.lang.reflect.Method]();
//	      var name = decomposeName(methodName)
//	      for(method <- invoker.getClass.getMethods) {
//	        assignable = true;
//	        if(method.getName.equals(name)) {
//	          var paramTypes = method.getParameterTypes
//	          if(arguments == null && paramTypes == null) {
//	            return method;
//	          } else if(arguments != null && paramTypes != null && (arguments.length == paramTypes.length)) {
//	            for(i <- 0 to arguments.length-1) {
//	              if(arguments(i) != null && !paramTypes(i).isAssignableFrom(arguments(i).getClass)) {
//	                assignable = false
//	              }
//	            }
//	            if(assignable) {
//	              methodList = methodList ::: List(method)
//	            }
//	          }
//	        }
//	      }
//	      if(methodList.size == 1) {
//	        return methodList.head;
//	      } else {
//	        return null;
//	      }
//	      
//	      
//	    }
//	    
//	    
//	    /**
//	     * Busca una instancia sin considerar filtros
//	     */
//	    def getManyThings(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], pos : Int, reverse : scala.Boolean) : Adjective = {
//	      var list = List[Adjective/*T*/ => scala.Boolean]();
//	      if(cls != null) {
//	        list = list ::: List[Adjective/*T*/ => scala.Boolean](_.validateSuperclass(cls))
//	      }
//	      if(adjectives != null && adjectives.length > 0) {
//	        for(adj <- adjectives) {
//	          list = list ::: List[Adjective/*T*/ => scala.Boolean](_.validateInterfaces(adj))
//	        }
//	      }
//	      getListMany(list, pos, reverse)
//	    }
//	    
//	    /**
//	     * Busca una instancia agregando filtros
//	     */
//	    def getManyThings(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], filters: scala.List[_ <: Adjective => scala.Boolean], pos : Int, reverse : scala.Boolean) : Adjective = {
//	      var list = List[Adjective => scala.Boolean]();
//	      if(cls != null) {
//	        list = list ::: List[Adjective => scala.Boolean](_.validateSuperclass(cls))
//	      }
//	      if(adjectives != null && adjectives.length > 0) {
//	        for(adj <- adjectives) {
//	          list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(adj))
//	        }
//	      }
//	      list = list ::: filters
//	      getListMany(list, pos, reverse)
//	    }
//	    
//	    private def getListMany(filters: scala.List[_ <: Adjective => scala.Boolean], pos : Int, reverse : scala.Boolean) : Things = {
//	      var these : naturalistic.lang.Things = null
//	      for(f <- filters) {
//	    	  if(these == null) {
//	    	    these = new Things{}
//	    	    these.setContained(varList.filter(f))
//	    	  } else {
//	    	    these.setContained(these.getContained.filter(f))
//	    	  }
//	      }
//	      
//	      if(pos > these.___plural_size)
//	        throw new RuntimeException("Adjective list out of bounds.")
//	      
//	      /**
//	       * Como se resta 1 a pos, la comparaci�n es "pos > 0" y no "pos >= 0"
//	       */
//	      if(pos > 0) {
//	        if(reverse) {
//	          these.setContained(these.getContained.takeRight(pos))
//	        } else {
//	          these.setContained(these.getContained.take(pos))
//	        }
//	      }
//	      these
//	    }
//	    
//	    /**
//	     * Busca una instancia sin considerar filtros
//	     */
//	    def getOneThing(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], pos : Int) : Adjective = {
//	      var list = List[Adjective => scala.Boolean]()
//	      if(cls != null && !cls.isInterface) {
//	        list = list ::: List[Adjective => scala.Boolean](_.validateSuperclass(cls))
//	      } else if(cls.isInterface) {
//	        list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(cls))
//	      }
//	      if(adjectives != null && adjectives.length > 0) {
//	        for(adj <- adjectives) {
//	          list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(adj))
//	        }
//	      }
//	      getListOne(list, pos)
//	    }
//	    
//	    /**
//	     * Busca una instancia agregando filtros
//	     */
//	    def getOneThing(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], filters: scala.List[Adjective => scala.Boolean], pos : Int) : Adjective = {
//	      var list = List[Adjective => scala.Boolean]()
//	      if(cls != null && !cls.isInterface) {
//	        list = list ::: List[Adjective => scala.Boolean](_.validateSuperclass(cls))
//	      } else if(cls.isInterface) {
//	        list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(cls))
//	      }
//	      if(adjectives != null && adjectives.length > 0) {
//	        for(adj <- adjectives) {
//	          list = list ::: List[Adjective => scala.Boolean](_.validateInterfaces(adj))
//	        }
//	      }
//	      list = list ::: filters
//	      getListOne(list, pos/*, reverse*/)
//	    }
//	    
//	    /**
//	     * Devuelve la instancia que se encuentre en la posicion "pos" filtrando los tipos, en caso de que pos sea 0
//	     * el programa devuelve el �ltimo
//	     */
//	    def getListOne(filters: scala.List[Adjective => scala.Boolean], pos : Int) : Adjective = {
//	      var aux : scala.List[T] = null
//	      for(f <- filters) {
//	    	  if(aux == null) {
//	    	    aux = varList.filter(f)
//	    	  } else {
//	    	    aux = aux.filter(f)
//	    	  }
//	      }
//	      
//	      if(pos > aux.size) {
//	        throw new RuntimeException("Thing list out of bounds.")
//	      }
//	      
//	      /**
//	       * Como se resta 1 a pos, la comparaci�n es "pos > 0" y no "pos >= 0"
//	       */
//	      if(pos >= 0) {
//	        if(pos == 0) {
//	          aux.head;
//	        } else {
//  	        for(i <- 0 to pos-1) {
//              aux = aux.tail;
//  	        }
//	        }
//	        aux.head;
//	      } else {
//  	       aux.reverse.head
//	      }
//	    }
//}