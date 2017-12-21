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
		toSend.setTag("input", input.writeToNBT(new NBTTagCompound()));
		toSend.setTag("output", output.writeToNBT(new NBTTagCompound()));
		toSend.setFloat("xp", xp);
		
		FMLInterModComms.sendMessage("enderfuge", "addenderfugerecipe",
				toSend);
	}
	public static final void addEnderfugeFuel(ItemStack input, int burntime)
	{
		if (input == null || burntime == 0) {
			return;
		}
		String burntime1=String.valueOf(burntime);
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", input.writeToNBT(new NBTTagCompound()));
		toSend.setInteger("burn", burntime);
		
		FMLInterModComms.sendMessage("enderfuge", "addenderfugefuel",
				toSend);
	}
}
