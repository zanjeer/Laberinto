package laberinto;
import modelo.Celda;
import modelo.Laberinto;

public class Estado {
		private Laberinto l;
		private Celda cel;
		private Estado antecesor;
		private final String movimiento;
		
		
		
		public Estado(Laberinto lab,Celda cel, Estado antecesor, String movimiento) {
			this.l = lab;
			this.cel = cel;
			this.antecesor = antecesor;
			this.movimiento = movimiento;	
		}



		public Celda getCel() {
			return cel;
		}

		public Estado getAntecesor() {
			return antecesor;
		}

		public String getMovimiento() {
			return movimiento;
		}

	  @Override
	    public boolean equals(Object obj) {
	        if(!(obj instanceof Estado)) return false;
	        return cel.equals(((Estado)obj).getCel());
	        //return((Estado)obj).getCel().equals(this.getCel());
	    }

		@Override
		public String toString() {
			return this.movimiento;
		}

		public Laberinto getL() {
			return l;
		}	
		
}
	
	

