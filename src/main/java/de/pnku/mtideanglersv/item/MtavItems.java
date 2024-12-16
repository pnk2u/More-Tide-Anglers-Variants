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
import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.more_arrows;
import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.more_weapon_sticks;
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

    public static final Item ACACIA_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    public static final Item BAMBOO_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    public static final Item BIRCH_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    public static final Item CHERRY_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    public static final Item CRIMSON_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties().fireResistant());
    public static final Item DARK_OAK_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    //public static final Item PALE_OAK_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    public static final Item JUNGLE_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    public static final Item MANGROVE_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    public static final Item SPRUCE_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties());
    public static final Item WARPED_DEEP_AQUA_ARROW = new DeepAquaArrowItem(new Item.Properties().fireResistant());

    public static final List<Item> more_deep_aqua_arrows = new ArrayList<>();


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

        registerDeepAquaArrowItem(SPRUCE_DEEP_AQUA_ARROW, TideItems.DEEP_AQUA_ARROW, SPRUCE_STICK);
        registerDeepAquaArrowItem(BIRCH_DEEP_AQUA_ARROW, SPRUCE_DEEP_AQUA_ARROW, BIRCH_STICK);
        registerDeepAquaArrowItem(JUNGLE_DEEP_AQUA_ARROW, BIRCH_DEEP_AQUA_ARROW, JUNGLE_STICK);
        registerDeepAquaArrowItem(ACACIA_DEEP_AQUA_ARROW, JUNGLE_DEEP_AQUA_ARROW, ACACIA_STICK);
        registerDeepAquaArrowItem(DARK_OAK_DEEP_AQUA_ARROW, ACACIA_DEEP_AQUA_ARROW, DARK_OAK_STICK);
        registerDeepAquaArrowItem(MANGROVE_DEEP_AQUA_ARROW, DARK_OAK_DEEP_AQUA_ARROW, MANGROVE_STICK);
        registerDeepAquaArrowItem(CHERRY_DEEP_AQUA_ARROW, MANGROVE_DEEP_AQUA_ARROW, CHERRY_STICK);
        registerDeepAquaArrowItem(BAMBOO_DEEP_AQUA_ARROW, CHERRY_DEEP_AQUA_ARROW, Items.BAMBOO);
        registerDeepAquaArrowItem(CRIMSON_DEEP_AQUA_ARROW, BAMBOO_DEEP_AQUA_ARROW, CRIMSON_STICK);
        registerDeepAquaArrowItem(WARPED_DEEP_AQUA_ARROW, CRIMSON_DEEP_AQUA_ARROW, WARPED_STICK);
        more_weapon_sticks.put(TideItems.DEEP_AQUA_ARROW, Items.STICK);
    }

    private static void registerCrateItem(Item crate, Item crateAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreTideAnglersVariants.asId((more_crate_wood_types.get(((BlockItem) crate).getBlock()) + "_loot_crate")), crate);

        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(CREATIVE_MODE_TAB.key(), Tide.resource("tide"))).register(entries -> entries.addAfter(crateAfter, crate));
    }

    private static void registerAnglerWorkshopItem(Item anglerWorkshop, Item anglerWorkshopAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreTideAnglersVariants.asId((more_angler_workshop_wood_types.get(((BlockItem) anglerWorkshop).getBlock()) + "_angler_workshop")), anglerWorkshop);

        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(CREATIVE_MODE_TAB.key(), Tide.resource("tide"))).register(entries -> entries.addAfter(anglerWorkshopAfter, anglerWorkshop));
    }

    private static void registerDeepAquaArrowItem(Item deepAquaArrow, Item deepAquaArrowAfter, Item stickItem) {
        String stickVariant;
        if (stickItem.equals(Items.BAMBOO)) {stickVariant = "bamboo";} else if (stickItem.equals(Items.STICK)) {stickVariant = "oak";} else { stickVariant = ((MoreStickVariantItem) stickItem).mstvWoodType;}
        Registry.register(BuiltInRegistries.ITEM, MoreTideAnglersVariants.asId(stickVariant + "_deep_aqua_arrow"), deepAquaArrow);
        more_deep_aqua_arrows.add(deepAquaArrow);
        more_weapon_sticks.put(deepAquaArrow, stickItem);

        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(CREATIVE_MODE_TAB.key(), Tide.resource("tide"))).register(entries -> entries.addAfter(deepAquaArrowAfter, deepAquaArrow));
    }
}