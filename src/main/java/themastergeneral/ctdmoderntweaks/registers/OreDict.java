package themastergeneral.ctdmoderntweaks.registers;

import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	public static final void init() {
		OreDict.block();
		OreDict.ore();
		OreDict.ingot();
		OreDict.dust();
		OreDict.nugget();
	}
	public static final void ore() {
		
	}
	public static final void ingot() {
		
		
	}
	public static final void block() {
		
	}
	public static final void dust() {
		
	}
	public static final void nugget() {
		OreDictionary.registerOre("nuggetTin", ModItems.nuggetTin);
	}
}
