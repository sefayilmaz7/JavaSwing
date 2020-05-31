import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.Timer;

public class cookie {
	
	
	
	int sayac = 0;
	
	String[] cookie = {"Zihin ate�ine att���n hi�bir odun bo�a yanmaz!","Hala yapabiliyorken e�lenmene bak!","B�y�k ad�mlar atmaktan �ekinme","Hi�bir �eyi yar�m b�rakma!","Zaman�n� iyi de�erlendir","Mutlu olman i�in yapman gerekenleri en iyi sen bilebilirsin","Liderlik �zelliklerin kan�tlanmay� bekliyor","R�yalar anlams�z de�ildir , �zerlerinde d���n...","Sa�l���n�n k�ymetini bil","Harika ba�ar�lara kucak a�man senin elinde","Yeteneklerinin fark�nda ol","Neredeyse ba�aracaks�n vazge�me!","Ya� bilgelik getirir","De�i�ikliklere Merhaba De..","�nemsedi�in insanlara yak�n olmaktan �ekinme","�zg�rl���n� k�s�tlama","Kendine daha iyi davran","Belki de fazla odaklanm��s�nd�r ?","Ke�fedece�in �ok �ey oldu�unun fark�ndas�n","Do�ru tavsiyenin kimden gelece�ini bilemezsin","Bir �eyler yapman�n zaman� gelmedi mi ?","Hayal g�c�n seni y�nlendiriyor","E�er do�ru y�ne bakarsan g�rmen gerekenleri g�receksin","G�rd���n �eylerden ders ��kar","�ans Bulunamad�","Yapmay� istedi�in ilk �ey , yapman gereken tek �ey olacak","Yak�nda �ans seni bulacak.." , "Para kaybetmeye haz�r m�s�n?" , "Bir kap� kapand���nda di�eri a��l�r","�nsanlar�n senden beklentileri var","Yeni bir i� seni bekliyor","Ak�ll� bir insanla tan��may� bekleyebilirsin","Arkada�lar�nla e�lenmene bak","Yeni bir ba�lang�� seni beklemekte","Alt�n yumurtlayan tavu�u g�zden ka��rma!","Hayata bak�� a��n� de�i�tirmende fayda var","De�i�tiremeyece�in �eyleri kabullenmeyi ��ren","�nemli insanlar�n deste�inden ka�ma","Dikkat d�zeyini artt�rman gereken g�nlere girdin","De�i�iklikler ya�anacak , uyum sa�la","Kendine fazladan i� ��karma","Yaln�zca d���nme,harekete ge�!","Hayat�ndaki her g�n bulunmaz birer f�rsat","Kaybetmekten korkma","Korkusuz cesaret galibiyetin kayna��d�r","Biraz dinlen,bunu hak ettin..."};
	
	static JLabel lbl_sonuc;

	private JProgressBar progressBar;
	private JFrame frmansKurabiyesi;
	private JTextField tf_isim;
	private JLabel lbl_wait;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cookie window = new cookie();
					window.frmansKurabiyesi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public cookie() {
		initialize();
	}

	private void initialize() {
		frmansKurabiyesi = new JFrame();
		frmansKurabiyesi.setTitle("\u015Eans Kurabiyesi");
		frmansKurabiyesi.setResizable(false);
		frmansKurabiyesi.getContentPane().setBackground(Color.BLACK);
		frmansKurabiyesi.setBounds(100, 100, 700, 700);
		frmansKurabiyesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmansKurabiyesi.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u015EANS KURAB\u0130YES\u0130");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 65));
		lblNewLabel.setBounds(46, -38, 605, 251);
		frmansKurabiyesi.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("A\u00C7");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Random random = new Random();
				int msg = random.nextInt(46);
				Timer timer = new Timer(50,null);
				timer.start();
				timer.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						lbl_wait.setVisible(true);
						sayac++;
						progressBar.setValue(sayac);
						if(progressBar.getValue()== 100) {
							
							//progressBar.setForeground(Color.GREEN);
							String isim = tf_isim.getText();
							lbl_sonuc.setText(isim + " " + cookie[msg]);
							lbl_wait.setVisible(false);
							tf_isim.setEditable(false);
							if(sayac == 200) {
								System.exit(0);
							}
						}
					}
				});		
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(242, 316, 189, 70);
		frmansKurabiyesi.getContentPane().add(btnNewButton);
		
		lbl_sonuc = new JLabel("");
		lbl_sonuc.setForeground(Color.WHITE);
		lbl_sonuc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_sonuc.setBounds(116, 482, 633, 82);
		frmansKurabiyesi.getContentPane().add(lbl_sonuc);
		
		JLabel lblNewLabel_1 = new JLabel("\u0130sminiz:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(134, 195, 105, 50);
		frmansKurabiyesi.getContentPane().add(lblNewLabel_1);
		
		tf_isim = new JTextField();
		tf_isim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_isim.setBounds(221, 195, 238, 46);
		frmansKurabiyesi.getContentPane().add(tf_isim);
		tf_isim.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("designedby: sefayilmaz");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(547, 634, 159, 26);
		frmansKurabiyesi.getContentPane().add(lblNewLabel_2);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(Color.BLACK);
		progressBar.setBackground(Color.WHITE);
		progressBar.setStringPainted(true);
		progressBar.setBounds(221, 256, 238, 26);
		frmansKurabiyesi.getContentPane().add(progressBar);
		
		lbl_wait = new JLabel("             Kurabiyeniz A\u00E7\u0131l\u0131yor...");
		lbl_wait.setForeground(Color.WHITE);
		lbl_wait.setBounds(242, 397, 189, 25);
		frmansKurabiyesi.getContentPane().add(lbl_wait);
		lbl_wait.setVisible(false);
	}
}
