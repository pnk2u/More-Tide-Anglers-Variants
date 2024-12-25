package de.pnku.mtideanglersv;

import de.pnku.mtideanglersv.block.MtavBlocks;
import de.pnku.mtideanglersv.item.MtavDAArrowItems;
import de.pnku.mtideanglersv.item.MtavItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MoreTideAnglersVariants implements ModInitializer {

	public static final String MOD_ID = "mtideanglersv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Boolean isMWeaponVLoaded = false;

	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isModLoaded("mstv-mweaponv")) {
			isMWeaponVLoaded = true;
			LOGGER.info("mWeaponV (MStV+) loaded");
			ResourceManagerHelper.registerBuiltinResourcePack(
					asId("mtideanglersv-mweaponv-compat"),
					FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
					ResourcePackActivationType.ALWAYS_ENABLED
			);
		}
		ResourceManagerHelper.registerBuiltinResourcePack(
				asId("tide-fishable-crate-variants"),
				FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
				ResourcePackActivationType.ALWAYS_ENABLED
		);
		MtavBlocks.registerBlocks();
		MtavItems.registerItems();
		if (isMWeaponVLoaded) {
			MtavDAArrowItems.registerDAArrowItems();
		}
	}

	public static ResourceLocation asId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

}
