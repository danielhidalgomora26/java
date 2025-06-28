package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {
    public static void main(String[] args) {
        try {
            AdminPersonas.eliminar("1004421432");
            System.out.println("Eliminación realizada correctamente.");
        } catch (Exception e) {
            System.out.println("Error en el sistema: " + e.getMessage());
        }
    }
}
