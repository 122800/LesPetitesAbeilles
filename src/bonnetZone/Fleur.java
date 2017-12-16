package bonnetZone;

public class Fleur {
	private int pollen;
	
	public Fleur() {
		pollen = 5;
	}
	
	public Integer getPollen() {
		if(pollen > 0) {
			pollen--;
			return 1;
		} else {
			return 0;
		}
	}
}