package pd.examen;

public class Cafe extends Articulo{
	
	private static Cafe cafe = null;

	private Cafe(double precio){
		super("Cafe",precio);
	}

    public static Cafe getInstance() {
        // Creación perezosa
        if (Cafe.cafe == null) {
        	Cafe.cafe = new Cafe(1.20);
        }
        return Cafe.cafe;
    }

}
