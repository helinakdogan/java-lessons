package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	//bu classı kullananın default hesapla metodu yok
	//bu classtan extend edilenlerin mutlaka kendine özel hesapla metodunu yazması gerekli, yani override etmek zorunda
	
	
	public final void gameOver() {
		System.out.println("oyun bitti");
	}
	//bu classı kullanan gameOver'ı override edemez, olduğu gibi kullanmak zorunda

}
