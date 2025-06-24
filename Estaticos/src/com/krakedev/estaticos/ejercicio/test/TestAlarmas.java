package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma lunes=new Alarma(DiasSemana.LUNES,18,5);
		Alarma martes=new Alarma(DiasSemana.MARTES,3,32);
		Alarma miercoles=new Alarma(DiasSemana.MIERCOLES,8,45);
		Alarma jueves=new Alarma(DiasSemana.JUEVES,8,45);
		Alarma viernes=new Alarma(DiasSemana.VIERNES,8,45);
		Alarma sabado=new Alarma(DiasSemana.SABADO,8,45);
		Alarma domingo=new Alarma(DiasSemana.DOMINGO,8,45);
		AdminAlarmas admin=new AdminAlarmas();
		
		
		admin.agregarAlarma(lunes);
		admin.agregarAlarma(martes);
		admin.agregarAlarma(miercoles);
		admin.agregarAlarma(jueves);
		admin.agregarAlarma(viernes);
		admin.agregarAlarma(sabado);
		admin.agregarAlarma(domingo);
		
		ArrayList<Alarma> alarmasActuales=admin.getAlarmas();
		System.out.println(alarmasActuales);
	}

}
