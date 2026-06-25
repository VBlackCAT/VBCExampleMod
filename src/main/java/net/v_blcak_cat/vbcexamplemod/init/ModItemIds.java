package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;


public final class ModItemIds {


    public static final ResourceKey<Item> EXAMPLE_ITEM = create("example_item");
    public static final ResourceKey<Item> EXAMPLE_FOOD = create("example_food");
    public static final ResourceKey<Item> EXAMPLE_BLOCK_ITEM = create("example_block");

    public static final ResourceKey<Item> EXAMPLE_SPAWN_EGG = createSpawnEgg(ModEntityTypeIds.EXAMPLE_ENTITY);


    private static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(VBCExampleMod.MODID, name));
    }

    private static ResourceKey<Item> createSpawnEgg(ResourceKey<EntityType<?>> entity) {
        return entity.dependent(Registries.ITEM, "_spawn_egg");
    }

    private ModItemIds() {}
}