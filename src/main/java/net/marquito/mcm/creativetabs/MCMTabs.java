package net.marquito.mcm.creativetabs;

import net.marquito.mcm.block.MCMBlockClass;
import net.marquito.mcm.item.MCMItemsClass;
import net.marquito.mcm.MarquitosCoreMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MCMTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarquitosCoreMod.MODID);



    public static final RegistryObject<CreativeModeTab> MATERIALS_TAB = CREATIVE_MODE_TABS.register("meaterials_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(MCMItemsClass.BLACK_STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.meaterials_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(MCMItemsClass.BLACK_STEEL_INGOT.get());
                        pOutput.accept(MCMItemsClass.SILVER_INGOT.get());
                        pOutput.accept(MCMItemsClass.STEEL_INGOT.get());

                        pOutput.accept(MCMItemsClass.ONYX.get());
                        pOutput.accept(MCMItemsClass.PERIODITE.get());
                        pOutput.accept(MCMItemsClass.TOURMALINE.get());

                        pOutput.accept(MCMItemsClass.AZINITE.get());
                        pOutput.accept(MCMItemsClass.DRAKINITE.get());
                        pOutput.accept(MCMItemsClass.ICHORITE.get());
                        pOutput.accept(MCMItemsClass.YONITE.get());
                        pOutput.accept(MCMItemsClass.VOLCANITE.get());
                        pOutput.accept(MCMItemsClass.ILLUMINITE.get());
                        pOutput.accept(MCMItemsClass.VOIDITE.get());
                        pOutput.accept(MCMItemsClass.ECLITE.get());


                        pOutput.accept(MCMItemsClass.WHITE_BRICK.get());


                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> RC_TAB = CREATIVE_MODE_TABS.register("rc_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(MCMItemsClass.SILVER_CHUNK.get()))
                    .title(Component.translatable("creativetab.rc_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(MCMItemsClass.BLACK_STEEL_CHUNK.get());
                        pOutput.accept(MCMItemsClass.SILVER_CHUNK.get());
                        pOutput.accept(MCMItemsClass.STEEL_CHUNK.get());

                        pOutput.accept(MCMItemsClass.RAW_BLACK_STEEL.get());
                        pOutput.accept(MCMItemsClass.RAW_SILVER.get());
                        pOutput.accept(MCMItemsClass.RAW_STEEL.get());

                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(MCMBlockClass.ONYX_ORE.get()))
                    .title(Component.translatable("creativetab.blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(MCMBlockClass.BLACK_STEEL_BLOCK.get());
                        pOutput.accept(MCMBlockClass.SILVER_BLOCK.get());
                        pOutput.accept(MCMBlockClass.STEEL_BLOCK.get());

                        pOutput.accept(MCMBlockClass.ONYX_BLOCK.get());
                        pOutput.accept(MCMBlockClass.PERIODITE_BLOCK.get());
                        pOutput.accept(MCMBlockClass.TOURMALINE_BLOCK.get());



                        pOutput.accept(MCMBlockClass.BLACKSTEEL_ORE.get());
                        pOutput.accept(MCMBlockClass.SILVER_ORE.get());
                        pOutput.accept(MCMBlockClass.STEEL_ORE.get());

                        pOutput.accept(MCMBlockClass.ONYX_ORE.get());
                        pOutput.accept(MCMBlockClass.PERIODITE_ORE.get());
                        pOutput.accept(MCMBlockClass.TOURMALINE_ORE.get());



                        pOutput.accept(MCMBlockClass.WHITE_BRICKS.get());
                        pOutput.accept(MCMBlockClass.WHITE_BRICKS_2.get());
                        pOutput.accept(MCMBlockClass.WHITE_BRICKS_3.get());

                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> WEAPONS_TOOLS = CREATIVE_MODE_TABS.register("weapons_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(MCMItemsClass.STEEL_SWORD.get()))
                    .title(Component.translatable("creativetab.weapons_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(MCMItemsClass.SILVER_SWORD.get());
                        pOutput.accept(MCMItemsClass.STEEL_SWORD.get());
                        pOutput.accept(MCMItemsClass.BLACK_STEEL_SWORD.get());
                        pOutput.accept(MCMItemsClass.ONYX_SWORD.get());
                        pOutput.accept(MCMItemsClass.PERIODITE_SWORD.get());
                        pOutput.accept(MCMItemsClass.TOURMALINE_SWORD.get());


                        pOutput.accept(MCMItemsClass.SILVER_SHOVEL.get());
                        pOutput.accept(MCMItemsClass.STEEL_SHOVEL.get());
                        pOutput.accept(MCMItemsClass.BLACK_STEEL_SHOVEL.get());
                        pOutput.accept(MCMItemsClass.ONYX_SHOVEL.get());
                        pOutput.accept(MCMItemsClass.PERIODITE_SHOVEL.get());
                        pOutput.accept(MCMItemsClass.TOURMALINE_SHOVEL.get());


                        pOutput.accept(MCMItemsClass.SILVER_PICKAXE.get());
                        pOutput.accept(MCMItemsClass.STEEL_PICKAXE.get());
                        pOutput.accept(MCMItemsClass.BLACK_STEEL_PICKAXE.get());
                        pOutput.accept(MCMItemsClass.ONYX_PICKAXE.get());
                        pOutput.accept(MCMItemsClass.PERIODITE_PICKAXE.get());
                        pOutput.accept(MCMItemsClass.TOURMALINE_PICKAXE.get());


                        pOutput.accept(MCMItemsClass.SILVER_AXE.get());
                        pOutput.accept(MCMItemsClass.STEEL_AXE.get());
                        pOutput.accept(MCMItemsClass.BLACK_STEEL_AXE.get());
                        pOutput.accept(MCMItemsClass.ONYX_AXE.get());
                        pOutput.accept(MCMItemsClass.PERIODITE_AXE.get());
                        pOutput.accept(MCMItemsClass.TOURMALINE_AXE.get());


                        pOutput.accept(MCMItemsClass.SILVER_HOE.get());
                        pOutput.accept(MCMItemsClass.STEEL_HOE.get());
                        pOutput.accept(MCMItemsClass.BLACK_STEEL_HOE.get());
                        pOutput.accept(MCMItemsClass.ONYX_HOE.get());
                        pOutput.accept(MCMItemsClass.PERIODITE_HOE.get());
                        pOutput.accept(MCMItemsClass.TOURMALINE_HOE.get());


                    })
                    .build());



    public static final RegistryObject<CreativeModeTab> ARMOR = CREATIVE_MODE_TABS.register("armor_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(MCMItemsClass.SILVER_CHESTPLATE.get()))
                    .title(Component.translatable("creativetab.armor_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(MCMItemsClass.BLACKSTEEL_HELMET.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_CHESTPLATE.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_LEGGING.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_BOOTS.get());


                        pOutput.accept(MCMItemsClass.SILVER_HELMET.get());
                        pOutput.accept(MCMItemsClass.SILVER_CHESTPLATE.get());
                        pOutput.accept(MCMItemsClass.SILVER_LEGGING.get());
                        pOutput.accept(MCMItemsClass.SILVER_BOOTS.get());


                        pOutput.accept(MCMItemsClass.STEEL_HELMET.get());
                        pOutput.accept(MCMItemsClass.STEEL_CHESTPLATE.get());
                        pOutput.accept(MCMItemsClass.STEEL_LEGGING.get());
                        pOutput.accept(MCMItemsClass.STEEL_BOOTS.get());


                        pOutput.accept(MCMItemsClass.BLACKSTEEL_O_HELMET.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_O_CHESTPLATE.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_O_LEGGING.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_O_BOOTS.get());


                        pOutput.accept(MCMItemsClass.BLACKSTEEL_P_HELMET.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_P_CHESTPLATE.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_P_LEGGING.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_P_BOOTS.get());


                        pOutput.accept(MCMItemsClass.BLACKSTEEL_T_HELMET.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_T_CHESTPLATE.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_T_LEGGING.get());
                        pOutput.accept(MCMItemsClass.BLACKSTEEL_T_BOOTS.get());


                    })
                    .withSearchBar()
                    .build());


    public static void register (IEventBus eventBus){

        CREATIVE_MODE_TABS.register(eventBus);
    }
}
