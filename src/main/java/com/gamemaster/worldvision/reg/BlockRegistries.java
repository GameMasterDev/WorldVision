package com.gamemaster.worldvision.reg;

import com.gamemaster.worldvision.models.Computer;
import com.gamemaster.worldvision.utils.Refs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistries {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Refs.MOD_ID);

    public static final RegistryObject<Block> COMPUTER = BLOCKS.register
            ("computer", () -> new Computer(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()));

}
