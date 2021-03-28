package com.turtywurty.tutorialmod.client.entities.model;// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.turtywurty.tutorialmod.common.entity.lightCube;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class light_cube_model<L extends lightCube> extends EntityModel<L> {
	private final ModelRenderer rim;
	private final ModelRenderer bb_main;
	private final ModelRenderer inside_r1;

	public light_cube_model() {
		textureWidth = 32;
		textureHeight = 32;

		rim = new ModelRenderer(this);
		rim.setRotationPoint(0.0F, 16.0F, 0.0F);
		setRotationAngle(rim, -0.7854F, 0.0F, 0.7854F);
		rim.setTextureOffset(12, 0).addBox(-3.0F, 2.0F, 2.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rim.setTextureOffset(0, 12).addBox(-3.0F, 2.0F, -3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rim.setTextureOffset(0, 10).addBox(-3.0F, -3.0F, 2.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rim.setTextureOffset(0, 8).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		rim.setTextureOffset(6, 15).addBox(-3.0F, -3.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rim.setTextureOffset(0, 14).addBox(2.0F, -3.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rim.setTextureOffset(13, 4).addBox(-3.0F, 2.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rim.setTextureOffset(10, 10).addBox(2.0F, 2.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		rim.setTextureOffset(19, 2).addBox(-3.0F, -2.0F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rim.setTextureOffset(16, 15).addBox(-3.0F, -2.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rim.setTextureOffset(0, 19).addBox(2.0F, -2.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rim.setTextureOffset(16, 9).addBox(2.0F, -2.0F, 2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		inside_r1 = new ModelRenderer(this);
		inside_r1.setRotationPoint(0.0F, -8.0F, 0.0F);
		bb_main.addChild(inside_r1);
		setRotationAngle(inside_r1, -0.7854F, 0.0F, 0.7854F);
		inside_r1.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(L entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rim.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}