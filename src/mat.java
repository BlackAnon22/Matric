import javax.swing.JOptionPane;
public class mat {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		String number = JOptionPane.showInputDialog("Enter your Matric Number");
		String pass = JOptionPane.showInputDialog("Enter your Password");
		
		String passcode = "hector234";
		
		if(pass.equals(passcode)) {
			JOptionPane.showMessageDialog(null, "Welcome " + name);
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect Password");
			}
		
		
	}

}
