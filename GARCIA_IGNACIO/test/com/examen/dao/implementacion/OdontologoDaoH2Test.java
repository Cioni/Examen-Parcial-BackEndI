package com.examen.dao.implementacion;

import com.examen.model.Odontologo;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OdontologoDaoH2Test {

    private OdontologoDaoH2 odontologoDaoH2;
    private Object odontologoService;

    @BeforeEach
    public void reset() {
        odontologoDaoH2 = new OdontologoDaoH2();
    }

    @BeforeAll
    public static void init() {
        PropertyConfigurator.configure("log4j.properties");
    }

    @Test
    public void testInsertar() throws Exception {
        Odontologo odontologoOriginal = new Odontologo("Roberto", "Gonzalez", "1708266");
        Odontologo odontologoInsertado = odontologoDaoH2.insertarNuevo(odontologoOriginal);
        assertNotNull(odontologoInsertado.getId());
    }


    @Test
    public void testConsultaIDExiste() throws Exception {
        Odontologo odontologoExistente = new Odontologo("1", "Chinchulin", "Asado", "546315");
        Odontologo odontologoInsertado = odontologoDaoH2.consultarPorId(1);
        assertEquals(odontologoExistente, odontologoInsertado);
    }

    @Test
    public void testConsultaTodos() throws Exception {
        odontologoDaoH2.insertarNuevo(new Odontologo("Albus", "Dumbledore", "1111111"));
        List<Odontologo> odontologos = odontologoDaoH2.consultarTodos();
        assertNotEquals(0, odontologos.size());
    }

    @Test
    public void testConsultaTodos2() throws SQLException {
        List<Odontologo> odontologos = odontologoDaoH2.consultarTodos();
        assertNotEquals(0, odontologos.size());
    }

}
