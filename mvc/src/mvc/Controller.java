package mvc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Controller {
private Model model;
private View view;
public Controller(Model m, View v) {
model = m;
view = v;
initView();
}
public void initView() {
view.getFirstnameTextfield().setText(model.getFirstname());
view.getLastnameTextfield().setText(model.getLastname());
view.getEmailIdTextfield().setText(model.getEmailId());
view.getPhoneNoTextfield().setText(model.getPhoneNo());
view.getCGPATextfield().setText(model.getCGPA());
view.getSemesterTextfield().setText(model.getSemester());
}
public void initController() {
view.getSaveButton().addActionListener(e -> SaveButton());
}
private void SaveButton() {
	model.setFirstname(view.getFirstnameTextfield().getText());
	model.setLastname(view.getLastnameTextfield().getText());
	model.setEmailId(view.getEmailIdTextfield().getText());
	model.setCGPA(view.getCGPATextfield().getText());
	model.setPhoneNo(view.getPhoneNoTextfield().getText());
	model.setSemester(view.getSemesterTextfield().getText());
	if(Float.parseFloat(model.getCGPA()) > 9.00){
		JOptionPane.showMessageDialog(null,"Name: " + model.getFirstname() +
		model.getLastname() + "\nCGPA : " + model.getCGPA() + "\nGrade : S", "PES1UG19CS185",
		JOptionPane.INFORMATION_MESSAGE);
	}
	else if(Float.parseFloat(model.getCGPA()) >= 8.00 && Float.parseFloat(model.getCGPA()) < 9.00){
		JOptionPane.showMessageDialog(null,"Name: " + model.getFirstname() +
		model.getLastname() + "\nCGPA : " + model.getCGPA() + "\nGrade : A","PES1UG19CS185",
		JOptionPane.INFORMATION_MESSAGE);
	}
	else if(Float.parseFloat(model.getCGPA()) >= 7.00 && Float.parseFloat(model.getCGPA()) < 8.00){
			JOptionPane.showMessageDialog(null,"Name: " + model.getFirstname() +
			model.getLastname() + "\nCGPA : " + model.getCGPA() + "\nGrade : B","PES1UG19CS185",
			JOptionPane.INFORMATION_MESSAGE);
	}
	else if(Float.parseFloat(model.getCGPA()) >= 6.00 && Float.parseFloat(model.getCGPA()) < 7.00){
		JOptionPane.showMessageDialog(null,"Name: " + model.getFirstname() +
		model.getLastname() + "\nCGPA : " + model.getCGPA() + "\nGrade : C","PES1UG19CS185",
		JOptionPane.INFORMATION_MESSAGE);
	}
	else {
		JOptionPane.showMessageDialog(null,"Name: " + model.getFirstname() +
		model.getLastname() +"\nCGPA : " + model.getCGPA() + "\nGrade : D","PES1UG19CS185",
		JOptionPane.INFORMATION_MESSAGE);
	}
	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc", "root", "abcd1234");
		String query = "INSERT INTO details values('" + model.getFirstname() + "','" + model.getLastname() + "','" + model.getEmailId() + "','" + model.getPhoneNo() + "','" + model.getCGPA() + "','" + model.getSemester() + "')";
		Statement sta = conn.createStatement();
		int x = sta.executeUpdate(query);
		if (x == 0) {
			JOptionPane.showMessageDialog(null, "This is already exists");
		} 
		else {
			JOptionPane.showMessageDialog(null,"Your data has been sucessfully uploaded");
		}
		conn.close();
	}
	catch (Exception exception) {
		exception.printStackTrace();
	}
	}
}