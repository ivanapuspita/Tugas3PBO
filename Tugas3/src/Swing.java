
import java.awt.*;
//import javafx.scene.control.PasswordField;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Swing extends JFrame
{
    JButton tombol1;
    JLabel judul, nama, nim, jk, agama1 , alamat1;
    JTextField text1, text2;
    JRadioButton lk, pr;
    JComboBox agama;
    JTextArea alamat;
    public void cobaSwing()
    {
        setTitle("Coba Swing Java");
        judul= new JLabel("DATA DIRI MAHASISWA");
        nama= new JLabel("Nama");
        nim= new JLabel("NIM");
        jk= new JLabel("Jenis Kelamin");
        agama1= new JLabel("Agama");
        alamat1= new JLabel("Alamat");
        
        text1= new JTextField(" ");
        text2= new JTextField(" ");
        
        lk= new JRadioButton("Laki-laki");
        pr= new JRadioButton("Perempuan");
        
        String[] agm= {"Islam", "Kristen", "Katholik", "Hindu", "Budha"};
        agama= new JComboBox(agm);
        
        alamat= new JTextArea(" ");
        tombol1= new JButton("OK");
        
        setLayout(null);
        add(judul);
        add(nama);
        add(nim);
        add(jk);
        add(agama1);
        add(alamat1);
        add(text1);
        add(text2);
        add(lk);
        add(pr);
        add(agama);
        add(alamat);
        
        add(tombol1);
        
        judul.setBounds(120,20,150,30);
        nama.setBounds(50,60,100,20);
        nim.setBounds(50,100,100,20);
        jk.setBounds(50,140,100,20);
        agama1.setBounds(50,180,100,20);
        alamat1.setBounds(50,220,100,20);
        text1.setBounds(150,60,160,20);
        text2.setBounds(150,100,160,20);
        lk.setBounds(140,140,80,20);
        pr.setBounds(220,140,100,20);
        agama.setBounds(150,180,100,20);
        alamat.setBounds(150,220,160,70);
        tombol1.setBounds(230,320,80,20);
    
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    
}
