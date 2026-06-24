package net.v_blcak_cat.vbcexamplemod.init.regevent;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;
import net.v_blcak_cat.vbcexamplemod.entity.example.ExampleEntityRenderer;
import net.v_blcak_cat.vbcexamplemod.entity.example.VBlackCATModel;
import net.v_blcak_cat.vbcexamplemod.init.ModEntityTypes;

@Mod(value = VBCExampleMod.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = VBCExampleMod.MODID, value = Dist.CLIENT)
public class ModClientRegEvents {

    public ModClientRegEvents(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        VBCExampleMod.LOGGER.info("HELLO FROM CLIENT SETUP");
        VBCExampleMod.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(
                ModEntityTypes.EXAMPLE_ENTITY.get(),
                ExampleEntityRenderer::new
        );
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(
                VBlackCATModel.LAYER_LOCATION,
                VBlackCATModel::createBodyLayer
        );
    }
}