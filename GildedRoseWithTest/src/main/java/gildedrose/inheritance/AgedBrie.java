package gildedrose.inheritance;
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 8f851de2ea5dec3a0be01d494641c98ce6d09f15
>>>>>>> 2e7142b5f98a8ac26b4344d48400192ed1bebbb5
public class AgedBrie extends ItemWithBehaviour {
	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateQuality() {
		sellIn--;
		
		quality++;
	}
}
