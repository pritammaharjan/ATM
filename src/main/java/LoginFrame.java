
import javax.swing.*;

public class LoginFrame extends JFrame {
	
	private final LoginPanel loginPanel;

	private static boolean login;

	
	public LoginFrame(){ // Mainframe Constructor
		
	
		
		super("Please Login ...");
		setSize(320, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		loginPanel = new LoginPanel();
		
		this.setLocation(500, 500);
		add(loginPanel);

		loginPanel.setVisible(true);

	
	}

	public static boolean isNumeric(String str)  {  
		  try  {  
			  double d = Double.parseDouble(str);  
		  }  
		  catch(NumberFormatException nfe)  {  
		    return false;  
		  }  
		  return true;  
		}
	
	public String getID(){
		return LoginPanel.getID();
	}
	public String getPIN(){
		return LoginPanel.getPIN();
	}
	
	public void setIncorrect(){
		loginPanel.setIncorrect();
	}
	
	public void setClear(){
		loginPanel.setClear();
	}
        @SuppressWarnings("empty-statement")
	public void setAccountNumber(String ID){
		loginPanel.setAccountNumber(ID);;
	}
	

}