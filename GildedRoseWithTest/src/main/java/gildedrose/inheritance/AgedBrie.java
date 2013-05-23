package gildedrose.inheritance;
<<<<<<< HEAD

=======
>>>>>>> 8f851de2ea5dec3a0be01d494641c98ce6d09f15
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
