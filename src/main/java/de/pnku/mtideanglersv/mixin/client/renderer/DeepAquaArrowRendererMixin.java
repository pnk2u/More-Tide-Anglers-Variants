package de.pnku.mtideanglersv.mixin.client.renderer;

import com.li64.tide.registries.entities.misc.DeepAquaArrow;
import com.li64.tide.registries.entities.misc.DeepAquaArrowRenderer;
import de.pnku.mtideanglersv.util.IDeepAquaArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static de.pnku.mtideanglersv.MoreTideAnglersVariants.asId;

@Mixin(DeepAquaArrowRenderer.class)
public abstract class DeepAquaArrowRendererMixin extends ArrowRenderer<DeepAquaArrow> implements IDeepAquaArrow {

    public DeepAquaArrowRendererMixin(EntityRendererProvider.Context context) {
        super(context);
    }

    @Inject(method = "getTextureLocation(Lcom/li64/tide/registries/entities/misc/DeepAquaArrow;)Lnet/minecraft/resources/ResourceLocation;", at = @At("HEAD"), cancellable = true)
    public void injectedGetTextureLocation(DeepAquaArrow deepAquaArrowEntity, CallbackInfoReturnable<ResourceLocation> cir) {
        String arrowVariant = ((IDeepAquaArrow) deepAquaArrowEntity).mtideanglersv$getVariant();
        ResourceLocation arrowLocation;
        if (!arrowVariant.equals("oak") && !arrowVariant.isEmpty()) {
        arrowLocation = asId("textures/entity/arrow/" + arrowVariant + "_deep_aqua_arrow.png");
        cir.setReturnValue(arrowLocation);}
    }
}
