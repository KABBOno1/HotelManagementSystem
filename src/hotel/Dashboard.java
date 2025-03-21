package hotel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    JButton btn1;
    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("WUB HOTEL MANAGEMENT SYSTEM by Kabbo");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1365, 865,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1365, 865); 
        add(NewLabel);
        
        // AirlineManagementSystem
        
        JLabel hotelManagementSystem = new JLabel("WUB HOTEL by Kabbo WELCOMES YOU");
	hotelManagementSystem.setForeground(Color.WHITE);
        hotelManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	hotelManagementSystem.setBounds(300, 60, 900, 85);
	NewLabel.add(hotelManagementSystem);
	
        
        btn1 = new JButton("Demo");
	btn1.setBounds(300, 200, 120, 48);
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.black);
       // add(btn1);
                        
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        // AirlineSystem
        
        JMenu hotelSystem = new JMenu("WUB HOTEL MANAGEMENT");
        hotelSystem.setForeground(Color.BLUE);
	menuBar.add(hotelSystem);
        
        // FlightDetails
		
        JMenuItem guestDetails = new JMenuItem("RECEPTION");
	hotelSystem.add(guestDetails);
        
        // AirlineSystemHello
		
	JMenu hotelSystemHello = new JMenu("ADMIN");
        hotelSystemHello.setForeground(Color.RED);
	menuBar.add(hotelSystemHello);
        
        // FlightDetailshello1
        
        JMenuItem guestDetailshello1 = new JMenuItem("ADD EMPLOYEE");
	hotelSystemHello.add(guestDetailshello1);
        
        
        guestDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        
        // FlightDetailshello2

        JMenuItem hotelDetailshello2 = new JMenuItem("ADD ROOMS");
	hotelSystemHello.add(hotelDetailshello2);
        
        hotelDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
        // FlightDetails
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new AddDrivers().setVisible(true);
            }
	});

	guestDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});
        
        // FlightDetailshello3
        
        JMenuItem hotelDetailshello3 = new JMenuItem("ADD DRIVERS");
	hotelSystemHello.add(hotelDetailshello3);
        
	hotelDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}

