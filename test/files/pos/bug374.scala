object tokens extends Enumeration {
  type Token = Value;
  val BAD     = Value("<bad>");
  val IDENT   = Value("ident");
  val NAME    = Value("name");
}

object test extends Object with Application {
  import tokens._;

  val reserved = new scala.collection.mutable.HashMap[String, Token]();

  if (true) {
    reserved.get("a") match {
      case None     => IDENT
      case Some(tk) => tk
    }
  }
  else
    BAD
}
