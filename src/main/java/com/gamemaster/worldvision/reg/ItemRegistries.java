package com.gamemaster.worldvision.reg;

import com.gamemaster.worldvision.WorldVision;
import com.gamemaster.worldvision.utils.Refs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistries {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Refs.MOD_ID);

    public static final RegistryObject<Item> COMPUTER_ITEM = ITEMS.register
            ("computer_item", () -> new BlockItem(BlockRegistries.COMPUTER.get(), new Item.Properties().tab(WorldVision.futuristTab)));

}
