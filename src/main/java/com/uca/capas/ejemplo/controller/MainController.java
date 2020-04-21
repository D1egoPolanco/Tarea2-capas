package com.uca.capas.ejemplo.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MainController {
	
	

	@RequestMapping("/alumno")
	public @ResponseBody String ejemplos() {
		String texto = "Diego Ernesto Polanco Ortiz 00301417, 4to año";
		return texto;
		
		
	}
	
	@RequestMapping ("/fecha")
	
	public @ResponseBody String ejemplo() {
		int mes = 0;
		int dias = 5 ;
		int año = 0;
	         String dia="";
	         String texto1 = "Hoy es: ";
	         int numD;
	         Calendar c = Calendar.getInstance(Locale.US);
	         c.set(año,mes,dias);
	         numD=c.get(Calendar.DAY_OF_WEEK);
	        if(numD == Calendar.SUNDAY)
	            dia="DOMINGO";
	        else if(numD == Calendar.MONDAY)
	            dia="LUNES";
	        else if(numD == Calendar.TUESDAY)
	            dia="MARTES";
	        else if(numD == Calendar.WEDNESDAY)
	            dia="MIERCOLES";
	        else if(numD == Calendar.THURSDAY)
	            dia="JUEVES";
	        else if(numD == Calendar.FRIDAY)
	            dia="VIERNES";
	        else if(numD == Calendar.SATURDAY)
	            dia="SABADO";
	         return texto1+dia;
	    }
	}
	

