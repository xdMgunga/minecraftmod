package com.xd_Mgunga.randommod.init;

import java.util.ArrayList;
import java.util.List;

import com.xd_Mgunga.randommod.items.ItemBase;
import com.xd_Mgunga.randommod.items.armor.ArmorBase;
import com.xd_Mgunga.randommod.items.tools.ToolAxe;
import com.xd_Mgunga.randommod.items.tools.ToolPickaxe;
import com.xd_Mgunga.randommod.items.tools.ToolSpade;
import com.xd_Mgunga.randommod.items.tools.ToolSword;
import com.xd_Mgunga.randommod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_SAPHIRE = EnumHelper.addToolMaterial("material_saphire", 3, 2600, 15.0F, 3.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 20, new int[] {4, 7, 9, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ToolMaterial MATERIAL_UHH = EnumHelper.addToolMaterial("material_uhh", 3, 9999, 1000.0F, 900.0F, 23);
	public static final ArmorMaterial ARMOR_MATERIAL_UHH = EnumHelper.addArmorMaterial("armor_material_uhh", Reference.MOD_ID + ":uhh", 900, new int[] {994, 997, 999, 995}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ToolMaterial MATERIAL_NORSE_INGOT = EnumHelper.addToolMaterial("material_norse_ingot", 3, 9999, 30.0F, 250.0F, 23);
	
	//Items
	public static final Item BEDROCK_INGOT = new ItemBase("bedrock_ingot");
	public static final Item SAPHIRE = new ItemBase("saphire");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item DIAMOND_INGOT = new ItemBase("diamond_ingot");
	public static final Item COMPRESSED_DIAMOND = new ItemBase("compressed_diamond");
	public static final Item UHH = new ItemBase("uhh");
	public static final Item COMPRESSED_STICK = new ItemBase("compressed_stick");
	public static final Item DOUBLE_COMPRESSED_STICK = new ItemBase("double_compressed_stick");
	public static final Item NORSE_INGOT = new ItemBase("norse_ingot");
	public static final Item V = new ItemBase("v");
	
	//Tools
	public static final ItemSword SAPHIRE_SWORD = new ToolSword("saphire_sword", MATERIAL_SAPHIRE);
	public static final ItemSpade SAPHIRE_SHOVEL = new ToolSpade("saphire_shovel", MATERIAL_SAPHIRE);
	public static final ItemPickaxe SAPHIRE_PICKAXE = new ToolPickaxe("saphire_pickaxe", MATERIAL_SAPHIRE);
	public static final ItemAxe SAPHIRE_AXE = new ToolAxe("saphire_axe", MATERIAL_SAPHIRE);
	public static final ItemSword UHH_SWORD = new ToolSword("uhh_sword", MATERIAL_UHH);
	public static final ItemPickaxe UHH_PICKAXE = new ToolPickaxe("uhh_pickaxe", MATERIAL_UHH);
	public static final ItemAxe UHH_AXE = new ToolAxe("uhh_axe", MATERIAL_UHH);
	public static final ItemSpade UHH_SHOVEL = new ToolSpade("uhh_shovel", MATERIAL_UHH);
	public static final ItemPickaxe MJOLNIR = new ToolPickaxe("mjolnir", MATERIAL_NORSE_INGOT);
	
	//Armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	public static final Item UHH_HELMET = new ArmorBase("uhh_helmet", ARMOR_MATERIAL_UHH, 1, EntityEquipmentSlot.HEAD);
	public static final Item UHH_CHESTPLATE = new ArmorBase("uhh_chestplate", ARMOR_MATERIAL_UHH, 1, EntityEquipmentSlot.CHEST);
	public static final Item UHH_LEGGINGS = new ArmorBase("uhh_leggings", ARMOR_MATERIAL_UHH, 1, EntityEquipmentSlot.LEGS);
	public static final Item UHH_BOOTS = new ArmorBase("uhh_boots", ARMOR_MATERIAL_UHH, 1, EntityEquipmentSlot.FEET);

}
