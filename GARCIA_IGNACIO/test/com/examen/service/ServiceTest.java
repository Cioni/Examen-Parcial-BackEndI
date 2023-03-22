package com.examen.service;

import com.examen.model.Odontologo;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ServiceTest {

    private Service service;

    @BeforeEach
    public void reset() throws Exception {
        service = new Service();
    }

    @BeforeAll
    public static void init() {
        PropertyConfigurator.configure("log4j.properties");
    }

    @Test
    public void testDarDeAlta() {
        Odontologo odontologo = new Odontologo("Mac", "Miller", "222222");
        String respuestaEsperada = "El odontologo " + odontologo + " fue dado de alta con éxito";

        String respuestaObtenida = service.darDeAltaOdontologo("Mac", "Miller", "222222");

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void testConNullNoSeDaAlta() {
        String respuestaEsperada = "No se pudo dar de alta el odontologo";

        String respuestaObtenida = service.darDeAltaOdontologo(null, "Alfa", "9999");

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void testConsultarPorIDExistente() {
        Odontologo odontologoExistente = new Odontologo("1", "Milo", "Garcia", "385");
        String respuestaEsperada = "El odontologo con ID: 1 es " + odontologoExistente;

        String respuestaObtenida = service.buscarOdontologoPorId(1);

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void test04ConsultarPorIDInexistente() {
        String respuestaEsperada = "Odontologo con ID: 21 no encontrado";

        String respuestaObtenida = service.buscarOdontologoPorId(1234);

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void test05NoSePuedeConsultarConsultarPorIDNull() {
        String respuestaEsperada = "Odontologo con ID: null no encontrado";

        String respuestaObtenida = service.buscarOdontologoPorId(null);

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void testActualizarDatosExistente() {
        Odontologo odontologoActualizado = new Odontologo("2", "Bruno", "Mars", "23");
        String respuestaEsperada = "Los nuevos datos son:\n" + odontologoActualizado;

        String respuestaObtenida = service.actualizarOdontologo(2, "Bruno", "Mars", "23");

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void testNoSePuedeActualizarDatos() {
        String respuestaEsperada = "Odontologo con ID: 1111 no encontrado";

        String respuestaObtenida = service.buscarOdontologoPorId(1111);

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

    @Test
    public void testConsultarTodos() {
        String respuestaNoEsperada = "No hay odontologos";

        String respuestaObtenida = service.consultarTodos();

        assertNotEquals(respuestaNoEsperada, respuestaObtenida);
    }
}
