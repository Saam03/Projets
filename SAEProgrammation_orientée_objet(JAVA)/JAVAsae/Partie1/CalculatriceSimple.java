public class CalculatriceSimple {
	public static void main(String [] args){

	/*-----------------MULTIPLICATION-------------------------*/

	Nombre six = new Nombre(6) ;

	Nombre dix = new Nombre(10) ;

	Operation s = new Multiplication(six,dix) ;

	System.out.println(s + " = " + s.Valeur());

	/*-----------------DIVISION QUI MARCHE PAS -------------------------*/

	try {
	Nombre vingt = new Nombre(20);
	Nombre zero = new Nombre(0);
	Operation s1 = new Division(vingt,zero);
	System.out.println(s1 + " = " + s1.Valeur());
		}
	 catch (ArithmeticException e) {
            System.out.println(
            "Ne peut etre divisé par zéro.");
        }

	/*-----------------DIVISION QUI MARCHE -------------------------*/

	try {
	Nombre vingt = new Nombre(20);
	Nombre deux = new Nombre(2);
	Operation s4 = new Division(vingt,deux);
	System.out.println(s4 + " = " + s4.Valeur());
		}
	 catch (ArithmeticException e) {
            System.out.println(
            "Ne peut etre divisé par zéro.");
        }

	/*-----------------SOUSTRACTION-------------------------*/

	Nombre trois = new Nombre(3);

	Nombre quatre = new Nombre(4);

	Operation s2 = new Soustraction(trois,quatre);

	System.out.println(s2 + " = " + s2.Valeur());

	/*-----------------ADDITION-------------------------*/

	Nombre sept = new Nombre(7);

	Nombre un = new Nombre(1);

	Operation s3 = new Addition(sept,un);

	System.out.println(s3 + " = " + s3.Valeur());


	}
}
