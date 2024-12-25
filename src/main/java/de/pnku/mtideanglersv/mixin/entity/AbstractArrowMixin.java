package de.pnku.mtideanglersv.mixin.entity;

import com.li64.tide.registries.entities.misc.DeepAquaArrow;
import de.pnku.mtideanglersv.util.IDeepAquaArrow;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractArrow.class)
public abstract class AbstractArrowMixin extends Projectile implements IDeepAquaArrow {

    @Unique
    private static final EntityDataAccessor<String> DATA_ID_DAATYPE;

    public AbstractArrowMixin(EntityType<? extends Projectile> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "defineSynchedData", at = @At("TAIL"))
    protected void injectedDefineSynchedData(CallbackInfo ci) {
        this.entityData.define(DATA_ID_DAATYPE, "oak");
    }

    @Unique
    AbstractArrow abstractArrow = (AbstractArrow) (Object) this;

    @Inject(method = "addAdditionalSaveData", at = @At("TAIL"))
    protected void injectedAddAdditionalSaveData(CompoundTag compound, CallbackInfo ci) {
        if (abstractArrow instanceof DeepAquaArrow) {
            compound.putString("DAAType", this.mtideanglersv$getVariant());
        }
    }

    @Inject(method = "readAdditionalSaveData", at = @At("TAIL"))
    protected void injectedReadAdditionalSaveData(CompoundTag compound, CallbackInfo ci) {
        if (abstractArrow instanceof DeepAquaArrow) {
            if (compound.contains("DAAType", 8)) {
                this.mtideanglersv$setVariant(compound.getString("DAAType"));
            }
        }
    }

    @Unique
    public String mtideanglersv$getVariant() {
        return this.entityData.get(DATA_ID_DAATYPE);
    }

    @Unique
    public void mtideanglersv$setVariant(String variant) {
        this.entityData.set(DATA_ID_DAATYPE, variant);
    }

    static {
        DATA_ID_DAATYPE = SynchedEntityData.defineId(AbstractArrowMixin.class, EntityDataSerializers.STRING);
    }
}
