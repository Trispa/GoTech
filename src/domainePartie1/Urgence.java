package domainePartie1;
import java.util.Timer;
public class Urgence {
	private  Timer m_heuredebut; 
	private Timer m_duree;
	private Carte.Noeud m_noeudCible;
	private int m_priorite; // de 0 a 5
	
	public Urgence()
	{
	
	}
	public Urgence(Carte.Noeud p_NoeudCible, int p_priorit�)
	{
		this.m_noeudCible = p_NoeudCible;
		this.m_priorite = p_priorit�;
		
	}
	public Timer reqDuree()
	{
		return this.m_duree;
	}
	
	public Timer reqHeureDebut()
	{
		return this.m_heuredebut;
	}
	
	public int reqPriorite()
	{
		return this.m_priorite;
	}
	
	public Carte.Noeud reqNoeudCible()
	{
		return this.m_noeudCible;
	}
}
