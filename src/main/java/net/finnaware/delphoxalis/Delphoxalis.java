package net.finnaware.delphoxalis;

import net.fabricmc.api.ModInitializer;

import net.finnaware.delphoxalis.compat.CompatCore;
import net.finnaware.delphoxalis.content.*;
import net.finnaware.delphoxalis.util.FoxTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Delphoxalis implements ModInitializer {
	public static final String MOD_ID = "delphoxalis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CompatCore.register();
		FoxWoodTypes.registerFoxWoodTypes();
		FoxItemGroups.registerFoxGroups();
		FoxItems.registerFoxItems();
		FoxBlocks.registerFoxBlocks();
		FoxFuel.registerFoxFuel();
		FoxFlammableBlocks.registerFoxFlammableBlocks();
		FoxParticles.registerFoxParticles();
		FoxStrippedWood.registerFoxStrippedWood();
		FoxEffects.registerFoxEffects();
        FoxLootTableModifiers.registerFoxLootTableModifiers();
		FoxTags.registerFoxTags();
	}
}
