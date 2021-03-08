/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_handle;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import obj.Scolar;
import obj.Student;

/**
 *
 * @author User
 */
public class db_scloar {

    Connection con =null;
    Statement  stmt=null;
    ResultSet rs = null;
    
    
    public db_scloar() {
     
         con=db_connect.connection();
        
    }
    
    
    public void add_result(Scolar s) throws SQLException{
        
        int cm=Integer.parseInt(s.getOwn_marks());
        int pm=Integer.parseInt(s.getPass_mark());
        
        
         stmt=(Statement) con.createStatement();
            
    
            String query = "INSERT INTO scolar (Indext_no,Admission_no,Own_mark,Pass_mark,Status,Year) VALUES (?, ?, ?, ?, ?,?)";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
//          con.prepareStatement(query1);

          preparedStmt.setString(1,s.getIndext_no());
          preparedStmt.setString(2,s.getAdminssion_no());
          preparedStmt.setInt(3, cm);
          preparedStmt.setInt(4, pm);
         preparedStmt.setString(5,s.getStatus());
          preparedStmt.setString(6,s.getYear());
          preparedStmt.execute();
  
    }
    
    public Scolar getschoal(String A_id){
        int a=0;
        Scolar c=new Scolar();
        
        try
        {
            stmt = (Statement) con.createStatement();
            
            
            String query = "SELECT * FROM scolar";
            
            rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                if(A_id.equals( rs.getString("Admission_no")))
                {
                    
                    c.setAdminssion_no(A_id);
                    c.setIndext_no(rs.getString("Indext_no"));
                    c.setOwn_marks(String.valueOf(rs.getInt("Own_mark")));
                    c.setPass_mark(String.valueOf(rs.getInt("Pass_mark")));
                    c.setYear(String.valueOf(rs.getInt("Year")));
                    c.setStatus();
                    
                    a=1;
                   
                    break;
                    
                }
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
         if (a==0) {
             
                     c.setAdminssion_no("Not_Available");
                    c.setIndext_no("Not_Available");
                    
                   
             
            
        }
         
  
       return c;
    }
        
        
        
      
     public void update(Scolar s,String id) throws SQLException{
        try{
         int cm=Integer.parseInt(s.getOwn_marks());
        int pm=Integer.parseInt(s.getPass_mark());
        stmt = (Statement) con.createStatement();

                    String query = "UPDATE scolar SET Indext_no= ?,Own_mark= ?,Pass_mark= ?,Status=?,Year= ? WHERE Indext_no= ?";

                    java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);

          preparedStmt.setString(1,s.getIndext_no());
          preparedStmt.setInt(2, cm);
          preparedStmt.setInt(3, pm);
          preparedStmt.setString(4,s.getStatus());
          preparedStmt.setString(5,s.getYear());
          preparedStmt.setString(6,id);
          preparedStmt.executeUpdate(); 
        
        }catch(SQLException e){
            
            System.out.println(e);
        }
        
        
        
        
        
    }
     
       public void Delete(String ID) throws SQLException{
            
             stmt = (Statement) con.createStatement();
            
            String query = "DELETE FROM scolar WHERE Admission_no ='"+ID+"'";
            
            stmt.executeUpdate(query);
   
    }
    
        
    }
    
    
    
    
    
    
    

