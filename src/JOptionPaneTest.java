import javax.swing.JOptionPane;


public class JOptionPaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		String password;
		
		username = JOptionPane.showInputDialog("Enter Username");
		password = JOptionPane.showInputDialog("Enter Password");
		
		if(UserAuthentication1.authenciation(username, password))
			JOptionPane.showMessageDialog(null, "Welcome " + username);
		else
			JOptionPane.showMessageDialog(null,"Wrong Username Or Password");
		
	}

}

