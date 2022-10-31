package com.gamemaster.worldvision.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class FuturistTab extends CreativeModeTab {
    public FuturistTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return Items.SAND.getDefaultInstance();
    }
}
