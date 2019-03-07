package wyvagon.spectral.core;

import wyvagon.spectral.Spectral;
import wyvagon.spectral.block.*;
import wyvagon.spectral.block.logistics.*;
import wyvagon.spectral.tile.logistics.*;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;

@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(Spectral.MODID)
@SuppressWarnings("unchecked")
public class BlockHandler {

	public static final Block LOGISTICS_BEACON = null;

	public static List<Block> blocks;

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		blocks = Lists.newArrayList(new BlockLogisticsBeacon().setRegistryName("logistics_beacon"));

		event.getRegistry().registerAll(blocks.toArray(new Block[0]));

		registerTileEntities();
	}

	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileLogisticsBeacon.class, new ResourceLocation(Spectral.MODID, "logistics_beacon"));
	}

}