package de.pnku.mtideanglersv.block;

import com.li64.tide.registries.TideBlockEntities;
import com.li64.tide.registries.TideBlocks;
import com.li64.tide.registries.blocks.AnglerWorkshopBlock;
import com.li64.tide.registries.blocks.SurfaceLootCrateBlock;
import de.pnku.mtideanglersv.MoreTideAnglersVariants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MtavBlocks {
    public static final Block SPRUCE_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.PODZOL));
    public static final Block BIRCH_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.SAND));
    public static final Block JUNGLE_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.DIRT));
    public static final Block ACACIA_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.COLOR_ORANGE));
    public static final Block DARK_OAK_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.COLOR_BROWN));
    //public static final Block PALE_OAK_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.QUARTZ));
    public static final Block MANGROVE_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.COLOR_RED));
    public static final Block CHERRY_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CHERRY_WOOD));
    public static final Block BAMBOO_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.BAMBOO_WOOD));
    public static final Block CRIMSON_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_CRATE = new SurfaceLootCrateBlock(BlockBehaviour.Properties.copy(TideBlocks.SURFACE_LOOT_CRATE).mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD));

    public static final Block SPRUCE_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.PODZOL));
    public static final Block BIRCH_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.SAND));
    public static final Block JUNGLE_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.DIRT));
    public static final Block ACACIA_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.COLOR_ORANGE));
    public static final Block DARK_OAK_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.COLOR_BROWN));
    //public static final Block PALE_OAK_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.QUARTZ));
    public static final Block MANGROVE_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.COLOR_RED));
    public static final Block CHERRY_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.TERRACOTTA_WHITE).sound(SoundType.CHERRY_WOOD));
    public static final Block BAMBOO_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.BAMBOO_WOOD));
    public static final Block CRIMSON_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.CRIMSON_STEM).sound(SoundType.NETHER_WOOD));
    public static final Block WARPED_ANGLER_WORKSHOP = new AnglerWorkshopBlock(BlockBehaviour.Properties.copy(TideBlocks.ANGLER_WORKSHOP).mapColor(MapColor.WARPED_STEM).sound(SoundType.NETHER_WOOD));

    public static final List<Block> more_crates = new ArrayList<>();
    public static final List<Block> more_angler_workshops = new ArrayList<>();
    public static final Map<Block, String> more_crate_wood_types = new HashMap<>();
    public static final Map<Block, String> more_angler_workshop_wood_types = new HashMap<>();

    public static void registerBlocks() {
        registerCrateBlock(SPRUCE_CRATE, "spruce");
        registerCrateBlock(BIRCH_CRATE, "birch");
        registerCrateBlock(JUNGLE_CRATE, "jungle");
        registerCrateBlock(ACACIA_CRATE, "acacia");
        registerCrateBlock(DARK_OAK_CRATE, "dark_oak");
        //registerCrateBlock(PALE_OAK_CRATE, "pale_oak");
        registerCrateBlock(MANGROVE_CRATE, "mangrove");
        registerCrateBlock(CHERRY_CRATE, "cherry");
        registerCrateBlock(BAMBOO_CRATE, "bamboo");
        registerCrateBlock(CRIMSON_CRATE, "crimson");
        registerCrateBlock(WARPED_CRATE, "warped");

        registerAnglerWorkshopBlock(SPRUCE_ANGLER_WORKSHOP, "spruce");
        registerAnglerWorkshopBlock(BIRCH_ANGLER_WORKSHOP, "birch");
        registerAnglerWorkshopBlock(JUNGLE_ANGLER_WORKSHOP, "jungle");
        registerAnglerWorkshopBlock(ACACIA_ANGLER_WORKSHOP, "acacia");
        registerAnglerWorkshopBlock(DARK_OAK_ANGLER_WORKSHOP, "dark_oak");
        //registerAnglerWorkshopBlock(PALE_OAK_ANGLER_WORKSHOP, "pale_oak");
        registerAnglerWorkshopBlock(MANGROVE_ANGLER_WORKSHOP, "mangrove");
        registerAnglerWorkshopBlock(CHERRY_ANGLER_WORKSHOP, "cherry");
        registerAnglerWorkshopBlock(BAMBOO_ANGLER_WORKSHOP, "bamboo");
        registerAnglerWorkshopBlock(CRIMSON_ANGLER_WORKSHOP, "crimson");
        registerAnglerWorkshopBlock(WARPED_ANGLER_WORKSHOP, "warped");
    }

    private static void registerCrateBlock(Block crate, String woodType) {
        Registry.register(BuiltInRegistries.BLOCK, MoreTideAnglersVariants.asId(woodType + "_loot_crate"), crate);
        more_crates.add(crate);
        more_crate_wood_types.put(crate, woodType);

    }

    private static void registerAnglerWorkshopBlock(Block angler_workshop, String woodType) {
        Registry.register(BuiltInRegistries.BLOCK, MoreTideAnglersVariants.asId(woodType + "_angler_workshop"), angler_workshop);
        more_angler_workshops.add(angler_workshop);
        more_angler_workshop_wood_types.put(angler_workshop, woodType);
    }
}