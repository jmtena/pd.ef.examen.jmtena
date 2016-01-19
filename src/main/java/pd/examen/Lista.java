package pd.examen;

public class Lista extends Cesta{

	private java.util.List<Cesta> list;

    public Lista(String name) {
        super(name);
        this.list = new java.util.ArrayList<Cesta>();
    }

	@Override
	public void add(Articulo articulo) {
		list.add(articulo);
	}

	@Override
	public void add(Cesta cesta) {
		list.add(cesta);
	}
    
	@Override
	public int cantidad() {
		int size = 0;
		
		for (Cesta item : list) {
			size += item.cantidad();
		}
		
		return size;
	}

	@Override
	public double valor() {
		double value = 0;
		
		for (Cesta item : list) {
			value += item.valor();
		}
		
		return value;
	}
    
}
