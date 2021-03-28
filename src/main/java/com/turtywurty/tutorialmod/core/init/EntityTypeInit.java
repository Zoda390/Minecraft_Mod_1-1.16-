package com.turtywurty.tutorialmod.core.init;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.common.entity.lightCube;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, TutorialMod.MOD_ID);

    public static final RegistryObject<EntityType<lightCube>> LIGHT_CUBE = ENTITY_TYPES.register("light_cube",
            () -> EntityType.Builder.<lightCube>create(lightCube::new, EntityClassification.CREATURE).size(0.9f, 0.5f)
                    .build(new ResourceLocation(TutorialMod.MOD_ID, "light_cube").toString()));
}
