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
import obj.Student;

/**
 *
 * @author User
 */
public class db_handler_student extends db_connect{
    
    Connection con =null;
    Statement  stmt=null;
    ResultSet rs = null;

    public db_handler_student() {
        
           con=db_connect.connection();
            
        
    }
    
    public void add_student(Student s) throws SQLException{
        
        System.out.println(s.getAdmission_no()+"  "+s.getAddress()+"  "+s.getDob());
        stmt=(Statement) con.createStatement();
            
    
            String query = "INSERT INTO student (Admission_no,Identity_no,Name,Full_name,Gender,Dob,Date_of_admission,Race,Religion,Guardian_name,Address,Leaving_date,Last_grade,Leaving_c_no,Leaving_c_date,status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
//          con.prepareStatement(query1);

          preparedStmt.setString(1,s.getAdmission_no());
          preparedStmt.setString(2,s.getIdentity_no());
          preparedStmt.setString(3,s.getName());
          preparedStmt.setString(4,s.getFull_name());
          preparedStmt.setString(5,s.getGender());
          preparedStmt.setString(6,s.getDob());
          preparedStmt.setString(7,s.getDate_of_admission());
          preparedStmt.setString(8,s.getRace());
          preparedStmt.setString(9,s.getReligion());
          preparedStmt.setString(10,s.getGuardian_name());
          preparedStmt.setString(11,s.getAddress());
          preparedStmt.setString(12,s.getLeaving_date());
          preparedStmt.setString(13,s.getLast_grade());
          preparedStmt.setString(14,s.getLeaving_c_no());
          preparedStmt.setString(15,s.getLeaving_c_date());
          preparedStmt.setString(16,s.getStatus());
          
     
            
            preparedStmt.execute();
        
        
            
        
    }
    
    public Student get_Student(String A_id){
        int a=0;
        Student s=new Student();
        try
        {
            stmt = (Statement) con.createStatement();
            
            
            String query = "SELECT * FROM student";
            
            rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                if(A_id.equals( rs.getString("Admission_no")))
                {
                    
                    s.setAdmission_no(A_id);
                    s.setIdentity_no(rs.getString("Identity_no"));
                    s.setName(rs.getString("Name"));
                    s.setFull_name(rs.getString("Full_name"));
                    s.setGender(rs.getString("Gender"));
                    s.setDob(rs.getString("Dob"));
                    s.setDate_of_admission(rs.getString("Date_of_admission"));
                    s.setRace(rs.getString("Race"));
                    s.setReligion(rs.getString("Religion"));
                    s.setGuardian_name(rs.getString("Guardian_name"));
                    s.setAddress(rs.getString("Address"));
                    s.setLeaving_date(rs.getString("Leaving_date"));
                    s.setLast_grade(rs.getString("Last_grade"));
                    s.setLeaving_c_no(rs.getString("Leaving_c_no"));
                    s.setLeaving_c_date(rs.getString("Leaving_c_date"));
                     s.setStatus(rs.getString("status"));
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
             
                    s.setAdmission_no("Not_Available");
                    s.setIdentity_no("Not Available");
                    s.setName("Not Available");
                    s.setFull_name("Not Available");
                    s.setGender("Not Available");
                    s.setDob("Not Available");
                    s.setDate_of_admission("Not Available");
                    s.setRace("Not Available");
                    s.setReligion("Not Available");
                    s.setGuardian_name("Not Available");
                    s.setAddress("Not Available");
                    s.setLeaving_date("Not Available");
                    s.setLast_grade("Not Available");
                    s.setLeaving_c_no("Not Available");
                    s.setLeaving_c_date("Not Available");
                    s.setStatus("Not Available");
                   
             
            
        }
         
  
       return s;
    }
            
    
    public void update(Student s,String id) throws SQLException{
        
        
        stmt = (Statement) con.createStatement();

                    String query = "UPDATE student SET Admission_no= ?,Identity_no= ?,Name= ?,Full_name= ?,Gender= ?,Dob= ?,Date_of_admission= ?,Race= ?,Religion= ?,Guardian_name= ?,Address= ?,Leaving_date= ?,Last_grade= ?,Leaving_c_no= ?,Leaving_c_date= ? WHERE Admission_no = ?";

                    java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);

          preparedStmt.setString(1,s.getAdmission_no());
          preparedStmt.setString(2,s.getIdentity_no());
          preparedStmt.setString(3,s.getName());
          preparedStmt.setString(4,s.getFull_name());
          preparedStmt.setString(5,s.getGender());
          preparedStmt.setString(6,s.getDob());
          preparedStmt.setString(7,s.getDate_of_admission());
          preparedStmt.setString(8,s.getRace());
          preparedStmt.setString(9,s.getReligion());
          preparedStmt.setString(10,s.getGuardian_name());
          preparedStmt.setString(11,s.getAddress());
          preparedStmt.setString(12,s.getLeaving_date());
          preparedStmt.setString(13,s.getLast_grade());
          preparedStmt.setString(14,s.getLeaving_c_no());
          preparedStmt.setString(15,s.getLeaving_c_date());
          preparedStmt.setString(16,id);
           preparedStmt.executeUpdate(); 
        
        
        
        
        
        
        
    }
    
    public void Delete(String ID) throws SQLException{
            
             stmt = (Statement) con.createStatement();
            
            String query = "DELETE FROM student WHERE Admission_no ='"+ID+"'";
            
            stmt.executeUpdate(query);
   
    }
    
    public void Expel(String id) throws SQLException{
        
         final String Status="OUT";
        stmt = (Statement) con.createStatement();

                    String query = "UPDATE student SET status= ? WHERE Admission_no = ?";

                    java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);

          preparedStmt.setString(1,Status);
          preparedStmt.setString(2,id);
          preparedStmt.executeUpdate(); 
        
        
        
        
    }
    
    
    
    
}
