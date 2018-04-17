package package1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddressForm extends JFrame implements ActionListener{
	
	private static final int FRAME_WIDTH    = 600;
    private static final int FRAME_HEIGHT   = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
        
    private static final int BUTTON_WIDTH  = 80;
    private static final int BUTTON_HEIGHT = 30;

    private JLabel name;
    private JLabel street;
    private JLabel city;
    private JLabel state;
    private JLabel zip;
    
    private JTextField nameTxt;
    private JTextField streetTxt;
    private JTextField cityTxt;
    private JTextField stateTxt;
    private JTextField zipTxt;
    
    private JButton submitButton;
    
    private static final String EMPTY_STRING = "";
    
	public AddressForm() {
		setTitle("Address Form");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

		Container contentPane = getContentPane( );
        contentPane.setLayout( null );
        contentPane.setBackground( Color.white );
		
        //create and place two buttons on the frame's content pane
        submitButton = new JButton("Submit");
        submitButton.setBounds(250, 150, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(submitButton);
        submitButton.addActionListener(this);
        
		// register 'Exit upon closing' as a default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		name = new JLabel("Name");
		name.setBounds(30, 10, 50, 20);
		contentPane.add(name);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(30, 30, 130, 25);
        contentPane.add(nameTxt);
		
		street = new JLabel("Street");
		street.setBounds(230, 10, 50, 20);
		contentPane.add(street);
		
		streetTxt = new JTextField();
        streetTxt.setBounds(230, 30, 130, 25);
        contentPane.add(streetTxt);
		
		city = new JLabel("City");
		city.setBounds(430, 10, 50, 20);
		contentPane.add(city);
		
		cityTxt = new JTextField();
        cityTxt.setBounds(430, 30, 130, 25);
        contentPane.add(cityTxt);
		
		state = new JLabel("State");
		state.setBounds(130, 90, 50, 20);
		contentPane.add(state);
		
		stateTxt = new JTextField();
        stateTxt.setBounds(130, 110, 130, 25);
        contentPane.add(stateTxt);
		
		zip = new JLabel("zip");
		zip.setBounds(330, 90, 50, 20);
		contentPane.add(zip);
		
        zipTxt = new JTextField();
        zipTxt.setBounds(330, 110, 130, 25);
        contentPane.add(zipTxt);
	}
	
	public void actionPerformed(ActionEvent event) {
		String output = "";
        if (event.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) event.getSource();

            if (clickedButton == submitButton) {//Same Addresses.Same object
                output = nameTxt.getText() + "\n";
                output += streetTxt.getText() + "\n";
                output += cityTxt.getText() + ", " + stateTxt.getText() + " " + zipTxt.getText();
            }
            clearText( );
        } 
        System.out.println(output);
    }
	
	private void clearText( ) {
        nameTxt.setText(EMPTY_STRING);
        streetTxt.setText(EMPTY_STRING);
        cityTxt.setText(EMPTY_STRING);
        stateTxt.setText(EMPTY_STRING);
        zipTxt.setText(EMPTY_STRING);
    }
	
}
