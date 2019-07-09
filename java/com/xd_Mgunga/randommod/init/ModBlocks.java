package com.xd_Mgunga.randommod.init;


import java.util.ArrayList;
import java.util.List;

import com.xd_Mgunga.randommod.blocks.BedrockBlock;
import com.xd_Mgunga.randommod.blocks.BlockBase;
import com.xd_Mgunga.randommod.blocks.NorseOre;
import com.xd_Mgunga.randommod.blocks.RubyOre;
import com.xd_Mgunga.randommod.blocks.SaphireBlock;
import com.xd_Mgunga.randommod.blocks.SaphireOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block SAPHIRE_BLOCK = new SaphireBlock("saphire_block", Material.IRON);
	public static final Block BEDROCK_BLOCK = new BedrockBlock("bedrock_block", Material.IRON);
	public static final Block SAPHIRE_ORE = new SaphireOre("saphire_ore", Material.ROCK);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block SHIT = new RubyOre("shit", Material.SAND);
	public static final Block COMPRESSED_DIAMOND_BLOCK = new RubyOre("compressed_diamond_block", Material.IRON);
	public static final Block NORSE_ORE = new NorseOre("norse_ore", Material.ROCK);
	
	
}
