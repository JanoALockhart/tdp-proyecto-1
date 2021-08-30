/**
 * 
 */
package entities;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author JanoAxelLockhart
 *
 */
public class FechaHoraActual {
	private SimpleDateFormat formateador;//Establece el formato de presentacion de la fecha
	private Date fecha;//Es la fecha actual
	
	/**
	 * Constructor FechaHoraActual
	 */
	public FechaHoraActual() {
		formateador = new SimpleDateFormat("'Esta ventana fue generada el ' dd/MM/yyyy ' a las ' HH:mm:ss");  
		fecha = new Date();
	}
	
	/**
	 * Metodo que devuelve la frase con la fecha y la hora actual.
	 * @return Un String con la frase con la fecha y hora actual: "Esta ventana
	 * fue generada el dd/MM/yyyy a las HH:mm:ss"
	 */
	public String getMensajeFecha() {
		return formateador.format(fecha);
	}
}
