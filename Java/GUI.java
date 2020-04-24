import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.FileWriter;

public class GUI {

	public static void main(String[] args) throws IOException
	{
		new Myframe();

	}

}
class Myframe extends Frame
{
	Myframe()
	{
		
	
	Frame f = new Frame();       
    Label lb = new Label("Resume Details",Label.CENTER);
    f.add(lb);
    lb.setBounds(200, 50, 120, 30);
    lb.setFont(new Font("calibri light", Font.BOLD, 20));
    
    Label lb1 = new Label("Name : ");
    f.add(lb1);
    lb1.setBounds(100, 100, 120, 20);
    TextField t1 = new TextField();
    f.add(t1);
    t1.setBounds(230, 100, 190, 20);           
    
    Label lb2 = new Label("Mobile no.: ");
    f.add(lb2);
    lb2.setBounds(100, 130, 120, 20);
    TextField t2 = new TextField();
    f.add(t2);
    t2.setBounds(230, 130, 190, 20);
   
    Label lb3 = new Label("Email_Id: ");
    f.add(lb3);
    lb3.setBounds(100, 160, 120, 20);
    TextField t3 = new TextField();
    f.add(t3);
    t3.setBounds(230, 160, 190, 20); 
   
    Label lb4 = new Label("Address: ");
    f.add(lb4);
    lb4.setBounds(100, 190, 120, 20);
    TextField t4 = new TextField();
    t4.doLayout();
    f.add(t4);
    t4.setBounds(230, 190, 190, 40);
    
    Label lb5 = new Label("Date Of Birth: ");
    f.add(lb5);
    lb5.setBounds(100, 240, 120, 20);
    TextField t5a = new TextField();
    f.add(t5a);
    t5a.setBounds(230, 240, 30, 20);
    TextField t5b = new TextField();
    f.add(t5b);
    t5b.setBounds(270, 240, 30, 20);
    TextField t5c = new TextField();
    f.add(t5c);
    t5c.setBounds(310, 240, 50, 20);
    
    Label lb6 = new Label("Qualification :  ");
    f.add(lb6);
    lb6.setBounds(100, 270, 120, 20);
    Choice c1=new Choice();  
      c1.setBounds(230, 270, 190, 20);  
      c1.add("Diploma");  
      c1.add("B.Tech.");  
      c1.add("M.Tech");  
      f.add(c1);
      
      Label lb7 = new Label("Year of Passout ");
      f.add(lb7);
      lb7.setBounds(100, 300, 120, 20);
      TextField t7 = new TextField();
      f.add(t7);
      t7.setBounds(230, 300, 190, 20);
      
    Label lb8 = new Label("Any Experience (work-link) : ");
    f.add(lb8);
    lb8.setBounds(100, 330, 120, 20);
    TextField t8 = new TextField();
    f.add(t8);
    t8.setBounds(230, 330, 190, 20);
    
    
    Label lb9 = new Label("Programming Skills : ");
    f.add(lb9);
    lb9.setBounds(100, 360, 120, 20);
    TextField t9 = new TextField();           
    f.add(t9);
    t9.setBounds(230, 360, 190, 20);
    
    
    Button b=new Button("Procced"); 
    f.add(b);
    b.setBounds(200,420,70,30);  
    b.addActionListener(new ActionListener() {  
          public void actionPerformed(ActionEvent e) {       
              String name=t1.getText();
              String phone=t2.getText();
              String email=t3.getText();
              String address=t4.getText();
              String dob=t5a.getText()+"/"+t5b.getText()+"/"+t5c.getText();
              String qual=c1.getSelectedItem();
              String year = t7.getText();
              String link=t8.getText();
              String skill=t9.getText();
     
      		FileWriter fw = null;
				try {
					fw = new FileWriter("C:/Users/Mayank/Desktop/Resume.txt",true);
				} catch (IOException e20) {
					// TODO Auto-generated catch block
					e20.printStackTrace();
				}
              try {
					fw.write("\n\n\nName:");
				} catch (IOException e19) {
					// TODO Auto-generated catch block
					e19.printStackTrace();
				}
              try {
					fw.write(name);
				} catch (IOException e18) {
					// TODO Auto-generated catch block
					e18.printStackTrace();
				}
             
              try {
					fw.write("\nMobile no.:");
				} catch (IOException e17) {
					// TODO Auto-generated catch block
					e17.printStackTrace();
				}
              try {
					fw.write(phone);
				} catch (IOException e16) {
					// TODO Auto-generated catch block
					e16.printStackTrace();
				}
              try {
					fw.write("\nEmail_Id:");
				} catch (IOException e15) {
					// TODO Auto-generated catch block
					e15.printStackTrace();
				}
            try {
					fw.write(email);
				} catch (IOException e14) {
					// TODO Auto-generated catch block
					e14.printStackTrace();
				}
              try {
					fw.write("\nAddress:");
				} catch (IOException e13) {
					// TODO Auto-generated catch block
					e13.printStackTrace();
				}
              try {
					fw.write(address);
				} catch (IOException e12) {
					// TODO Auto-generated catch block
					e12.printStackTrace();
				}
              try {
					fw.write("\nDate Of Birth:");
				} catch (IOException e11) {
					// TODO Auto-generated catch block
					e11.printStackTrace();
				}
              try {
					fw.write(dob);
				} catch (IOException e10) {
					// TODO Auto-generated catch block
					e10.printStackTrace();
				}
              try {
					fw.write("\nQualification:");
				} catch (IOException e9) {
					// TODO Auto-generated catch block
					e9.printStackTrace();
				}
              try {
					fw.write(qual);
				} catch (IOException e8) {
					// TODO Auto-generated catch block
					e8.printStackTrace();
				}
              
              try {
					fw.write("\nYear of Passing:");
				} catch (IOException e7) {
					// TODO Auto-generated catch block
					e7.printStackTrace();
				}
              try {
					fw.write(year);
				} catch (IOException e6) {
					// TODO Auto-generated catch block
					e6.printStackTrace();
				}
              try {
					fw.write("\nWork_link:");
				} catch (IOException e5) {
					// TODO Auto-generated catch block
					e5.printStackTrace();
				}
              try {
					fw.write(link);
				} catch (IOException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				}
              try {
					fw.write("\nPrograming skill:");
				} catch (IOException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
              try {
					fw.write(skill);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
             
              try {
					fw.close();
				} catch (IOException e0) {
					// TODO Auto-generated catch block
					e0.printStackTrace();
				}
              
             }  
             });
    
    f.setSize(750, 850);
    f.setTitle("Resume");
    f.setLayout(null);
    f.setResizable(true);
    f.setBackground(Color.lightgray);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){  
          public void windowClosing(WindowEvent e) {  
              System.exit(0);  
          }  
      });
}}
