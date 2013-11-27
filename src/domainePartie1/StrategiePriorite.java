package domainePartie1;

import java.util.ArrayList;

import javax.xml.ws.LogicalMessage;

public class StrategiePriorite extends StrategieGestion
{

	public StrategiePriorite(ArrayList<Urgence> listeUrgence, ArrayList<Urgence> listeUrgenceTraitee)
	{
		super(listeUrgence, listeUrgenceTraitee);
		this.trierListeUrgence();
	}

	// l'urgence actuelle est la premiere de la liste desja tri�e
	public Urgence reqProchaineUrgence() 
	{
		try 
		{
			Urgence uneUrgence = this.reqListeUrgence().get(0);
			this.asgProchaineUrgence(uneUrgence);
		}
		catch (IndexOutOfBoundsException e) 
		{
			System.out.println("il Y a plus d'urgence a traiter  :(");
		}
		
		return this.reqProchaineUrgence();
	}

	 
//	public void traiterUrgenceActuelle() 
//	{
//		if (this.reqListeUrgence().contains(this.reqProchaineUrgence())) 
//		{
//			Urgence urgence = this.reqProchaineUrgence();
//			this.asgProchaineUrgence(urgence);
//			this.traiterUrgenceAtuelle();
//		} 
//		else
//		{
//			System.out.println("il ya plus d'ergence a Traiter");
//		}
//	}

	// une fonction qui trie la liste des urgences pass�e en parametre
	public void trierListeUrgence()
	{
		ArrayList<Urgence> listUrgence = this.reqListeUrgence();
		for (int i = 0; i < listUrgence.size(); ++i) 
		{
			for (int j = i + 1; j < listUrgence.size(); ++j)
			{
				if (listUrgence.get(i).reqPriorite() < listUrgence.get(j).reqPriorite()) 
				{
					Urgence urgenceTemp = listUrgence.get(i);
					listUrgence.set(i, listUrgence.get(j));
					listUrgence.set(j, urgenceTemp);
				}
			}
		}
	}

	// en ajoutant, on ordonne la liste selon la strategie priorit�
	public void ajouterUrgence(Urgence urgenceAajouter) 
	{
		
		ArrayList<Urgence> listTemp = this.reqListeUrgence();
		if(listTemp.isEmpty()){
			listTemp.add(urgenceAajouter);
			
		}
		else{
			int priorite = urgenceAajouter.reqPriorite();
			int debut = 0;
			int size = listTemp.size();
			int fin = size - 1;
			int middle = size/2;
			while(debut != fin){
				if(priorite <= listTemp.get(middle).reqPriorite()){
					fin = middle;
					middle = (debut + fin)/2;
				}
				else{
					debut = middle;
					middle = (debut + fin)/2;
				}
			}
			listTemp.add(debut, urgenceAajouter);
		}
		
	}
	


}
