package com.themastergeneral.ctdtweaks.imc.enderfuge;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.event.FMLInterModComms;

public class IMEEnderfuge {
	public static final void addEnderfugeSmelt(ItemStack input,
			ItemStack output, float xp) {
		if (input == null || output == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		input.writeToNBT(toSend.getCompoundTag("input"));
		output.writeToNBT(toSend.getCompoundTag("output"));
		FMLInterModComms.sendMessage("enderfuge", "addenderfugerecipe",
				toSend);
	}
}
