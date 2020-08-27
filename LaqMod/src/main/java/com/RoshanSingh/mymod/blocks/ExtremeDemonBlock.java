package com.RoshanSingh.mymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ExtremeDemonBlock extends Block {

    public ExtremeDemonBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(10.0f, 100000000000.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)


        );
    }
}
