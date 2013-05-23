package gildedrose.inheritance;

public class Sulfuras extends ItemWithBehaviour {
	public Sulfuras(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		quality=super.getQuality();
	}
}
