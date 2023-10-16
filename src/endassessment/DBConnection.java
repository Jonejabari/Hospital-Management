package endassessment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author office
 */
public class DBConnection
{
       JOptionPane pane = new JOptionPane();
        
       final String  url = "jdbc:mysql://localhost:3306/java_login_register";
       final String user = "root";
       final String pass = "";
       
       //GET CONNECTION TO DATABASE
       Connection con;
       
       //CREATE STATEMENT
       Statement stm;

       //PROCESS RESULT SET
       ResultSet rs;
       
       public DBConnection()
       {
            try
            {
                this.con = DriverManager.getConnection(url,user,pass);

                this.stm = this.con.createStatement();
                this.rs = null;
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"something went wrong \n" +e.getMessage(),"DATABASE CONNECTION", 0);

            }
            
       }
       
       public int ExcecuteUpdate(String SQL)
       {
           int result = 0; 
           try
           {
               result = stm.executeUpdate(SQL);
            }
           catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null,"something went wrong \n" +e.getMessage(),"DATABASE CONNECTION", 0);
           }
           return result;
       }
       
              
       public void ExcecuteQuery(String SQL)
       {
           try
           {
               this.rs = this.stm.executeQuery(SQL);
           }
           catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null,"something went wrong2 \n" +e.getMessage(),"DATABASE CONNECTION", 0);

           }
           
       }
       public void closeConnetion()
       {
           try
           {
                //this.rs.close();
                //this.stm.close();
                this.con.close();
           }
           catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null,"something went wrong \n" +e.getMessage(),"DATABASE CONNECTION", 0);

           }
           
       }

    void Queryresult(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int ExcecuteQuery() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
