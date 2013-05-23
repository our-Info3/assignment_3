package gildedrose.inheritance;

public class AgedBrie extends ItemWithBehaviour {
	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		sellIn--;
		
		quality++;
		

		if(sellIn<=0){
			quality++;
		}
		if(quality>50){
			quality=50;
		}
	}
}
