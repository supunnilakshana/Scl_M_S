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
public class Teacher {
    
    private String serial_no;
    private String computer_no;
    private String name;
    private String full_name;
    private String dob;
    private String nic_no;
    private String personal_addr;
    private String tel_no;
    private String reg_no;
    private String educational_qualification;
    private String prof_qualification;
    private String first_apponit_date;
    private String first_school_ap;
    private String grade_class;
    private String conf_apoint_date;
    private String difficult_period;
    private String appoint_zone_date;
    private String appoint_school_date;
    private String w_o_penssion_no;
    private String status;

    public Teacher(String serial_no, String computer_no, String name, String full_name, String dob, String nic_no, String personal_addr, String tel_no, String reg_no, String educational_qualification, String prof_qualification, String first_apponit_date, String first_school_ap, String grade_class, String conf_apoint_date, String difficult_period, String appoint_zone_date, String appoint_school_date, String w_o_penssion_no, String status) {
        this.serial_no = serial_no;
        this.computer_no = computer_no;
        this.name = name;
        this.full_name = full_name;
        this.dob = dob;
        this.nic_no = nic_no;
        this.personal_addr = personal_addr;
        this.tel_no = tel_no;
        this.reg_no = reg_no;
        this.educational_qualification = educational_qualification;
        this.prof_qualification = prof_qualification;
        this.first_apponit_date = first_apponit_date;
        this.first_school_ap = first_school_ap;
        this.grade_class = grade_class;
        this.conf_apoint_date = conf_apoint_date;
        this.difficult_period = difficult_period;
        this.appoint_zone_date = appoint_zone_date;
        this.appoint_school_date = appoint_school_date;
        this.w_o_penssion_no = w_o_penssion_no;
        this.status = status;
    }

   

    public Teacher() {
        
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getComputer_no() {
        return computer_no;
    }

    public void setComputer_no(String computer_no) {
        this.computer_no = computer_no;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNic_no() {
        return nic_no;
    }

    public void setNic_no(String nic_no) {
        this.nic_no = nic_no;
    }

    public String getPersonal_addr() {
        return personal_addr;
    }

    public void setPersonal_addr(String personal_addr) {
        this.personal_addr = personal_addr;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getEducational_qualification() {
        return educational_qualification;
    }

    public void setEducational_qualification(String educational_qualification) {
        this.educational_qualification = educational_qualification;
    }

    public String getProf_qualification() {
        return prof_qualification;
    }

    public void setProf_qualification(String prof_qualification) {
        this.prof_qualification = prof_qualification;
    }

    public String getFirst_apponit_date() {
        return first_apponit_date;
    }

    public void setFirst_apponit_date(String first_apponit_date) {
        this.first_apponit_date = first_apponit_date;
    }

    public String getFirst_school_ap() {
        return first_school_ap;
    }

    public void setFirst_school_ap(String first_school_ap) {
        this.first_school_ap = first_school_ap;
    }

    public String getGrade_class() {
        return grade_class;
    }

    public void setGrade_class(String grade_class) {
        this.grade_class = grade_class;
    }

    public String getConf_apoint_date() {
        return conf_apoint_date;
    }

    public void setConf_apoint_date(String conf_apoint_date) {
        this.conf_apoint_date = conf_apoint_date;
    }

    public Teacher(String serial_no, String computer_no, String name, String full_name, String dob, String nic_no, String personal_addr, String tel_no, String reg_no, String educational_qualification, String prof_qualification, String first_apponit_date, String first_school_ap, String grade_class, String conf_apoint_date, String difficult_period, String appoint_zone_date, String appoint_school_date, String w_o_penssion_no) {
        this.serial_no = serial_no;
        this.computer_no = computer_no;
        this.name = name;
        this.full_name = full_name;
        this.dob = dob;
        this.nic_no = nic_no;
        this.personal_addr = personal_addr;
        this.tel_no = tel_no;
        this.reg_no = reg_no;
        this.educational_qualification = educational_qualification;
        this.prof_qualification = prof_qualification;
        this.first_apponit_date = first_apponit_date;
        this.first_school_ap = first_school_ap;
        this.grade_class = grade_class;
        this.conf_apoint_date = conf_apoint_date;
        this.difficult_period = difficult_period;
        this.appoint_zone_date = appoint_zone_date;
        this.appoint_school_date = appoint_school_date;
        this.w_o_penssion_no = w_o_penssion_no;
    }

    public String getDifficult_period() {
        return difficult_period;
    }

    public void setDifficult_period(String difficult_period) {
        this.difficult_period = difficult_period;
    }

    public String getAppoint_zone_date() {
        return appoint_zone_date;
    }

    public void setAppoint_zone_date(String appoint_zone_date) {
        this.appoint_zone_date = appoint_zone_date;
    }

    public String getAppoint_school_date() {
        return appoint_school_date;
    }

    public void setAppoint_school_date(String appoint_school_date) {
        this.appoint_school_date = appoint_school_date;
    }

    public String getW_o_penssion_no() {
        return w_o_penssion_no;
    }

    public void setW_o_penssion_no(String w_o_penssion_no) {
        this.w_o_penssion_no = w_o_penssion_no;
    }
}

