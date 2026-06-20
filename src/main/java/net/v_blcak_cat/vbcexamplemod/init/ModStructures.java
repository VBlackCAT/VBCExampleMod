package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public class ModStructures {
    public static final DeferredRegister<StructureType<?>> STRUCTURES =
            DeferredRegister.create(Registries.STRUCTURE_TYPE, VBCExampleMod.MODID);


    // public static final DeferredHolder<StructureType<?>, ExampleStructureType> EXAMPLE_STRUCTURE =
    //         STRUCTURES.register("example_structure", () -> () -> ExampleStructure.CODEC);

    public static void register(IEventBus bus) {
        STRUCTURES.register(bus);
    }
}