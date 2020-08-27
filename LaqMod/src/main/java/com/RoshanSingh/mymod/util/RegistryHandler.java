package com.RoshanSingh.mymod.util;

import com.RoshanSingh.mymod.LaqMod;
import com.RoshanSingh.mymod.blocks.BlockItemBase;
import com.RoshanSingh.mymod.blocks.ExtremeDemonBlock;
import com.RoshanSingh.mymod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LaqMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, LaqMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> EXTREME_DEMON = ITEMS.register("extreme_demon", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> EXTREME_DEMON_BLOCK = BLOCKS.register("extreme_demon_block", ExtremeDemonBlock::new);


    // Block Items
    public static final RegistryObject<Item> EXTREME_DEMON_BLOCK_ITEM = ITEMS.register("extreme_demon_block", () -> new BlockItemBase(EXTREME_DEMON_BLOCK.get()));


}
