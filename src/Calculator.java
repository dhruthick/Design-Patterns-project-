import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Calculator {
	DistanceDetails details=new DistanceDetails();
	JFrame frame;
	JPanel distancepanel1,distancepanel2,distancepanel3,
	astropanel1,astropanel2,astropanel3,
	atomicpanel1,atomicpanel2,atomicpanel3;
	JComboBox<String> tfrom,tto,afrom,ato,pfrom,pto;
	JTextArea fvalue,tvalue,favalue,tavalue,fpvalue,tpvalue;
	JButton dconvert,aconvert,pconvert;
	public void init() {
		frame=new JFrame("Calculator");
		frame.setVisible(true);
		frame.setLayout(new GridLayout(0,1));
		Calculator calculator=this;
		frame.setSize(800, 200);
		distancepanel1=new JPanel();
		distancepanel1.add(new JLabel("Distance",JLabel.CENTER));
		distancepanel1.setLayout(new FlowLayout());
		frame.add(distancepanel1);
		distancepanel2=new JPanel();
		distancepanel2.setLayout(new FlowLayout());
		tfrom=new JComboBox<String>(details.general);
		tto=new JComboBox<String>(details.general);
		distancepanel2.add(new JLabel("From",JLabel.CENTER));
		distancepanel2.add(tfrom);
		distancepanel2.add(new JLabel("To",JLabel.CENTER));
		distancepanel2.add(tto);
		frame.add(distancepanel2);
		distancepanel3=new JPanel();
		distancepanel3.setLayout(new FlowLayout());
		fvalue=new JTextArea(3,20);
		distancepanel3.add(fvalue);
		tvalue=new JTextArea(3,20);
		distancepanel3.add(tvalue);
		dconvert=new JButton("Convert");
		distancepanel3.add(dconvert);
		frame.add(distancepanel3);
		dconvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new ConvertDistance(calculator));
            }
        });
		astropanel1=new JPanel();
		astropanel1.add(new JLabel("Astronomical Distance",JLabel.CENTER));
		astropanel1.setLayout(new FlowLayout());
		frame.add(astropanel1);
		astropanel2=new JPanel();
		astropanel2.setLayout(new FlowLayout());
		afrom=new JComboBox<String>(details.astronomical);
		ato=new JComboBox<String>(details.astronomical);
		astropanel2.add(new JLabel("From",JLabel.CENTER));
		astropanel2.add(afrom);
		astropanel2.add(new JLabel("To",JLabel.CENTER));
		astropanel2.add(ato);
		frame.add(astropanel2);
		astropanel3=new JPanel();
		astropanel3.setLayout(new FlowLayout());
		favalue=new JTextArea(3,20);
		astropanel3.add(favalue);
		tavalue=new JTextArea(3,20);
		astropanel3.add(tavalue);
		aconvert=new JButton("Convert");
		astropanel3.add(aconvert);
		frame.add(astropanel3);
		aconvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new ConvertAstro(calculator));
            }
        });
		atomicpanel1=new JPanel();
		atomicpanel1.add(new JLabel("Atomic Distance",JLabel.CENTER));
		atomicpanel1.setLayout(new FlowLayout());
		frame.add(atomicpanel1);
		atomicpanel2=new JPanel();
		atomicpanel2.setLayout(new FlowLayout());
		pfrom=new JComboBox<String>(details.atomic);
		pto=new JComboBox<String>(details.atomic);
		atomicpanel2.add(new JLabel("From",JLabel.CENTER));
		atomicpanel2.add(pfrom);
		atomicpanel2.add(new JLabel("To",JLabel.CENTER));
		atomicpanel2.add(pto);
		frame.add(atomicpanel2);
		atomicpanel3=new JPanel();
		atomicpanel3.setLayout(new FlowLayout());
		fpvalue=new JTextArea(3,20);
		atomicpanel3.add(fpvalue);
		tpvalue=new JTextArea(3,20);
		atomicpanel3.add(tpvalue);
		pconvert=new JButton("Convert");
		atomicpanel3.add(pconvert);
		frame.add(atomicpanel3);
		pconvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new ConvertAtomic(calculator));
            }
        });
	}
	private void executeCommand(Command command) {
		if(command.execute()) {
			System.out.println("Success");
		}
	}
}
