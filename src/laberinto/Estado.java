package laberinto;


import java.util.Objects;

public class Estado {

		private Laberinto lab;
		private Estado antecesor;
		private final String movimiento;
		
		
		
		public Estado(Laberinto lab, Estado antecesor, String movimiento) {
			
			this.lab = lab;
			this.antecesor = antecesor;
			this.movimiento = movimiento;
			
		}



		public Laberinto getLab() {
			return lab;
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
		        return ((Estado)obj).getLab().equals(this.getLab());
		    }

		  @Override
		  	public int hashCode() {
		        //Hashcode generado por IDE
		        int hash = 5;
		        hash = 89 * hash + Objects.hashCode(this.lab);
		        hash = 89 * hash + Objects.hashCode(this.antecesor);
		        hash = 89 * hash + Objects.hashCode(this.movimiento);
		        return hash;
		    }


		@Override
		public String toString() {
			return this.movimiento;
		}




		
		
	}
	
	

