package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<>();
	private Date fechaModificacion;
	private Date ultimaModificacion = new Date();
	private ArrayList<Contacto> correctos=new ArrayList<>();
	private ArrayList<Contacto> incorrectos=new ArrayList<>();
	
	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) != null) {

			return false;
		} else {
			contactos.add(contacto);
			ultimaModificacion = new Date();
			return true;
		}
	}

	public String consultarUltimaModificacion() {
		if (ultimaModificacion == null) {
			return "Aun no se ha hecho una modificacion";
		}
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fechaFormateada = formato.format(ultimaModificacion);
		return fechaFormateada;
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (cedula.equals(elementoContacto.getCedula())) {
				return elementoContacto;
			}
		}
		return null;
	}

	public int contarPerdidos() {
		int contactosSinRumbo = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				contactosSinRumbo++;
			}
		}
		return contactosSinRumbo;
	}

	public int contarFijos() {
		int fijo = 0;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto elementoContacto = contactos.get(i);
			ArrayList<Telefono> telefonos = elementoContacto.getTelefonos();
			for (int i1 = 0; i1 < telefonos.size(); i1++) {
				Telefono elementoTelefono = telefonos.get(i1);
				if (elementoTelefono.getTipo().equals("Convencional") && "C".equals(elementoTelefono.getEstado())) {
					fijo++;
				}
			}
		}
		return fijo;
	}

	public void depurar() {
		for(int i=0;i<contactos.size();i++) {
			Contacto elementoContacto=contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				incorrectos.add(elementoContacto);
			}else if(elementoContacto.getDireccion() != null){
				correctos.add(elementoContacto);
			}
		}
		contactos.clear();
		
	}

	public Directorio() {
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	

}
