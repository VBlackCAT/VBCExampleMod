package net.v_blcak_cat.vbcexamplemod;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.v_blcak_cat.vbcexamplemod.init.*;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(VBCExampleMod.MODID)
public class VBCExampleMod {
    public static final String MODID = "vbcexamplemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public VBCExampleMod(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModEntityTypes.register(modEventBus);
        ModFeatures.register(modEventBus);
        ModStructures.register(modEventBus);
        ModStructureSets.register(modEventBus);
        ModSensorTypes.register(modEventBus);
        ModSoundEvents.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        ModTags.init();

        modContainer.registerConfig(net.neoforged.fml.config.ModConfig.Type.COMMON, ModConfig.SPEC);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("{} 模组通用设置阶段", MODID);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModItems.EXAMPLE_BLOCK_ITEM);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("{} 服务器启动完成", MODID);
    }
}