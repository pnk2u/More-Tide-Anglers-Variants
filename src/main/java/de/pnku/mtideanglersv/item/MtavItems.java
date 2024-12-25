package de.pnku.mtideanglersv.item;

import com.li64.tide.Tide;
import com.li64.tide.registries.TideItems;
import com.li64.tide.registries.items.DeepAquaArrowItem;
import de.pnku.mstv_base.item.MoreStickVariantItem;
import de.pnku.mtideanglersv.MoreTideAnglersVariants;
import de.pnku.mtideanglersv.block.MtavBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.mstv_base.item.MoreStickVariantItems.*;
import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.more_weapon_sticks;
import static de.pnku.mtideanglersv.MoreTideAnglersVariants.isMWeaponVLoaded;
import static de.pnku.mtideanglersv.block.MtavBlocks.*;
import static net.minecraft.core.registries.BuiltInRegistries.CREATIVE_MODE_TAB;

public class MtavItems {
    public static final Item SPRUCE_CRATE_I = new BlockItem(MtavBlocks.SPRUCE_CRATE, new Item.Properties());
    public static final Item BIRCH_CRATE_I = new BlockItem(MtavBlocks.BIRCH_CRATE, new Item.Properties());
    public static final Item JUNGLE_CRATE_I = new BlockItem(MtavBlocks.JUNGLE_CRATE, new Item.Properties());
    public static final Item ACACIA_CRATE_I = new BlockItem(MtavBlocks.ACACIA_CRATE, new Item.Properties());
    public static final Item DARK_OAK_CRATE_I = new BlockItem(MtavBlocks.DARK_OAK_CRATE, new Item.Properties());
    // public static final Item PALE_OAK_CRATE_I = new BlockItem(MtavBlocks.PALE_OAK_CRATE, new Item.Properties());
    public static final Item MANGROVE_CRATE_I = new BlockItem(MtavBlocks.MANGROVE_CRATE, new Item.Properties());
    public static final Item CHERRY_CRATE_I = new BlockItem(MtavBlocks.CHERRY_CRATE, new Item.Properties());
    public static final Item BAMBOO_CRATE_I = new BlockItem(MtavBlocks.BAMBOO_CRATE, new Item.Properties());
    public static final Item CRIMSON_CRATE_I = new BlockItem(MtavBlocks.CRIMSON_CRATE, new Item.Properties().fireResistant());
    public static final Item WARPED_CRATE_I = new BlockItem(MtavBlocks.WARPED_CRATE, new Item.Properties().fireResistant());

    public static final Item SPRUCE_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.SPRUCE_ANGLER_WORKSHOP, new Item.Properties());
    public static final Item BIRCH_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.BIRCH_ANGLER_WORKSHOP, new Item.Properties());
    public static final Item JUNGLE_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.JUNGLE_ANGLER_WORKSHOP, new Item.Properties());
    public static final Item ACACIA_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.ACACIA_ANGLER_WORKSHOP, new Item.Properties());
    public static final Item DARK_OAK_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.DARK_OAK_ANGLER_WORKSHOP, new Item.Properties());
    // public static final Item PALE_OAK_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.PALE_OAK_ANGLER_WORKSHOP, new Item.Properties());
    public static final Item MANGROVE_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.MANGROVE_ANGLER_WORKSHOP, new Item.Properties());
    public static final Item CHERRY_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.CHERRY_ANGLER_WORKSHOP, new Item.Properties());
    public static final Item BAMBOO_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.BAMBOO_ANGLER_WORKSHOP, new Item.Properties());
    public static final Item CRIMSON_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.CRIMSON_ANGLER_WORKSHOP, new Item.Properties().fireResistant());
    public static final Item WARPED_ANGLER_WORKSHOP_I = new BlockItem(MtavBlocks.WARPED_ANGLER_WORKSHOP, new Item.Properties().fireResistant());



    public static void registerItems() {
        registerCrateItem(SPRUCE_CRATE_I, TideItems.SURFACE_LOOT_CRATE);
        registerCrateItem(BIRCH_CRATE_I, SPRUCE_CRATE_I);
        registerCrateItem(JUNGLE_CRATE_I, BIRCH_CRATE_I);
        registerCrateItem(ACACIA_CRATE_I, JUNGLE_CRATE_I);
        registerCrateItem(DARK_OAK_CRATE_I, ACACIA_CRATE_I);
        registerCrateItem(MANGROVE_CRATE_I, DARK_OAK_CRATE_I);
        registerCrateItem(CHERRY_CRATE_I, MANGROVE_CRATE_I);
        registerCrateItem(BAMBOO_CRATE_I, CHERRY_CRATE_I);
        registerCrateItem(CRIMSON_CRATE_I, BAMBOO_CRATE_I);
        registerCrateItem(WARPED_CRATE_I, CRIMSON_CRATE_I);

        registerAnglerWorkshopItem(SPRUCE_ANGLER_WORKSHOP_I, TideItems.ANGLER_WORKSHOP);
        registerAnglerWorkshopItem(BIRCH_ANGLER_WORKSHOP_I, SPRUCE_ANGLER_WORKSHOP_I);
        registerAnglerWorkshopItem(JUNGLE_ANGLER_WORKSHOP_I, BIRCH_ANGLER_WORKSHOP_I);
        registerAnglerWorkshopItem(ACACIA_ANGLER_WORKSHOP_I, JUNGLE_ANGLER_WORKSHOP_I);
        registerAnglerWorkshopItem(DARK_OAK_ANGLER_WORKSHOP_I, ACACIA_ANGLER_WORKSHOP_I);
        registerAnglerWorkshopItem(MANGROVE_ANGLER_WORKSHOP_I, DARK_OAK_ANGLER_WORKSHOP_I);
        registerAnglerWorkshopItem(CHERRY_ANGLER_WORKSHOP_I, MANGROVE_ANGLER_WORKSHOP_I);
        registerAnglerWorkshopItem(BAMBOO_ANGLER_WORKSHOP_I, CHERRY_ANGLER_WORKSHOP_I);
        registerAnglerWorkshopItem(CRIMSON_ANGLER_WORKSHOP_I, BAMBOO_ANGLER_WORKSHOP_I);
        registerAnglerWorkshopItem(WARPED_ANGLER_WORKSHOP_I, CRIMSON_ANGLER_WORKSHOP_I);

    }

    private static void registerCrateItem(Item crate, Item crateAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreTideAnglersVariants.asId((more_crate_wood_types.get(((BlockItem) crate).getBlock()) + "_loot_crate")), crate);

        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(CREATIVE_MODE_TAB.key(), Tide.resource("tide"))).register(entries -> entries.addAfter(crateAfter, crate));
    }

    private static void registerAnglerWorkshopItem(Item anglerWorkshop, Item anglerWorkshopAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreTideAnglersVariants.asId((more_angler_workshop_wood_types.get(((BlockItem) anglerWorkshop).getBlock()) + "_angler_workshop")), anglerWorkshop);

        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(CREATIVE_MODE_TAB.key(), Tide.resource("tide"))).register(entries -> entries.addAfter(anglerWorkshopAfter, anglerWorkshop));
    }

}