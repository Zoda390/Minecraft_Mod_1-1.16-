package com.turtywurty.tutorialmod.core.util;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.client.screen.DisplayCaseScreen;
import com.turtywurty.tutorialmod.core.init.ContainerTypeInit;
import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ContainerTypeInit.DISPLAY_CASE_CONTAINER_TYPE.get(), DisplayCaseScreen::new);

    }
}
