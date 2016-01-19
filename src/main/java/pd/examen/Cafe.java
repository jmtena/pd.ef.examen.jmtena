package pd.examen;

public class Cafe extends Articulo{
	
	private static Cafe cafe = null;

	public Cafe(double precio){
		super("Cafe",precio);
	}

    public static Cafe getInstance() {
        // Creación perezosa
        if (Cafe.cafe == null) {
        	Cafe.cafe = new Cafe(1.0);
        }
        return Cafe.cafe;
    }

}
