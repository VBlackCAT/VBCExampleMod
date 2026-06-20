package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(Registries.FEATURE, VBCExampleMod.MODID);

    // public static final DeferredHolder<Feature<?>, ExampleFeature> EXAMPLE_FEATURE =
    //         FEATURES.register("example_feature", () -> new ExampleFeature(ExampleConfig.CODEC));

    public static void register(IEventBus bus) {
        FEATURES.register(bus);
    }
}