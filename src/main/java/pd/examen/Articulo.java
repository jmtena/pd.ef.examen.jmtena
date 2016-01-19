package pd.examen;

public class Articulo extends Cesta{
	
	protected double valor;

	public Articulo(String nombre, double precio) {
        super(nombre);
        this.valor = precio;
    }
	
	@Override
	public void add(Articulo articulo) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public void add(Cesta cesta) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public int cantidad() {
		return 1;
	}

	@Override
	public double valor() {
		return this.valor;
	}
	
}
