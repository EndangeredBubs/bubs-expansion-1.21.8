package net.endangeredbubs.bubsexpansion;

import net.endangeredbubs.bubsexpansion.item.ModItemGroups;
import net.endangeredbubs.bubsexpansion.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubsExpansion implements ModInitializer {
	public static final String MOD_ID = "bubsexpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModItemGroups.initialize();
	}
}