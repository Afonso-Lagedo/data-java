package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.time.Instant;


public class Program {

	public static void main(String[] args) throws ParseException {//
		
		SimpleDateFormat Var1 = new SimpleDateFormat("dd/MM/yyyy");//instaciando formato 1
		SimpleDateFormat Var2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//instanciando formato 2
	
		SimpleDateFormat Var3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//resolvendo o problema do fuso
		Var3.setTimeZone(TimeZone.getTimeZone("GMT"));//resolvendo o problema do fuso
		
		Date y1 = Var1.parse("09/01/2021");//atribuindo datas 
		Date y2 = Var2.parse("09/01/2021 02:02:30");
	
		System.out.println(y1);//formato padrão do java
		System.out.println(Var1.format(y2));//formato Var1 criado 
		System.out.println(Var2.format(y2));//formato Var2 criado
		
		System.out.println();//pulando linha 
		
		Date y3 = new Date();//data atual
		System.out.println(y3);//padrão java
		System.out.println(Var2.format(y3));//padrão Var2 criado
	
		System.out.println();//pulando linha 
		
		Date y4 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//formato utc(greenwich) na iso 8601, com 3 horas de atraso pois a maq está no fuso de brasilia 
		System.out.println(y4);//padrão java
		
		System.out.println(Var3.format(y4));//imprimindo com horario BR
	}
	
}
