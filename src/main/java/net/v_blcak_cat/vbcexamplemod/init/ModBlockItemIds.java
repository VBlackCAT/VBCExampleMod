package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public final class ModBlockItemIds {


    public static final BlockItemId EXAMPLE_BLOCK = create("example_block");

    public static final BlockItemId SPECIAL_CASE = create("special_block", "special_item");

    private static BlockItemId create(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(VBCExampleMod.MODID, name);
        return BlockItemId.create(id, id);
    }
    private static BlockItemId create(String blockName, String itemName) {
        Identifier blockId = Identifier.fromNamespaceAndPath(VBCExampleMod.MODID, blockName);
        Identifier itemId = Identifier.fromNamespaceAndPath(VBCExampleMod.MODID, itemName);
        return BlockItemId.create(blockId, itemId);
    }

    private ModBlockItemIds() {}
}