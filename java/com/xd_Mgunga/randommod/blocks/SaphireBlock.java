package com.xd_Mgunga.randommod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SaphireBlock extends BlockBase 
{

	public SaphireBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(10.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0F);
	}

}
