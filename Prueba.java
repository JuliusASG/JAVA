
public class Prueba {

	public static void main(String[] args) {
		
	final String NombreDeEmpresa = "Productos Tupperware";
			
			double costoUnitario = 25;
			int cantidadProducto = 250;
			double totalDePago = costoUnitario*cantidadProducto;
			final double precioDeVenta = 40;
			final double IVA = 0.12;
			double totalIVAporUnidad = precioDeVenta*IVA;
			
			
			
			System.out.println("*********************************************************");
			System.out.println("");
			System.out.println(" Costo por unidad: Q"+ costoUnitario +"\n");
			System.out.println(" Cantidad de producto:   " + cantidadProducto + "\n");
			System.out.println(" El total es de: Q" + totalDePago + "\n"); 
			System.out.println("");
			System.out.println(" Venderse a: Q" + precioDeVenta + "\n");
			System.out.println(" Impuesto establecido: " + IVA + "\n");
			System.out.println(" Impuesto por unidad: Q" + totalIVAporUnidad);
			System.out.println("*********************************************************");
			
			
			int cantidadProductosVendidos = 35;
			
			double totalCobroSinDescuento = cantidadProductosVendidos * precioDeVenta;
			
			double tiposDeDescuento = 0;
			
			double totalConDescuento = 0;
			if(cantidadProductosVendidos>=50) {
				tiposDeDescuento = 0.05;
				totalConDescuento = totalCobroSinDescuento - (totalCobroSinDescuento);
	
			}
	
			if(cantidadProductosVendidos>=100) {
				tiposDeDescuento = 0.15;
				totalConDescuento = totalCobroSinDescuento - (totalCobroSinDescuento*tiposDeDescuento);
				
			}
			
			if(cantidadProductosVendidos>=1000) {
				tiposDeDescuento = 0.25;
				totalConDescuento = totalCobroSinDescuento - (totalCobroSinDescuento*tiposDeDescuento);
			}
			
			double impuestoTotalADeclarar = totalConDescuento*IVA;
			double descuentoObtenido = 0;
			
			if(cantidadProductosVendidos>=50) {	
				descuentoObtenido = 0.15;
			    
			}
			
			if(cantidadProductosVendidos>= 100) {
				descuentoObtenido = 0.15;

			}
			
			if(cantidadProductosVendidos>= 1000) {
				descuentoObtenido = 0.25;
			}
			
			
			
			double ganancias = (totalCobroSinDescuento - (cantidadProducto*costoUnitario)) - impuestoTotalADeclarar;
					
					
					
		    System.out.println("");
		    System.out.println(" Informacion que el usuario desea ver\n es la siguiente:");
		    System.out.println("**************************************************");
		    System.out.println("");
		    System.out.println(" Cantidad Vendida:" +cantidadProducto);
		    System.out.println(" Total sin descuento: " +totalCobroSinDescuento);
		    System.out.println(" Total con el descuento: "+totalConDescuento);
		    System.out.println(" IVA a declarar: Q" +impuestoTotalADeclarar);
		    System.out.println(" Tipo de Descuento " +descuentoObtenido);
		    System.out.println(" Ganancias: Q" +ganancias);
	
			}
	
	
	
}
