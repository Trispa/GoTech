package presentation;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import domainePartie1.Simulateur;

import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;

public class ParametrePanel extends JPanel {
	private static Simulateur m_simulateur;
	public ParametrePanel(Simulateur simulateur) {
		m_simulateur = simulateur;
		setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Anciennet\u00E9\n");
		rdbtnNewRadioButton.setToolTipText("Les urgences sont trait\u00E9es par ordre d'anciennet\u00E9");
		rdbtnNewRadioButton.setBounds(26, 72, 166, 23);
		add(rdbtnNewRadioButton);
		
		JLabel lblStratgieDeSimulation = new JLabel("Strat\u00E9gie de simulation");
		lblStratgieDeSimulation.setBounds(16, 44, 145, 16);
		add(lblStratgieDeSimulation);
		
		JRadioButton rdbtnParProximit = new JRadioButton("Proximit\u00E9");
		rdbtnParProximit.setToolTipText("Les urgences sont trait\u00E9es par ordre de proximit\u00E9");
		rdbtnParProximit.setBounds(26, 96, 177, 23);
		add(rdbtnParProximit);
		
		JRadioButton rdbtnCheminMinimum = new JRadioButton("Chemin Minimum");
		rdbtnCheminMinimum.setToolTipText("Les urgences sont trait\u00E9es de sorte \u00E0 reduire le chemin parcouru");
		rdbtnCheminMinimum.setBounds(26, 118, 166, 23);
		add(rdbtnCheminMinimum);
		
		JLabel lblVehiculeDurgence = new JLabel("Vehicule D'urgence");
		lblVehiculeDurgence.setBounds(16, 159, 135, 16);
		add(lblVehiculeDurgence);
		
		JLabel lblVitesseDuVhicule = new JLabel("Vitesse du v\u00E9hicule (Km/h) : ");
		lblVitesseDuVhicule.setBounds(26, 187, 185, 23);
		add(lblVitesseDuVhicule);
		
		JLabel lblParamtresDeSimulation = DefaultComponentFactory.getInstance().createTitle("Param\u00E8tres de simulation");
		lblParamtresDeSimulation.setBounds(6, 6, 174, 16);
		add(lblParamtresDeSimulation);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(210, 188, 93, 19);
		add(formattedTextField);
		
		JCheckBox chckbxVhiculeRetourneAu = new JCheckBox("Retour au point d'attache apr\u00E8s traitement des urgences");
		chckbxVhiculeRetourneAu.setBounds(16, 217, 405, 23);
		add(chckbxVhiculeRetourneAu);
		
		JLabel lblEchelle = new JLabel("Echelle de la carte");
		lblEchelle.setBounds(16, 261, 118, 16);
		add(lblEchelle);
		
		JLabel lblDistanceEntreDeux = new JLabel("Distance entre deux points de la grille (m) :");
		lblDistanceEntreDeux.setBounds(26, 289, 277, 16);
		add(lblDistanceEntreDeux);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(305, 289, 93, 16);
		add(formattedTextField_1);
	}
}
