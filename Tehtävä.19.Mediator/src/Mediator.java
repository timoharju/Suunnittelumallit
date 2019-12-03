import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	private Hyppaaja hyppaaja;
	private Kisasihteeri kisasihteeri;
	private Mittamies mittamies;
	private Tulostaulu tulostaulu;
	private List<Arvostelutuomari> tuomarit;
	
	public Mediator() {
		tuomarit = new ArrayList<>();
	}
	
	
	public void hyppaa() {
		Hyppy h1 = new Hyppy();
		Hyppy h2 = new Hyppy();
		h1.setPituus(mittamies.mittaaPituus());
		h2.setPituus(mittamies.mittaaPituus());
		double tyyliPisteet = tuomarit.stream().mapToInt(Arvostelutuomari::annaPisteet).sum();
		
		h1.setTyylipiste(kisasihteeri.laskePisteet(tyyliPisteet, h1.getPituus()));
		tyyliPisteet = tuomarit.stream().mapToInt(Arvostelutuomari::annaPisteet).sum();
		h2.setTyylipiste(kisasihteeri.laskePisteet(tyyliPisteet, h2.getPituus()));
		hyppaaja.setTulokset(h1, h2);
		
		Tulosrivi rivi1 = new Tulosrivi(h1);
		Tulosrivi rivi2 = new Tulosrivi(h2);
		tulostaulu.setTulos(rivi1);
		tulostaulu.setTulos(rivi2);
		tulostaulu.printTulokset();
	}
	
	public void setHyppaaja(Hyppaaja hyppaaja) {
		this.hyppaaja = hyppaaja;
		hyppaaja.setMediator(this);
	}
	
	public void setMittamies(Mittamies mittamies) {
		this.mittamies = mittamies;
	}
	
	public void setArvostelutuomarit(Arvostelutuomari...tuomarit) {
		for(Arvostelutuomari tuomari : tuomarit) {
			this.tuomarit.add(tuomari);
		}
	}
	
	public void setKisasihteeri(Kisasihteeri sihteeri) {
		kisasihteeri = sihteeri;
	}
	
	public void setTulostaulu(Tulostaulu tulostaulu) {
		this.tulostaulu = tulostaulu;
	}
}
