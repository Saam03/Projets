public class Division extends Operation {

private Expression op1;
private Expression op2;

public Division () {
	super();
}

public Division(Expression op1, Expression op2){
	super(op1,op2);
}


public int Valeur () throws ArithmeticException {

	if (this.getOPerande2().Valeur()==0){
	throw new ArithmeticException("On ne peut pas diviser par 0.");
					 }
		return this.getOPerande1().Valeur() / this.getOPerande2().Valeur();
}

public String toString(){

	String s = "( " + this.getOPerande1().Valeur() + " / " + this.getOPerande2().Valeur() + " ) ";
	return s;
	}



}
