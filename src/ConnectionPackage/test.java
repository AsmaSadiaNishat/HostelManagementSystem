package ConnectionPackage;

import java.sql.*;
import java.util.Scanner;

public class test {

    public static void main (String args  []){

        Scanner in = new Scanner (System.in);

        Connection c = Jdbc_connection.connectionMethod();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql, student;
        int seat;

        System.out.println ("Enter Name");
        student = in.nextLine();
        System.out.println ("Enter Seat");
        seat = in.nextInt();

        try {

            //sql = "select count(seat_no) as total from room";

            sql = "UPDATE ROOM SET STATUS='Filled', STUDENT_NAME= '" +student+"'"
                    +"SEAT_NO=" +seat;
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();

           // while (rs.next()){

                System.out.print ("Congratulations to " +student);
            //}



        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
