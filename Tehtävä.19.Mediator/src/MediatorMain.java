public class MediatorMain {

	public static void main(String[] args) {
		Mediator m = new Mediator();
		
		Hyppaaja h = new Hyppaaja();
		m.setHyppaaja(h);
		
		Kisasihteeri sihteeri = new Kisasihteeri();
		m.setKisasihteeri(sihteeri);
		
		Mittamies mittamies = new Mittamies();
		m.setMittamies(mittamies);
		
		Tulostaulu taulu = new Tulostaulu();
		m.setTulostaulu(taulu);
		
		for(int i = 0; i < 5; i++) {
			m.setArvostelutuomarit(new Arvostelutuomari());
		}
		
		h.hyppaa();
		System.out.println("\nuusi kierros\n");
		h.hyppaa();
	}

}
