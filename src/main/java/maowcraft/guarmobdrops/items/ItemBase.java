package maowcraft.guarmobdrops.items;

import maowcraft.guarmobdrops.GuaranteedMobDrops;
import maowcraft.guarmobdrops.init.ModItems;
import maowcraft.guarmobdrops.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	public ItemBase(String name) {
		setUnlocalizedName(GuaranteedMobDrops.MODID+"."+name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	public void registerModels() {
		RegistryHandler.registerItemRenderer(this, 0, "inventory");
	}
}
