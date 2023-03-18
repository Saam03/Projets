public class Multiplication extends Operation {

private Expression op1;
private Expression op2;

public Multiplication () {
	super();
}

public Multiplication(Expression op1, Expression op2){
	super(op1,op2);
	}


public int Valeur (){
		return this.getOPerande1().Valeur() * this.getOPerande2().Valeur();
}

public String toString(){

	String s = "( " + this.getOPerande1().Valeur() + " * " + this.getOPerande2().Valeur() + " ) ";
	return s;
	}



}
