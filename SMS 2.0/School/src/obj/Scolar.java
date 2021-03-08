/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import db_handle.db_handler_student;

/**
 *
 * @author User
 */
public class Scolar {
    
    private String Indext_no;
    private String Adminssion_no;
    private String Own_marks;
    private String Pass_mark;
    private Student s;
    private String status; 
    private String Year; 

   

    public Scolar(String Indext_no, String Adminssion_no, String Own_marks, String Pass_mark,String Year) {
        this.Indext_no = Indext_no;
        this.Adminssion_no = Adminssion_no;
        this.Own_marks = Own_marks;
        this.Pass_mark = Pass_mark;
        this.Year=Year;
        
        db_handler_student db=new db_handler_student();
        
        s=db.get_Student(Adminssion_no);
        
    }

    public Scolar() {
        
        
        
    }
    
    public void setStudent(){
         db_handler_student db=new db_handler_student();
        
         s=db.get_Student(Adminssion_no);
        
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public Scolar(String Adminssion_no) {
        this.Adminssion_no = Adminssion_no;
         db_handler_student db=new db_handler_student();
        
        s=db.get_Student(Adminssion_no);
    }
    
    
    public int isRight(){
        String id=s.getAdmission_no();
        System.out.println(id);
        if(id.equals("Not_Available")) {
            
            
            return 0;
            
        }else{
            
          return 1;
                 
        }       
        
    }
    
    
    public void setStatus(){
        int cm=Integer.parseInt(Own_marks);
        int pm=Integer.parseInt(Pass_mark);
        String st;
        if(cm>=pm){
            
            st="A";
        }else if (cm>=100) {
            st="B";
        }else if (cm>=70) {
            st="C";
        }else{
            st="F";
        }
             
        status=st;
   
    }

    public String getIndext_no() {
        return Indext_no;
    }

    public void setIndext_no(String Indext_no) {
        this.Indext_no = Indext_no;
    }

    public String getAdminssion_no() {
        return Adminssion_no;
    }

    public void setAdminssion_no(String Adminssion_no) {
        this.Adminssion_no = Adminssion_no;
    }

    public String getOwn_marks() {
        return Own_marks;
    }

    public void setOwn_marks(String Own_marks) {
        this.Own_marks = Own_marks;
    }

    public String getPass_mark() {
        return Pass_mark;
    }

    public void setPass_mark(String Pass_mark) {
        this.Pass_mark = Pass_mark;
    }

    public Student getS() {
        return s;
    }

    public String getStatus() {
        return status;
    }
    
    
    
    
   
    
    
    
}
