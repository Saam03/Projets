public class Nombre extends Expression {

	public int valeurNombre;
	
		public Nombre() {
		}
	
		public Nombre (int uneValeur) {
			this.valeurNombre=uneValeur;
	
		}
		public int Valeur() {
			return this.valeurNombre;
		}
	
		public String toString(){
			String s = "La valeur du nombre est : " + this.Valeur();
			return s;
		}
	
		
	}
	