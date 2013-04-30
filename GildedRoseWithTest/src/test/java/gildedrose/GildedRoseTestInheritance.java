package gildedrose;

import gildedrose.inheritance.AgedBrie;
import gildedrose.inheritance.ItemWithBehaviour;
import gildedrose.inheritance.GildedRose;
import gildedrose.original.Item;

import java.util.List;

public class GildedRoseTestInheritance extends
		GildedRoseTest {

	public GildedRoseTestInheritance(String message, String itemName,
			int sellIn, int quality, int expectedSellIn, int expectedQuality) {
		super(message, itemName, sellIn, quality, expectedSellIn, expectedQuality);
		
	}


	@Override
	public ItemWithBehaviour createItem(String name, int sellIn, int quality) {
		if (name.contains("Aged Brie"))
			return new AgedBrie(name,sellIn,quality);
		return new ItemWithBehaviour(name,sellIn,quality);
	}

	@Override
	public void setItems(List<Item> items) {
		GildedRose.setItems(items);
	}
	@Override
	public void callUpdateQuality() {
		GildedRose.updateQuality();
	}
	
}
