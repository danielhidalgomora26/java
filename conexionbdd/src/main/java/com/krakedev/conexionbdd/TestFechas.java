package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		// Date- java.util.Date
		// Date- java.sql.Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:s");
		String fechaStr = "2022/03/22 10:05:04";
		
		try {
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechaMilis = fecha.getTime();
			System.out.println(fechaMilis);
			// crea un Java.sqlDate, partindo de un java.util.Date
			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
			System.out.println(fechaSQL);

			Time timeSQL = new Time(fechaMilis);
			System.out.println(timeSQL);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
