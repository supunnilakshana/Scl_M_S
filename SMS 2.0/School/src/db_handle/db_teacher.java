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
import obj.Teacher;

/**
 *
 * @author User
 */
public class db_teacher {

    Connection con =null;
    Statement  stmt=null;
    ResultSet rs = null;
    
    public db_teacher() {
        
        
         con=db_connect.connection();
 
    }
    
    
    public void add(Teacher t) throws SQLException{
        
          String query = "INSERT INTO teacher (serial_no,computer_no,name,full_name,dob,nic_no,personal_addr,tel_no,reg_no,educational_qualification,prof_qualification,first_apponit_date,first_school_ap,grade_class,conf_apoint_date,difficult_period,appoint_zone_date,appoint_school_date,w_o_penssion_no,status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?)";
          PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
// con.prepareStatement(query1);
          preparedStmt.setString(1,t.getSerial_no());
          preparedStmt.setString(2,t.getComputer_no());
          preparedStmt.setString(3,t.getName());
          preparedStmt.setString(4,t.getFull_name());
          preparedStmt.setString(5,t.getDob());
          preparedStmt.setString(6,t.getNic_no());
          preparedStmt.setString(7,t.getPersonal_addr());
          preparedStmt.setString(8,t.getTel_no());
          preparedStmt.setString(9,t.getReg_no());
          preparedStmt.setString(10,t.getEducational_qualification());
          preparedStmt.setString(11,t.getProf_qualification());
          preparedStmt.setString(12,t.getFirst_apponit_date());
          preparedStmt.setString(13,t.getFirst_school_ap());
          preparedStmt.setString(14,t.getGrade_class());
          preparedStmt.setString(15,t.getConf_apoint_date());
          preparedStmt.setString(16,t.getDifficult_period());
          preparedStmt.setString(17,t.getAppoint_zone_date());
          preparedStmt.setString(18,t.getAppoint_school_date());
          preparedStmt.setString(19,t.getW_o_penssion_no());
          preparedStmt.setString(20,t.getStatus());
          
     
            
            preparedStmt.execute();
        
        
            
        
    }
    
    
    public Teacher get_teacher(String id){
        int a=0;
        Teacher t=new Teacher();
        
        try
        {
            stmt = (Statement) con.createStatement();
            
            
            String query = "SELECT * FROM teacher";
            
            rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                
                if(id.equals( rs.getString("serial_no")))
                {
                    
                    t.setSerial_no(rs.getString("serial_no"));
                    t.setComputer_no(rs.getString("computer_no"));
                    t.setName(rs.getString("name"));
                    t.setFull_name(rs.getString("full_name"));
                    t.setDob(rs.getString("dob"));
                    t.setNic_no(rs.getString("nic_no"));
                    t.setPersonal_addr(rs.getString("personal_addr"));
                    t.setTel_no(rs.getString("tel_no"));
                    t.setReg_no(rs.getString("reg_no"));
                    t.setEducational_qualification(rs.getString("educational_qualification"));
                    t.setProf_qualification(rs.getString("educational_qualification"));
                    t.setFirst_apponit_date(rs.getString("first_apponit_date"));
                    t.setFirst_school_ap(rs.getString("first_school_ap"));
                    t.setGrade_class(rs.getString("grade_class"));
                    t.setConf_apoint_date(rs.getString("conf_apoint_date"));
                    t.setDifficult_period(rs.getString("difficult_period"));
                    t.setAppoint_zone_date(rs.getString("appoint_zone_date"));
                    t.setAppoint_school_date(rs.getString("appoint_school_date"));
                    t.setW_o_penssion_no(rs.getString("w_o_penssion_no"));
                    t.setStatus(rs.getString("status"));
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
             String q="Not_Available";
                    t.setSerial_no(q);
                    t.setComputer_no(q);
                    t.setName(q);
                    t.setFull_name(q);
                    t.setDob(q);
                    t.setNic_no(q);
                    t.setPersonal_addr(q);
                    t.setTel_no(q);
                    t.setReg_no(q);
                    t.setEducational_qualification(q);
                    t.setProf_qualification(q);
                    t.setFirst_apponit_date(q);
                    t.setFirst_school_ap(q);
                    t.setGrade_class(q);
                    t.setConf_apoint_date(q);
                    t.setDifficult_period(q);
                    t.setAppoint_zone_date(q);
                    t.setAppoint_school_date(q);
                    t.setW_o_penssion_no(q);
                    t.setStatus(q);
             
            
        }
         
        
        
        
        return t;
        
   
    }
    
    
    public void update(Teacher t,String id) throws SQLException{
        
        
        
         String query = "UPDATE  teacher SET serial_no = ?,computer_no = ?,name = ?,full_name = ?,dob = ?,nic_no = ?,personal_addr = ?,tel_no = ?,reg_no = ?,educational_qualification = ?,prof_qualification = ?,first_apponit_date = ?,first_school_ap = ?,grade_class = ?,conf_apoint_date = ?,difficult_period = ?,appoint_zone_date = ?,appoint_school_date = ?,w_o_penssion_no = ? WHERE serial_no = ?";
          PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
// con.prepareStatement(query1);
          preparedStmt.setString(1,t.getSerial_no());
          preparedStmt.setString(2,t.getComputer_no());
          preparedStmt.setString(3,t.getName());
          preparedStmt.setString(4,t.getFull_name());
          preparedStmt.setString(5,t.getDob());
          preparedStmt.setString(6,t.getNic_no());
          preparedStmt.setString(7,t.getPersonal_addr());
          preparedStmt.setString(8,t.getTel_no());
          preparedStmt.setString(9,t.getReg_no());
          preparedStmt.setString(10,t.getEducational_qualification());
          preparedStmt.setString(11,t.getProf_qualification());
          preparedStmt.setString(12,t.getFirst_apponit_date());
          preparedStmt.setString(13,t.getFirst_school_ap());
          preparedStmt.setString(14,t.getGrade_class());
          preparedStmt.setString(15,t.getConf_apoint_date());
          preparedStmt.setString(16,t.getDifficult_period());
          preparedStmt.setString(17,t.getAppoint_zone_date());
          preparedStmt.setString(18,t.getAppoint_school_date());
          preparedStmt.setString(19,t.getW_o_penssion_no());
          preparedStmt.setString(20,id);
          
     
            
            preparedStmt.execute();
        
        
        
    }
        
        
      public void Delete(String ID) throws SQLException{
            
             stmt = (Statement) con.createStatement();
            
            String query = "DELETE FROM teacher WHERE serial_no ='"+ID+"'";
            
            stmt.executeUpdate(query);
   
    }
      
      
         public void Expel(String id) throws SQLException{
        
         final String Status="OUT";
        stmt = (Statement) con.createStatement();

                    String query = "UPDATE teacher SET status= ? WHERE serial_no = ?";

                    java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);

          preparedStmt.setString(1,Status);
          preparedStmt.setString(2,id);
          preparedStmt.executeUpdate(); 
        
        
        
        
    }
         
         
         
    }
    
    
    
    
    

