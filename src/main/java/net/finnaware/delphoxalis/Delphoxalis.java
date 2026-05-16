package net.finnaware.delphoxalis;

import net.fabricmc.api.ModInitializer;

import net.finnaware.delphoxalis.compat.CompatCore;
import net.finnaware.delphoxalis.content.FoxFlammableBlocks;
import net.finnaware.delphoxalis.content.FoxBlocks;
import net.finnaware.delphoxalis.content.FoxStrippedWood;
import net.finnaware.delphoxalis.content.FoxEffects;
import net.finnaware.delphoxalis.content.FoxFuel;
import net.finnaware.delphoxalis.content.FoxItemGroups;
import net.finnaware.delphoxalis.content.FoxItems;
import net.finnaware.delphoxalis.content.FoxParticles;
import net.finnaware.delphoxalis.util.FoxTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Delphoxalis implements ModInitializer {
	public static final String MOD_ID = "delphoxalis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CompatCore.register();
		FoxItemGroups.registerFoxGroups();
		FoxItems.registerFoxItems();
		FoxBlocks.registerFoxBlocks();
		FoxFuel.registerFoxFuel();
		FoxFlammableBlocks.registerFoxFlammableBlocks();
		FoxParticles.registerFoxParticles();
		FoxStrippedWood.registerFoxStrippedWood();
		FoxEffects.registerFoxEffects();
		FoxTags.registerFoxTags();
	}
}
