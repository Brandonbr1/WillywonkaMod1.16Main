package com.jerios.willywonka.client.enity.model;// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.jerios.willywonka.enities.GummyBearEnity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

import java.util.function.Consumer;

public class GummyBearModel<G extends GummyBearEnity> extends EntityModel<G> {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer arm1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer arm2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer head;
	private final ModelRenderer eyes;
	private final ModelRenderer eyes2;
	private final ModelRenderer nose;
	private final ModelRenderer smile;
	private final ModelRenderer ears;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer ears2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public GummyBearModel() {
		texWidth = 64;
		texHeight = 64;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 24.0F, 0.0F);
		bone.texOffs(20, 37).addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(16, 37).addBox(-0.75F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(12, 37).addBox(-0.75F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(8, 37).addBox(-0.75F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(37, 6).addBox(-1.75F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(4, 37).addBox(-1.75F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(0, 37).addBox(-1.75F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(31, 36).addBox(-1.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, 24.0F, -6.0F);
		bone2.texOffs(34, 35).addBox(-0.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(28, 35).addBox(-0.75F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(24, 35).addBox(-0.75F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(20, 35).addBox(-0.75F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(16, 35).addBox(-1.75F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(35, 12).addBox(-1.75F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(12, 35).addBox(-1.75F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(35, 10).addBox(-1.75F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(0.0F, 22.0F, 0.0F);
		bone3.texOffs(20, 16).addBox(-2.0F, -7.0F, -6.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(1.0F, 22.0F, 0.0F);
		bone4.texOffs(0, 16).addBox(-2.0F, -7.0F, -6.0F, 2.0F, 7.0F, 8.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setPos(0.0F, 18.0F, 1.0F);
		arm1.texOffs(30, 18).addBox(-3.0F, -2.0F, 1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-3.7304F, 0.1134F, 0.0F);
		arm1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1309F);
		cube_r1.texOffs(30, 14).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setPos(0.0F, 18.0F, -9.0F);
		arm2.texOffs(23, 4).addBox(-3.0F, -2.0F, 1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-3.7304F, 0.1134F, 0.0F);
		arm2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
		cube_r2.texOffs(23, 0).addBox(-2.0F, -2.0F, 1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, 15.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -7.0F, -7.0F, 7.0F, 7.0F, 9.0F, 0.0F, false);

		eyes = new ModelRenderer(this);
		eyes.setPos(0.0F, 12.0F, 0.0F);
		eyes.texOffs(35, 8).addBox(-5.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		eyes2 = new ModelRenderer(this);
		eyes2.setPos(0.0F, 12.0F, -5.0F);
		eyes2.texOffs(8, 35).addBox(-5.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setPos(0.0F, 22.5F, -0.25F);
		nose.texOffs(4, 35).addBox(-5.0F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		nose.texOffs(35, 0).addBox(-5.0F, -12.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		nose.texOffs(0, 35).addBox(-5.0F, -11.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		nose.texOffs(34, 33).addBox(-5.0F, -11.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		nose.texOffs(28, 33).addBox(-5.0F, -11.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		nose.texOffs(24, 33).addBox(-5.0F, -12.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		smile = new ModelRenderer(this);
		smile.setPos(0.0F, 24.0F, 0.0F);
		smile.texOffs(34, 31).addBox(-5.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		smile.texOffs(34, 5).addBox(-5.0F, -12.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		smile.texOffs(31, 34).addBox(-5.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		smile.texOffs(34, 22).addBox(-5.0F, -11.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		smile.texOffs(12, 16).addBox(-5.0F, -10.0F, -6.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		ears = new ModelRenderer(this);
		ears.setPos(0.0F, 10.0F, 2.0F);
		ears.texOffs(0, 19).addBox(-1.0F, -4.899F, -3.8284F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		ears.texOffs(20, 33).addBox(-1.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(16, 33).addBox(-1.0F, -4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(12, 33).addBox(-1.0F, -5.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(28, 31).addBox(-1.0F, -5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(8, 33).addBox(-1.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(4, 33).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(33, 2).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(0, 33).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(31, 32).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(32, 11).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(24, 31).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(20, 31).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears.texOffs(32, 7).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 15.0065F, -1.9504F);
		ears.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
		cube_r3.texOffs(0, 6).addBox(-1.0F, -20.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r3.texOffs(0, 16).addBox(-1.0F, -20.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 3.0872F, -3.9331F);
		ears.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
		cube_r4.texOffs(15, 19).addBox(-1.0F, -9.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, 0.0F, 0.0F);
		ears.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
		cube_r5.texOffs(21, 19).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		ears2 = new ModelRenderer(this);
		ears2.setPos(0.0F, 11.0F, -9.0F);
		ears2.texOffs(12, 16).addBox(-1.0F, -4.899F, 2.8284F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		ears2.texOffs(16, 31).addBox(-1.0F, -3.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(12, 31).addBox(-1.0F, -4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(8, 31).addBox(-1.0F, -5.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(31, 4).addBox(-1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(4, 31).addBox(-1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(31, 0).addBox(-1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(0, 31).addBox(-1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(30, 22).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(24, 21).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(24, 18).addBox(-1.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(12, 21).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(4, 16).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ears2.texOffs(4, 0).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, 15.0065F, 1.9504F);
		ears2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
		cube_r6.texOffs(0, 0).addBox(-1.0F, -20.0F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r6.texOffs(0, 3).addBox(-1.0F, -20.0F, 2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, 3.0872F, 3.9331F);
		ears2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
		cube_r7.texOffs(5, 2).addBox(-1.0F, -9.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, 0.0F, 0.0F);
		ears2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
		cube_r8.texOffs(4, 19).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(G p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

	}

	public <T> void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount,
									  float ageInTicks, float netHeadYaw, float headPitch) {
		//this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		//this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.bone.xRot = MathHelper.cos(limbSwing * 0.4682F + (float)Math.PI) * 1F * limbSwingAmount;
		this.bone2.xRot = MathHelper.cos(limbSwing * 0.4682F) * 1F * limbSwingAmount;
	}



	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		arm1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		arm2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		eyes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		eyes2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		nose.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		smile.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		ears.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		ears2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public Consumer<ModelRenderer> andThen(Consumer<? super ModelRenderer> after) {
		return super.andThen(after);
	}
}