package maowcraft.guarmobdrops;

//import maowcraft.guarmobdrops.util.handlers.CraftingHandler;
import maowcraft.guarmobdrops.util.handlers.MobDropsHandler;
import maowcraft.guarmobdrops.util.handlers.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=GuaranteedMobDrops.MODID,name=GuaranteedMobDrops.MODNAME,version=GuaranteedMobDrops.VERSION,acceptedMinecraftVersions=GuaranteedMobDrops.MCVERSION)
public class GuaranteedMobDrops {
	public static final String MODID = "guarmobdrops";
	public static final String MODNAME = "Guaranteed Mob Drops";
	public static final String VERSION = "1.0.0";
	public static final String MCVERSION = "1.12.2";
	
	@Instance
	public static GuaranteedMobDrops instance;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new RegistryHandler());
		MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
//		MinecraftForge.EVENT_BUS.register(new CraftingHandler());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
