package de.pnku.mtideanglersv.block;

import com.li64.tide.registries.blocks.entities.LootCrateBlockEntity;
import com.li64.tide.registries.blocks.entities.SurfaceLootCrateBlockEntity;
import de.pnku.mtideanglersv.MoreTideAnglersVariants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class MtavBlockEntities {

    public static final BlockEntityType<? extends LootCrateBlockEntity> VARIANT_LOOT_CRATE = BlockEntityType.Builder.of(SurfaceLootCrateBlockEntity::new, MtavBlocks.more_crates.toArray(new Block[0])).build(null);

    public static void init() {
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, MoreTideAnglersVariants.asId("variant_loot_crate"), VARIANT_LOOT_CRATE);
    }
}