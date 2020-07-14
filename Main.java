package calcolatrice;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
/**
 * 
 * @author Brugin  CALCOLATRICE
 *
 */
public class Main implements ActionListener {
	private boolean prima;
	private boolean seconda;
	private JLabel primo;
	private JLabel secondo;
	private JLabel ris;
	private double scelta;
	private double ausiliaria;
	private double primon;
	private double secondon;
	private double risultato;
	private JButton sette;
	private JButton otto;
	private JButton nove;
	private JButton quattro;
	private JButton cinque;
	private JButton sei;
	private JButton uno;
	private JButton due;
	private JButton tre;
	private JButton punto;
	private JButton zero;
	private JButton uguale;
	private JButton CE;
	private JButton addizione;
	private JButton sottrazione;
	private JButton moltiplicazione;
	private JButton divisione;
	private JButton radice;
	private JButton potenza;
	private JButton logaritmo;
	private JButton aggiornaprimo;
	private JButton aggiornasecondo;
	private JButton azzeraprimo;
	private JButton azzerasecondo;
	 private String primos="0" ;
	 private String secondos="0";
	public Main() {
		Image imm = Toolkit.getDefaultToolkit().getImage("img/icona.jpg");
		prima=false;
		seconda=false;
		JFrame m=new JFrame();
		m.setIconImage(imm);
		m.setTitle("Brugin Calculator");
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p=new JPanel();
		Container c1=m.getContentPane();
		c1.add(p);
		scelta=-1;
		primon=0;
		secondon=0;
		ausiliaria=-1;
		risultato=0;
		JPanel c=new JPanel();
		JPanel s=new JPanel();
		p.setLayout(new GridLayout(2,1));
		c.setLayout(new GridLayout(3,1));
		p.add(c);
		s.setLayout(new GridLayout(8,3));
		p.add(s);
		primo=new JLabel("0");
		secondo=new JLabel("0");
		ris=new JLabel("0");
		primo.setOpaque(true);
		primo.setBackground(new Color(0,255,255));
		secondo.setOpaque(true);
		secondo.setBackground(new Color(255,255,145));
		ris.setOpaque(true);
		ris.setBackground(new Color(255,140,255));
		c.add(primo);
		c.add(secondo);
		c.add(ris);
		sette=new JButton("7");
		sette.addActionListener(this);
		s.add(sette);
		otto=new JButton("8");
		otto.addActionListener(this);
		s.add(otto);
		nove=new JButton("9");
		nove.addActionListener(this);
		s.add(nove);
		quattro=new JButton("4");
		quattro.addActionListener(this);
		s.add(quattro);
		cinque=new JButton("5");
		cinque.addActionListener(this);
		s.add(cinque);
		sei=new JButton("6");
		sei.addActionListener(this);
		s.add(sei);
		uno=new JButton("1");
		uno.addActionListener(this);
		s.add(uno);
		due=new JButton("2");
		due.addActionListener(this);
		s.add(due);
		tre=new JButton("3");
		tre.addActionListener(this);
		s.add(tre);
		punto=new JButton(".");
		punto.addActionListener(this);
		s.add(punto);
		zero=new JButton("0");
		zero.addActionListener(this);
		s.add(zero);
		uguale=new JButton("=");
		uguale.addActionListener(this);
		s.add(uguale);
		CE=new JButton("CE");
		CE.addActionListener(this);
		s.add(CE);
		addizione=new JButton("+");
		addizione.addActionListener(this);
		s.add(addizione);
		sottrazione=new JButton("-");
		sottrazione.addActionListener(this);
		s.add(sottrazione);
		moltiplicazione=new JButton("*");
		moltiplicazione.addActionListener(this);
		s.add(moltiplicazione);
		divisione=new JButton("/");
		divisione.addActionListener(this);
		s.add(divisione);
		radice=new JButton("Radice");
		radice.addActionListener(this);
		s.add(radice);
		potenza=new JButton("Potenza");
		potenza.addActionListener(this);
		s.add(potenza);
		logaritmo=new JButton("logx(x)");
		logaritmo.addActionListener(this);
		s.add(logaritmo);
		aggiornaprimo=new JButton("aggiorna 1^");
		aggiornaprimo.addActionListener(this);
		s.add(aggiornaprimo);
		aggiornasecondo=new JButton("agggiorna 2^");
		aggiornasecondo.addActionListener(this);
		s.add(aggiornasecondo);
		azzeraprimo=new JButton("azzerra 1^");
		azzeraprimo.addActionListener(this);
		s.add(azzeraprimo);
		azzerasecondo=new JButton("azzera 2^");
		azzerasecondo.addActionListener(this);
		s.add(azzerasecondo);
		m.pack();
		m.setVisible(true);		
	}
	public void actionPerformed(ActionEvent e){
		try{
			
			if(e.getSource()==uno) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("1");
						
					}
					else {
						primo.setText(primo.getText()+"1");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("1");
						
					}
					else {
						secondo.setText(secondo.getText()+"1");
					}
					
				}
				
			}
				
			if(e.getSource()==due) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("2");
						
					}
					else {
						primo.setText(primo.getText()+"2");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("2");
						
					}
					else {
						secondo.setText(secondo.getText()+"2");
					}
					
				}
				
			}
			if(e.getSource()==tre) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("3");
						
					}
					else {
						primo.setText(primo.getText()+"3");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("3");
						
					}
					else {
						secondo.setText(secondo.getText()+"3");
					}
					
				}
				
			}
			if(e.getSource()==quattro) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("4");
						
					}
					else {
						primo.setText(primo.getText()+"4");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("4");
						
					}
					else {
						secondo.setText(secondo.getText()+"4");
					}
					
				}
				
			}
			if(e.getSource()==cinque) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("5");
						
					}
					else {
						primo.setText(primo.getText()+"5");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("5");
						
					}
					else {
						secondo.setText(secondo.getText()+"5");
					}
					
				}
				
			}
			if(e.getSource()==sei) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("6");
						
					}
					else {
						primo.setText(primo.getText()+"6");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("6");
						
					}
					else {
						secondo.setText(secondo.getText()+"6");
					}
					
				}
				
			}
			if(e.getSource()==sette) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("7");
						
					}
					else {
						primo.setText(primo.getText()+"7");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("7");
						
					}
					else {
						secondo.setText(secondo.getText()+"7");
					}
					
				}
				
			}
			if(e.getSource()==otto) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("8");
						
					}
					else {
						primo.setText(primo.getText()+"8");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("8");
						
					}
					else {
						secondo.setText(secondo.getText()+"8");
					}
					
				}
				
			}
			if(e.getSource()==nove) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("9");
						
					}
					else {
						primo.setText(primo.getText()+"9");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("9");
						
					}
					else {
						secondo.setText(secondo.getText()+"9");
					}
					
				}
				
			}
			if(e.getSource()==zero) {
				if(ausiliaria<0) {
					if(primo.getText().equals("0")) {
						primo.setText("0");
						
					}
					else {
						primo.setText(primo.getText()+"0");
					}
				}
				else {
					if(secondo.getText().equals("0")) {
						secondo.setText("0");
						
					}
					else {
						secondo.setText(secondo.getText()+"0");
					}
					
				}
				
			
			}if(e.getSource()==punto) {
				if(ausiliaria<0) {
					if(!prima) {
					primo.setText(primo.getText()+".");
					prima=true;
					}
					}
				else if(ausiliaria>0) {
					if(!seconda) {
						secondo.setText(secondo.getText()+".");
						seconda=true;
					}
				}
				}
			if(e.getSource()==CE) {
				if(ausiliaria<0) {
					if(!(primo.equals("0")))
					{	
						if(primo.getText().length()==1) {
						primo.setText("0");
						
							
					}
					else {
						if(primo.getText().charAt(primo.getText().length()-1)=='.') {
							prima=false;
						}
						primo.setText(primo.getText().substring(0, primo.getText().length()-1));
					}
					}
					
				}
				if(ausiliaria>0) {
					if(!(secondo.equals("0")))
					{	
						if(secondo.getText().length()==1) {
						secondo.setText("0");		
					}
					else {
						if(secondo.getText().charAt(secondo.getText().length()-1)=='.') {
							seconda=false;
						}
						secondo.setText(secondo.getText().substring(0, secondo.getText().length()-1));
					}
					}
					
				}
			}
			if(e.getSource()==addizione) {
				if(ausiliaria==10) {
					if(primo.getText().equals("Math Error")) {
						
					}
					else {
						primo.setText(ris.getText());
						secondo.setText("0");
						ris.setText("0");
						scelta=1;
					}
				}
				else {
						if(primo.getText().equals("Math Error")) {
						
					}
						scelta=1;
						ausiliaria=1;
				}
				
			}
			if(e.getSource()==sottrazione) {
				if(ausiliaria==10) {
					if(primo.getText().equals("Math Error")) {
						
					}
					else {
						primo.setText(ris.getText());
						secondo.setText("0");
						ris.setText("0");
						scelta=2;
					}
				}
				else {
						if(primo.getText().equals("Math Error")) {
						
					}
						scelta=2;
						ausiliaria=1;
				}
				
			}
			if(e.getSource()==moltiplicazione) {
				if(ausiliaria==10) {
					if(primo.getText().equals("Math Error")) {
						
					}
					else {
						primo.setText(ris.getText());
						secondo.setText("0");
						ris.setText("0");
						scelta=3;
					}
				}
				else {
						if(primo.getText().equals("Math Error")) {
						
					}
						scelta=3;
						ausiliaria=1;
				}
				
			}
			if(e.getSource()==divisione) {
				if(ausiliaria==10) {
					if(primo.getText().equals("Math Error")) {
						
					}
					else {
						primo.setText(ris.getText());
						secondo.setText("0");
						ris.setText("0");
						scelta=4;
					}
				}
				else {
						if(primo.getText().equals("Math Error")) {
						
					}
						scelta=4;
						ausiliaria=1;
				}
				
			}
			if(e.getSource()==radice) {
				if(ausiliaria==10) {
					if(primo.getText().equals("Math Error")) {
						
					}
					else {
						primo.setText(ris.getText());
						secondo.setText("0");
						ris.setText("0");
						scelta=5;
					}
				}
				else {
						if(primo.getText().equals("Math Error")) {
						
					}
						scelta=5;
						ausiliaria=1;
				}
				
			}
			if(e.getSource()==potenza) {
				if(ausiliaria==10) {
					if(primo.getText().equals("Math Error")) {
						
					}
					else {
						primo.setText(ris.getText());
						secondo.setText("0");
						ris.setText("0");
						scelta=6;
					}
				}
				else {
						if(primo.getText().equals("Math Error")) {
						
					}
						scelta=6;
						ausiliaria=1;
				}
				
			}
			if(e.getSource()==logaritmo) {
				if(ausiliaria==10) {
					if(primo.getText().equals("Math Error")) {
						
					}
					else {
						primo.setText(ris.getText());
						secondo.setText("0");
						ris.setText("0");
						scelta=7;
					}
				}
				else {
						if(primo.getText().equals("Math Error")) {
						
					}
						scelta=7;
						ausiliaria=1;
				}
				
			}
			if(e.getSource()==azzeraprimo) {
				primo.setText("0");
				ausiliaria=-1;
			}
			if(e.getSource()==azzerasecondo) {
				secondo.setText("0");
				ausiliaria=1;
			}
			if(e.getSource()==aggiornaprimo) {
				ausiliaria=-1;
				//prima=false;
			}
			if(e.getSource()==aggiornasecondo) {
				ausiliaria=1;
			}
			if(e.getSource()==uguale) {
				String el1="";
				String el2="";
				if(primo.getText().charAt(primo.getText().length()-1)=='.')
					 el1=primo.getText().substring(0, primo.getText().length()-1);
				else
					el1=primo.getText();
				if(secondo.getText().charAt(secondo.getText().length()-1)=='.')
					el2=primo.getText().substring(0, secondo.getText().length()-1);
				else
					el2=secondo.getText();
				if(scelta==1) {
					ris.setText(String.valueOf((Double.parseDouble(primo.getText())+Double.parseDouble(secondo.getText()))));
					ausiliaria=10;
				}
				else if(scelta==2) {
					ris.setText(String.valueOf((Double.parseDouble(primo.getText())-Double.parseDouble(secondo.getText()))));
					ausiliaria=10;
				}
				else if(scelta==3) {
					ris.setText(String.valueOf((Double.parseDouble(primo.getText())*Double.parseDouble(secondo.getText()))));
					ausiliaria=10;
				}
				else if(scelta==4) {
					if((Double.parseDouble(primo.getText())==0)&&(Double.parseDouble(secondo.getText())==0)){
						ris.setText("Divisione indeterminatata");
					}
					else if((Double.parseDouble(secondo.getText())==0)){
						ris.setText("Divisione impossibile");
					}
					else{
					ris.setText(String.valueOf((Double.parseDouble(primo.getText())/Double.parseDouble(secondo.getText()))));
					}
					ausiliaria=10;
				}
				else if(scelta==5) {
					if(Double.parseDouble(secondo.getText())==0){
						ris.setText("Radice impossibile");
					}
					else if(Double.parseDouble(primo.getText())==0){
						ris.setText("Radice impossibile");
					}
					else{
						ris.setText(String.valueOf(Math.pow(Double.parseDouble(primo.getText()),1/Double.parseDouble(secondo.getText()))));
					}
					ausiliaria=10;
				}
				else if(scelta==6) {
					ris.setText(String.valueOf(Math.pow(Double.parseDouble(primo.getText()),Double.parseDouble(secondo.getText()))));
					
					ausiliaria=10;
				}
				else if(scelta==7) {
					double m=Double.parseDouble(primo.getText());
					double  k=Double.parseDouble(secondo.getText());
					if((m>0)&&(m!=1)&&(k>0))
						ris.setText(String.valueOf(Math.log10(m)/Math.log10(k)));
					else
						ris.setText("Error");
					ausiliaria=10;
					}
				}
		}
		catch(Exception e1){
			ris.setText("MATH ERROR");
		}
	}
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome in  Brugin calculator, use this calculator with attention and don't put too figures and\n GOOD FUN!!! P.S. LASCIATE QUALCHE DONAZIONE (SOLO PEZZI DA 500)", "Benvenuto", JOptionPane.INFORMATION_MESSAGE);
		new Main();

	}

}
