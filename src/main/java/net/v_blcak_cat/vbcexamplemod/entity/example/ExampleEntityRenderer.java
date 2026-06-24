package net.v_blcak_cat.vbcexamplemod.entity.example;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;
import net.v_blcak_cat.vbcexamplemod.VBCExampleMod;

public class ExampleEntityRenderer extends MobRenderer<
        ExampleEntity,
        ExampleRenderState,
        VBlackCATModel> {

    private static final Identifier TEXTURE =
            Identifier.fromNamespaceAndPath(
                    VBCExampleMod.MODID,
                    "textures/entity/vblackcat.png"
            );

    public ExampleEntityRenderer(EntityRendererProvider.Context context) {
        super(
                context,
                new VBlackCATModel(
                        context.bakeLayer(
                                VBlackCATModel.LAYER_LOCATION
                        )
                ),
                0.4F
        );
    }

    @Override
    public ExampleRenderState createRenderState() {
        return new ExampleRenderState();
    }

    @Override
    public Identifier getTextureLocation(
            ExampleRenderState state
    ) {
        return TEXTURE;
    }

    @Override
    public void extractRenderState(
            ExampleEntity entity,
            ExampleRenderState state,
            float partialTick
    ) {
        super.extractRenderState(
                entity,
                state,
                partialTick
        );
    }
}