package laberinto;
import java.util.ArrayList;
import modelo.Celda;
import modelo.Laberinto;

public class Busqueda {
		private ArrayList<Estado> abiertos;
		private ArrayList<Estado> cerrados;
		private Estado actual;
		private Estado meta;
		 private final char[][] laberinto = {{'#', '#', '#', '#', '#'},
							                 {' ', ' ', '#', ' ', ' '},
							                 {'#', ' ', '#', ' ', '#'},
							                 {'#', ' ', '#', ' ', '#'},
							                 {'#', ' ', '#', ' ', '#'},
							                 {'#', ' ', ' ', ' ', '#'},
							                 {'#', '#', '#', '#', '#'}};
								
	
		public Busqueda(Estado actual, Estado meta) {
			this.abiertos = new ArrayList<>();
			this.cerrados = new ArrayList<>();
			this.actual = actual;
			this.meta = meta;
		}
	
	
		public void resultado(){
			char [][] dibujoLaberinto;
	        ArrayList<Estado> resultado = buscar();
	       	      
	        if(resultado.isEmpty()) System.out.println("sin resultado");;
	        
	        dibujoLaberinto = getMapaDibujado();
	        
	        for(Estado e : resultado) {
	            int x = e.getCel().getX();
	            int y = e.getCel().getY();
	            
	            dibujoLaberinto[x][y] = '*';
	            System.out.println("\n" + e.getMovimiento() + "\n");
	            for(int i = 0; i < dibujoLaberinto.length; i++) {
	                for(int j = 0; j < dibujoLaberinto[0].length; j++) {
	                    System.out.print(" " + dibujoLaberinto[i][j]);
	                }
	                System.out.println("");
	            }
	            
	            
	            dibujoLaberinto[x][y] = ' ';
	        }

	    }
	
		private ArrayList<Estado> buscar(){
			ArrayList<Estado> puntos;
			boolean win = false;
			 
			abiertos.add(actual);
			while( !win && !abiertos.isEmpty() ){
				actual = abiertos.get(0);
					if( !cerrados.contains(actual) ){
						cerrados.add(actual);
						expandir(actual);
						if(actual.equals(meta)) win = true; 
						
					}	
				
				abiertos.remove(0);	
			}
			
			puntos = new ArrayList<>();
			if(!win) return puntos;
			
	
			while ( actual != null ){
				
				puntos.add(0,actual);
				actual = actual.getAntecesor();
				
				
			}
			return puntos;
		}
	
		
		
		private void expandir(Estado actual){		
			expandirArriba(actual);
			expandirAbajo(actual);
			expandirDerecha(actual);
			expandirIzquerda(actual);	
		}
	
		private void expandirArriba(Estado actual) {
			Laberinto lab = actual.getL();
			int x = actual.getCel().getX();
			int y = actual.getCel().getY();
			int nx = x - 1;
			Celda nuevo;
			Estado ex1;
			String mov1;
		 
				if( actual.getCel().getX() - 1 >= 0 ){
					if( lab.getCeldas()[x-1][y].getTipo().equals(new String("C"))){
						 nx= x-1;
						 mov1 = " moverse Arriba [" + nx + "] ["+ y +"]" ;
						 nuevo = new Celda(x-1,y,new String("C"));
						 ex1 = new Estado(lab,nuevo, actual, mov1);
						 abiertos.add(ex1);	
					}
				}
		}
	
		private void expandirAbajo(Estado actual) {
			Laberinto lab = actual.getL();
			int x = actual.getCel().getX();
			int y = actual.getCel().getY();
			int nx = x+1;
			Celda nuevo;
			Estado ex1;
			String mov1;
			
				if( actual.getCel().getX() + 1 <= 6  ){
					if( lab.getCeldas()[x+1][y].getTipo().equals(new String("C"))){	
						 mov1 = " moverse Abajo [" + nx + "] ["+ y +"]" ;
						 nuevo = new Celda(x+1,y,new String("C"));
						 ex1 = new Estado(lab,nuevo, actual, mov1);
						 abiertos.add(ex1);	
					}
				}
		}
	
		private void expandirDerecha(Estado actual) {
			Laberinto lab = actual.getL();
			int x = actual.getCel().getX();
			int y = actual.getCel().getY();
			int ny = y+1;
			Celda nuevo;
			Estado ex1;
			String mov1;
			
				if( y + 1 <= 4  ){
					if( lab.getCeldas()[x][y+1].getTipo().equals(new String("C"))){			 
						mov1 = " moverse a la Derecha [" + x + "] ["+ ny +"]" ;
						nuevo = new Celda(x,y+1,new String ("C"));
						ex1 = new Estado(lab,nuevo, actual, mov1);
						abiertos.add(ex1);	
					}
				}
		}
	
		private void expandirIzquerda(Estado actual) {
			Laberinto lab = actual.getL();
			int y = actual.getCel().getY();
			int x = actual.getCel().getX();	
			int ny = y-1;
			Estado ex1;
			String mov1;
			Celda nuevo;
			
				if( y - 1 >= 0  ){
					if( lab.getCeldas()[x][y-1].getTipo().equals(new String("C"))){
						 mov1 = " moverse a la Izquerda [" + x + "] ["+ ny +"]" ;
						 nuevo = new Celda(x,y-1,new String ("C"));
						 ex1 = new Estado(lab,nuevo, actual, mov1);
						 abiertos.add(ex1);	
					}
				}
		}	
		
		
		
		 private char[][] getMapaDibujado() {
		        return laberinto;
		    }
		    
}
