package wyvagon.spectral.core;

import wyvagon.spectral.Spectral;
import wyvagon.spectral.item.*;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;

//Holds references to items and registers items on Item RegistryEvent
@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(Spectral.MODID)
public class ItemHandler {
	
	public static List<Item> items;

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		items = new ArrayList();
	}


}