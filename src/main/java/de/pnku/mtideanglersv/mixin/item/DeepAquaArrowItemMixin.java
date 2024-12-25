package de.pnku.mtideanglersv.mixin.item;

import com.li64.tide.registries.entities.misc.DeepAquaArrow;
import com.li64.tide.registries.items.DeepAquaArrowItem;
import de.pnku.mstv_base.item.MoreStickVariantItem;
import de.pnku.mtideanglersv.util.IDeepAquaArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static de.pnku.mstv_mweaponv.item.MoreWeaponVariantItems.more_weapon_sticks;
import static de.pnku.mtideanglersv.item.MtavDAArrowItems.more_deep_aqua_arrows;

@Mixin(DeepAquaArrowItem.class)
public abstract class DeepAquaArrowItemMixin {
    @Inject(method = "createArrow", at = @At("HEAD"), cancellable = true)
    public void injectedCreateArrow(Level level, ItemStack ammo, LivingEntity shooter, ItemStack weapon, CallbackInfoReturnable<AbstractArrow> cir) {
        Item deepAquaArrowVariantItem = ammo.getItem();
        Item deepAquaStickItem;
        String deepAquaArrowVariant;
        if (more_deep_aqua_arrows.contains(deepAquaArrowVariantItem)) {
            AbstractArrow deepAquaArrow = new DeepAquaArrow(level, shooter, ammo.copyWithCount(1), weapon);
            deepAquaStickItem = more_weapon_sticks.get(deepAquaArrowVariantItem);
            if (deepAquaStickItem.equals(Items.BAMBOO)) {
                deepAquaArrowVariant = "bamboo";
            } else if (deepAquaStickItem.equals(Items.STICK)) {
                deepAquaArrowVariant = "oak";
            } else {
                deepAquaArrowVariant = ((MoreStickVariantItem) deepAquaStickItem).mstvWoodType;
            }
            ((IDeepAquaArrow) deepAquaArrow).mtideanglersv$setVariant(deepAquaArrowVariant);
            cir.setReturnValue(deepAquaArrow);
        }
    }
}
