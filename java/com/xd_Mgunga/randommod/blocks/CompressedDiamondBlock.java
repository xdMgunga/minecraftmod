package com.xd_Mgunga.randommod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CompressedDiamondBlock extends BlockBase {
	
	public CompressedDiamondBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(20.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0F);
	}
}
