package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.sensing.SensorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public class ModSensorTypes {
    public static final DeferredRegister<SensorType<?>> SENSOR_TYPES =
            DeferredRegister.create(Registries.SENSOR_TYPE, VBCExampleMod.MODID);

    // public static final DeferredHolder<SensorType<?>, SensorType<ExampleSensor>> EXAMPLE_SENSOR =
    //         SENSOR_TYPES.register("example_sensor", () -> new SensorType<>(ExampleSensor::new));

    public static void register(IEventBus bus) {
        SENSOR_TYPES.register(bus);
    }
}