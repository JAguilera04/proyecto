
package datoss;


public enum Comestibles {
    
        HAMBURGUESAS(1500),
	POLLOCONPAPAS(2000),
        CARNEALAOLLA(3000),
        PIZZANAPOLITANA(3000),
        PIZZAVEGETARIANA(2700);
        private int precio;

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Comestibles{" + "precio=" + precio + '}';
    }
    public void mostrarComestible(){
        for(Comestibles com: Comestibles.values()){
            System.out.println(com.toString()+"-");
        }
    }

    Comestibles (int precio) { 
    this.precio = precio;
}
    public int getPrecio() {
        return precio; 
    }

    } 


