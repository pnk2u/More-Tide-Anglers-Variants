package de.pnku.mtideanglersv.client.renderer.item.properties.select;

import com.li64.tide.registries.TideItems;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import de.pnku.mstv_base.item.MoreStickVariantItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.properties.select.SelectItemModelProperty;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import org.jetbrains.annotations.Nullable;

import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.more_arrows;
import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.more_weapon_sticks;
import static de.pnku.mtideanglersv.item.MtavDAArrowItems.more_deep_aqua_arrows;

@Environment(EnvType.CLIENT)
public record BowDAArrowPredicate() implements SelectItemModelProperty<String> {
    public static final Type<BowDAArrowPredicate, String> TYPE;

    public BowDAArrowPredicate() {
    }

    @Nullable
    public String get(ItemStack itemStack, @Nullable ClientLevel clientLevel, @Nullable LivingEntity livingEntity, int seed, ItemDisplayContext itemDisplayContext) {
        String arrowStickWood;
        // Check from PullingPredicate
        if (livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack) {
            Item arrowItem = livingEntity.getProjectile(itemStack).getItem();
            if (arrowItem.equals(TideItems.DEEP_AQUA_ARROW)) {return "oak";}
            if (more_deep_aqua_arrows.contains(arrowItem)) {
                Item stickItem = more_weapon_sticks.get(arrowItem);
                if (stickItem.equals(Items.BAMBOO)) {arrowStickWood = "bamboo";}
                else if (stickItem.equals(Items.STICK)) {arrowStickWood = "oak";}
                else { arrowStickWood = ((MoreStickVariantItem) (more_weapon_sticks.get(arrowItem))).mstvWoodType;
                }
            } else if (arrowItem instanceof ArrowItem) {arrowStickWood = "arrow";}
            else {arrowStickWood = "";}
        } else {arrowStickWood = "";}
        return arrowStickWood;
    }

    public Type<BowDAArrowPredicate, String> type() {
        return TYPE;
    }

    static {
        TYPE = Type.create(MapCodec.unit(new BowDAArrowPredicate()), Codec.STRING);
    }
}