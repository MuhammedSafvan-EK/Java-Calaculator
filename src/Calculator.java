import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	
	JFrame jf;
	JLabel displayLabel;
	
	String operator;
	String oldValue;
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton subButton;
	JButton addButton;
	JButton clearButton;
	
	public Calculator() {
		jf=new JFrame("Calculator"); //window nte mugalil name calculator print cheyyan ane jframe nte ullil calcualtor enn koduthath
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150); //window sender il set cheyyan
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 40, 540, 40);
		displayLabel.setBackground(Color.lightGray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.black); //text color changing
		jf.add(displayLabel);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(mulButton);
		
		subButton=new JButton("-");
		subButton.setBounds(330, 330, 80, 80);
		subButton.addActionListener(this);
		subButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(330, 430, 80, 80);
		addButton.addActionListener(this);
		addButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(addButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 15));
		jf.add(clearButton);
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override //button click cheyyunmbol ee function call cheyyum
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==sevenButton) {
			
			if (isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"7");  //2 0r more numbers display 
				
			}
			
					
		}else if (e.getSource()==eightButton) {

			if (isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"8");   
				
			}
			
			
		}else if (e.getSource()==nineButton) {

			if (isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"9");  //2 0r more numbers display 
				
			}
			
			
		}else if (e.getSource()==fourButton) {

			if (isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"4");  //2 0r more numbers display 
				
			}
			
			
		}else if (e.getSource()==fiveButton) {

			if (isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"5");  //2 0r more numbers display 
				
			}
			
			
		}else if (e.getSource()==sixButton) {

			if (isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"6");   
				
			}
			
			
		}else if (e.getSource()==oneButton) {

			if (isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"1");   
				
			}
			
			
		}else if (e.getSource()==twoButton) {

			if (isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"2");   
				
			}
			
			
		}else if (e.getSource()==threeButton) {

			if (isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
				
			}else {
				displayLabel.setText(displayLabel.getText()+"3");   
				
			}
			
			
		}else if (e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
			
		}else if (e.getSource()==zeroButton) {
			displayLabel.setText(displayLabel.getText()+"0");
			
		}else if (e.getSource()==equalButton) {
			
			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);					//old value is string datatype that are convereted into float
			float newValueF=Float.parseFloat(newValue);					 //newvalue is a string datatype that are convereted into float
			float result= 0;
			
			    if (operator.equals("+")) {
			    	result=oldValueF+newValueF;
					
				}else if (operator.equals("-")) {
					result=oldValueF-newValueF;
					
				}else if (operator.equals("*")) {
					result=oldValueF*newValueF;
					
				}else if (operator.equals("/")) {
					if (newValueF==0) {
						displayLabel.setText("Error: / by 0 " );
						return;
					}else {
						result=oldValueF/newValueF;
					}
					
				}
									
			    displayLabel.setText(result+"");							 // +"" data ne string leek convert cheyyan
			
		}else if (e.getSource()==divButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator = "/" ;
			
		}else if (e.getSource()==mulButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="*";
			
		}else if (e.getSource()==subButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="-";
			
		}else if (e.getSource()==addButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="+";
			
		}else if (e.getSource()==clearButton) {
			displayLabel.setText("");									 //null akkey koduthal clear avum 
			
		}
		
		
	}

}
