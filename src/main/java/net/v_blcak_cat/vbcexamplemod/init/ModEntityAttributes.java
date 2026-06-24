package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;
import net.v_blcak_cat.vbcexamplemod.entity.example.ExampleEntity;



public class ModEntityAttributes {



    public static AttributeSupplier.Builder createAttributes() {
        return ExampleEntity.createMobAttributes()
                // 生命值
                .add(Attributes.MAX_HEALTH, 20.0D)
                // 移动速度
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                // 跟随距离
                .add(Attributes.FOLLOW_RANGE, 16.0D)
                // 击退抗性
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.1D)
                // 攻击力
                .add(Attributes.ATTACK_DAMAGE, 3.0D);
    }



    public static void register(EntityAttributeCreationEvent event){
        event.put(
                ModEntityTypes.EXAMPLE_ENTITY.get(),
                ModEntityAttributes
                        .createAttributes()
                        .build()
        );

    }


}
