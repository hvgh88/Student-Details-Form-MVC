package mvc;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class View {
	private JFrame frame;
	private JLabel firstnameLabel;
	private JLabel lastnameLabel;
	private JLabel emailIdLabel;
	private JLabel phoneNoLabel;
	private JLabel CGPALabel;
	private JLabel semesterLabel;
	private JTextField firstnameTextfield;
	private JTextField lastnameTextfield;
	private JTextField emailIdTextfield;
	private JTextField phoneNoTextfield;
	private JTextField CGPATextfield;
	private JTextField semesterTextfield;
	private JButton SaveButton;

public View(String title) {
	frame = new JFrame(title);
	frame.getContentPane().setLayout(new BorderLayout());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 300);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	// Create UI elements
	firstnameLabel = new JLabel("Firstname :");
	lastnameLabel = new JLabel("Lastname :");
	emailIdLabel = new JLabel("Email ID :");
	phoneNoLabel = new JLabel("Phone Number :");
	CGPALabel = new JLabel("CGPA :");
	semesterLabel = new JLabel("Semester :");
	
	firstnameTextfield = new JTextField();
	lastnameTextfield = new JTextField();
	emailIdTextfield = new JTextField();
	phoneNoTextfield = new JTextField();
	CGPATextfield = new JTextField();
	semesterTextfield = new JTextField();
	
	SaveButton = new JButton("Save");
	
	GroupLayout layout = new GroupLayout(frame.getContentPane());
	layout.setAutoCreateGaps(true);
	layout.setAutoCreateContainerGaps(true);
	
	layout.setHorizontalGroup(layout.createSequentialGroup()
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameLabel)
		.addComponent(lastnameLabel)
		.addComponent(emailIdLabel)
		.addComponent(phoneNoLabel)
		.addComponent(CGPALabel)
		.addComponent(semesterLabel))
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameTextfield)
		.addComponent(lastnameTextfield)
		.addComponent(emailIdTextfield)
		.addComponent(phoneNoTextfield)
		.addComponent(CGPATextfield)
		.addComponent(semesterTextfield))
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(SaveButton)));
	
	layout.setVerticalGroup(layout.createSequentialGroup()

	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(firstnameLabel)
			.addComponent(firstnameTextfield))
	
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lastnameLabel)
			.addComponent(lastnameTextfield).addComponent(SaveButton))
	
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(emailIdLabel)
			.addComponent(emailIdTextfield))
	
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(phoneNoLabel)
			.addComponent(phoneNoTextfield))
	
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(CGPALabel)
			.addComponent(CGPATextfield))
	
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(semesterLabel)
			.addComponent(semesterTextfield))
	
	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(SaveButton)));
	
	frame.getContentPane().setLayout(layout);
}
public JLabel getEmailIdLabel() {
return emailIdLabel;
}
public void setEmailIdLabel(JLabel emailIdLabel) {
this.emailIdLabel = emailIdLabel;
}
public JLabel getPhoneNoLabel() {
return phoneNoLabel;
}
public void setPhoneNoLabel(JLabel phoneNoLabel) {
this.phoneNoLabel = phoneNoLabel;
}
public JLabel getCGPALabel() {
return CGPALabel;
}
public void setCGPALabel(JLabel cGPALabel) {
CGPALabel = cGPALabel;
}
public JLabel getSemesterLabel() {
return semesterLabel;
}
public void setSemesterLabel(JLabel semesterLabel) {
this.semesterLabel = semesterLabel;
}
public JTextField getEmailIdTextfield() {
return emailIdTextfield;
}
public void setEmailIdTextfield(JTextField emailIdTextfield) {
this.emailIdTextfield = emailIdTextfield;
}
public JTextField getPhoneNoTextfield() {
return phoneNoTextfield;
}
public void setPhoneNoTextfield(JTextField phoneNoTextfield) {
this.phoneNoTextfield = phoneNoTextfield;
}
public JTextField getCGPATextfield() {
return CGPATextfield;
}
public void setCGPATextfield(JTextField cGPATextfield) {
CGPATextfield = cGPATextfield;
}
public JTextField getSemesterTextfield() {
return semesterTextfield;
}
public void setSemesterTextfield(JTextField semesterTextfield) {
this.semesterTextfield = semesterTextfield;
}
public JButton getSaveButton() {
return SaveButton;
}
public void setSaveButton(JButton saveButton) {
SaveButton = saveButton;
}
public JFrame getFrame() {
return frame;
}
public void setFrame(JFrame frame) {
this.frame = frame;
}
public JLabel getFirstnameLabel() {
return firstnameLabel;
}
public void setFirstnameLabel(JLabel firstnameLabel) {
this.firstnameLabel = firstnameLabel;
}
public JLabel getLastnameLabel() {
return lastnameLabel;
}
public void setLastnameLabel(JLabel lastnameLabel) {
this.lastnameLabel = lastnameLabel;
}
public JTextField getFirstnameTextfield() {
return firstnameTextfield;
}
public void setFirstnameTextfield(JTextField firstnameTextfield) {
this.firstnameTextfield = firstnameTextfield;
}
public JTextField getLastnameTextfield() {
return lastnameTextfield;
}
public void setLastnameTextfield(JTextField lastnameTextfield) {
this.lastnameTextfield = lastnameTextfield;
}
}