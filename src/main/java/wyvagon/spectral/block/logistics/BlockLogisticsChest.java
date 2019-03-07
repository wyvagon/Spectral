package wyvagon.spectral.block.logistics;

import wyvagon.spectral.Spectral;
import wyvagon.spectral.tile.logistics.TileLogisticsChest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockLogisticsChest extends Block {
	
	public BlockLogisticsChest() {
		super(Material.ROCK);
		setTranslationKey(Spectral.MODID + ".logisticsChest");
		setCreativeTab(Spectral.SPECTRAL_TAB);
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 1);
	}

	@Nullable
	@Override
	public TileEntity createTileEntity(World worldIn, IBlockState state) {
		return new TileLogisticsChest();
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
}