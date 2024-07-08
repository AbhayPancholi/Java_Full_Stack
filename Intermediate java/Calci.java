import java.awt.*;

import java.awt.event.*;

//for Hibernate

public class Calci extends Frame implements ActionListener {

Button b1,b2,b3,b4;
TextField t1, t2, t3;

Label l1,l2,l3;

public Calci(){

l1 = new Label("enter a number");

l2 = new Label("enter another number");

l3 = new Label("solution");

t1 = new TextField(10);
t2=new TextField(10);
t3=new TextField(18); 
t3.setEditable(false);

b1 = new Button("Add");
b2 = new Button("substract");
b3 = new Button("Multiply");
b4 = new Button("Divide");

b1.addActionListener(this); 
b2.addActionListener(this);
b3.addActionListener(this); 
b4.addActionListener(this); 
setLayout(new FlowLayout());

add(l1);
add(l2);
add(l3);

add(t1);
add(t2);
add(t3);

add(b1);
add(b2);
add(b3);
add(b4);
}

public void actionPerformed(ActionEvent e){

double x,y,z;

if(e.getSource()==b1){
x = Double.valueOf(t1.getText().trim()).doubleValue();
y= Double.valueOf(t2.getText().trim()).doubleValue(); 
z = x+y;
t3.setText(String.valueOf(z));}

else if(e.getSource()==b2){

x = Double.valueOf(t1.getText().trim()).doubleValue();
y= Double.valueOf(t2.getText().trim()).doubleValue(); 
z = x-y;
t3.setText(String.valueOf(z));}

else if(e.getSource()==b3){

x = Double.valueOf(t1.getText().trim()).doubleValue();
y= Double.valueOf(t2.getText().trim()).doubleValue(); 
z = x*y;
t3.setText(String.valueOf(z));}

else if(e.getSource()==b4){

x = Double.valueOf(t1.getText().trim()).doubleValue();
y= Double.valueOf(t2.getText().trim()).doubleValue(); 
z = x/y;
t3.setText(String.valueOf(z));}
}

public static void main(String[] ar){
Calci c1 = new Calci();
c1.setSize(400,600);
c1.setVisible(true);
//c1.pack();
//c1.show();
}
}