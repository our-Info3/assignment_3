package gildedrose.inheritance;
//test
public class AgedBrie extends ItemWithBehaviour {
	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		sellIn--;
		
		quality++;
	}
}
