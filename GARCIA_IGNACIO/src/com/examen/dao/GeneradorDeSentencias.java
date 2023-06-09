package com.examen.dao;

import java.util.List;

public class GeneradorDeSentencias {

    public static String generarInsert(String tabla, List<String> campos) throws Exception {
        if (campos.size() < 1) throw new Exception("No se puede generar un insert sin campos");
        String cantidadCampos = sacarUltimoCaracter("?,".repeat(campos.size()));
        String query = "INSERT INTO " + tabla + " (";
        for (String campo : campos) {
            query += campo + ",";
        }
        return sacarUltimoCaracter(query) + ") VALUES (" + cantidadCampos + ");";
    }

    public static String generarSelectAll(String tabla){
        return "SELECT * FROM " + tabla;
    }

    public static String generarSelectPorId(String tabla){
        return "SELECT * FROM " + tabla + " WHERE id = ?";
    }

    public static String generarSelectPorCampo(String tabla){
        return "SELECT * FROM " + tabla + " WHERE ? = ?";
    }

    public static String generarDeleteAll(String tabla) {
        return "TRUNCATE TABLE " + tabla;
    }

    public static String generarUpdate(String tabla, List<String> campos) throws Exception {
        if (campos.size() < 1) throw new Exception("No se puede generar un update sin campos");
        String query = "UPDATE " + tabla + " SET ";
        for (String campo : campos) {
            query += campo + "=?,";
        }
        return sacarUltimoCaracter(query) + " WHERE id=?;";
    }

    private static String sacarUltimoCaracter(String str) {
        return str.substring(0, str.length() - 1);
    }
}