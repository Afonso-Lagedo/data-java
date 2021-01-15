package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.time.Instant;
import java.util.Calendar;

public class Program2 {

	public static void main(String[] args) throws ParseException {//
		
		SimpleDateFormat Var1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//instanciando formato 2
	
		Date y1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//formato utc(greenwich) na iso 8601, com 3 horas de atraso pois a maq está no fuso de brasilia 
	
		System.out.println(Var1.format(y1));
	
		Calendar cal = Calendar.getInstance(); // instanciando um Calendar
		cal.setTime(y1);
		cal.add(Calendar.HOUR_OF_DAY,4);//adicionando 4 horas a data
		y1 = cal.getTime();//atualizando minha data dentro de y1
		System.out.println(Var1.format(y1));//atualizado
		
		System.out.println();
		
		int min = cal.get(Calendar.MINUTE);//pegando os minutos 
		System.out.println(min);
	}
	
}
