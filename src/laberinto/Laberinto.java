package laberinto;



public class Laberinto {
	
	private Celda[][] celdas;
	
	
	
	
	public Laberinto(Celda[][] celdas) {
		
		this.celdas = celdas;
		
	}



	public Celda getJugador(){
		
		int j=0,i=0;
		for( j = 0; j <=4 ; j++ ){
			for( i = 0; i <= 6 ; i++){
				if (celdas[i][j].getTipo() == "J"){
					return celdas[i][j];
				}
			}
		}
		return null;
	}
	



	public Celda[][] getCeldas() {
		return celdas;
	}



	
}
