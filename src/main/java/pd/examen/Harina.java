package pd.examen;

public class Harina extends Articulo{

	private static Harina harina = null;

	private Harina(double precio){
		super("Harina",precio);
	}

    public static Harina getInstance() {
        // Creación perezosa
        if (Harina.harina == null) {
        	Harina.harina = new Harina(2.50);
        }
        return Harina.harina;
    }
	
}
