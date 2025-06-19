package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	ArrayList<Prestamo> prestamos=new ArrayList<>();
	ArrayList<Cliente> clientes=new ArrayList<>();
	
	public Cliente buscarCliente(String cedula) {
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
	    for (int i = 0; i < clientes.size(); i++) {
	        Cliente cliente = clientes.get(i);
	        if (cliente.getCedula().equals(cedula)) {
	            prestamo.setCedulaCliente(cedula);  
	            CalculadoraAmortizacion.generarTabla(prestamo);
	            prestamos.add(prestamo);
	            return;
	        }
	    }
	    System.out.println("no es cliente del banco");
	}
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
	    ArrayList<Prestamo> resultado = new ArrayList<>();
	    for (int i = 0; i < prestamos.size(); i++) {
	        Prestamo p = prestamos.get(i);
	        if (p.getCedulaCliente() != null && p.getCedulaCliente().equals(cedula)) {
	            resultado.add(p);
	        }
	    }
	    return resultado; 
	}
	
	public void registrarCliente(Cliente cliente) {
		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i);
			if (c.getCedula().equals(cliente.getCedula())) {
				System.out.println("Cliente ya existe :" + cliente.getCedula());
				return;
			}
		}
		clientes.add(cliente);
	}
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
}
