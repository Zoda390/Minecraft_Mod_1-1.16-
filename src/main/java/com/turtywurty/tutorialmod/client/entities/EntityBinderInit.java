package com.turtywurty.tutorialmod.client.entities;

import com.turtywurty.tutorialmod.client.entities.render.light_cube_render;
import com.turtywurty.tutorialmod.core.init.EntityTypeInit;
import net.minecraftforge.fml.client.registry.RenderingRegistry;


public class EntityBinderInit {
    public static void bindAllEntities() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTypeInit.LIGHT_CUBE.get(), light_cube_render::new);
    }
}
