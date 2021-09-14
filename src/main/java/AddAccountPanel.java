import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AddAccountPanel extends JPanel implements ActionListener{

	private boolean savings = true;
	private boolean checking = true;
	
	private JLabel desired_name;
	
	private final JButton savingsButton;
	private final JButton checkingButton;
	
	public AddAccountPanel(){
			
			GridBagConstraints constraints = new GridBagConstraints();
		    constraints.anchor = GridBagConstraints.EAST;
		    
		    savingsButton = new JButton("Savings Account");
		    checkingButton = new JButton("Checking Account");
		    
		    savingsButton.addActionListener(this);
		    checkingButton.addActionListener(this);
		    
			constraints.gridx = 0;
			constraints.gridy = 1;
			add(savingsButton,constraints);
			
			constraints.gridx = 1;
			constraints.gridy = 1;
			add(checkingButton,constraints);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed.equals(savingsButton)){
			System.out.println("Opening Savings Account");
			savings = true;
			
		}
	
		if (buttonPressed.equals(checkingButton)){
			System.out.println("Opening Savings Account");
			checking = true;
			
		}
	
	}
	
	public boolean getSavings(){
		return savings;
	}
	
	public void setSavingsFalse(){
		savings = false;
	}
	
	public boolean getChecking(){
		return checking;
	}
	
	public void setCheckingFalse(){
		checking = false;
	}
	
}