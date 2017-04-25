package com.businessdecision.ocp;

/**
 * Created by Temime.Hammami on 25/04/2017.
 */
//  Query1.java:  Query an mSQL database using JDBC.

import java.sql.*;

/**
 * A JDBC SELECT (JDBC query) example program.
 */
class Query1 {

    public static void main (String[] args) {
        try {
            String url = "jdbc:mysql://10.21.62.49:3306/ocp_maint";
            Connection conn = DriverManager.getConnection(url,"root","SPLXP026");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT idAlert FROM Alert");
            while ( rs.next() ) {
                String lastName = rs.getString("idAlert");
                System.out.println(lastName);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}