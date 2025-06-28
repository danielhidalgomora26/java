package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		PreparedStatement psProducto=null;
		PreparedStatement psRegistroEntrada=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"DaniLocoMama26");
			System.out.println("conexion exitosa");

			ps = connection.prepareStatement("insert into persona(cedula_persona, nombre, apellido, numero_hijos, estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento) values (?, ?, ?, ?,?,?,?,?)");
			ps.setString(1, "1004414544");
			ps.setString(2, "Daniel");
			ps.setString(3, "Hidalgo");
			ps.setInt(4, 2);
			ps.setDouble(5, 1.56);		
			ps.setBigDecimal(6, new BigDecimal(1200.45));
	
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:s");
			String fechaStr = "2022/03/22 10:05:04";
			
			String fechaStrR = "2025/06/27 16:10:24";
			
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(7, fechaSQL);
				ps.setTime(8, timeSQL);
				
				ps.executeUpdate();
				System.out.println("ejecuta insert");
				
				System.out.println("------------------------------");
			
				psProducto = connection.prepareStatement("insert into producto(codigo,nombre,precio,stock) values(?,?,?,?)");
				psProducto.setInt(1,12345);
				psProducto.setString(2, "Manzana");
				psProducto.setBigDecimal(3, new BigDecimal(2.45));
				psProducto.setInt(4, 10);
				System.out.println("Producto insertado: 12345 - Manzana - 2.45 - 10");
				psProducto.executeUpdate();
				System.out.println("ejecuta insert");
				
				System.out.println("------------------------------");
				psRegistroEntrada = connection.prepareStatement("insert into registro_entrada(codigo_registro,cedula_empleado,fecha,hora) values(?,?,?,?)");
				psRegistroEntrada.setInt(1, 54321);
				psProducto.setString(2, "1004421432");
				Date fechaR = sdf.parse(fechaStrR);
				System.out.println(fechaR);
				long fechaMilisR = fechaR.getTime();
				System.out.println(fechaMilisR);
				java.sql.Date fechaSQLR = new java.sql.Date(fechaMilisR);
				System.out.println(fechaSQLR);

				Time timeSQLR = new Time(fechaMilisR);
				System.out.println(timeSQLR);
				psRegistroEntrada.setDate(3,fechaSQLR);
				psRegistroEntrada.setTime(4,timeSQLR);
				psRegistroEntrada.executeUpdate();
				System.out.println("ejecuta insert");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
