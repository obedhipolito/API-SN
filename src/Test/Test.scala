package Test

import naturalistic.lang._

object Test extends App {
  var a = new Number with Integer
  a.setValue(9)
  print(a.getValue)
}