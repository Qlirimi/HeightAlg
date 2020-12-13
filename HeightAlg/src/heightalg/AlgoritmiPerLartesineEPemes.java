package heightalg;

class AlgoritmiPerLartesineEPemes 
{ 
	public static void main(String[] args) 
	{ 
		AlgoritmiPerLartesineEPemes pema = new AlgoritmiPerLartesineEPemes(); 
		
		pema.rrenja = new Nyja(1); 
		pema.rrenja.majtas = new Nyja(2); 
		pema.rrenja.djathtas = new Nyja(3); 
		pema.rrenja.majtas.majtas = new Nyja(4); 
		pema.rrenja.majtas.djathtas = new Nyja(5); 
		pema.rrenja.majtas.majtas.majtas=new Nyja(8);

		System.out.println("Lartesia e Pemes eshte: " +  pema.max(pema.rrenja)); 
	} 
	
	Nyja rrenja; 
	int max(Nyja nyja) 
	{ 
		if (nyja == null) 
			return 0; 
		else
		{ 
			/* compute the depth of each subtree */
			int lartesiamajtas = max(nyja.majtas); 
			int lartesiadjathtas = max(nyja.djathtas); 

			
			if (lartesiamajtas > lartesiadjathtas) 
				return (lartesiamajtas + 1); 
			else
				return (lartesiadjathtas + 1); 
		} 
	} 
} 
class Nyja 
{ 
	int data; 
	Nyja majtas, djathtas; 

	Nyja(int item) 
	{ 
		data = item; 
		majtas = djathtas = null; 
	} 
} 



