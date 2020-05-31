import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JLabel;

public class Downloader {
	
	static JLabel lbl_succes;
	
	private int say = 0;

	private JFrame frmDownloader;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Downloader window = new Downloader();
					window.frmDownloader.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Downloader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDownloader = new JFrame();
		frmDownloader.setTitle("Downloader 1.6.2");
		frmDownloader.setBounds(400, 400, 450, 300);
		frmDownloader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDownloader.getContentPane().setLayout(null);
		
		JProgressBar check_progress = new JProgressBar();
		check_progress.setStringPainted(true);
		check_progress.setBounds(47, 97, 345, 27);
		frmDownloader.getContentPane().add(check_progress);
		
		JButton btnNewButton = new JButton("\u0130ndirme Ba\u015Flat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Timer timer = new Timer(50,null);
				timer.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						say++;
						check_progress.setValue(say);
						
						if(check_progress.getValue() == 100) {
							
							check_progress.setValue(100);
							lbl_succes.setText("Ýndirme Tamamlandý");
							if(say == 115) {
								System.exit(0);
							}
						}

						
					}
				});
			timer.start();
		}
		});
		btnNewButton.setBounds(153, 151, 110, 34);
		frmDownloader.getContentPane().add(btnNewButton);
		
		lbl_succes = new JLabel("");
		lbl_succes.setBounds(76, 25, 301, 27);
		frmDownloader.getContentPane().add(lbl_succes);
	}
}
