package net.v_blcak_cat.vbcexamplemod.init;

import net.minecraft.references.BlockItemId;
import net.minecraft.references.ItemIds;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;
import net.v_blcak_cat.vbcexamplemod.item.ExampleItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VBCExampleMod.MODID);


    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            getPath(ModBlockItemIds.EXAMPLE_BLOCK),
            ModBlocks.EXAMPLE_BLOCK
    );


//    public static final DeferredItem<Item> EXAMPLE_FOOD = ITEMS.registerSimpleItem(
//            getPath(ModItemIds.EXAMPLE_ITEM),
//            p -> p.food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.6f).build())
//    );

    public static final DeferredItem<Item> EXAMPLE_FOOD = ITEMS.registerItem(
            getPath(ModItemIds.EXAMPLE_FOOD),
            ExampleItem::new,
            p -> p.food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.6f).build())
    );

    public static final DeferredItem<SpawnEggItem> EXAMPLE_SPAWN_EGG = ITEMS.registerItem(
            getPath(ModItemIds.EXAMPLE_SPAWN_EGG),
            SpawnEggItem::new,
            () -> new Item.Properties().spawnEgg(ModEntityTypes.EXAMPLE_ENTITY.get())
    );

    static String getPath(BlockItemId id){
        return getPath(id.item());
    }
    static String getPath(ResourceKey<Item> id){
        return id.identifier().getPath() ;
    }


    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}