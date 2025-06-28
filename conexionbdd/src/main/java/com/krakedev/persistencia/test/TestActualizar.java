package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {
    public static void main(String[] args) {
        Persona p = new Persona("1004421432", "Daniel", "Hidalgo Editado");
        try {
            Date fechaNac = Convertidor.convertirFecha("2007/03/26");
            p.setFechaNacimiento(fechaNac);
            Date horaNac = Convertidor.convertirHora("10:45");
            p.setHoraNacimiento(horaNac);
            p.setCantidadAhorrada(new BigDecimal(1500.00));
            p.setNumeroHijos(1);
            p.setEstatura(1.75);

            AdminPersonas.actualizar(p);
            System.out.println("Actualización realizada correctamente.");
        } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }
}