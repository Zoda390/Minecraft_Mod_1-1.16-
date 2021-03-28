package com.turtywurty.tutorialmod.client.entities.render;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.client.entities.model.light_cube_model;
import com.turtywurty.tutorialmod.common.entity.lightCube;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class light_cube_render extends MobRenderer<lightCube, light_cube_model<lightCube>> {
    protected static final ResourceLocation LIGHT_CUBE_TEXTURE = new ResourceLocation(TutorialMod.MOD_ID,
            "textures/entity/light_cube.png");

    public light_cube_render(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new light_cube_model<lightCube>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(lightCube entity) {

        return LIGHT_CUBE_TEXTURE;
    }
}
