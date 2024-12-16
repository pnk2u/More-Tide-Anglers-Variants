package de.pnku.mtideanglersv.client.renderer;

import com.li64.tide.registries.TideItems;
import de.pnku.mstv_base.item.MoreStickVariantItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ChargedProjectiles;

import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.*;
import static de.pnku.mtideanglersv.item.MtavItems.*;
import static de.pnku.mtideanglersv.MoreTideAnglersVariants.LOGGER;

public class MtavModelPredicates {

    public static void registerMtavModelPredicates() {
        for (Item bowItem : more_bows){
            registerBowDeepAquaArrowPredicate(bowItem);
        }
        for (Item crossbowItem : more_crossbows){
            registerCrossbowChargedDeepAquaArrowPredicate(crossbowItem);
        }
    }

    private static void registerBowDeepAquaArrowPredicate(Item bowItem) {
        ItemProperties.register(bowItem, ResourceLocation.parse("bowarrow_daa"),
                (itemStack, clientLevel, livingEntity, seed) -> {
                    String arrowStickWood;
                    // Check from PullingPredicate
                    if (livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack) {
                        Item arrowItem = livingEntity.getProjectile(itemStack).getItem();
                        if (arrowItem.equals(TideItems.DEEP_AQUA_ARROW)||more_deep_aqua_arrows.contains(arrowItem)) {
                            Item stickItem = more_weapon_sticks.get(arrowItem);
                            if (stickItem.equals(Items.BAMBOO)) {arrowStickWood = "bamboo";}
                            else if (stickItem.equals(Items.STICK)) {arrowStickWood = "oak";}
                            else { arrowStickWood = ((MoreStickVariantItem) (more_weapon_sticks.get(arrowItem))).mstvWoodType;
                            }
                        } else {arrowStickWood = null;}
                    } else {arrowStickWood = null;}
                    switch (arrowStickWood) {
                        case ("acacia") -> {return 0.01F;}
                        case ("bamboo") -> {return 0.02F;}
                        case ("birch") -> {return 0.03F;}
                        case ("cherry") -> {return 0.04F;}
                        case ("crimson") -> {return 0.05F;}
                        case ("dark_oak") -> {return 0.06F;}
                        case ("jungle") -> {return 0.07F;}
                        case ("mangrove") -> {return 0.08F;}
                        case ("oak") -> {return 0.09F;}
                        case ("spruce") -> {return 0.10F;}
                        case ("warped") -> {return 0.11F;}
                        case null, default -> {return 0.0F;}
                    }
                });
    }

    private static void registerCrossbowChargedDeepAquaArrowPredicate(Item crossbowItem) {
        ItemProperties.register(crossbowItem, ResourceLocation.parse("charged_projectiles_daa"),
                (itemStack, clientLevel, livingEntity, i) -> {
                    if (CrossbowItem.isCharged(itemStack)) {
                        ChargedProjectiles chargedProjectiles = (ChargedProjectiles) itemStack.get(DataComponents.CHARGED_PROJECTILES);
                        if (chargedProjectiles != null) {
                            if (chargedProjectiles.contains(TideItems.DEEP_AQUA_ARROW) || chargedProjectiles.contains(ACACIA_DEEP_AQUA_ARROW) || chargedProjectiles.contains(BAMBOO_DEEP_AQUA_ARROW) || chargedProjectiles.contains(BIRCH_DEEP_AQUA_ARROW) || chargedProjectiles.contains(CHERRY_DEEP_AQUA_ARROW) || chargedProjectiles.contains(CRIMSON_DEEP_AQUA_ARROW) || chargedProjectiles.contains(DARK_OAK_DEEP_AQUA_ARROW) || chargedProjectiles.contains(JUNGLE_DEEP_AQUA_ARROW) || chargedProjectiles.contains(MANGROVE_DEEP_AQUA_ARROW) || chargedProjectiles.contains(SPRUCE_DEEP_AQUA_ARROW) || chargedProjectiles.contains(WARPED_DEEP_AQUA_ARROW))
                            {return 1.00F;}
                            else {return 0.00F;}
                        } else {return 0.00F;}
                    } else {return 0.00F;}
                });
    }

}
