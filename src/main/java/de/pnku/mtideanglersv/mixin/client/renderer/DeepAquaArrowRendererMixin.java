package de.pnku.mtideanglersv.mixin.client.renderer;

import com.li64.tide.registries.entities.misc.DeepAquaArrow;
import com.li64.tide.registries.entities.misc.DeepAquaArrowRenderer;
import de.pnku.mstv_mweaponv.client.renderer.MweaponvTippableArrowRenderState;
import de.pnku.mstv_mweaponv.util.IArrow;
import de.pnku.mtideanglersv.client.renderer.MtideanglersvArrowRenderState;
import de.pnku.mtideanglersv.util.IDeepAquaArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ArrowRenderState;
import net.minecraft.client.renderer.entity.state.TippableArrowRenderState;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static de.pnku.mtideanglersv.MoreTideAnglersVariants.asId;

@Mixin(DeepAquaArrowRenderer.class)
public abstract class DeepAquaArrowRendererMixin extends ArrowRenderer<DeepAquaArrow, MtideanglersvArrowRenderState> implements IDeepAquaArrow {

    public DeepAquaArrowRendererMixin(EntityRendererProvider.Context context) {
        super(context);
    }

    @Inject(method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ArrowRenderState;", at = @At("HEAD"), cancellable = true)
    public void injectedCreateRenderState(CallbackInfoReturnable<ArrowRenderState> cir) {
        cir.setReturnValue(new MtideanglersvArrowRenderState());
        return;
    }


    public void extractRenderState(DeepAquaArrow deepAquaArrow, MtideanglersvArrowRenderState mtavArrowRenderState, float partialTicks) {
        super.extractRenderState(deepAquaArrow, mtavArrowRenderState, partialTicks);
        mtavArrowRenderState.arrowVariant = ((IDeepAquaArrow) deepAquaArrow).mtideanglersv$getVariant();
    }

    @Inject(method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ArrowRenderState;)Lnet/minecraft/resources/ResourceLocation;", at = @At("HEAD"), cancellable = true)
    public void injectedGetTextureLocation(ArrowRenderState arrowRenderState, CallbackInfoReturnable<ResourceLocation> cir) {
        MtideanglersvArrowRenderState mtavArrowRenderState = (MtideanglersvArrowRenderState) arrowRenderState;
        String arrowVariant = mtavArrowRenderState.arrowVariant;
        ResourceLocation arrowLocation;
        if (!arrowVariant.equals("oak") && !arrowVariant.isEmpty()) {
        arrowLocation = asId("textures/entity/arrow/" + arrowVariant + "_deep_aqua_arrow.png");
        cir.setReturnValue(arrowLocation);}
    }
}
