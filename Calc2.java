import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calc2 extends Frame implements ActionListener{
JFrame f;
Button b1 , b2 , b3, b4 , b5 , b6 , b7 , b8 , b9 , b0 , bsum , bsub , bmult , bdiv , bclear , beq ;
TextField t;
double num,ans;
int calculation;
	public void paint(Graphics g)
	{
		setBackground(Color.PINK);
		setForeground(Color.BLUE);
	}
Calc2()
{
	//display
	t = new TextField();
	t.setBounds(10,10,280,30);
	//number	
	b9 = new Button("9");
	b9.setBounds(10,60,40,40);
	b8 = new Button("8");
	b8.setBounds(60,60,40,40);
	b7 = new Button("7");
	b7.setBounds(110,60,40,40);
	b6 = new Button("6");
	b6.setBounds(10,120,40,40);
	b5 = new Button("5");
	b5.setBounds(60,120,40,40);
	b4 = new Button("4");
	b4.setBounds(110,120,40,40);
	b3 = new Button("3");
	b3.setBounds(10,180,40,40);
	b2 = new Button("2");
	b2.setBounds(60,180,40,40);
	b1 = new Button("1");
	b1.setBounds(110,180,40,40);
	b0 = new Button("0");
	b0.setBounds(10,240,40,40);
	//symbols
	bsum = new Button("+");
	bsum.setBounds(160,60,40,40);
	bsub = new Button("-");
	bsub.setBounds(160,120,40,40);
	bmult = new Button("*");
	bmult.setBounds(160,180,40,40);
	bdiv = new Button("/");
	bdiv.setBounds(210,60,40,40);
	bclear = new Button("C");
	bclear.setBounds(210,120,40,40);
	beq = new Button("=");
	beq.setBounds(210,180,40,40);
	Label l1 = new Label("JAVA SWING CALCULATOR");
	l1.setBounds(60,250,280,30);	
	//add ActionListeners
	b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bsum.addActionListener(this);
        bdiv.addActionListener(this);
        bmult.addActionListener(this);
        bsub.addActionListener(this);
        bclear.addActionListener(this);
        beq.addActionListener(this);
	
	//addframe
	add(t);add(b9);add(b8);add(b7);add(b6);add(b5);add(b4);add(b3);add(b2);add(b1);add(b0);
	add(bsum);add(bsub);add(bmult);add(bdiv);add(bclear);add(l1);add(beq);
	setSize(300,300);
	setLayout(null);
	setVisible(true);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}	
	public void arithmetic()
		{	        
		switch(calculation){
			case 1:
				ans = num + Double.parseDouble(t.getText()); //convert to double the text
				
				t.setText(Double.toString(ans)); //conert to string and set back
				break;
			case 2:
				ans = num - Double.parseDouble(t.getText()); //convert to double the text
				t.setText(Double.toString(ans)); //conert to string and set back
				break;
			case 3:
				ans = num * Double.parseDouble(t.getText()); //convert to double the text
				t.setText(Double.toString(ans)); //conert to string and set back
				break;
			case 4:
				if(Double.parseDouble(t.getText())==0)
					t.setText("NULL");
				else{
				ans = num / Double.parseDouble(t.getText()); //convert to double the text
				t.setText(Double.toString(ans)); //conert to string and set back
				
				}
				break;
			}

	}
	
	//action performed
	 public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText()+"1");
        
        if(e.getSource()==b2)
            t.setText(t.getText()+"2");
        
        if(e.getSource()==b3)
            t.setText(t.getText()+"3");
        
        if(e.getSource()==b4)
            t.setText(t.getText()+"4");
        
        if(e.getSource()==b5)
            t.setText(t.getText()+"5");
        
        if(e.getSource()==b6)
            t.setText(t.getText()+"6");
        
        if(e.getSource()==b7)
            t.setText(t.getText()+"7");
        
        if(e.getSource()==b8)
            t.setText(t.getText()+"8");
        
        if(e.getSource()==b9)
            t.setText(t.getText()+"9");
        
        if(e.getSource()==b0)
            t.setText(t.getText()+"0");
        if(e.getSource()==bsum)
       { num = Double.parseDouble(t.getText());
	    calculation = 1;
	    t.setText("");
	}
           	
        
        if(e.getSource()==bsub)
        { num = Double.parseDouble(t.getText());
	    calculation = 2;
	    t.setText("");}    
           
        if(e.getSource()==bmult)
	{num = Double.parseDouble(t.getText());
	    calculation = 3;
	    t.setText(" ");
}            
            
        if(e.getSource()==bdiv)
	{
	num = Double.parseDouble(t.getText());
	    calculation = 4;
	    t.setText(" ");


	}	
       	if(e.getSource()==bclear)
		t.setText("");
	if(e.getSource()==beq)
		arithmetic();
	
        
        
                     
    }
	//arithmetic operation
	

	public static void main(String args[])
	{

		new Calc2();

	}

}
