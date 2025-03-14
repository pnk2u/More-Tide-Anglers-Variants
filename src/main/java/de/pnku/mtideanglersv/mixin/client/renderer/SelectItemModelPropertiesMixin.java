package de.pnku.mtideanglersv.mixin.client.renderer;

import de.pnku.mtideanglersv.client.renderer.item.properties.select.BowDAArrowPredicate;
import de.pnku.mtideanglersv.client.renderer.item.properties.select.CrossbowDAArrowPredicate;
import net.minecraft.client.renderer.item.properties.select.SelectItemModelProperties;
import net.minecraft.client.renderer.item.properties.select.SelectItemModelProperty;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.ExtraCodecs;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static de.pnku.mtideanglersv.MoreTideAnglersVariants.asId;

@Mixin(SelectItemModelProperties.class)
public class SelectItemModelPropertiesMixin {

    @Shadow
    @Final
    public static ExtraCodecs.LateBoundIdMapper<ResourceLocation, SelectItemModelProperty.Type<?, ?>> ID_MAPPER;

    @Inject(method = "bootstrap", at = @At("HEAD"))
    private static void bootstrap(CallbackInfo ci) {
        ID_MAPPER.put(asId("bowdaarrow"), BowDAArrowPredicate.TYPE);
        ID_MAPPER.put(asId("crossbowdaarrow"), CrossbowDAArrowPredicate.TYPE);
    }
}
