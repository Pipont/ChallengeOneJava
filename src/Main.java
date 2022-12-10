import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Cambio cambio = new Cambio();
		
		
		String[] opciones = {
				"Conversor de Monedas"
		};
		String [] auxopciones = {
				"De nacional a extranjera",
				"De extranjera a nacional"
		};
		
		String [] tiposaextranjera = {
			"De soles a dólares",
			"De soles a euros",
			"De soles a libras",
			"De soles a yenes",
			"De soles a won coreano",
		};
		
		String[] tiposanacional = {
				"De dolares a soles",
				"De euros a soles",
				"De libras a soles",
				"De yenes a soles",
				"De won coreano a soles"
		};
		
		String seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una opción de conversión","Menú", 
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		String tipo;
		
		switch(seleccion) {

		case "Conversor de Monedas":{
			boolean cancontinue;
			double valor=0;
			String auxopcion = (String) JOptionPane.showInputDialog(null,"Seleccione una opción", "Tipo de conversiónn", 
				JOptionPane.QUESTION_MESSAGE, null, auxopciones, auxopciones[0]);
			if(auxopcion==auxopciones[0].toString()) {
				cancontinue=false;
				 tipo = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
						JOptionPane.QUESTION_MESSAGE, null, tiposaextranjera, tiposaextranjera[0]);
				do {
				String Svalor = (String) JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
				try {
					valor = Double.parseDouble(Svalor);
					cancontinue=true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Deberías de color solo datos númericos","Error", JOptionPane.ERROR_MESSAGE);
					cancontinue=false;
				}
				}while(!cancontinue);
	
				
				String valorfinal = cambio.Desconversion(tipo, valor);
				
				JOptionPane.showMessageDialog(null, valorfinal);

			} else {
				cancontinue=false;
				tipo = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
						JOptionPane.QUESTION_MESSAGE, null, tiposanacional, tiposanacional[0]);
				do {
				String Svalor = (String) JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
				try {
				 valor = Double.parseDouble(Svalor);
				 cancontinue=true;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Deberías de color solo datos númericos","Error", JOptionPane.ERROR_MESSAGE);
					cancontinue=false;
					}
				}while(!cancontinue);
				
				String valorfinal = cambio.Conversion(tipo, valor);
				
				JOptionPane.showMessageDialog(null, valorfinal);
			}
			
			int reply = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
			if(reply == JOptionPane.YES_OPTION) {
				Main.main(null);
			}
			else {
				JOptionPane.showMessageDialog(null, "Programa terminado",null, JOptionPane.INFORMATION_MESSAGE);
			}
			}

			
		}
		
	}
}
