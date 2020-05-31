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
	
	String[] cookie = {"Zihin ateþine attýðýn hiçbir odun boþa yanmaz!","Hala yapabiliyorken eðlenmene bak!","Büyük adýmlar atmaktan çekinme","Hiçbir þeyi yarým býrakma!","Zamanýný iyi deðerlendir","Mutlu olman için yapman gerekenleri en iyi sen bilebilirsin","Liderlik özelliklerin kanýtlanmayý bekliyor","Rüyalar anlamsýz deðildir , üzerlerinde düþün...","Saðlýðýnýn kýymetini bil","Harika baþarýlara kucak açman senin elinde","Yeteneklerinin farkýnda ol","Neredeyse baþaracaksýn vazgeçme!","Yaþ bilgelik getirir","Deðiþikliklere Merhaba De..","Önemsediðin insanlara yakýn olmaktan çekinme","Özgürlüðünü kýsýtlama","Kendine daha iyi davran","Belki de fazla odaklanmýþsýndýr ?","Keþfedeceðin çok þey olduðunun farkýndasýn","Doðru tavsiyenin kimden geleceðini bilemezsin","Bir þeyler yapmanýn zamaný gelmedi mi ?","Hayal gücün seni yönlendiriyor","Eðer doðru yöne bakarsan görmen gerekenleri göreceksin","Gördüðün þeylerden ders çýkar","Þans Bulunamadý","Yapmayý istediðin ilk þey , yapman gereken tek þey olacak","Yakýnda þans seni bulacak.." , "Para kaybetmeye hazýr mýsýn?" , "Bir kapý kapandýðýnda diðeri açýlýr","Ýnsanlarýn senden beklentileri var","Yeni bir iþ seni bekliyor","Akýllý bir insanla tanýþmayý bekleyebilirsin","Arkadaþlarýnla eðlenmene bak","Yeni bir baþlangýç seni beklemekte","Altýn yumurtlayan tavuðu gözden kaçýrma!","Hayata bakýþ açýný deðiþtirmende fayda var","Deðiþtiremeyeceðin þeyleri kabullenmeyi öðren","Önemli insanlarýn desteðinden kaçma","Dikkat düzeyini arttýrman gereken günlere girdin","Deðiþiklikler yaþanacak , uyum saðla","Kendine fazladan iþ çýkarma","Yalnýzca düþünme,harekete geç!","Hayatýndaki her gün bulunmaz birer fýrsat","Kaybetmekten korkma","Korkusuz cesaret galibiyetin kaynaðýdýr","Biraz dinlen,bunu hak ettin..."};
	
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
