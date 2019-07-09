package com.xd_Mgunga.randommod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NorseOre extends BlockBase {
	
	public NorseOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(15.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0F);
	}
}