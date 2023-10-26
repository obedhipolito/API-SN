package naturalistic.lang

/**
@author Oscar Pulido Prieto.
*/
@naturalistic.lang.annotations.Noun(name = "System")
abstract class System extends naturalistic.lang.Thing
  {@naturalistic.lang.annotations.Verb(name = "prints", signature = "itself prints naturalistic.lang.Thing", returnType = "naturalistic.lang.String", container = "System")
  def itself_prints_arg(thing : Thing) : naturalistic.lang.String
  @naturalistic.lang.annotations.Verb(name = "prints", signature = "itself prints naturalistic.lang.Thing and naturalistic.lang.Thing", returnType = "naturalistic.lang.String", container = "System")
  def itself_prints_arg_arg(thing : Thing, thing2 : Thing) : naturalistic.lang.String
  @naturalistic.lang.annotations.Verb(name = "reads", signature = "itself reads", returnType = "naturalistic.lang.String", container = "System")
  def itself_reads : naturalistic.lang.String
  @naturalistic.lang.annotations.Verb(name = "empties", signature = "itself empties Things", returnType = "naturalistic.lang.Things", container = "System")
  def itself_empties_arg(things : Things) : naturalistic.lang.Things
}

object System extends naturalistic.lang.Thing
  {@naturalistic.lang.annotations.Verb(name = "prints", signature = "itself prints naturalistic.lang.Thing", returnType = "naturalistic.lang.String", container = "System")
  def itself_prints_arg(thing : Thing) : naturalistic.lang.String = {
    //val aux = naturalistic.lang.String.instance(thing.toString);
    print(thing.toString);
    thing.string_of_itself;
    //aux;
  }
  
  @naturalistic.lang.annotations.Verb(name = "prints", signature = "itself prints naturalistic.lang.Thing and naturalistic.lang.Thing", returnType = "naturalistic.lang.String", container = "System")
  def itself_prints_arg_arg(thing : Thing, thing2 : Thing) : naturalistic.lang.String = {
    val aux = naturalistic.lang.String.instance(thing.toString).concat_arg_with_itself(naturalistic.lang.String.instance(thing2.toString));
    print(aux.toString);
    if(thing2.equals(newline)) {
      //java.lang.System.err.println("encuentra newline");
      thing.string_of_itself
    } else {
      aux;
    }
  }
  
  @naturalistic.lang.annotations.Verb(name = "reads", signature = "itself reads", returnType = "naturalistic.lang.String", container = "System")
  def itself_reads : naturalistic.lang.String = {
    //var br : java.io.BufferedReader = null;
    var input : java.lang.String = null;
    var scanner : java.util.Scanner = null
    try {
      /*br = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
      input = br.readLine();*/
      scanner = new java.util.Scanner(java.lang.System.in)
      input = scanner.nextLine()
      //java.lang.System.out.println("Carga");
    } catch {
      case e : java.io.IOException => {e.printStackTrace(); java.lang.System.exit(0);}
    } finally {
      //java.lang.System.out.println("final");
      //if(br != null) {
      /*if(scanner != null) {
        try {
          //br.close();
          scanner.close;
        } catch {
          case e : java.io.IOException => {return naturalistic.lang.String.instance("Error 2")}
        }
      }*/
    }
    //java.lang.System.out.println(input);
    naturalistic.lang.String.instance(input);
  }
  
  @naturalistic.lang.annotations.Verb(name = "empties", signature = "itself empties Things", returnType = "naturalistic.lang.Things", container = "System")
  def itself_empties_arg(things : Things) : naturalistic.lang.Things = {
    things.setContained(List())
    things
  }
}

//object System extends naturalistic.lang.System {}

/*
System prints string of the first Attribute and newline.
	System prints string of the first Attribute and newline.
	System prints string of the first Attribute and newline.
	System prints string of the first Attribute and newline.
	System prints "||| " and newline.
	System prints string of attributes and newline.
	System prints "||| " and newline.*/