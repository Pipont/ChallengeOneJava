
public class Cambio {
	private double dolar = 0.2587;
	private double euros = 0.25;
	private double libras = 0.21;
	private double yen = 35.34;
	private double won= 337.46;
	
	
	public Cambio() {

	}
	

	
	public String Conversion(String tipo, double valor) {

		switch(tipo) {
		case "De dolares a soles":{
			return "Tienes " + valor/ dolar  + "soles"; 
		}
		case "De euros a soles":{
			return "Tienes " + valor / euros + "soles";
		}
		case "De libras a soles":{
			return "Tienes " + valor / libras + "soles";
		}
		case "De yenes a soles":{
			return "Tienes " + valor / yen + "soles";
		}
		case "De won coreano a soles":{
			return "Tienes " + valor / won + "soles";
		}
		default:{
			return "No admitido";
		}
		}
	}
	
	
	public String Desconversion(String tipo, double valor) {
		switch(tipo) {
		case "De soles a dólares":{
			return "Tienes " + valor * dolar + "dolares"; 
		}
		case "De soles a euros":{
			return "Tienes " + valor * euros + "euros";
		}
		case "De soles a libras":{
			return "Tienes " + valor * libras + "libras esterlinans";
		}
		case "De soles a yenes":{
			return "Tienes " + valor * yen + "Yen Japones";
		}
		case "De soles a won coreano":{
			return "Tienes " + valor * won + "Won coreano";
		}
		default:{
			return "No admitido";
		}
		}
	}
	
}
