import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorChooser {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JPanel controlPanel;
	public ColorChooser(){prepareGUI();
	}
	
	public static void main(String[] args){
		ColorChooser colorDemo = new ColorChooser();
		colorDemo.showListDemo();
		}
	private void prepareGUI(){mainFrame = new JFrame("Select a color to change backgroud");
	mainFrame.setSize(600,600);
	mainFrame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent windowEvent){
			System.exit(0);
			}
		});
	headerLabel = new JLabel("", JLabel.CENTER);controlPanel = new JPanel();
	controlPanel.setLayout(new FlowLayout());
	mainFrame.add(headerLabel);
	mainFrame.add(controlPanel);
	mainFrame.setVisible(true);
	}
	
	private void showListDemo(){headerLabel.setText("Select a color to change bg");
	final HashMap<String, Color> colorMap = new ColorStore().getAllColors();
	
	final JList jlist = new JList(new Vector(colorMap.keySet()));
	jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	jlist.setSelectedIndex(0);
	jlist.setVisibleRowCount(5);
	JScrollPane listScrollPane = new JScrollPane(jlist);
	jlist.addListSelectionListener((ListSelectionEvent listSelectionEvent)
			-> {
		String selected = (String)jlist.getSelectedValue();
		controlPanel.setBackground(colorMap.get(selected));
		});
	controlPanel.add(listScrollPane);mainFrame.setVisible(true);
	}

			
	}

