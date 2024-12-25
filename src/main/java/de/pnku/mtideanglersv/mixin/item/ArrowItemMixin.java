package de.pnku.mtideanglersv.mixin.item;

import com.llamalad7.mixinextras.sugar.Local;
import de.pnku.mstv_base.item.MoreStickVariantItem;
import de.pnku.mtideanglersv.util.IDeepAquaArrow;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ArrowItem;
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

@Mixin(ArrowItem.class)
public abstract class ArrowItemMixin implements IDeepAquaArrow {

    @Inject(method = "asProjectile", at = @At(value = "RETURN", shift = At.Shift.BEFORE), cancellable = true)
    public void injectedAsProjectile(Level level, Position pos, ItemStack ammo, Direction direction, CallbackInfoReturnable<Projectile> cir, @Local Arrow arrow) {
        Item deepAquaArrowVariantItem = ammo.getItem();
        Item deepAquaStickItem;
        String deepAquaArrowVariant;
        if (more_deep_aqua_arrows.contains(deepAquaArrowVariantItem)) {
            deepAquaStickItem = more_weapon_sticks.get(deepAquaArrowVariantItem);
            if (deepAquaStickItem.equals(Items.BAMBOO)) {
                deepAquaArrowVariant = "bamboo";
            } else if (deepAquaStickItem.equals(Items.STICK)) {
                deepAquaArrowVariant = "oak";
            } else {
                deepAquaArrowVariant = ((MoreStickVariantItem) deepAquaStickItem).mstvWoodType;
            }
            ((IDeepAquaArrow) arrow).mtideanglersv$setVariant(deepAquaArrowVariant);
            cir.setReturnValue(arrow);
        }
    }
}
