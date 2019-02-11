import javax.swing.*;           //Rgistration Form2 with file handling//
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class RegistrationDemo extends JFrame implements ActionListener
{ 
      JLabel l=new JLabel("REGISTRATION FORM");
      JLabel l1=new JLabel("Name:" );
      JLabel l2=new JLabel("Father Name:" );
      JLabel l3=new JLabel("Mobile:" );
      JLabel l4=new JLabel("DOB:" );
      JLabel l5=new JLabel("Gender:" );
      JLabel l6=new JLabel("Nationality:" );
      JLabel l7=new JLabel("Cast:" );
      JLabel l8=new JLabel("Address:" );
      JLabel l9=new JLabel("-INFORMATION-" );

      JTextField t1=new JTextField();
      JTextField t2=new JTextField();
      JTextField t3=new JTextField();

      JRadioButton jrb=new JRadioButton("Male");
      JRadioButton jrb1=new JRadioButton("FeMale");
       ButtonGroup gender=new ButtonGroup();
      JRadioButton jrb2=new JRadioButton("Indian");
      JRadioButton jrb3=new JRadioButton("Other");
       ButtonGroup nationality=new ButtonGroup();
      JRadioButton jrb4=new JRadioButton("Hindu");
      JRadioButton jrb5=new JRadioButton("Christian");
      JRadioButton jrb6=new JRadioButton("Muslim");
       ButtonGroup cast=new ButtonGroup();
  
      JTextArea jt=new JTextArea();
      JTextArea jt1=new JTextArea();
      
      JCheckBox jcb=new JCheckBox("I accepts all terms and conditions");

      JButton jb=new JButton("UPDATE");
      JButton jb1=new JButton("SHOW");
      JButton jb2=new JButton("CLEAR");
      Cursor cur=new Cursor(Cursor.HAND_CURSOR);

      JComboBox day;
      JComboBox month;
      JComboBox year;
      
      Container c;
  public RegistrationDemo()
  {
   c=this.getContentPane();
   c.setLayout(null);

   c.setBackground(Color.YELLOW);
   l.setForeground(Color.BLUE);
   jb.setBackground(Color.GREEN);
   jb1.setBackground(Color.GREEN);
   jb2.setBackground(Color.GREEN);
   jcb.setForeground(Color.RED);
   jcb.setBackground(Color.YELLOW);
   l1.setForeground(Color.BLUE);
   l2.setForeground(Color.BLUE);
   l3.setForeground(Color.BLUE);
   l4.setForeground(Color.BLUE);
   l5.setForeground(Color.BLUE);
   l6.setForeground(Color.BLUE);
   l7.setForeground(Color.BLUE);
   l8.setForeground(Color.BLUE);
   l9.setForeground(Color.BLUE);
   jrb.setBackground(Color.YELLOW);
   jrb1.setBackground(Color.YELLOW);
   jrb2.setBackground(Color.YELLOW);
   jrb3.setBackground(Color.YELLOW);
   jrb4.setBackground(Color.YELLOW);
   jrb5.setBackground(Color.YELLOW);
   jrb6.setBackground(Color.YELLOW);
   jt1.setBackground(Color.LIGHT_GRAY);
   jt1.setEditable(false);
   
   
   Font f=new Font("Arial",Font.BOLD,30);
   Font f1=new Font("Arial",Font.BOLD,20);


   String ar[]=new String[31];
       for(int i=1;i<=31;i++)
         ar[i-1]=Integer.toString(i);
    day=new JComboBox(ar);
    String ar1[]=                                      
{"January","February","March","April","May","June","July","August","Septembar","Octobar","Novembar","Decembar"};
    month=new JComboBox(ar1);
   String ar2[]=new String[70];
       for(int i=1950;i<=2019;i++)
         ar2[i-1950]=Integer.toString(i);
    year=new JComboBox(ar2);


   l.setBounds(360,10,350,50);
   l1.setBounds(50,80,150,30);
   l2.setBounds(50,140,150,30);
   l3.setBounds(50,200,150,30);
   l4.setBounds(50,260,150,30);
   l5.setBounds(50,310,150,30);
   l6.setBounds(50,370,150,30);
   l7.setBounds(50,430,150,30);
   l8.setBounds(50,490,150,30);
   l9.setBounds(810,80,200,30);
   t1.setBounds(230,80,200,30);
   t2.setBounds(230,140,200,30);
   t3.setBounds(230,200,200,30);
   day.setBounds(230,260,50,30);
   month.setBounds(300,260,130,30);
   year.setBounds(450,260,80,30);
   jrb.setBounds(230,310,100,30);
   jrb1.setBounds(360,310,100,30);
   jrb2.setBounds(230,370,100,30);
   jrb3.setBounds(360,370,100,30);
   jrb4.setBounds(230,430,100,30);
   jrb5.setBounds(360,430,120,30);
   jrb6.setBounds(490,430,100,30);
   jt.setBounds(230,480,400,100);
   jt1.setBounds(720,110,350,400);
   jcb.setBounds(50,585,360,20);
   jb.setBounds(100,620,150,40);
   jb1.setBounds(300,620,150,40);
   jb2.setBounds(500,620,150,40);


   
   l.setFont(f);
   l1.setFont(f1);
   l2.setFont(f1);
   l3.setFont(f1);
   l4.setFont(f1);
   l5.setFont(f1);
   l6.setFont(f1);
   l7.setFont(f1);
   l8.setFont(f1);
   l9.setFont(f1);
   t1.setFont(f1);
   t2.setFont(f1);
   t3.setFont(f1);
   day.setFont(f1);
   month.setFont(f1);
   year.setFont(f1);
   jrb.setFont(f1);
   jrb1.setFont(f1);
   jrb2.setFont(f1);
   jrb3.setFont(f1);
   jrb4.setFont(f1);
   jrb5.setFont(f1);
   jrb6.setFont(f1);
   jt.setFont(f1);
   jt1.setFont(f1);
   jcb.setFont(f1);
   jb.setFont(f1);
   jb1.setFont(f1);
   jb2.setFont(f1);
  
   
   jb.setCursor(cur);
   jb1.setCursor(cur);
   jb2.setCursor(cur);
  
  
  
   c.add(l);
   c.add(l1);
   c.add(l2);
   c.add(l3);
   c.add(l4);
   c.add(l5);
   c.add(l6);
   c.add(l7);
   c.add(l8);
   c.add(l9);
   c.add(t1);
   c.add(t2);
   c.add(t3);
   c.add(day);
   c.add(month);
   c.add(year);
   c.add(jrb);
   c.add(jrb1);
   c.add(jrb2);
   c.add(jrb3);
   c.add(jrb4);
   c.add(jrb5);
   c.add(jrb6);
   c.add(jt);
   c.add(jt1);
   c.add(jcb);
   c.add(jb);
   c.add(jb1);
   c.add(jb2);
 
   
      
   gender.add(jrb);
   gender.add(jrb1);
   nationality.add(jrb2);
   nationality.add(jrb3);
   cast.add(jrb4);
   cast.add(jrb5);
   cast.add(jrb6);
   
  jb.addActionListener(this);
  jb1.addActionListener(this);
  jb2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) 
  {
   if(e.getSource()==jb)
   {
    if(jcb.isSelected())
    {
      if(t1.getText().length()>=3 && t2.getText().length()>=3 &&                             t3.getText().length()==10 && jt.getText().length()>=5)
       {
         String name=t1.getText();
         String fath_name=t2.getText();
         String moblie=t3.getText();
         String d=(String)day.getSelectedItem();
         String m=(String)month.getSelectedItem();
         String y=(String)year.getSelectedItem();
         String gen="Male"; 
          if(jrb1.isSelected())
         gen="FeMale";
         String nationality="Indian";
         if(jrb3.isSelected())
         nationality="Other";
         String cast1="Hindu";
         if(jrb5.isSelected())
         cast1="Christian";
         if(jrb6.isSelected())
         cast1="Muslim";
         String adrs=jt.getText();
          try{
         FileWriter fw=new FileWriter("g:/Information.doc",false);
         BufferedWriter bf=new BufferedWriter(fw);
         bf.write("Name:"+name+"\n Father Name:"+fath_name+"\n Mobile:"+moblie +"\n DOB:"+d+" "+m+" "+y+"\n Gender:"+gen+"\n Nationality:"+nationality+"\n Cast:"+cast1+"\n Address:"+adrs);
         bf.close();
         }
         catch(IOException ie)
         {   } 
         jt1.setText("\n"+"    UPDATED");
         jt1.setForeground(Color.GREEN);
       }       
       else {
        jt1.setText("Please fill the information correctly!");
        jt1.setForeground(Color.RED); 
        }
     }
     else
     {
      jt1.setText("Please accept terms and conditions!");
      jt1.setForeground(Color.RED);
     }
   }
    if(e.getSource()==jb1)
     {
      if(jcb.isSelected())
       {
         jt1.setText(" ");
         try{
            String s;
           FileReader fr=new FileReader("g:/Information.doc");
           BufferedReader bf=new BufferedReader(fr);
           while((s=bf.readLine())!=null)
           jt1.append(s+"\n");     //over lapping// 
           bf.close();
          }
         catch(IOException ie)
         { }
         jt1.setForeground(Color.BLACK);
       }
     }
       if(e.getSource()==jb2)
      {
       jt1.setText(" ");
      }
  }
}
public class Swing42
{
  public static void main(String h[])
  {
    RegistrationDemo rd= new RegistrationDemo();
    rd.setTitle("Registration Form");
    rd.setVisible(true);
    rd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    rd.setBounds(100,20,1150,700);
    rd.setResizable(false);
   }
}