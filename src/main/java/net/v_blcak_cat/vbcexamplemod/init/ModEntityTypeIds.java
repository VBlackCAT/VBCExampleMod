package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public class ModEntityTypeIds {
    public static final ResourceKey<EntityType<?>> EXAMPLE_ENTITY = create("example_entity");

    private static ResourceKey<EntityType<?>> create(String name) {
        return ResourceKey.create(
                Registries.ENTITY_TYPE,
                Identifier.fromNamespaceAndPath(VBCExampleMod.MODID, name)
        );
    }
}