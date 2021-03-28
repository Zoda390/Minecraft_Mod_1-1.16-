package com.turtywurty.tutorialmod.core.init;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.common.container.DisplayCaseContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypeInit {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, TutorialMod.MOD_ID);

    public static final RegistryObject<ContainerType<DisplayCaseContainer>> DISPLAY_CASE_CONTAINER_TYPE = CONTAINER_TYPES
            .register("display_case", () -> IForgeContainerType.create(DisplayCaseContainer::new));

}
