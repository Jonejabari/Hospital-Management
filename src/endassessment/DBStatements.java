 package endassessment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author office
 */
public class DBStatements 
{
    JOptionPane pane;
    DBConnection con = new DBConnection();
    
    public DBStatements()
    {
        /*Statement ps;
        String query = "INSERT INTO `register`(`Name`, `Id Number`, `Surname`, `Address`, `Phone Number`, `Date`, `Date Of Birth`, `Gender`, `Nationality`, `Educational Qualifications`, `Type of user`, `Password`, `City`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try
        {
            ps = MyConnection.getConnection().preparestatement(query)
        }
        /*pane = new JOptionPane();
        this.con = new DBConnection();*/
        
    }
    public void registerreg(reg regi)
    {
   
        String Sql2= "INSERT INTO `register`(`Name`, `Id Number`, `Surname`, `Address`, `Phone Number`, `Date`, `Date Of Birth`, `Gender`, `Nationality`, `Educational Qualifications`, `Type of user`, `Password`, `City`)"
                + " VALUES ('"+regi.getName()+"','"+regi.getID()+"','"+regi.getSurname()+"','"+regi.getAddress()+"','"+regi.getPhone_Number()+"','"+regi.getDate()+"','"+regi.getDOB()+"','"+regi.getGender()+"','"+regi.getNationality()+"','"+regi.getQualification()+"','"+regi.getType_of_user()+"','"+regi.getPassword()+"','"+regi.getCity()+"')";
              
               
        int result = con.ExcecuteUpdate(Sql2);
        if(result > 0)
        {
             JOptionPane.showMessageDialog(null,"employee was registered","EMPLOYEE REGISTRATION",3);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"employee could not be registered","EMPLOYEE REGISTRATION",1);
        }
    }

    
    public void Departmental_Supervisorrig(regi rig)
    {
        String SQL= "INSERT INTO `departmental_supervisors`(`Name`, `Id Number`, `Surname`, `Address`, `Phone Number`, `Date`, `Date Of Birth`, `Gender`, `Nationality`, `Educational Qualifications`, `Types of user`, `Password`, `City`)"
                + "values ('"+rig.getName()+"','"+rig.getID()+"','"+rig.getSurname()+"','"+rig.getAddress()+"','"+rig.getPhone_Number()+"','"+rig.getDate()+"','"+rig.getDOB()+"','"+rig.getGender()+"','"+rig.getNationality()+"','"+rig.getQualification()+"','"+rig.getType_of_user()+"','"+rig.getPassword()+"','"+rig.getCity()+"')";
              
               
        int result = con.ExcecuteUpdate(SQL);
        if(result > 0)
        {
             JOptionPane.showMessageDialog(null,"employee was registered","EMPLOYEE REGISTRATION",3);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"employee could not be registered","EMPLOYEE REGISTRATION",1);
        }
    }
    public void registerMin(Ministries min)
    {
            
        
        String SQL = "INSERT INTO `minister`(`Ministry_unique_code`, `Minister_Name`, `Contact_No_of_head_office`, `Address_of_head_office`)" 
        + "VALUES ('"+min.getMinistriesCode()+"','"+min.getMinistriesName()+"','"+min.getMinistriesContact()+"','"+min.getMinistriesAddress()+"')";
        
        int result = con.ExcecuteUpdate(SQL);
        if(result > 0)
        {
            JOptionPane.showMessageDialog(null,"employee was registered","EMPLOYEE REGISTRATION",3);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"employee could not be registered","EMPLOYEE REGISTRATION",1);
        }
    }
    //public void registerDep(Department Dep)
    {
        
    }
     
    
    /*
    public void UpdateEmployee(int id,String name)
    {
        String SQL = "update Employee Set name = '"+name+ "' where empid ="+id;
        int result = con.ExcecuteUpdate(SQL);
        if(result > 0)
        {
             JOptionPane.showMessageDialog(null,"employee was updated","EMPLOYEE REGISTRATION",2);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"employee could not be updated","EMPLOYEE REGISTRATION",1);
        }
    }
    public void RetrieveEmps(JTable tbl)
    {
        String SQL = "select * from Employee";
        con.ExcecuteQuery(SQL);
        try
        {
            DefaultTableModel tb =  (DefaultTableModel)tbl.getModel();//new change
            tb.setRowCount(0);//new change this line clears all the table
            while(con.rs.next())
            {
              String id = con.rs.getString(1);
              String name = con.rs.getString(2);
              String datehired = con.rs.getString(3);
              
              String[] ar = {id,name,datehired};             
              
              
              tb.addRow(ar);
              
            }
        }
        catch(SQLException e)
        {
            System.out.println("something went wrong ");
        }
    }
     public void FindEmp(JTable tbl, int ID)
    {
        String SQL = "select * from Employee where empid = " +ID;
        con.ExcecuteQuery(SQL);
        try
        {
            while(con.rs.next())
            {
              String id = con.rs.getString(1);
              String name = con.rs.getString(2);
              String datehired = con.rs.getString(3);
              
              String[] ar = {id,name,datehired};             
              DefaultTableModel tb =  ((DefaultTableModel)tbl.getModel());
              tb.setRowCount(0);//new changethis line clear the table
              tb.addRow(ar);
              
            }
        }
        catch(SQLException e)
        {
            System.out.println("something went wrong ");
        }
    }*/

    }
