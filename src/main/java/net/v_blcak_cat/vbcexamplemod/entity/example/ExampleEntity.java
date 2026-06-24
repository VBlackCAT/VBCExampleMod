package net.v_blcak_cat.vbcexamplemod.entity.example;

import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.v_blcak_cat.vbcexamplemod.init.ModEntityTypes;

public class ExampleEntity extends Animal {

    public ExampleEntity(EntityType<? extends Animal> type, Level level) {
        super(type, level);
    }

    @Override
    public boolean isFood(ItemStack itemStack) {
        return false;
    }

    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob partner) {
        return ModEntityTypes.EXAMPLE_ENTITY.get().create(level, EntitySpawnReason.BREEDING);
    }
}
