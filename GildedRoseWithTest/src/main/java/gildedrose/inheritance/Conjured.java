package gildedrose.inheritance;

public class Conjured extends ItemWithBehaviour {
	public Conjured(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		quality -=2;
		if(quality<0){
			quality=0;
		}
		sellIn--;
		if(sellIn<=0){
			quality -=2;
		}
	}
}
