package pd.examen;

public class Azucar extends Articulo{
	
	private static Azucar azucar = null;

	private Azucar(double precio){
		super("Azucar",precio);
	}

    public static Azucar getInstance() {
        // Creación perezosa
        if (Azucar.azucar == null) {
        	Azucar.azucar = new Azucar(1.0);
        }
        return Azucar.azucar;
    }
	
}
