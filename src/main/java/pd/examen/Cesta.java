package pd.examen;

public abstract class Cesta {

    private String name;

    public Cesta(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public abstract void add(Articulo articulo);
    public abstract void add(Cesta cesta);
    public abstract int cantidad();
    public abstract double valor();
	
}
