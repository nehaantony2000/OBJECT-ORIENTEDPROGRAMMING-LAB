
import java.awt.*;
import java.awt.event.*;
 
public class largenum implements ActionListener{
	Frame f=new Frame();
	Label l1=new Label("First Number");
	Label l2=new Label("Second Number");
	Label l3=new Label("Third Number");
	Label res=new Label("Result");
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	Button b1=new Button("Largest !");
	
	largenum(){
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
		t1.setBounds(150,100,100,20);
		t2.setBounds(150,140,100,20);
		t3.setBounds(150,180,100,20);
		b1.setBounds(50,220,100,20);
		res.setBounds(50,260,100,20);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(res);
		f.add(b1);
		
		b1.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
	}
	
	public static void main(String[] args){
		new largenum();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			int n3=Integer.parseInt(t3.getText());
			
			int largeres= (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
			res.setText(String.valueOf(largeres)+" is the largest");
		}
		
	}
}

