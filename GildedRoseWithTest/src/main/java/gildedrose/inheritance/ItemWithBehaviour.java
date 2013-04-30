package gildedrose.inheritance;

import gildedrose.original.Item;

/**
 * @author kleinen
 *
 */
public class ItemWithBehaviour extends Item{
    
    public ItemWithBehaviour(String name, int sellIn, int quality) {
    	super(name,sellIn,quality);
	}
    

	public void updateQuality(){
		 sellIn--;
		 if (sellIn < 0)
			 quality -= 2;
		 else
		 quality--;
	}
}
