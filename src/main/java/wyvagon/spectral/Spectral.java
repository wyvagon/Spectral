package wyvagon.spectral;

import wyvagon.spectral.core.ItemHandler;
import wyvagon.spectral.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Spectral.MODID, name = Spectral.NAME, version = Spectral.VERSION, useMetadata = true)
public class Spectral {

	public static final String MODID = "spectral";
	public static final String NAME = "Spectral";
	public static final String VERSION = "1.0.0";
	public static final CreativeTabs SPECTRAL_TAB = new CreativeTabs(MODID) {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemHandler.SOUL_JAR);
		}
	};

	@SidedProxy(clientSide = "wyvagon.spectral.proxy.ClientProxy", serverSide = "wyvagon.spectral.proxy.CommonProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static Spectral instance;

	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}