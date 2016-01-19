package pd.examen;

public class Leche extends Articulo{

	private static Leche leche = null;

	public Leche(double precio){
		super("Leche",precio);
	}

    public static Leche getInstance() {
        // Creación perezosa
        if (Leche.leche == null) {
        	Leche.leche = new Leche(1.50);
        }
        return Leche.leche;
    }
	
}
