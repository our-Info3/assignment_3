package gildedrose;

import static org.junit.Assert.assertEquals;
import gildedrose.original.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// original version

/**
 * This is a parameterized Version of the Gilded Rose Characterization Test. It
 * allows for easier switching between the different implementations.
 * http://junit.sourceforge.net/javadoc/org/junit/runners/Parameterized.html
 * to activate the tests for the new feature - conjured items - set 
 * INCLUDE_CONJURED_TEST_CASES to true.
 * 
 * @author kleinen
 * 
 */
@RunWith(Parameterized.class)
public abstract class GildedRoseTest {
	public static final boolean INCLUDE_CONJURED_TEST_CASES = true;

	@Parameters
	public static Collection<Object[]> data() {
		
		
		//Collection<Object[]> data = Arrays.asList
				
				Collection<Object[]> data = new ArrayList<Object[]>();
				data.addAll(Arrays.asList
		(new Object[][] {
						{
								"At the end of each day our system lowers both values for every item",
								"any name", 5, 49, 4, 48 },

						{
								"Once the sell by date has passed, Quality degrades twice as fast",
								"any name", 0, 40, -1, 38 },

						{ "The Quality of an item is never negative",
								"anything", 5, 0, 4, 0 },
						{ "qualityOfItemShouldNeverBeNegativeEvenAfterSellin",
								"", -5, 0, -6, 0 },
						{
								"\"Aged Brie\" actually increases in Quality the older it gets",
								"Aged Brie", 2, 10, 1, 11 },
						{
								"\"Aged Brie\" actually increases in Quality the older it gets + The Quality of an item is never more than 50",
								"Aged Brie", 2, 50, 1, 50 },

						{
								"\"Aged Brie\" actually increases in Quality twice as fast after the sellin date",
								"Aged Brie", -2, 10, -3, 12 },
						{
								"\"Aged Brie\" actually increases in Qualitytwice as fast after the sellin date + The Quality of an item is never more than 50",
								"Aged Brie", -2, 50, -3, 50 },

						{
								"- The Quality of an item is never more than 50 TBD: This does not work in the original version!",
								"", 5, 55, 4, 54 },
						{
								"- \"Sulfuras\", I being a legendary item, never has to be sold or decreases in Quality",
								"Sulfuras, Hand of Ragnaros", 0, 80, 0, 80 },
						{ "- \"Sulfuras\", sellIn stays even if negative",
								"Sulfuras, Hand of Ragnaros", -5, 80, -5, 80 },

						{
								"\"Backstage passes\", like aged brie, increases in Quality as it's SellIn approaches;",
								"Backstage passes to a TAFKAL80ETC concert",
								15, 20, 14, 21 },
						{
								"\"Backstage passes\", like aged brie, increases in Quality as it's SellIn approaches; also limited to 50",
								"Backstage passes to a TAFKAL80ETC concert",
								15, 50, 14, 50 },

						{
								"\"Backstage passes\", Quality increases by 2 when there are 10 days or less",
								"Backstage passes to a TAFKAL80ETC concert",
								10, 20, 9, 22 },
						{
								"\"Backstage passes\", Quality increases by 2 when there are 10 days or less - limit 50",
								"Backstage passes to a TAFKAL80ETC concert",
								10, 50, 9, 50 },

						{
								"\"Backstage passes\", Quality increases by 2 when there are 10 days or less - 9 days",
								"Backstage passes to a TAFKAL80ETC concert", 9,
								20, 8, 22 },
						{
								"\"Backstage passes\", Quality increases by 2 when there are 10 days or less - limit 50 - 9 days",
								"Backstage passes to a TAFKAL80ETC concert", 9,
								50, 8, 50 },

						{
								"\"Backstage passes\", Quality increases by 2 when there are 10 days or less - 11 days",
								"Backstage passes to a TAFKAL80ETC concert",
								11, 20, 10, 21 },
						{
								"\"Backstage passes\", Quality increases by 2 when there are 10 days or less - limit 50 - 11 days",
								"Backstage passes to a TAFKAL80ETC concert",
								11, 50, 10, 50 },

						{
								"\"Backstage passes\", Quality increases by 3 when there are 5 days",
								"Backstage passes to a TAFKAL80ETC concert", 5,
								20, 4, 23 },
						{
								"\"Backstage passes\", Quality increases by 3 when there are 5 days or less - limit 50",
								"Backstage passes to a TAFKAL80ETC concert", 5,
								50, 4, 50 },

						{
								"\"Backstage passes\", Quality increases by 3 when there are 5 days - grenzwert 6 ",
								"Backstage passes to a TAFKAL80ETC concert", 6,
								20, 5, 22 },

						{
								"\"Backstage passes\", Quality increases by 3 when there are 5 days - grenzwert 4",
								"Backstage passes to a TAFKAL80ETC concert", 4,
								20, 3, 23 },

						{
								"\"Backstage passes\", Quality drops to 0 after the concert",
								"Backstage passes to a TAFKAL80ETC concert", 0,
								20, -1, 0 }

				}));
		if (INCLUDE_CONJURED_TEST_CASES) {
			data.addAll(conjuredTestData());
		}
		return data;
	}

	public static Collection<Object[]> conjuredTestData() {

		return Arrays
				.asList(new Object[][] {
						{ "\"Conjured\" items have a lowest quality of 0",
								"Conjured mana cake", 5, 0, 4, 0 },
						{
								"\"Conjured\" items degrade in Quality twice as fast as normal items",
								"Conjured mana cake", 5, 49, 4, 47 },
						{
								"\"Conjured\" items degrade in Quality twice as fast as normal items - after sell in",
								"Conjured mana cake", -5, 49, -6, 45 } });
	}

	String message;
	String itemName;
	int sellIn;
	int quality;
	int expectedSellIn;
	int expectedQuality;

	public GildedRoseTest(String message, String itemName, int sellIn,
			int quality, int expectedSellIn, int expectedQuality) {
		this.message = message;
		this.itemName = itemName;
		this.sellIn = sellIn;
		this.quality = quality;
		this.expectedSellIn = expectedSellIn;
		this.expectedQuality = expectedQuality;
	}

	/*
	 * hook methods to be overwritten by subclasses
	 */
	public Item createItem(String name, int sellIn, int quality) {
		quality = checkQuality(quality);
		return new Item(name, sellIn, quality);
	}

	abstract public void setItems(List<Item> items);

	abstract public void callUpdateQuality();

	@Test
	public void test() {
		Item item = createItem(itemName, sellIn, quality);
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		setItems(items);

		callUpdateQuality();
		// 2 assertions per test case - but this should never fail, as the logic for sellIn is quite simple,
		// and keeping it in the same test case makes the tests much more concise.
		assertEquals(message + " (SellIn)", expectedSellIn, item.getSellIn());
		// the main assertion
		assertEquals(message + " (Quality)", expectedQuality, item.getQuality());
	}
	
	public int checkQuality(int quality){
		if (quality > 50){
			return 50;
		}else{
			return quality;
		}
	}

}
