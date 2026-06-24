package net.v_blcak_cat.vbcexamplemod.entity.example;// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.util.Mth;

import static net.v_blcak_cat.vbcexamplemod.VBCExampleMod.MODID;

public class VBlackCATModel extends EntityModel<ExampleRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath(MODID, "vblackcat"), "main");
	private final ModelPart body;
	private final ModelPart spine;
	private final ModelPart backLegR;
	private final ModelPart backLegL;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart spine2;
	private final ModelPart spine3;
	private final ModelPart frontLegL;
	private final ModelPart frontLegL2;
	private final ModelPart frontLegL3;
	private final ModelPart frontLegR;
	private final ModelPart frontLegR2;
	private final ModelPart frontLegR3;
	private final ModelPart frontLegR4;
	private final ModelPart head;
	private final ModelPart hat;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;

	public VBlackCATModel(ModelPart root) {
		super(root);
        this.body = root.getChild("body");
		this.spine = this.body.getChild("spine");
		this.backLegR = this.spine.getChild("backLegR");
		this.backLegL = this.spine.getChild("backLegL");
		this.tail1 = this.spine.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.spine2 = this.spine.getChild("spine2");
		this.spine3 = this.spine2.getChild("spine3");
		this.frontLegL = this.spine3.getChild("frontLegL");
		this.frontLegL2 = this.frontLegL.getChild("frontLegL2");
		this.frontLegL3 = this.frontLegL2.getChild("frontLegL3");
		this.frontLegR = this.spine3.getChild("frontLegR");
		this.frontLegR2 = this.frontLegR.getChild("frontLegR2");
		this.frontLegR3 = this.frontLegR2.getChild("frontLegR3");
		this.frontLegR4 = this.frontLegR3.getChild("frontLegR4");
		this.head = this.spine3.getChild("head");
		this.hat = this.head.getChild("hat");
		this.bone = this.hat.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 1.0F));

		PartDefinition spine = body.addOrReplaceChild("spine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r1 = spine.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(19, 11).addBox(-2.0F, -9.125F, -3.0F, 4.0F, 5.25F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 11.875F, 1.5708F, 0.0F, 0.0F));

		PartDefinition backLegR = spine.addOrReplaceChild("backLegR", CubeListBuilder.create().texOffs(8, 13).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.1F, 1.0F, 6.0F));

		PartDefinition backLegL = spine.addOrReplaceChild("backLegL", CubeListBuilder.create().texOffs(8, 13).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 1.0F, 6.0F));

		PartDefinition tail1 = spine.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 7.0F));

		PartDefinition tail1_r1 = tail1.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7453F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(4, 15).addBox(0.0F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.853F, 4.7504F, 2.8362F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.5F, 5.0F, -0.5F));

		PartDefinition tail3_r1 = tail3.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(4, 15).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0F, 0.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition spine2 = spine.addOrReplaceChild("spine2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 6.625F));

		PartDefinition body_r2 = spine2.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(20, 6).addBox(-2.0F, -9.125F, -3.0F, 4.0F, 5.25F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition spine3 = spine2.addOrReplaceChild("spine3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r3 = spine3.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 5.5F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.625F, 1.5708F, 0.0F, 0.0F));

		PartDefinition frontLegL = spine3.addOrReplaceChild("frontLegL", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 6.125F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2F, -3.0F, -11.625F));

		PartDefinition frontLegL2 = frontLegL.addOrReplaceChild("frontLegL2", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 5.925F, -1.0F, 2.0F, 2.375F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontLegL3 = frontLegL2.addOrReplaceChild("frontLegL3", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 8.3F, -1.0F, 2.0F, 1.5F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontLegR = spine3.addOrReplaceChild("frontLegR", CubeListBuilder.create(), PartPose.offset(-1.2F, -3.0F, -11.625F));

		PartDefinition frontLegR2 = frontLegR.addOrReplaceChild("frontLegR2", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, -0.2F, -1.0F, 2.0F, 6.125F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.025F, 0.0F, 0.0F));

		PartDefinition frontLegR3 = frontLegR2.addOrReplaceChild("frontLegR3", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 5.925F, -1.0F, 2.0F, 2.375F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontLegR4 = frontLegR3.addOrReplaceChild("frontLegR4", CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 8.3F, -1.0F, 2.0F, 1.5F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = spine3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-1.5F, -0.0156F, -4.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 10).addBox(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -16.625F));

		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = hat.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(32, 22).addBox(-4.0F, -3.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(40, 13).addBox(-3.0F, -3.875F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0653F, -2.0043F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(48, 10).addBox(-2.0F, -2.1875F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0326F, -3.4396F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(56, 5).addBox(-1.0F, -10.375F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.5625F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-1.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.875F, 0.0F, -0.7854F, -0.7854F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}


	@Override
	public void setupAnim(ExampleRenderState state) {

		super.setupAnim(state);

		float walkPos = state.walkAnimationPos;
		float walkSpeed = state.walkAnimationSpeed;

		head.yRot = state.yRot * ((float)Math.PI / 180F);
		head.xRot = state.xRot * ((float)Math.PI / 180F);

		frontLegL.xRot =
				Mth.cos(walkPos * 0.6662F)
						* 1.4F
						* walkSpeed;

		frontLegR.xRot =
				Mth.cos(
						walkPos * 0.6662F
								+ (float)Math.PI
				)
						* 1.4F
						* walkSpeed;

		backLegL.xRot =
				Mth.cos(
						walkPos * 0.6662F
								+ (float)Math.PI
				)
						* 1.4F
						* walkSpeed;

		backLegR.xRot =
				Mth.cos(walkPos * 0.6662F)
						* 1.4F
						* walkSpeed;

		tail1.yRot =
				Mth.cos(walkPos * 0.3F)
						* 0.15F
						* walkSpeed;

		tail2.yRot =
				Mth.cos(walkPos * 0.3F + 0.4F)
						* 0.2F
						* walkSpeed;

		tail3.yRot =
				Mth.cos(walkPos * 0.3F + 0.8F)
						* 0.25F
						* walkSpeed;
	}

}