package com.xd_Mgunga.randommod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BedrockBlock extends BlockBase 
{

	public BedrockBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setResistance(6000.0F);
		setBlockUnbreakable();
	}
}
