package pd.examen;

public class Aceite extends Articulo{

	private static Aceite aceite = null;

	private Aceite(double precio){
		super("Aceite",precio);
	}

    public static Aceite getInstance() {
        // Creación perezosa
        if (Aceite.aceite == null) {
        	Aceite.aceite = new Aceite(2.0);
        }
        return Aceite.aceite;
    }
	
}
