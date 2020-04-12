package maowcraft.guarmobdrops.util.handlers;

import maowcraft.guarmobdrops.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class MobDropsHandler {
	@SubscribeEvent
	public void onMobKilled(LivingDropsEvent event) {
		EntityLivingBase entity = event.getEntityLiving();
		if (entity instanceof EntityBlaze) { entity.dropItem(ModItems.BLAZE_ROD_PIECE, 1); }
		if (entity instanceof EntityCreeper) { entity.dropItem(ModItems.GUNPOWDER_SCRAPS, 1); }
		if (entity instanceof EntityMagmaCube) { entity.dropItem(ModItems.MAGMA_CREAM_PIECE, 1); }
		if (entity instanceof EntitySkeleton) { entity.dropItem(ModItems.BONE_MARROW, 1); }
		if (entity instanceof EntitySlime) { entity.dropItem(ModItems.SLIME_BITS, 1); }
		if (entity instanceof EntitySpider) { entity.dropItem(ModItems.LOOSE_STRING, 1); }
		if (entity instanceof EntityWitherSkeleton) { entity.dropItem(ModItems.WITHERED_BONE, 1); }
		if (entity instanceof EntityEnderman) { entity.dropItem(ModItems.ENDER_PEARL_PIECE, 1); }
		if (entity instanceof EntityWither) { entity.dropItem(ModItems.NETHER_STAR_CHUNK, 1); }
	}
}
