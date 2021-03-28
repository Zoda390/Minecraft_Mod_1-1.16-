package com.turtywurty.tutorialmod.core.init;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.common.blocks.te.DisplayCaseTileEntity;
//import com.turtywurty.tutorialmod.common.blocks.te.SWCTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeInit {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TutorialMod.MOD_ID);

    //public static final RegistryObject<TileEntityType<SWCTileEntity>> SWC_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE.register("silver_weapon_crafter",
    //        () -> TileEntityType.Builder.create(SWCTileEntity::new, BlockInit.SILVER_WEAPON_CRAFTER.get()).build(null));
    public static final RegistryObject<TileEntityType<DisplayCaseTileEntity>> DISPLAY_CASE_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE.register("display_case",
            () -> TileEntityType.Builder.create(DisplayCaseTileEntity::new, BlockInit.DISPLAY_CASE.get()).build(null));

}
