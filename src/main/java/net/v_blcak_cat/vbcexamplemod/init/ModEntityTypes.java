package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypeIds;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.happyghast.HappyGhast;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;
import net.v_blcak_cat.vbcexamplemod.entity.example.ExampleEntity;

import static net.v_blcak_cat.vbcexamplemod.VBCExampleMod.MODID;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, VBCExampleMod.MODID);

     public static final DeferredHolder<EntityType<?>, EntityType<ExampleEntity>> EXAMPLE_ENTITY =
             ENTITY_TYPES.register("example_entity", () ->
                 EntityType.Builder.of(ExampleEntity::new, MobCategory.CREATURE)
                     .sized(0.8f, 1.8f)
                     .build(ModEntityTypeIds.EXAMPLE_ENTITY));


     public static void register(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }
}