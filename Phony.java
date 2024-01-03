import java.util.*;
import java.awt.event.*;
import javax.swing.*;

class Main 
{
    
    String s="";
    int t=0;
    JFrame jframe;
    JButton jbutton1,jbutton2,jbutton3,jbutton4,jbutton5,jbutton6,jbutton7,jbutton8,jbutton9,jbutton10,jbutton11,jbutton12;
    JLabel jlanel;
    JTextArea jtextarea;
    Main()
    {
        
        jframe=new JFrame("PHONY");
        jtextarea=new JTextArea("");
        jtextarea.setBounds(0,0,420,100);
        jbutton1=new JButton("1");
        jbutton1.setBounds(0,100,140,100);
        jbutton2=new JButton("2");
        jbutton2.setBounds(140,100,140,100);
        jbutton3=new JButton("3");
        jbutton3.setBounds(280,100,140,100);
        jbutton4=new JButton("4");
        jbutton4.setBounds(0,200,140,100);
        jbutton5=new JButton("5");
        jbutton5.setBounds(140,200,140,100);
        jbutton6=new JButton("6");
        jbutton6.setBounds(280,200,140,100);
        jbutton7=new JButton("7");
        jbutton7.setBounds(0,300,140,100);
        jbutton8=new JButton("8");
        jbutton8.setBounds(140,300,140,100);
        jbutton9=new JButton("9");
        jbutton9.setBounds(280,300,140,100);
        jbutton10=new JButton("0");
        jbutton10.setBounds(140,400,140,100);
        jbutton11=new JButton("CALL");
        jbutton11.setBounds(280,400,140,100);
        jbutton12=new JButton("CLEAR");
        jbutton12.setBounds(0,400,140,100);
        
        jbutton1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"1";
                jtextarea.setText(s);
            }
        }
        );
        jbutton2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"2";
                jtextarea.setText(s);
            }
        }
        );
        jbutton3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"3";
                jtextarea.setText(s);
            }
        }
        );
        jbutton4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"4";
                jtextarea.setText(s);
            }
        }
        );
        jbutton5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"5";
                jtextarea.setText(s);
            }
        }
        );
        jbutton6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"6";
                jtextarea.setText(s);
            }
        }
        );
        jbutton7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"7";
                jtextarea.setText(s);
            }
        }
        );
        jbutton8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"8";
                jtextarea.setText(s);
            }
        }
        );
        jbutton9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"9";
                jtextarea.setText(s);
            }
        }
        );
        jbutton10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s=s+"0";
                jtextarea.setText(s);
            }
        }
        );
        
        jbutton11.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Main obj=Main.this;
                t+=1;
                jtextarea.setText(s);
                obj.call(s);
                obj.hangup();
                
                
            }
        }
        );
        jbutton12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                s="";
                jtextarea.setText(s);
            }
        }
        );
        jframe.add(jtextarea);
        jframe.add(jbutton1);
        jframe.add(jbutton2);
        jframe.add(jbutton3);
        jframe.add(jbutton4);
        jframe.add(jbutton5);
        jframe.add(jbutton6);
        jframe.add(jbutton7);
        jframe.add(jbutton8);
        jframe.add(jbutton9);
        jframe.add(jbutton10);
        jframe.add(jbutton11);
        jframe.add(jbutton12);
        jframe.setSize(430,530);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void call(String phoneNumber)
    {
        if(t==1)
                jbutton11.setText("Hang up");
    } 
    public void hangup()
    {
        if(t==2)
                {
                    t=0;
                    s="";
                    jbutton11.setText("Call");
                    jtextarea.setText(s);
                }
    }
    

}
public class Phony extends Main
{
    public static void main(String args[])
    {
        Main obj=new Main();
    }
}
