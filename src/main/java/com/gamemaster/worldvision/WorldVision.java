package com.gamemaster.worldvision;

import com.gamemaster.worldvision.tabs.TechnologicTab;
import com.gamemaster.worldvision.utils.Refs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Refs.MOD_ID)
public class WorldVision {

    public static CreativeModeTab technologicTab = new TechnologicTab("TechnologicTab");

    public WorldVision() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(technologicTab);

    }

}