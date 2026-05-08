package net.finnaware.delphoxalis;

import net.fabricmc.api.ModInitializer;

import net.finnaware.delphoxalis.block.FoxBlocks;
import net.finnaware.delphoxalis.block.FoxVerticalSlab;
import net.finnaware.delphoxalis.item.FoxFuel;
import net.finnaware.delphoxalis.item.FoxItemGroups;
import net.finnaware.delphoxalis.item.FoxItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Delphoxalis implements ModInitializer {
	public static final String MOD_ID = "delphoxalis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FoxVerticalSlab.registerFoxBlocksClass();
		FoxItemGroups.registerFoxGroups();
		FoxItems.registerFoxItems();
		FoxBlocks.registerFoxBlocks();
		FoxFuel.registerFoxFuel();
	}
}