package de.pnku.mtideanglersv.client.renderer.item.properties.select;

import com.li64.tide.registries.TideItems;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.properties.select.SelectItemModelProperty;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.ChargedProjectiles;
import org.jetbrains.annotations.Nullable;

import static de.pnku.mtideanglersv.item.MtavDAArrowItems.*;

@Environment(EnvType.CLIENT)
public record CrossbowDAArrowPredicate() implements SelectItemModelProperty<String> {
    public static final Type<CrossbowDAArrowPredicate, String> TYPE;

    public CrossbowDAArrowPredicate() {
    }

    public String get(ItemStack itemStack, @Nullable ClientLevel clientLevel, @Nullable LivingEntity livingEntity, int seed, ItemDisplayContext itemDisplayContext) {
        // Not checking for Firework as this predicate only gets checked when ChargeType predicate doesn't return ChargeType.ROCKET
        if (CrossbowItem.isCharged(itemStack)) {
            ChargedProjectiles chargedProjectiles = (ChargedProjectiles) itemStack.get(DataComponents.CHARGED_PROJECTILES);
            if (chargedProjectiles != null) {
                if (chargedProjectiles.contains(ACACIA_DEEP_AQUA_ARROW)) {return "acacia";}
                else if (chargedProjectiles.contains(BAMBOO_DEEP_AQUA_ARROW)) {return "bamboo";}
                else if (chargedProjectiles.contains(BIRCH_DEEP_AQUA_ARROW)) {return "birch";}
                else if (chargedProjectiles.contains(CHERRY_DEEP_AQUA_ARROW)) {return "cherry";}
                else if (chargedProjectiles.contains(CRIMSON_DEEP_AQUA_ARROW)) {return "crimson";}
                else if (chargedProjectiles.contains(DARK_OAK_DEEP_AQUA_ARROW)) {return "dark_oak";}
                else if (chargedProjectiles.contains(PALE_OAK_DEEP_AQUA_ARROW)) {return "pale_oak";}
                else if (chargedProjectiles.contains(JUNGLE_DEEP_AQUA_ARROW)) {return "jungle";}
                else if (chargedProjectiles.contains(MANGROVE_DEEP_AQUA_ARROW)) {return "mangrove";}
                else if (chargedProjectiles.contains(TideItems.DEEP_AQUA_ARROW)) {return "oak";}
                else if (chargedProjectiles.contains(SPRUCE_DEEP_AQUA_ARROW)) {return "spruce";}
                else if (chargedProjectiles.contains(WARPED_DEEP_AQUA_ARROW)) {return "warped";}
                else if (chargedProjectiles.getItems().stream().anyMatch(arrowStack -> arrowStack.getItem() instanceof ArrowItem)) {return "arrow";}
            }
        }
        return "oak";
    }

    public Type<CrossbowDAArrowPredicate, String> type() {
        return TYPE;
    }

    static {
        TYPE = Type.create(MapCodec.unit(new CrossbowDAArrowPredicate()), Codec.STRING);
    }
}