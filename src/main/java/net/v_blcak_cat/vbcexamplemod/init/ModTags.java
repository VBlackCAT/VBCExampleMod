package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.Identifier;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public class ModTags {
    public static final TagKey<Block> EXAMPLE_BLOCK_TAG = BlockTags.create(
            Identifier.fromNamespaceAndPath(VBCExampleMod.MODID, "example_blocks"));


    public static final TagKey<Item> EXAMPLE_ITEM_TAG = ItemTags.create(
            Identifier.fromNamespaceAndPath(VBCExampleMod.MODID, "example_items"));


    public static void init() {
    }
}