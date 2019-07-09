package com.xd_Mgunga.randommod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 3), 1.5F);
		GameRegistry.addSmelting(Blocks.WOOL, new ItemStack(ModBlocks.SHIT, 1), 100.0F);
		GameRegistry.addSmelting(ModBlocks.NORSE_ORE, new ItemStack(ModItems.NORSE_INGOT, 1), 10.0F);
	}
}
