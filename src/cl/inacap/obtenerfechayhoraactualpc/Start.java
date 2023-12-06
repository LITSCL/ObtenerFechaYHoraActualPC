package cl.inacap.obtenerfechayhoraactualpc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Start {

	public static void main(String[] args) {
		//Obtener fecha con la clase "Calendar":
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
		String year = Integer.toString(c.get(Calendar.YEAR));
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(year);
		
		//Obtener fecha Y/O hora con la clase "DateTimeFormatter":
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("yyyy/MM/dd HH:mm:ss-> " + dtf1.format(LocalDateTime.now()));
        
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("yyyy/MM/dd-> " + dtf2.format(LocalDateTime.now()));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("HH:mm:ss-> " + dtf3.format(LocalDateTime.now()));
	}
	
}
