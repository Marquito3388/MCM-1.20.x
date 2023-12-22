package net.marquito.mcm.item;

import net.marquito.mcm.MarquitosCoreMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MCMItemsClass {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarquitosCoreMod.MODID);


    //------------------------------------------------------------------------------------------------------------------

    //INGOTS

    public static final RegistryObject<Item> BLACK_STEEL_INGOT = ITEMS.register("blacksteel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver",
            () -> new Item(new Item.Properties()));


    //SPECIAL INGOTS

    public static final RegistryObject<Item> AZINITE = ITEMS.register("azinite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAKINITE = ITEMS.register("drakinite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ECLITE = ITEMS.register("eclite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ICHORITE = ITEMS.register("ichorite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ILLUMINITE = ITEMS.register("illuminite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VOIDITE = ITEMS.register("voidite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VOLCANITE = ITEMS.register("volcanite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> YONITE = ITEMS.register("yonite",
            () -> new Item(new Item.Properties()));


    //CRYSTALS

    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIODITE = ITEMS.register("periodite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE = ITEMS.register("tourmaline",
            () -> new Item(new Item.Properties()));


    //RAW

    public static final RegistryObject<Item> RAW_BLACK_STEEL = ITEMS.register("raw_blacksteel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));


    //CHUNK

    public static final RegistryObject<Item> BLACK_STEEL_CHUNK = ITEMS.register("blacksteel_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_CHUNK = ITEMS.register("steel_chunk",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_CHUNK = ITEMS.register("silver_chunk",
            () -> new Item(new Item.Properties()));

    //MISC

    public static final RegistryObject<Item> WHITE_BRICK = ITEMS.register("whitebrick",
            () -> new Item(new Item.Properties()));




    //------------------------------------------------------------------------------------------------------------------

    //SWORDS

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(MCMToolTiers.SILVER, 3, -2.2F, new  Item.Properties()));


    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(MCMToolTiers.STEEL, 3, -2.2F, new  Item.Properties()));


    public static final RegistryObject<Item> BLACK_STEEL_SWORD = ITEMS.register("blacksteel_sword",
            () -> new SwordItem(MCMToolTiers.BLACK_STEEL, 3, -2.2F, new  Item.Properties()));


    public static final RegistryObject<Item> ONYX_SWORD = ITEMS.register("onyx_sword",
            () -> new SwordItem(MCMToolTiers.ONYX, 3, -2.4F, new  Item.Properties()));


    public static final RegistryObject<Item> PERIODITE_SWORD = ITEMS.register("periodite_sword",
            () -> new SwordItem(MCMToolTiers.PERIODITE, 3, -2.2F, new  Item.Properties()));


    public static final RegistryObject<Item> TOURMALINE_SWORD = ITEMS.register("tourmaline_sword",
            () -> new SwordItem(MCMToolTiers.TOURMALINE, 3, -2.2F, new  Item.Properties()));


    //SHOVEL =========================



    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(MCMToolTiers.SILVER, 2, -3F, new  Item.Properties()));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(MCMToolTiers.STEEL, 2, -3F, new  Item.Properties()));

    public static final RegistryObject<Item> BLACK_STEEL_SHOVEL = ITEMS.register("blacksteel_shovel",
            () -> new ShovelItem(MCMToolTiers.BLACK_STEEL, 2, -3F, new  Item.Properties()));



    public static final RegistryObject<Item> ONYX_SHOVEL = ITEMS.register("onyx_shovel",
            () -> new ShovelItem(MCMToolTiers.ONYX, 1.5F, -3F, new  Item.Properties()));

    public static final RegistryObject<Item> PERIODITE_SHOVEL = ITEMS.register("periodite_shovel",
            () -> new ShovelItem(MCMToolTiers.PERIODITE, 2, -3F, new  Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE_SHOVEL = ITEMS.register("tourmaline_shovel",
            () -> new ShovelItem(MCMToolTiers.TOURMALINE, 2, -3F, new  Item.Properties()));



    //PICKAXE =========================

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(MCMToolTiers.SILVER, 1, -2.6F, new  Item.Properties()));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(MCMToolTiers.STEEL, 2, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> BLACK_STEEL_PICKAXE = ITEMS.register("blacksteel_pickaxe",
            () -> new PickaxeItem(MCMToolTiers.BLACK_STEEL, 2, -2.8F, new  Item.Properties()));


    public static final RegistryObject<Item> ONYX_PICKAXE = ITEMS.register("onyx_pickaxe",
            () -> new PickaxeItem(MCMToolTiers.ONYX, 1, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> PERIODITE_PICKAXE = ITEMS.register("periodite_pickaxe",
            () -> new PickaxeItem(MCMToolTiers.PERIODITE, 2, -2.8F, new  Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE_PICKAXE = ITEMS.register("tourmaline_pickaxe",
            () -> new PickaxeItem(MCMToolTiers.TOURMALINE, 2, -2.8F, new  Item.Properties()));



    //AXE =========================


    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(MCMToolTiers.SILVER, 7, -3.15F, new  Item.Properties()));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(MCMToolTiers.STEEL, 6, -3.05F, new  Item.Properties()));

    public static final RegistryObject<Item> BLACK_STEEL_AXE = ITEMS.register("blacksteel_axe",
            () -> new AxeItem(MCMToolTiers.BLACK_STEEL, 5, -2.9F, new  Item.Properties()));

    public static final RegistryObject<Item> ONYX_AXE = ITEMS.register("onyx_axe",
            () -> new AxeItem(MCMToolTiers.ONYX, 6, -3.10F, new  Item.Properties()));

    public static final RegistryObject<Item> PERIODITE_AXE = ITEMS.register("periodite_axe",
            () -> new AxeItem(MCMToolTiers.PERIODITE, 6, -3.05F, new  Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE_AXE = ITEMS.register("tourmaline_axe",
            () -> new AxeItem(MCMToolTiers.TOURMALINE, 5, -2.9F, new  Item.Properties()));



    //HOE =========================

    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(MCMToolTiers.SILVER, -1, -1.5F, new  Item.Properties()));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(MCMToolTiers.STEEL, -2, -0.5F, new  Item.Properties()));

    public static final RegistryObject<Item> BLACK_STEEL_HOE = ITEMS.register("blacksteel_hoe",
            () -> new HoeItem(MCMToolTiers.BLACK_STEEL, -3, 0.5F, new  Item.Properties()));


    public static final RegistryObject<Item> ONYX_HOE = ITEMS.register("onyx_hoe",
            () -> new HoeItem(MCMToolTiers.ONYX, -2, -1F, new  Item.Properties()));

    public static final RegistryObject<Item> PERIODITE_HOE = ITEMS.register("periodite_hoe",
            () -> new HoeItem(MCMToolTiers.PERIODITE, -2, -0.5F, new  Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE_HOE = ITEMS.register("tourmaline_hoe",
            () -> new HoeItem(MCMToolTiers.TOURMALINE, -3, 0.5F, new  Item.Properties()));


    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(MCMArmorMaterials.SILVER, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(MCMArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> SILVER_LEGGING = ITEMS.register("silver_leggings",
            () -> new ArmorItem(MCMArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(MCMArmorMaterials.SILVER, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(MCMArmorMaterials.STEEL, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(MCMArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> STEEL_LEGGING = ITEMS.register("steel_leggings",
            () -> new ArmorItem(MCMArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(MCMArmorMaterials.STEEL, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static final RegistryObject<Item> BLACKSTEEL_HELMET = ITEMS.register("blacksteel_helmet",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_CHESTPLATE = ITEMS.register("blacksteel_chestplate",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_LEGGING = ITEMS.register("blacksteel_leggings",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_BOOTS = ITEMS.register("blacksteel_boots",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL, ArmorItem.Type.BOOTS,
                    new Item.Properties()));




    public static final RegistryObject<Item> BLACKSTEEL_O_HELMET = ITEMS.register("blacksteel_helmet_o",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_O, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_O_CHESTPLATE = ITEMS.register("blacksteel_chestplate_o",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_O, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_O_LEGGING = ITEMS.register("blacksteel_leggings_o",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_O, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_O_BOOTS = ITEMS.register("blacksteel_boots_o",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_O, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static final RegistryObject<Item> BLACKSTEEL_P_HELMET = ITEMS.register("blacksteel_helmet_p",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_P, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_P_CHESTPLATE = ITEMS.register("blacksteel_chestplate_p",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_P, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_P_LEGGING = ITEMS.register("blacksteel_leggings_p",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_P, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_P_BOOTS = ITEMS.register("blacksteel_boots_p",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_P, ArmorItem.Type.BOOTS,
                    new Item.Properties()));



    public static final RegistryObject<Item> BLACKSTEEL_T_HELMET = ITEMS.register("blacksteel_helmet_t",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_T, ArmorItem.Type.HELMET,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_T_CHESTPLATE = ITEMS.register("blacksteel_chestplate_t",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_T, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_T_LEGGING = ITEMS.register("blacksteel_leggings_t",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_T, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));

    public static final RegistryObject<Item> BLACKSTEEL_T_BOOTS = ITEMS.register("blacksteel_boots_t",
            () -> new ArmorItem(MCMArmorMaterials.BLACKSTEEL_T, ArmorItem.Type.BOOTS,
                    new Item.Properties()));


 /*
--------------------------------------------------------------


    //HELMET

    public static final RegistryObject<Item> BLACK_STEEL_HELMET = ITEMS.register("blacksteel_helmet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ONYX_HELMET = ITEMS.register("onyx_helmet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE_HELMET = ITEMS.register("tourmaline_helmet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIODITE_HELMET = ITEMS.register("periodite_helmet",
            () -> new Item(new Item.Properties()));


    //CHESTPLATE

    public static final RegistryObject<Item> BLACK_STEEL_CHESTPLATE = ITEMS.register("blacksteel_chestplate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ONYX_CHESTPLATE = ITEMS.register("onyx_chestplate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE_CHESTPLATE = ITEMS.register("tourmaline_chestplate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIODITE_CHESTPLATE = ITEMS.register("periodite_chestplate",
            () -> new Item(new Item.Properties()));


    //LEGGINGS

    public static final RegistryObject<Item> BLACK_STEEL_LEGGINGS = ITEMS.register("blacksteel_leggings",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ONYX_LEGGINGS = ITEMS.register("onyx_leggings",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE_LEGGINGS = ITEMS.register("tourmaline_leggings",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIODITE_LEGGINGS = ITEMS.register("periodite_leggings",
            () -> new Item(new Item.Properties()));


    //BOOTS

    public static final RegistryObject<Item> BLACK_STEEL_BOOTS = ITEMS.register("blacksteel_boots",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ONYX_BOOTS = ITEMS.register("onyx_boots",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOURMALINE_BOOTS = ITEMS.register("tourmaline_boots",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIODITE_BOOTS = ITEMS.register("periodite_boots",
            () -> new Item(new Item.Properties()));

===================*/

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }
}
