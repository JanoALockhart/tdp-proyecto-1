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
	private SimpleDateFormat formateador;
	private Date fecha;
	
	/**
	 * Constructor FechaHoraActual
	 */
	public FechaHoraActual() {
		formateador = new SimpleDateFormat("'Esta ventana fue generada el ' dd/MM/yyyy ' a las ' HH:mm:ss");  
		fecha = new Date();
	}
	
	/**
	 * Metodo que devuelve la frase con la fecha y la hora actual.
	 * @return Un String con la frase con la fecha y hora actual.
	 */
	public String getMensajeFecha() {
		return formateador.format(fecha);
	}
}
