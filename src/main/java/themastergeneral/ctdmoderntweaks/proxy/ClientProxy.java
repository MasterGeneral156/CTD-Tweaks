package themastergeneral.ctdmoderntweaks.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import themastergeneral.ctdmoderntweaks.ctdmoderntweaks;

public class ClientProxy extends CommonProxy {

 public void registerItemRenderer(Item item, int meta, String id) {
 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ctdmoderntweaks.modId + ":" + id, "inventory"));
 }
}