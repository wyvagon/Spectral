package wyvagon.spectral.core;

import wyvagon.spectral.Spectral;
import wyvagon.spectral.core.BlockHandler;
import wyvagon.spectral.item.*;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

//Holds references to items and registers items on Item RegistryEvent
@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(Spectral.MODID)
@SuppressWarnings("unchecked")
public class ItemHandler {

	public static final Item SOUL_JAR = null;
	
	public static List<Item> items;

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		items = Lists.newArrayList(new ItemSoulJar().setRegistryName("soul_jar"));

		BlockHandler.blocks.stream().forEach(block -> 
			items.add(new ItemBlock(block).setRegistryName(block.getRegistryName())));

		event.getRegistry().registerAll(items.toArray(new Item[0]));
	}


}