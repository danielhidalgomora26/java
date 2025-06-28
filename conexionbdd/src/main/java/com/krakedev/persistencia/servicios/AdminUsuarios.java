package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminUsuarios {
    private static final Logger LOGGER = LogManager.getLogger(AdminUsuarios.class);

    public static void insertar(Persona persona) throws Exception {
        Connection con = null;
        PreparedStatement ps;
        LOGGER.trace("Usuario a insertar>>> " + persona);
        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement("insert into personass(cedulas, nombre, apellido, numero_hijos, estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento) values (?, ?, ?, ?,?,?,?,?)");
            ps.setString(1, persona.getCedula());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.setInt(4, persona.getNumeroHijos());
            ps.setDouble(5, persona.getEstatura());
            ps.setBigDecimal(6, persona.getCantidadAhorrada());
            ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
            ps.setTime(8, new java.sql.Time(persona.getHoraNacimiento().getTime()));

            ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.error("Error al insertar usuario", e);
            throw new Exception("Error al insertar usuario");
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }
    }

    public static void actualizar(Persona persona) throws Exception {
        Connection con = null;
        PreparedStatement ps;
        LOGGER.trace("Usuario a actualizar>>> " + persona);
        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement("update personass set nombre=?, apellido=?, numero_hijos=?, estatura=?, cantidad_ahorrada=?, fecha_nacimiento=?, hora_nacimiento=? where cedulas=?");

            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setInt(3, persona.getNumeroHijos());
            ps.setDouble(4, persona.getEstatura());
            ps.setBigDecimal(5, persona.getCantidadAhorrada());
            ps.setDate(6, new java.sql.Date(persona.getFechaNacimiento().getTime()));
            ps.setTime(7, new java.sql.Time(persona.getHoraNacimiento().getTime()));
            ps.setString(8, persona.getCedula());

            ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.error("Error al actualizar usuario", e);
            throw new Exception("Error al actualizar usuario");
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }
    }

    public static void eliminar(String cedula) throws Exception {
        Connection con = null;
        PreparedStatement ps;
        LOGGER.trace("Eliminando usuario con cédula>>> " + cedula);
        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement("delete from personass where cedulas=?");
            ps.setString(1, cedula);

            ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.error("Error al eliminar usuario", e);
            throw new Exception("Error al eliminar usuario");
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }
    }
}