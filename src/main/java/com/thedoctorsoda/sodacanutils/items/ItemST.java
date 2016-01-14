package com.thedoctorsoda.sodacanutils.items;

import com.thedoctorsoda.sodacanutils.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemST extends Item {
	public ItemST() {
		super();
		this.setCreativeTab(CreativeTabs.tabAllSearch);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", Reference.RESOURCE_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s%s", Reference.RESOURCE_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}