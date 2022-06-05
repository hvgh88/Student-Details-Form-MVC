package mvc;
public class Model {
private String firstname;
private String lastname;
private String emailId;
private String phoneNo;
private String CGPA;
private String semester;
public Model(String firstname, String lastname, String emailId, String phoneNo,
String CGPA, String semester) {
this.firstname = firstname;
this.lastname = lastname;
this.emailId = emailId;
this.phoneNo = phoneNo;
this.CGPA = CGPA;
this.semester = semester;
}
public String getFirstname() {
return firstname;
}
public String getEmailId() {
return emailId;
}
public void setEmailId(String emailId) {
this.emailId = emailId;
}
public String getPhoneNo() {
return phoneNo;
}
public void setPhoneNo(String phoneNo) {
this.phoneNo = phoneNo;
}
public String getCGPA() {
return CGPA;
}
public void setCGPA(String CGPA) {

this.CGPA = CGPA;
}
public String getSemester() {
return semester;
}
public void setSemester(String semester) {
this.semester = semester;
}
public void setFirstname(String firstname) {
this.firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
}
}