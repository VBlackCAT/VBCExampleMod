package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, VBCExampleMod.MODID);

    // public static final DeferredHolder<EntityType<?>, EntityType<ExampleEntity>> EXAMPLE_ENTITY =
    //         ENTITY_TYPES.register("example_entity", () ->
    //             EntityType.Builder.of(ExampleEntity::new, MobCategory.CREATURE)
    //                 .sized(0.8f, 1.8f)
    //                 .build("example_entity"));

    public static void register(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }
}