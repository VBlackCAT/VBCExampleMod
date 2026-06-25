package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.references.BlockItemId;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;
import net.v_blcak_cat.vbcexamplemod.block.ExampleBlock;
import org.jspecify.annotations.NonNull;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(VBCExampleMod.MODID);


/*    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock(
            "example_block",
            p -> p.mapColor(MapColor.STONE).strength(3.0f)
    );   */

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerBlock(
            getPath(ModBlockItemIds.EXAMPLE_BLOCK),
            ExampleBlock::new,
            p -> p.strength(4.0f).requiresCorrectToolForDrops()
    );

    private static @NonNull String getPath(BlockItemId id) {
        return id.block().identifier().getPath();
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}