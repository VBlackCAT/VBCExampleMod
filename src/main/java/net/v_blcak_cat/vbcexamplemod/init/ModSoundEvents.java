package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;
import net.minecraft.resources.Identifier;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, VBCExampleMod.MODID);


    public static final DeferredHolder<SoundEvent, SoundEvent> EXAMPLE_SOUND =
            SOUND_EVENTS.register("example_sound", () ->
                    SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(VBCExampleMod.MODID, "example_sound")));

    public static void register(IEventBus bus) {
        SOUND_EVENTS.register(bus);
    }
}