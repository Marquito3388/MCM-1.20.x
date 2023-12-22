package net.marquito.mcm;

import com.mojang.logging.LogUtils;
import net.marquito.mcm.block.MCMBlockClass;
import net.marquito.mcm.creativetabs.MCMTabs;
import net.marquito.mcm.item.MCMItemsClass;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MarquitosCoreMod.MODID)
public class MarquitosCoreMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "mcm";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MarquitosCoreMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        MCMTabs.register(modEventBus);
        MCMItemsClass.register(modEventBus);
        MCMBlockClass.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
      /*
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){

            event.accept(MCMItemsClass.AZINITE);
            event.accept(MCMItemsClass.ECLITE);
            event.accept(MCMItemsClass.DRAKINITE);
            event.accept(MCMItemsClass.ECLITE);
            event.accept(MCMItemsClass.ICHORITE);
            event.accept(MCMItemsClass.ILLUMINITE);
            event.accept(MCMItemsClass.YONITE);
            event.accept(MCMItemsClass.VOLCANITE);
            event.accept(MCMItemsClass.BLACK_STEEL_CHUNK);


        }
*/
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
