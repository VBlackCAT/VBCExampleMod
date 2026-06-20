package net.v_blcak_cat.vbcexamplemod.init;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ModConfig {
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.BooleanValue LOG_DIRT_BLOCK;
    public static final ModConfigSpec.IntValue MAGIC_NUMBER;
    public static final ModConfigSpec.ConfigValue<String> MAGIC_NUMBER_INTRODUCTION;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        LOG_DIRT_BLOCK = builder
                .comment("Whether to log the dirt block on common setup")
                .define("logDirtBlock", true);

        MAGIC_NUMBER = builder
                .comment("A magic number")
                .defineInRange("magicNumber", 42, 0, Integer.MAX_VALUE);

        MAGIC_NUMBER_INTRODUCTION = builder
                .comment("What you want the introduction message to be for the magic number")
                .define("magicNumberIntroduction", "The magic number is... ");

        SPEC = builder.build();
    }
}