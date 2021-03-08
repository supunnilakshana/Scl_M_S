/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

/**
 *
 * @author User
 */
public class Student {
    
    private String admission_no;
    private String identity_no;
    private String name;
    private String full_name;
    private String gender;
    private String dob;
    private String date_of_admission;
    private String race;
    private String religion;
    private String guardian_name;
    private String address;
    private String leaving_date;
    private String last_grade;
    private String leaving_c_no;
    private String leaving_c_date;

    public Student(String admission_no, String identity_no, String name, String full_name, String gender, String dob, String date_of_admission, String race, String religion, String guardian_name, String address, String leaving_date, String last_grade, String leaving_c_no, String leaving_c_date) {
        this.admission_no = admission_no;
        this.identity_no = identity_no;
        this.name = name;
        this.full_name = full_name;
        this.gender = gender;
        this.dob = dob;
        this.date_of_admission = date_of_admission;
        this.race = race;
        this.religion = religion;
        this.guardian_name = guardian_name;
        this.address = address;
        this.leaving_date = leaving_date;
        this.last_grade = last_grade;
        this.leaving_c_no = leaving_c_no;
        this.leaving_c_date = leaving_c_date;
    }
     private String status;
    
    public Student(){
        
    }

    public Student(String admission_no, String identity_no, String name, String full_name, String gender, String dob, String date_of_admission, String race, String religion, String guardian_name, String address, String leaving_date, String last_grade, String leaving_c_no, String leaving_c_date, String status) {
        this.admission_no = admission_no;
        this.identity_no = identity_no;
        this.name = name;
        this.full_name = full_name;
        this.gender = gender;
        this.dob = dob;
        this.date_of_admission = date_of_admission;
        this.race = race;
        this.religion = religion;
        this.guardian_name = guardian_name;
        this.address = address;
        this.leaving_date = leaving_date;
        this.last_grade = last_grade;
        this.leaving_c_no = leaving_c_no;
        this.leaving_c_date = leaving_c_date;
        this.status = status;
    }

    

  /*  public Student(String identity_no, String name, String full_name, String gender, String dob, String date_of_admission, String race, String religion, String guardian_name, String address, String leaving_date, String last_grade, String leaving_c_no, String leaving_c_date,String status) {
        this.identity_no = identity_no;
        this.name = name;
        this.full_name = full_name;
        this.gender = gender;
        this.dob = dob;
        this.date_of_admission = date_of_admission;
        this.race = race;
        this.religion = religion;
        this.guardian_name = guardian_name;
        this.address = address;
        this.leaving_date = leaving_date;
        this.last_grade = last_grade;
        this.leaving_c_no = leaving_c_no;
        this.leaving_c_date = leaving_c_date;
        this.status=status;
    }*/

    public String getAdmission_no() {
        return admission_no;
    }

    public void setAdmission_no(String admission_no) {
        this.admission_no = admission_no;
    }

    public String getIdentity_no() {
        return identity_no;
    }

    public void setIdentity_no(String identity_no) {
        this.identity_no = identity_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDate_of_admission() {
        return date_of_admission;
    }

    public void setDate_of_admission(String date_of_admission) {
        this.date_of_admission = date_of_admission;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getGuardian_name() {
        return guardian_name;
    }

    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLeaving_date() {
        return leaving_date;
    }

    public void setLeaving_date(String leaving_date) {
        this.leaving_date = leaving_date;
    }

    public String getLast_grade() {
        return last_grade;
    }

    public void setLast_grade(String last_grade) {
        this.last_grade = last_grade;
    }

    public String getLeaving_c_no() {
        return leaving_c_no;
    }

    public void setLeaving_c_no(String leaving_c_no) {
        this.leaving_c_no = leaving_c_no;
    }

    public String getLeaving_c_date() {
        return leaving_c_date;
    }

    public void setLeaving_c_date(String leaving_c_date) {
        this.leaving_c_date = leaving_c_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}

