package datoss;


public enum Bebestibles {
        BEBIDA(1000),
	NECTAR(1000),
        JUGONATURAL(1500),
        AGUAMINERAL(1000);
        
        private int precio;
        
    Bebestibles(int precio) { 
      this.precio = precio;
      
    }

    @Override
    public String toString() {
        return "Bebestibles{" + "precio=" + precio + '}';
    }
    public void mostrarBebestible(){
        for(Bebestibles beb: Bebestibles.values()){
            System.out.println(beb.toString()+"-");
        }
    }
    public int getPrecio() {
        return precio; 
    }
}
