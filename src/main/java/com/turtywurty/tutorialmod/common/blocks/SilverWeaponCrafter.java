package com.turtywurty.tutorialmod.common.blocks;

import com.turtywurty.tutorialmod.core.init.TileEntityTypeInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class SilverWeaponCrafter extends Block {
    public SilverWeaponCrafter() {
        super(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY).hardnessAndResistance(15f).sound(SoundType.METAL));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    //@Override
    //public TileEntity createTileEntity(BlockState state, IBlockReader world) {
    //    return TileEntityTypeInit.SWC_TILE_ENTITY_TYPE.get().create();
    //}
}
