package de.pnku.mtideanglersv.client.renderer;

import com.li64.tide.registries.TideItems;
import de.pnku.mstv_base.item.MoreStickVariantItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.*;
import static de.pnku.mtideanglersv.item.MtavDAArrowItems.*;

public class MtavModelPredicates {

    public static void registerMtavModelPredicates() {
        for (Item bowItem : more_bows){
            registerBowDeepAquaArrowPredicate(bowItem);
        }
        registerBowDeepAquaArrowPredicate(Items.BOW);
        for (Item crossbowItem : more_crossbows){
            registerCrossbowChargedDeepAquaArrowPredicate(crossbowItem);
        }
        registerCrossbowChargedDeepAquaArrowPredicate(Items.CROSSBOW);
    }

    private static void registerBowDeepAquaArrowPredicate(Item bowItem) {
        ItemProperties.register(bowItem, new ResourceLocation("bowarrow_daa"),
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
        ItemProperties.register(crossbowItem, new ResourceLocation("charged_projectiles_daa"),
                (itemStack, clientLevel, livingEntity, i) -> {
                    if (CrossbowItem.isCharged(itemStack)) {
                        if (CrossbowItem.isCharged(itemStack)) {
                            if (CrossbowItem.containsChargedProjectile(itemStack, ACACIA_DEEP_AQUA_ARROW)) {
                                return 0.01F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, BAMBOO_DEEP_AQUA_ARROW)) {
                                return 0.02F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, BIRCH_DEEP_AQUA_ARROW)) {
                                return 0.03F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, CHERRY_DEEP_AQUA_ARROW)) {
                                return 0.04F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, CRIMSON_DEEP_AQUA_ARROW)) {
                                return 0.05F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, DARK_OAK_DEEP_AQUA_ARROW)) {
                                return 0.06F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, JUNGLE_DEEP_AQUA_ARROW)) {
                                return 0.07F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, MANGROVE_DEEP_AQUA_ARROW)) {
                                return 0.08F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, TideItems.DEEP_AQUA_ARROW)) {
                                return 0.09F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, SPRUCE_DEEP_AQUA_ARROW)) {
                                return 0.10F;
                            } else if (CrossbowItem.containsChargedProjectile(itemStack, WARPED_DEEP_AQUA_ARROW)) {
                                return 0.11F;
                            }
                        }
                    }
                    return 0.00F;
                }
        );
    }

}
