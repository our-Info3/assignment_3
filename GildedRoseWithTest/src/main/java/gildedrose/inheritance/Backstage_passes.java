package gildedrose.inheritance;

public class Backstage_passes extends ItemWithBehaviour {
	public Backstage_passes(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		sellIn--;
		
		if(sellIn>=10){
			quality++;
		}
		if(sellIn<10 && sellIn>=5){
			quality += 2;
		}
		if (sellIn<5){
			quality += 3;
		}
		if(quality>50){
			quality=50;
		}
		if(sellIn<0){
			quality=0;
		}
	}
}
