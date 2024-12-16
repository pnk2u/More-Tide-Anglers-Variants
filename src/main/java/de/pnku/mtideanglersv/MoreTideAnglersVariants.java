package de.pnku.mtideanglersv;

import de.pnku.mtideanglersv.block.MtavBlocks;
import de.pnku.mtideanglersv.item.MtavItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MoreTideAnglersVariants implements ModInitializer {

	public static final String MOD_ID = "mtideanglersv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MtavBlocks.registerBlocks();
		MtavItems.registerItems();
	}

	public static ResourceLocation asId(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

}
