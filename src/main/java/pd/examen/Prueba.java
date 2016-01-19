package pd.examen;

public class Prueba {
	
	Cesta cesta;
	Cesta cesta2;
	Cesta cesta3;
	
	public void run(){
		IO io = new IO();
		
		cesta = new Lista("Compra desayuno");
		cesta.add(Leche.getInstance());
		cesta.add(Leche.getInstance());
		cesta.add(Cafe.getInstance());
		io.writeln(cesta.getName() + " cantidad: " + cesta.cantidad() + " precio: " + cesta.valor());
		
		cesta2 = new Lista("Compra cena");
		cesta2.add(Aceite.getInstance());
		cesta2.add(Harina.getInstance());
		cesta2.add(Azucar.getInstance());
		cesta2.add(Leche.getInstance());
		io.writeln(cesta2.getName() + " cantidad: " + cesta2.cantidad() + " precio: " + cesta2.valor());
		
		cesta3 = new Lista("Compra total");
		cesta3.add(cesta);
		cesta3.add(cesta2);
		io.writeln(cesta3.getName() + " cantidad: " + cesta3.cantidad() + " precio: " + cesta3.valor());
	}
	
	public static void main(String[] args){
		new Prueba().run();
	}
	
}
