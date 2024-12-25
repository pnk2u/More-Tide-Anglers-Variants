package de.pnku.mtideanglersv.item;

import com.li64.tide.Tide;
import com.li64.tide.registries.TideItems;
import com.li64.tide.registries.items.DeepAquaArrowItem;
import de.pnku.mstv_base.item.MoreStickVariantItem;
import de.pnku.mtideanglersv.MoreTideAnglersVariants;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.mstv_base.item.MoreStickVariantItems.*;
import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.more_weapon_sticks;
import static de.pnku.mtideanglersv.MoreTideAnglersVariants.isMWeaponVLoaded;
import static net.minecraft.core.registries.BuiltInRegistries.CREATIVE_MODE_TAB;

public class MtavDAArrowItems {

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

    public static void registerDAArrowItems() {

        if (isMWeaponVLoaded) {
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
    }

    public static final List<Item> more_deep_aqua_arrows = new ArrayList<>();


    private static void registerDeepAquaArrowItem(Item deepAquaArrow, Item deepAquaArrowAfter, Item stickItem) {
        String stickVariant;
        if (stickItem.equals(Items.BAMBOO)) {stickVariant = "bamboo";} else if (stickItem.equals(Items.STICK)) {stickVariant = "oak";} else { stickVariant = ((MoreStickVariantItem) stickItem).mstvWoodType;}
        Registry.register(BuiltInRegistries.ITEM, MoreTideAnglersVariants.asId(stickVariant + "_deep_aqua_arrow"), deepAquaArrow);
        more_deep_aqua_arrows.add(deepAquaArrow);
        more_weapon_sticks.put(deepAquaArrow, stickItem);

        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(CREATIVE_MODE_TAB.key(), Tide.resource("tide"))).register(entries -> entries.addAfter(deepAquaArrowAfter, deepAquaArrow));
    }

}
