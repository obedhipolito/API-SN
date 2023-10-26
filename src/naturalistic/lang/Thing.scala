package naturalistic.lang

/**
@author Oscar Pulido Prieto.
*/

@naturalistic.lang.annotations.Adjective(name = "Adjective")
trait Adjective {
  
  val singular : java.lang.Class[_ <: Adjective] = this.getClass;
  
  /*override def equals(obj : scala.Any) : scala.Boolean = {
    
    if(!this.getClass.isAssignableFrom(obj.getClass) && !obj.getClass.isAssignableFrom(this.getClass)) {
      return false;
    }
    if(this.hashCode() == obj.hashCode()) {
      return true;
    }
    
    searchFields(this.getClass, obj.getClass)
    
    
    for(cls <- obj.getClass.getInterfaces) {
      
    }
    return true;
  }
  
  private final def searchFields(cls : java.lang.Class[_], obj : java.lang.Class[_]) : scala.Boolean = {
    
    if(cls.equals(classOf[naturalistic.lang.Adjective])) {
      return false;
    }
    
    var b = true;
    
    if(cls.equals(obj)) {
      for(f1 <- cls.getDeclaredFields) {
        
      }
    } else {
      return searchFields(cls.getSuperclass, obj)
    }
    
    //return false;
  }*/
  
  var actived_instance : scala.Boolean = false;
  def activate /*: Adjective =*/ {
    //println(this.getClass + " +++++ " + this.getClass.getSuperclass);
    actived_instance = true;
    //return this
  }
  def isActive : scala.Boolean = actived_instance;
  
  /*@naturalistic.lang.annotations.Verb(name = "is", preposition = "an", signature = "itself is a type", returnType = "naturalistic.lang.Boolean")
  def itself_is_an_arg[T]/*(cls : Class[_], itfs : Class[_]*)*/ = {
    
    java.lang.System.out.println("is an :: " + this.getClass.getInterfaces.toList);
    java.lang.System.out.println("is an :: " + this.isInstanceOf[T]);
    java.lang.System.out.println("is an :: " + this.hashCode());
    naturalistic.lang.Boolean.instance(this.isInstanceOf[T])
  }*/
  
  /*@naturalistic.lang.annotations.Verb(name = "is", preposition = "an", signature = "itself is an type", returnType = "naturalistic.lang.Boolean")
  def itself_is_an_arg(t : java.lang.Class[_]*) : naturalistic.lang.Boolean = {
    var b = true;
    for(tt <- t) {
      if(tt.isInterface()) {
        b = this.validateInterfaces(tt);
      } else {
        b = this.validateSuperclass(tt);
      }
    }
    naturalistic.lang.Boolean.instance(b);
  }*/
  
  @naturalistic.lang.annotations.Verb(name = "is", preposition = "a", signature = "itself is a type of java.lang.Class", returnType = "naturalistic.lang.Boolean", container = "Adjective")
  def itself_is_a_type_of_arg(t : java.lang.Class[_]*) : naturalistic.lang.Boolean = {
    var b = true;
    for(tt <- t) {
      if(tt.isInterface()) {
        b = this.validateInterfaces(tt);
      } else {
        b = this.validateSuperclass(tt);
      }
    }
    naturalistic.lang.Boolean.instance(b);
  }
  
  /*@naturalistic.lang.annotations.Verb(name = "as", preposition = "an", signature = "itself as an type", returnType = "naturalistic.lang.Thing")
  def itself_as_an_arg[T] = this.asInstanceOf[T];*/
  
  @naturalistic.lang.annotations.Verb(name = "as", preposition = "a", signature = "itself as a type of java.lang.Class", returnType = "naturalistic.lang.Thing", container = "Adjective")
  def itself_as_a_type_of_arg[T] = this.asInstanceOf[T];
  
  @naturalistic.lang.annotations.Verb(name = "equal", preposition = "to", signature = "itself equal to Thing", returnType = "naturalistic.lang.Thing", container = "Adjective")
  def itself_equal_to_arg(thing : naturalistic.lang.Adjective) : naturalistic.lang.Boolean = {
		//java.lang.System.out.println("DDD " + this.hashCode() + " ::: " + thing.hashCode() + " +++ " + this.equals(thing));
    if(this.equals(thing)) {
      return True;
    }
    return False;
  }
  
  @naturalistic.lang.annotations.Verb(name = "distinct", preposition = "to", signature = "itself distinct to Thing", returnType = "naturalistic.lang.Thing", container = "Adjective")
  def itself_distinct_to_arg(thing : naturalistic.lang.Adjective) : naturalistic.lang.Boolean = {
		//java.lang.System.out.println("DDD " + this.hashCode() + " ::: " + thing.hashCode() + " +++ " + this.equals(thing));
    if(this.equals(thing)) {
      return False;
    }
    return True;
  }
  
  /*@naturalistic.lang.annotations.Verb(name = "as", preposition = "an", signature = "itself is a type", returnType = "naturalistic.lang.Thing")
  def itself_as_an_arg(t : java.lang.Class[_]*) : naturalistic.lang.Thing = {
    var b = true;
    var c = "".asInstanceOf[Any]
    for(tt <- t) {
      if(tt.isInterface()) {
        b = this.validateInterfaces(tt);
      } else {
        this.validateSuperclass(tt);
      }
    }
    naturalistic.lang.Boolean.instance(b);
  }*/
  
  /*@naturalistic.lang.annotations.Verb(name = "is", preposition = "an", signature = "itself is a type", returnType = "naturalistic.lang.Boolean")
  def itself_is_an_arg(cls : java.lang.Class[_ <: Thing]) : naturalistic.lang.Boolean = {
    if(this.getClass.isAssignableFrom(cls)) {
      naturalistic.lang.True;
    }
    naturalistic.lang.False;
  }*/
  
  private def validateSuperclass(cls : Class[_], toSeek : Class[_]) : scala.Boolean = {
    //java.lang.System.out.println("Dentro de private.Thing: " + this.getClass + " ::: " + cls + " ::::::::::::: " + this.toString());
    if(toSeek.equals(cls)) {
      //java.lang.System.out.println("Sale de private.superclass2: true");
      return true
    } else if(toSeek.equals(classOf[Thing])) {
      //java.lang.System.out.println("Sale de private.superclass2: false");
      return false//throw new RuntimeException("Class " + cls.getName() + " not exists.");
    } else {
      //java.lang.System.out.println("Recursivo .superclass2: false");
      return validateSuperclass(cls, toSeek.getSuperclass)
    }
  }
  
  /*var actived_instance : scala.Boolean = false;
  def activate {
    actived_instance = true;
  }
  def isActive : scala.Boolean = actived_instance;*/
  
  private[lang] def validateSuperclass(cls : Class[_]) : scala.Boolean = {
    //java.lang.System.out.println("Dentro de Thing: " + this.getClass + " ::: " + cls + " ::::::::::::: " + this.toString());
    //java.lang.System.out.println("Dentro de Thing: " + this.getClass.getInterfaces.contains(classOf[Thing]));
    //*java.lang.System.out.println("private.cls: " + cls.getName + " :: " + this.getClass.getInterfaces.contains(cls));
    if(this.getClass.equals(cls)) {
      //java.lang.System.out.println("1: " + this.getClass + " ::: " + true);
      //*java.lang.System.out.println("Sale de private.superclass: true");
      return true
    } else if(this.getClass.getInterfaces.contains(classOf[Thing]) && !cls.equals(classOf[Thing])) {
      //java.lang.System.out.println("2: " + this.getClass + " ::: " + false);
      //*java.lang.System.out.println("Sale de private.superclass: false");
      return false//throw new RuntimeException("Class " + cls.getName + " not exists.");
    } else if(this.getClass.equals(classOf[Thing])) {
      //*java.lang.System.out.println("Sale de private.superclass: false");
      return false;
    } else {
      //java.lang.System.out.println("------");
      //java.lang.System.out.println(this.getClass.getSuperclass);
      return validateSuperclass(cls, this.getClass.getSuperclass)
    }
  }
  
  private[lang] def validateInterfaces(itf : Class[_], toSeek : Class[_]) : scala.Boolean = {
    //java.lang.System.out.println("private.itf: " + itf.getName + " :: " + toSeek.getInterfaces.contains(itf));
    //java.lang.System.out.println("private.toSeek: " + toSeek);
     if(toSeek.equals(classOf[Thing]) && !toSeek.getInterfaces.contains(itf)) {
      //java.lang.System.out.println("Sale de private.itf: false");
      return false//throw new RuntimeException("Class " + cls.getName() + " not exists.");*/
    } else if(toSeek.getInterfaces.contains(itf)) {
      //java.lang.System.out.println("Sale de private.itf: true");
      return true
    } else {
      //java.lang.System.out.println("itf recursivo");
      return validateInterfaces(itf, toSeek.getSuperclass)
      //java.lang.System.out.println("asignar r2");
    }
  }
  
  def validateInterfaces(itf : Class[_]) : scala.Boolean = {
    //java.lang.System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  " + this.getClass);
    //java.lang.System.out.println("itf: " + itf.getName + " :: " + this.getClass.getInterfaces.contains(itf) + " ::: " + this.getClass.getInterfaces.toList);
    if(this.getClass.getInterfaces.contains(itf)) {
      //java.lang.System.out.println("Sale de itf: true");
      return true
    } else if(this.getClass.getInterfaces.contains(classOf[Thing])) {
      //java.lang.System.out.println("Sale de itf: false");
      return false//throw new RuntimeException("Class " + cls.getName + " not exists.");
    } else {
      //java.lang.System.out.println("itf sobrecarga");
      return validateInterfaces(itf, this.getClass.getSuperclass)
      //java.lang.System.out.println("asignar r1");
    }
  }
  
  @naturalistic.lang.annotations.Verb(name = "string", signature = "string of itself", returnType = "naturalistic.lang.String", container = "Adjective")
  def string_of_itself : naturalistic.lang.String = naturalistic.lang.String.instance(this.getClass.getName + "@" + this.hashCode);
  override final def toString : java.lang.String = string_of_itself.getContained;
}
//@naturalistic.lang.annotations.Verb(name = "", preposition = "", signature = "", returnType = "")
@naturalistic.lang.annotations.Noun(name = "Thing", plural = "Things")
class Thing extends Adjective {
  
  private var pos = 0;
  
  def setPos(pos : Int) {
    this.pos = pos
  }
  def getPos = pos
}

object Null extends naturalistic.lang.Thing{}

object Things /*extends Things*//*[Thing]*/ {
  
  val singular : java.lang.Class[_ <: Adjective] = classOf[naturalistic.lang.Thing];
  
  def instance(itfs : Array[java.lang.Class[_]]) = {
    val t = new Things/*[Thing]*/{};
    t.parentClass = singular//t.parentClass = classOf[Thing];
    t.interfaces = itfs;
    t;
  }
}

//@naturalistic.lang.annotations.NounClass(name = "Things", isPlural = "true")
abstract class Things/*[T <: Adjective]*/ extends Thing {
  
  
  def value_$eq(t : Things/*[_]*/) {
    this.pluralAux = t.element_of_itself.asInstanceOf[List[_ <: Adjective/*T*/]];
  }
  
  //def getSingleClass = this.getClass;
  
  var interfaces : Array[java.lang.Class[_]] = _;
  var parentClass : java.lang.Class[_ <: Adjective] = _;
  
  protected var pluralAux : scala.List[_ <: Adjective /*T*/] = List()
  
  
  /**
   * MÉTODO PARA BUSCAR UN ELEMENTO EN UN PLURAL, SIN FILTROS 
   */
  def seekOneInstance(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], pos : Int) : naturalistic.lang.Adjective = {
    var it = new ItMethodCompanion
    it.setVarList(pluralAux)
    
    return it.getOneThing(cls, adjectives, pos)
    
    //return thing;
  }
  
  /**
   * MÉTODO PARA BUSCAR UN ELEMENTO EN UN PLURAL, SIN FILTROS 
   */
  def seekOneInstance(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], filters: scala.List[Adjective => scala.Boolean], pos : Int) : naturalistic.lang.Adjective = {
    var it = new ItMethodCompanion
    it.setVarList(pluralAux)
    
    return it.getOneThing(cls, adjectives, filters, pos)
    
    //return thing;
  }
  
  /**
   * MÉTODO PARA BUSCAR VARIOS ELEMENTOS EN UN PLURAL, FALTA INDAGAR QUÉ SE LE PASA PARA INVOCAR A NOUN 
   */
  def seekManyInstances(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], pos : Int, reverse : scala.Boolean) : Adjective = {
    var it = new ItMethodCompanion
    it.setVarList(pluralAux)
    
    return it.getManyThings(cls, adjectives, pos, reverse)
    
    //return thing;
  }
  
  /**
   * MÉTODO PARA BUSCAR VARIOS ELEMENTOS EN UN PLURAL, FALTA INDAGAR QUÉ SE LE PASA PARA INVOCAR A NOUN 
   */
  def seekManyInstances(cls : java.lang.Class[_ <: Adjective], adjectives : scala.Array[java.lang.Class[_]], filters: scala.List[_ <: Adjective => scala.Boolean], pos : Int, reverse : scala.Boolean) : Adjective = {
    var it = new ItMethodCompanion
    it.setVarList(pluralAux)
    
    return it.getManyThings(cls, adjectives, filters, pos, reverse)
    
    //return thing;
  }
  
  @naturalistic.lang.annotations.Verb(name = "element", signature = "element of itself", returnType = "scala.List", container = "Things")
  def element_of_itself : scala.List[_/*T*/] = pluralAux;
  
  private[lang] def getContained : scala.List[_ <: Adjective/*T*/] = pluralAux;
  private[lang] def setContained(things : scala.List[_ <: Adjective/*T*/]) {
    pluralAux = things;
  }
  //private[lang] var size = 0
  
  //private[lang] var isEmpty = true
  
  protected var isEmpty = true
  
  final def ___plural_size = pluralAux.size
  
  def size_of_itself : naturalistic.lang.Number with naturalistic.lang.Integer = naturalistic.lang.Number.instance(pluralAux.size);
  
  
  private def seekInterfaces(cls : java.lang.Class[_]) : scala.Boolean = {
    
    if(interfaces.size == 0) {
      return true;
    }
    
    var bnd = false;
    var clsAux = cls;
    while(clsAux != classOf[naturalistic.lang.Thing]) {
      bnd = iterateInterfaces(clsAux.getInterfaces)
      
      if(bnd == true) {
        //println("Found: finish it");
        return true;
      } else {
        clsAux = clsAux.getSuperclass
      }
    }
    
    if(bnd == false) {
      throw new RuntimeException("Illegal type");
    }
    
    return bnd;
    
  }
  
  private def iterateInterfaces(itf : Array[java.lang.Class[_]]) : scala.Boolean = {
    
    if(itf == null) {
      return false
    }
    
    var bnd = false;
    
    for(interface <- itf) {
      if(!interfaces.contains(interface)) {
        if(iterateInterfaces(interface.getInterfaces) == true) {
          return true;
        }
      } else {
        //println("Found: " + interface);
        return true;
      }
    }
    return bnd
    
  }
  
  
  
  
  @naturalistic.lang.annotations.Verb(name = "add", preposition = "to", signature = "add Thing to itself", returnType = "Things", container = "Things")
  def /*____plural_*/add_arg_to_itself(thing : Adjective/*T*/) : Things/*[T]*/ = {
    /*for(interface <- interfaces) {
      //if(!thing.getClass.getInterfaces.contains(interface)) {
      if(!thing.getClass.getInterfaces.contains(interface)) {
        throw new RuntimeException("Illegal type");
      }
    }*/
    seekInterfaces(thing.getClass)
    //java.lang.System.out.println(classOf[X] + " :::: " + thing.isInstanceOf[X] + " :::: " + thing.getClass);
    pluralAux = pluralAux ::: List(thing)
    isEmpty = false
    this;
  }
  
  @naturalistic.lang.annotations.Verb(name = "add", preposition = "before", signature = "add Things before itself", returnType = "Things", container = "Things")
  def /*____plural_*/add_arg_before_itself(things : Things/*T*/) : Things/*[T]*/ = {
    for(interface <- things.interfaces) {
      if(!this.interfaces.contains(interface)) {
        throw new RuntimeException("Illegal type");
      }
    }
    //java.lang.System.out.println(classOf[X] + " :::: " + thing.isInstanceOf[X] + " :::: " + thing.getClass);
    pluralAux = things.getContained ::: pluralAux
    isEmpty = false
    this;
  }
  
  @naturalistic.lang.annotations.Verb(name = "add", preposition = "after", signature = "add Things after itself", returnType = "Things", container = "Things")
  def /*____plural_*/add_arg_after_itself(things : Things/*T*/) : Things/*[T]*/ = {
    for(interface <- things.interfaces) {
      if(!this.interfaces.contains(interface)) {
        throw new RuntimeException("Illegal type");
      }
    }
    //java.lang.System.out.println(classOf[X] + " :::: " + thing.isInstanceOf[X] + " :::: " + thing.getClass);
    pluralAux = pluralAux ::: things.getContained
    isEmpty = false
    this;
  }
  
  @naturalistic.lang.annotations.Verb(name = "contains", signature = "itself contains Thing", returnType = "Boolean", container = "Things")
  def /*____plural_*/itself_contains_arg(thing : Adjective /*T*/) : naturalistic.lang.Boolean = {
    /*for(interface <- interfaces) {
      if(thing.getClass.getInterfaces.contains(interface)) {
        naturalistic.lang.True;
      }
    }
    naturalistic.lang.False;*/
    //java.lang.System.out.println("						pluralAux : " + pluralAux);
    for(aux <- pluralAux) {
      if(aux.itself_equal_to_arg(thing).isTrue) {
        //java.lang.System.out.println("						contains true");
        return naturalistic.lang.True;
      }
    }
    //java.lang.System.out.println("						contains false");
    /*if(pluralAux.contains(thing)) {
      java.lang.System.out.println("						contains true");
      return naturalistic.lang.True;
    } else {
      java.lang.System.out.println("						contains false");
      return naturalistic.lang.False;
    }*/
    return naturalistic.lang.False;
  }
  
  private var selectedIndex : scala.Int = -1
  
  
  /**
   * FALTA VERIFICAR EL ÍNDICE
   */
  @naturalistic.lang.annotations.Verb(name = "select", preposition = "from", signature = "select Integer Number from itself", returnType = "Integer", container = "Things")
  def /*____plural_*/select_arg_from_itself(index : naturalistic.lang.Number with Integer) : Integer/*T*/ = {
    //println("index: " + index + " :: " + pluralAux.size + " : " + pluralAux);
    if(index.__intValue >= 0 && index.__intValue < pluralAux.size) {
      selectedIndex = index.__intValue/**selectedIndex = index.__intValue-1*/
      //naturalistic.lang.Boolean.instance(true)
      naturalistic.lang.Number.instance(selectedIndex)
    } else {
      throw new RuntimeException("The index does not exists");
    }
    //naturalistic.lang.Boolean.instance(false)
  }
  
  @naturalistic.lang.annotations.Verb(name = "select", preposition = "from", signature = "select Integer Number from itself", returnType = "Integer", container = "Things")
  def /*____plural_*/select_arg_from_itself(ordinal : Ordinal) : Integer/*T*/ = {
    //println("index: " + index + " :: " + pluralAux.size + " : " + pluralAux);
    if(ordinal.__intValue == -1) {
      selectedIndex = this.___plural_size
    } else {
      selectedIndex = ordinal.__intValue
    }
    naturalistic.lang.Number.instance(selectedIndex)
    //naturalistic.lang.Boolean.instance(false)
  }
  
  
  @naturalistic.lang.annotations.Verb(name = "set", preposition = "into", signature = "set Thing into itself", returnType = "Boolean", container = "Things")
  def /*____plural_*/set_arg_into_itself(thing : naturalistic.lang.Number with Integer) : Boolean/*T*/ = {
    if(selectedIndex >= 0 && selectedIndex < pluralAux.size) {
      var auxL : scala.List[_ <: Adjective] = scala.List()
      var auxR : scala.List[_ <: Adjective] = scala.List()
      var aux = pluralAux
      //for(i <- 0 to selectedIndex-1) {
      for(i <- 0 to selectedIndex) {
        auxL = auxL ::: List(aux.head)
        auxR = aux.tail
        aux = aux.tail
        
      }
      //pluralAux = auxL ::: List(thing) ::: auxR
      if(selectedIndex < 0) {
        pluralAux = List(thing) ::: aux
      } else if(auxR.size > 0) {
        pluralAux = auxL ::: List(thing, auxR.head) ::: auxR.tail
      } else {
        pluralAux = auxL ::: List(thing) ::: auxR
      }
      
      selectedIndex = -1
      //auxR.head
      naturalistic.lang.Boolean.instance(true)
    } else {
      throw new RuntimeException("The index does not exists");
    }
    naturalistic.lang.Boolean.instance(false)
  }
  
  @naturalistic.lang.annotations.Verb(name = "replace", preposition = "into", signature = "replace Thing into itself", returnType = "Boolean", container = "Things")
  def /*____plural_*/replace_arg_into_itself(thing : naturalistic.lang.Number with Integer) : Boolean/*T*/ = {
    if(selectedIndex >= 0 && selectedIndex < pluralAux.size) {
      var auxL : scala.List[_ <: Adjective] = scala.List()
      var auxR : scala.List[_ <: Adjective] = scala.List()
      var aux = pluralAux
      for(i <- 0 to selectedIndex) {
        auxL = auxL ::: List(aux.head)
        auxR = aux.tail
        aux = aux.tail
      }
      if(selectedIndex < 0) {
        pluralAux = List(thing) ::: aux.tail
      } else if(auxR.size > 0) {
        pluralAux = auxL ::: List(thing) ::: auxR.tail
      } else {
        pluralAux = auxL ::: List(thing)
      }
      selectedIndex = -1
      //auxR.head
      naturalistic.lang.Boolean.instance(true)
    } else {
      throw new RuntimeException("The index does not exists");
    }
    naturalistic.lang.Boolean.instance(false)
  }
  
  @naturalistic.lang.annotations.Verb(name = "remove", preposition = "from", signature = "remove from itself", returnType = "Thing", container = "Things")
  def /*____plural_*/remove_from_itself : Adjective/*T*/ = {
    if(selectedIndex >= 0 && selectedIndex < pluralAux.size) {
      var auxL = pluralAux
      //var auxL : scala.List[_ <: Adjective] = scala.List()
      var auxR : scala.List[_ <: Adjective] = scala.List()
      for(i <- 0 to selectedIndex) {
        auxL = auxL ::: List(pluralAux.head)
        auxR = pluralAux.tail
        
      }
      pluralAux = auxL ::: auxR.tail
      selectedIndex = -1
      auxR.head
    } else {
      throw new RuntimeException("The index does not exists");
    }
    //naturalistic.lang.Boolean.instance(false)
  }
  
  @naturalistic.lang.annotations.Verb(name = "remove", preposition = "from", signature = "remove from itself", returnType = "Thing", container = "Things")
  def /*____plural_*/remove_arg_from_itself(ordinal : Ordinal) : Adjective/*T*/ = {
    if(ordinal.__intValue == 0) {
      var aux = pluralAux.head
      pluralAux = pluralAux.tail
      aux
    } else if(ordinal.__intValue != -1) {
      //println(ordinal);
      var auxL = List[Adjective]()//pluralAux
      //var auxL : scala.List[_ <: Adjective] = scala.List()
      var auxR : scala.List[_ <: Adjective] = scala.List()
      for(i <- 0 to ordinal.__intValue -1) {
        auxL = auxL ::: List(pluralAux.head)
        auxR = pluralAux.tail
        
      }
      pluralAux = auxL ::: auxR.tail
      selectedIndex = -1
      auxR.head
    } else {
      pluralAux = pluralAux.reverse
      var aux = pluralAux.head
      pluralAux = pluralAux.tail.reverse
      aux
    }
    //naturalistic.lang.Boolean.instance(false)
  }
  
  
  /** ERROR EN EL ANÁLISIS DEL COMPILADOR, TOMA get.from(this) EN LUGAR DE this.get_from_itself.
  @naturalistic.lang.annotations.Verb(name = "get", preposition = "from", signature = "get from itself", returnType = "Thing")
  def /*____plural_*/get_from_itself : Adjective/*T*/ = {
    if(selectedIndex >= 0 && pluralAux.size <= selectedIndex) {
      var aux = pluralAux(selectedIndex);
      selectedIndex = -1
      aux
    } else {
      throw new RuntimeException("The index does not exists");
    }
    //naturalistic.lang.Boolean.instance(false)
  }
  */
  @naturalistic.lang.annotations.Verb(name = "get", preposition = "from", signature = "get Thing from itself", returnType = "Thing", container = "Things")
  def /*____plural_*/get_arg_from_itself(index : naturalistic.lang.Number with Integer) : Adjective = pluralAux(index.__intValue)
  
  @naturalistic.lang.annotations.Verb(name = "get", preposition = "from", signature = "get Thing from itself", returnType = "Thing", container = "Things")
  def /*____plural_*/get_arg_from_itself(ordinal : Ordinal) : Adjective/*T*/ = {
    if(ordinal.__intValue != -1) {
      pluralAux(ordinal.__intValue)
    } else {
      pluralAux = pluralAux.reverse
      var aux = pluralAux.head
      pluralAux = pluralAux.reverse
      aux
    }
  }
  
  @naturalistic.lang.annotations.Verb(name = "last", signature = "last of itself", returnType = "Thing", container = "Things")
  def /*____plural_*/last_of_itself : Adjective/*T*/ = pluralAux.reverse.head
  
  @naturalistic.lang.annotations.Verb(name = "first", signature = "first of itself", returnType = "Thing", container = "Things")
  def /*____plural_*/first_of_itself = pluralAux.head
  
  @naturalistic.lang.annotations.Verb(name = "head", signature = "head of itself", returnType = "Thing", container = "Things")
  def /*____plural_*/head_of_itself : naturalistic.lang.Adjective = {
    //java.lang.System.out.println("			TTT " + pluralAux.head.getClass);
    return pluralAux.head
  }
  
  def tail_of_itself : naturalistic.lang.Things = {
    val t = new Things/*[T]*/{};
    t.pluralAux = pluralAux.tail;
    return t;
  }
  
  @naturalistic.lang.annotations.Verb(name = "remove", preposition = "from", signature = "remove Thing from itself", returnType = "Thing", container = "Things")
  def /*____plural_*/remove_arg_from_itself(index : naturalistic.lang.Integer) : Adjective/*T*/ = {
    //java.lang.System.out.println(index.__intValue-1 + "<<<-----");
    var aux = pluralAux(index.__intValue)
    /*pluralAux = pluralAux.diff(List(aux))
    aux*/
    
    var auxList : scala.List[_ <: Adjective/*T*/] = scala.List();
    var i = 0;
    for(elem <- pluralAux) {
      if(i != index.__intValue) {
        auxList = auxList ::: List(elem)
		    //java.lang.System.out.println("NO ENTRA " + i + " :: " + elem);
      } else {
        //java.lang.System.out.println("ENTRA " + i + " :: " + elem);
      }
      i = i + 1;
    }
    //println("PLURAL AUX ANTES : " + pluralAux);
    pluralAux = auxList;
    //println("PLURAL AUX DESPUÉS : " + pluralAux);
    return aux
  }
  
  /*@naturalistic.lang.annotations.Verb(name = "remove", preposition = "from", signature = "remove thing form itself", returnType = "Thing")
  def /*____plural_*/remove_first : T = {
    pluralAux = pluralAux.tail
    pluralAux.head
  }*/
  /*def /*____plural_*/remove_last : T = {
    var aux = pluralAux.reverse.head
    pluralAux = pluralAux.diff(List(aux))
    aux
  }*/
  
  @naturalistic.lang.annotations.Verb(name = "string", signature = "string of itself", returnType = "String", container = "Things")
  override def string_of_itself = {
    var cad = "[";//"Things with ";
    //var cnt = 1;
    if(pluralAux.size > 0) {
      for(thing <- pluralAux) {
        cad = cad + thing + ", "//cad = cad + cnt + ")" + things + " | "
        //cnt = cnt + 1;
      }
      cad = cad.substring(0,cad.length()-2) + "]";//cad = cad + " as ";
    } else {
      cad = cad + "]";//cad = cad + "none as"
    }
    //cad = cad + " values";
    naturalistic.lang.String.instance(cad);
    //things.toString
  }
  
  /*def /*____plural_*/to_Array : scala.Array[Thing] = {
    pluralAux.toArray
  }*/
  
  @naturalistic.lang.annotations.Verb(name = "reverse", signature = "reverse of itself", returnType = "Things", container = "Things")
  def reverse_of_itself : Things/*[T]*/ = {
    val reverseThings = new Things/*[T]*/ {}
    //reverseThings.pluralThing = this.pluralThing
    reverseThings.setContained(this.pluralAux.reverse)
    reverseThings
  }
  
  /****************************************************************
  * MECANISMO PARA REEMPLAZAR EL FORMATO plural_name_args*_itself *
  ****************************************************************/
  private[lang] var singularMethod : java.lang.String = _;
  
  def setSingularMethod(singularMethod : java.lang.String) {
    this.singularMethod = singularMethod
  }
  
  def pluralInvoker(/*thisValue : naturalistic.lang.Things[_]*/) : naturalistic.lang.Thing = {
  /**def pluralInvoker(singularMethod : java.lang.String) : naturalistic.lang.Thing = {*/
    //java.lang.System.out.println("Entra a pluralInvoker(arg0)");
    val it = new naturalistic.lang.ItMethodCompanion;//[naturalistic.lang.Thing];
    
    var aux : naturalistic.lang.Thing = null;
    
    if(this.containsMethod(singularMethod)) {
      //java.lang.System.out.println("true :: " + singularMethod);
      aux = it.invokeMethod(this, singularMethod).invoke(this).asInstanceOf[naturalistic.lang.Thing]
      aux;
    } else {
      //this.findMethod("instance", this.getClass);
      val pluralVar = naturalistic.lang.Things.instance(Array());
      //java.lang.System.out.println("entra :: " + this.getClass.getSuperclass);
      //java.lang.System.exit(0)
      
      //val pluralVar = this.findMethod("instance", this.getClass).invoke(null, Array[Class[_]]());
      for(element <- pluralAux) {
        //java.lang.System.out.println("entra :: " + it);
        //java.lang.System.out.println("entra :: " + element + " :::: " + element.getClass.getInterfaces.toList + " :::: " + singularMethod + " :::: " + this.getClass.getSuperclass);
        
        pluralVar./*____plural_*/add_arg_to_itself(it.invokeMethod(element, singularMethod).invoke(element).asInstanceOf[naturalistic.lang.Thing]);
        
        /*val aa = it.invokeMethod(element, singularMethod).invoke(element);
        it.invokeMethod(pluralVar.asInstanceOf[Thing], "add_arg_to_itself", aa.asInstanceOf[naturalistic.lang.Thing]).invoke(pluralVar, aa);*/
      }
      aux = pluralVar.asInstanceOf[Thing];
      singularMethod = null
      aux;
    }
  }
  def pluralInvoker(/*thisValue : naturalistic.lang.Things[_],*/ arguments : naturalistic.lang.Adjective*) : naturalistic.lang.Thing = {
  /**def pluralInvoker(singularMethod : java.lang.String, arguments : naturalistic.lang.Adjective*) : naturalistic.lang.Thing = {**/
    
    val it = new naturalistic.lang.ItMethodCompanion;//[naturalistic.lang.Thing];
    
    var aux : naturalistic.lang.Thing = null;
    
    if(this.containsMethod(singularMethod)) {
      //java.lang.System.out.println("true :: " + singularMethod);
      aux = it.invokeMethod(this, singularMethod, arguments.toArray).invoke(this, arguments.toArray).asInstanceOf[naturalistic.lang.Thing]
      aux;
    } else {
      //java.lang.System.out.println("false :: " + singularMethod);
      val pluralVar = naturalistic.lang.Things.instance(Array());
      for(element <- pluralAux) {
        pluralVar.add_arg_to_itself(it.invokeMethod(element, singularMethod, arguments.toArray).invoke(element, arguments.toArray).asInstanceOf[naturalistic.lang.Thing]);
      }
      aux = pluralVar;
      singularMethod = null
      aux;
    }
    
    //it.invokeMethod(this, name, arguments.toArray).invoke(this, arguments.toArray)
    
    //aux;
    
    //it.addElem(it.invokeMethod(naturalistic.lang.System, "itself_prints_arg", exp).invoke(naturalistic.lang.System, exp).asInstanceOf[naturalistic.lang.Thing].asInstanceOf[naturalistic.lang.Thing]);
  }
  
  def whereFilter(fieldNames : Array[java.lang.String], comparatorNames : Array[java.lang.String], arguments : Array[naturalistic.lang.Adjective]) : naturalistic.lang.Things = {
    val it = new naturalistic.lang.ItMethodCompanion;//[naturalistic.lang.Thing];
    
    var aux : naturalistic.lang.Things = naturalistic.lang.Things.instance(Array());//Array[naturalistic.lang.Things]();
    
    var auxFieldNames = fieldNames
    var auxComparatorNames = comparatorNames
    var auxArguments = arguments
    
    for(i <- 0.to(auxFieldNames.size-1)) {
      
      var fieldName = auxFieldNames.head
      var comparatorName = auxComparatorNames.head
      var argument = auxArguments.head
    
      if(this.containsMethod(fieldName)) {
        //val pluralVar = naturalistic.lang.Things.instance(Array());
        val simpleAux = it.invokeMethod(this, fieldName, argument).invoke(this, argument).asInstanceOf[naturalistic.lang.Thing]
        aux.add_arg_to_itself(simpleAux);
        //aux = pluralVar;
        //aux;
      } else {
        //val pluralVar = naturalistic.lang.Things.instance(Array());
        for(element <- pluralAux) {
          val field = it.invokeMethod(element, fieldName).invoke(element).asInstanceOf[naturalistic.lang.Thing]
          if(it.invokeMethod(field, comparatorName, argument).invoke(field, argument).asInstanceOf[naturalistic.lang.Boolean].isTrue()) {
            aux.add_arg_to_itself(element);
          }
        }
        //aux = pluralVar;
        //aux;
      }
      singularMethod = null
      
      auxFieldNames = auxFieldNames.tail
      auxComparatorNames = auxComparatorNames.tail
      auxArguments = auxArguments.tail
      
    }
    aux;
  }
  
  private def findMethod(name : java.lang.String, cls : Class[_]) : java.lang.reflect.Method = {
      //val pluralVar = naturalistic.lang.Things.instance(Array());
      
      //val pluralVar2 = this.getClass.getMethod("instance", classOf[Array[Class[_]]]);
      val aux = this.getClass.getMethods.filter(_.getName.equals(name));
      
      for(m <- aux) {
        if(m.getName == "instance") {
          if(m.getReturnType.equals(this.getClass) || m.getReturnType.equals(this.getClass.getSuperclass)) {
            //java.lang.System.out.println("++++ " + m);
            return m;
          }
        }
      }
      //java.lang.System.out.println("-------");
      return null;
      
      //java.lang.System.out.println("++++ " + pluralVar2);
      
      //val arr = Array("", 0,2.4);
      //java.lang.System.out.println(arr.getClass);
      
  }
  
  private def containsMethod(name : java.lang.String) : scala.Boolean = {
    for(m <- this.getClass.getMethods) {
      if(m.getName.equals(name)) {
        true;
      }
    }
    false;
  }
  
}

object NullAux extends Adjective {
  def instance = this;
}