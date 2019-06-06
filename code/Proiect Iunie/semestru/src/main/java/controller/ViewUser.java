
package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author ingri
 *
 */
public class ViewUser extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pane = new JPanel(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	 private JButton addUser = new JButton("Add User");
	 private JButton deleteUser = new JButton("Remove User");
	 private JButton addPassword = new JButton("Add Password");
	 private JButton deletePassword = new JButton("Remove Password");
	 private JButton addSite = new JButton("Add Site");
	 private JButton deleteSite = new JButton("Remove Site");
	 private JButton addAccount = new JButton("Add Account");
	 private JButton deleteAccount = new JButton("Remove Account");
	 
	 
	 private JButton viewUser = new JButton("View Users");
	 private JButton viewSite = new JButton("View Site");
	
	 JLabel id_label = new JLabel("ID:");
	 JLabel name_label = new JLabel("Name:");
	 JLabel password_label = new JLabel("Password:");
	 
	 JTextField text_textField = new JTextField(15);
	 JTextField text_textField1 = new JTextField(15);
	 JTextField id_textField = new JTextField(15);
	 
	 ControllerUser controller = new ControllerUser(this);
	 
	public ViewUser() {
		// TODO Auto-generated constructor stub
		super();
		pane.setPreferredSize(new Dimension(640,640));
		pane.setBackground(Color.LIGHT_GRAY);
		
		//listeners
		addUser.addActionListener(controller);
		deleteUser.addActionListener(controller);
		addSite.addActionListener(controller);
		deleteSite.addActionListener(controller);
		addPassword.addActionListener(controller);
		deletePassword.addActionListener(controller);
		addAccount.addActionListener(controller);
		deleteAccount.addActionListener(controller);
		viewUser.addActionListener(controller);
		viewSite.addActionListener(controller);
		
		
		//labels
		c.gridx=0;
		c.gridy=0;
	
		pane.add(id_label,c);
		
		c.gridy++;
		pane.add(name_label,c);
		
		c.gridy++;
		pane.add(password_label,c);
		
		c.gridx = 1;
		c.gridy = 0;
		pane.add(id_textField,c);
		c.gridy++;
		pane.add(text_textField,c);
		c.gridy++;
		pane.add(text_textField1,c);
		
		
		c.gridx = 2;
		c.gridy = 0;
		pane.add(addUser, c);
		c.gridy++;
		pane.add(deleteUser,c);
		c.gridy++;
		pane.add(addSite,c);
		c.gridy++;
		pane.add(deleteSite,c);
		c.gridy++;
		pane.add(addPassword,c);
		c.gridy++;
		pane.add(deletePassword,c);
		c.gridy++;
		pane.add(addAccount,c);
		c.gridy++;
		pane.add(deleteAccount,c);
		c.gridy++;
		pane.add(viewUser, c);
		c.gridy++;
		pane.add(viewSite, c);
		
		this.add(pane);
			
	}

	public JPanel getPane() {
		return pane;
	}

	public void setPane(JPanel pane) {
		this.pane = pane;
	}

	public GridBagConstraints getC() {
		return c;
	}

	public void setC(GridBagConstraints c) {
		this.c = c;
	}

	public JButton getAddUser() {
		return addUser;
	}

	public void setAddUser(JButton addUser) {
		this.addUser = addUser;
	}

	public JButton getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(JButton deleteUser) {
		this.deleteUser = deleteUser;
	}

	public JButton getAddPassword() {
		return addPassword;
	}

	public void setAddPassword(JButton addPassword) {
		this.addPassword = addPassword;
	}

	public JButton getDeletePassword() {
		return deletePassword;
	}

	public void setDeletePassword(JButton deletePassword) {
		this.deletePassword = deletePassword;
	}

	public JButton getAddSite() {
		return addSite;
	}

	public void setAddSite(JButton addSite) {
		this.addSite = addSite;
	}

	public JButton getDeleteSite() {
		return deleteSite;
	}

	public void setDeleteSite(JButton deleteSite) {
		this.deleteSite = deleteSite;
	}

	public JButton getAddAccount() {
		return addAccount;
	}

	public void setAddAccount(JButton addAccount) {
		this.addAccount = addAccount;
	}

	public JButton getDeleteAccount() {
		return deleteAccount;
	}

	public void setDeleteAccount(JButton deleteAccount) {
		this.deleteAccount = deleteAccount;
	}

	public JButton getViewUser() {
		return viewUser;
	}

	public void setViewUser(JButton viewUser) {
		this.viewUser = viewUser;
	}

	public JButton getViewSite() {
		return viewSite;
	}

	public void setViewSite(JButton viewSite) {
		this.viewSite = viewSite;
	}

	public JLabel getId_label() {
		return id_label;
	}

	public void setId_label(JLabel id_label) {
		this.id_label = id_label;
	}

	public JLabel getName_label() {
		return name_label;
	}

	public void setName_label(JLabel name_label) {
		this.name_label = name_label;
	}

	public JLabel getPassword_label() {
		return password_label;
	}

	public void setPassword_label(JLabel password_label) {
		this.password_label = password_label;
	}

	public JTextField getText_textField() {
		return text_textField;
	}

	public void setText_textField(JTextField text_textField) {
		this.text_textField = text_textField;
	}

	public JTextField getText_textField1() {
		return text_textField1;
	}

	public void setText_textField1(JTextField text_textField1) {
		this.text_textField1 = text_textField1;
	}

	public JTextField getId_textField() {
		return id_textField;
	}

	public void setId_textField(JTextField id_textField) {
		this.id_textField = id_textField;
	}

	public ControllerUser getController() {
		return controller;
	}

	public void setController(ControllerUser controller) {
		this.controller = controller;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

		
}
