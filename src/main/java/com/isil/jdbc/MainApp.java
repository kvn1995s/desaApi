package com.isil.jdbc;

import java.sql.*;

public class MainApp {

    public static void main(String[] args) throws Exception   {
        String jdbcUrl = "jdbc:mysql://localhost:3306/DESA1";

        //cargar el driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        //crear la conexion

        Connection con = DriverManager.getConnection(jdbcUrl,"kamc123456","kamc123456");

        //crear el statement

        Statement st = con.createStatement();

        //ejecutar sentencia sql

        ResultSet rs = st.executeQuery("select * from Users");

        //procesar resultado

        while(rs.next()){
            System.out.println(rs.getString("idUser") + " " + rs.getString("name") + " " + rs.getString("phone") + " " + rs.getString("city"));

        }

    }
}
