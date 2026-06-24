package net.v_blcak_cat.vbcexamplemod.init.regevent;


import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;
import net.v_blcak_cat.vbcexamplemod.init.ModEntityAttributes;

@EventBusSubscriber(
        modid = VBCExampleMod.MODID
)
public class ModRegEvents {

    @SubscribeEvent
    public static void registerAttributes(
            EntityAttributeCreationEvent event
    ) {
        ModEntityAttributes.register(event);
    }
}
