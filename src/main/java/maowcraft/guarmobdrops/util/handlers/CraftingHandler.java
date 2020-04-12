//package maowcraft.guarmobdrops.util.handlers;
//
//import maowcraft.guarmobdrops.GuaranteedMobDrops;
//import net.minecraft.client.Minecraft;
//import net.minecraft.entity.effect.EntityLightningBolt;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.init.Items;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.text.TextComponentString;
//import net.minecraft.util.text.TextFormatting;
//import net.minecraft.world.World;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//
//@EventBusSubscriber
//public class CraftingHandler {
//	@SubscribeEvent
//	public void onItemCrafted(ItemCraftedEvent event) {
//		if (event.crafting.getItem() == Items.NETHER_STAR) {
//			BlockPos pos = event.player.getPosition();
//			EntityPlayer player = Minecraft.getMinecraft().player;
//			World world = player.getEntityWorld();
//			EntityLightningBolt lightning = new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ(), false);
//			
//			world.addWeatherEffect(lightning);
//		}
//	}
//}
