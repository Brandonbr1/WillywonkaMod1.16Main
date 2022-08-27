package com.jerios.willywonka.client.enity.model;// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.jerios.willywonka.enities.NiceWillyWonkaEnity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

import java.util.function.Consumer;

public class NiceWillyWonkaModel<G extends NiceWillyWonkaEnity> extends EntityModel<G> {
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer hands;
	private final ModelRenderer cube_r1;
	private final ModelRenderer hands2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer hat;
	private final ModelRenderer shoes;

	public NiceWillyWonkaModel() {
		texWidth = 64;
		texHeight = 64;

		leg1 = new ModelRenderer(this);
		leg1.setPos(0.0F, 24.0F, 0.0F);
		leg1.texOffs(20, 31).addBox(-2.0F, -10.0F, -0.75F, 1.0F, 9.0F, 1.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setPos(0.0F, 24.0F, 0.0F);
		leg2.texOffs(16, 31).addBox(3.0F, -10.0F, -0.75F, 1.0F, 9.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 23.0F, 0.0F);
		body.texOffs(0, 26).addBox(-2.0F, -16.0F, -1.0F, 6.0F, 7.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, 23.0F, 0.0F);
		head.texOffs(18, 20).addBox(-2.0F, -21.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

		hands = new ModelRenderer(this);
		hands.setPos(0.0F, 24.0F, 0.0F);
		hands.texOffs(0, 20).addBox(-4.0F, -16.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -18.4272F, 7.7754F);
		hands.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1.texOffs(14, 19).addBox(-4.0F, 1.0F, -14.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		hands2 = new ModelRenderer(this);
		hands2.setPos(8.0F, 24.0F, 0.0F);
		hands2.texOffs(18, 0).addBox(-4.0F, -16.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -18.4272F, 7.7754F);
		hands2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
		cube_r2.texOffs(0, 15).addBox(-4.0F, 1.0F, -14.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, 24.0F, 0.0F);
		hat.texOffs(0, 15).addBox(-4.0F, -23.0F, -5.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		hat.texOffs(14, 5).addBox(4.0F, -23.0F, -5.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		hat.texOffs(28, 12).addBox(-2.0F, -23.0F, -5.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		hat.texOffs(14, 16).addBox(-2.0F, -23.0F, 3.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		hat.texOffs(0, 0).addBox(-2.0F, -31.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		shoes = new ModelRenderer(this);
		shoes.setPos(0.0F, 24.0F, 0.0F);
		shoes.texOffs(28, 6).addBox(-3.0F, -2.0F, -2.75F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		shoes.texOffs(28, 0).addBox(2.0F, -2.0F, -2.75F, 3.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(G p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
	}



	public <T> void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount,
									  float ageInTicks, float netHeadYaw, float headPitch) {
		//this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		//this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.leg1.xRot = MathHelper.cos(limbSwing * 0.3989F + (float)Math.PI) * 1.2F * limbSwingAmount;
		this.leg2.xRot = MathHelper.cos(limbSwing * 0.3989F) * 1.2F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leg1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		hands.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		hands2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		hat.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		shoes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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