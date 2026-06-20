package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public class ModStructureSets {
    public static final DeferredRegister<StructureSet> STRUCTURE_SETS =
            DeferredRegister.create(Registries.STRUCTURE_SET, VBCExampleMod.MODID);


    public static void register(IEventBus bus) {
        STRUCTURE_SETS.register(bus);
    }
}