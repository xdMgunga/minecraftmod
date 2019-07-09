package com.xd_Mgunga.randommod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Shit extends BlockBase 
{

	public Shit(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.SAND);
		setResistance(6000.0F);
		setHardness(1.0F);
		setLightLevel(1.0F);
	}
}


