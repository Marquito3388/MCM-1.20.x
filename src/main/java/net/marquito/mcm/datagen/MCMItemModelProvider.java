package net.marquito.mcm.datagen;

import net.marquito.mcm.MarquitosCoreMod;
import net.marquito.mcm.item.MCMItemsClass;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class MCMItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public MCMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MarquitosCoreMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /*
        simpleItem(MCMItemsClass.SAPPHIRE);
        simpleItem(MCMItemsClass.RAW_SAPPHIRE);

        simpleItem(MCMItemsClass.METAL_DETECTOR);
        simpleItem(MCMItemsClass.PINE_CONE);
        simpleItem(MCMItemsClass.STRAWBERRY);

        simpleBlockItem(ModBlocks.SAPPHIRE_DOOR);

        fenceItem(ModBlocks.SAPPHIRE_FENCE, ModBlocks.SAPPHIRE_BLOCK);
        buttonItem(ModBlocks.SAPPHIRE_BUTTON, ModBlocks.SAPPHIRE_BLOCK);
        wallItem(ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_BLOCK);

        evenSimplerBlockItem(ModBlocks.SAPPHIRE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_SLAB);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SAPPHIRE_FENCE_GATE);

        trapdoorItem(ModBlocks.SAPPHIRE_TRAPDOOR);

        handheldItem(MCMItemsClass.SAPPHIRE_SWORD);
        handheldItem(MCMItemsClass.SAPPHIRE_PICKAXE);
        handheldItem(MCMItemsClass.SAPPHIRE_AXE);
        handheldItem(MCMItemsClass.SAPPHIRE_SHOVEL);
        handheldItem(MCMItemsClass.SAPPHIRE_HOE);
        */

        //TOOLS

        handheldItem(MCMItemsClass.SILVER_SWORD);
        handheldItem(MCMItemsClass.STEEL_SWORD);
        handheldItem(MCMItemsClass.BLACK_STEEL_SWORD);
        handheldItem(MCMItemsClass.ONYX_SWORD);
        handheldItem(MCMItemsClass.PERIODITE_SWORD);
        handheldItem(MCMItemsClass.TOURMALINE_SWORD);

        handheldItem(MCMItemsClass.SILVER_SHOVEL);
        handheldItem(MCMItemsClass.STEEL_SHOVEL);
        handheldItem(MCMItemsClass.BLACK_STEEL_SHOVEL);
        handheldItem(MCMItemsClass.ONYX_SHOVEL);
        handheldItem(MCMItemsClass.PERIODITE_SHOVEL);
        handheldItem(MCMItemsClass.TOURMALINE_SHOVEL);

        handheldItem(MCMItemsClass.SILVER_AXE);
        handheldItem(MCMItemsClass.STEEL_AXE);
        handheldItem(MCMItemsClass.BLACK_STEEL_AXE);
        handheldItem(MCMItemsClass.ONYX_AXE);
        handheldItem(MCMItemsClass.PERIODITE_AXE);
        handheldItem(MCMItemsClass.TOURMALINE_AXE);

        handheldItem(MCMItemsClass.SILVER_HOE);
        handheldItem(MCMItemsClass.STEEL_HOE);
        handheldItem(MCMItemsClass.BLACK_STEEL_HOE);
        handheldItem(MCMItemsClass.ONYX_HOE);
        handheldItem(MCMItemsClass.PERIODITE_HOE);
        handheldItem(MCMItemsClass.TOURMALINE_HOE);

        handheldItem(MCMItemsClass.SILVER_PICKAXE);
        handheldItem(MCMItemsClass.STEEL_PICKAXE);
        handheldItem(MCMItemsClass.BLACK_STEEL_PICKAXE);
        handheldItem(MCMItemsClass.ONYX_PICKAXE);
        handheldItem(MCMItemsClass.PERIODITE_PICKAXE);
        handheldItem(MCMItemsClass.TOURMALINE_PICKAXE);


        trimmedArmorItem(MCMItemsClass.SILVER_HELMET);
        trimmedArmorItem(MCMItemsClass.SILVER_CHESTPLATE);
        trimmedArmorItem(MCMItemsClass.SILVER_LEGGING);
        trimmedArmorItem(MCMItemsClass.SILVER_BOOTS);

        trimmedArmorItem(MCMItemsClass.STEEL_HELMET);
        trimmedArmorItem(MCMItemsClass.STEEL_CHESTPLATE);
        trimmedArmorItem(MCMItemsClass.STEEL_LEGGING);
        trimmedArmorItem(MCMItemsClass.STEEL_BOOTS);

        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_HELMET);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_CHESTPLATE);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_LEGGING);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_BOOTS);


        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_O_HELMET);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_O_CHESTPLATE);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_O_LEGGING);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_O_BOOTS);

        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_P_HELMET);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_P_CHESTPLATE);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_P_LEGGING);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_P_BOOTS);

        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_T_HELMET);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_T_CHESTPLATE);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_T_LEGGING);
        trimmedArmorItem(MCMItemsClass.BLACKSTEEL_T_BOOTS);


        simpleItem(MCMItemsClass.RAW_SILVER);
        simpleItem(MCMItemsClass.RAW_STEEL);
        simpleItem(MCMItemsClass.RAW_BLACK_STEEL);

        simpleItem(MCMItemsClass.SILVER_CHUNK);
        simpleItem(MCMItemsClass.STEEL_CHUNK);
        simpleItem(MCMItemsClass.BLACK_STEEL_CHUNK);

        simpleItem(MCMItemsClass.SILVER_INGOT);
        simpleItem(MCMItemsClass.STEEL_INGOT);
        simpleItem(MCMItemsClass.BLACK_STEEL_INGOT);

        simpleItem(MCMItemsClass.ONYX);
        simpleItem(MCMItemsClass.PERIODITE);
        simpleItem(MCMItemsClass.TOURMALINE);

        simpleItem(MCMItemsClass.YONITE);
        simpleItem(MCMItemsClass.AZINITE);
        simpleItem(MCMItemsClass.ECLITE);
        simpleItem(MCMItemsClass.ICHORITE);
        simpleItem(MCMItemsClass.ILLUMINITE);
        simpleItem(MCMItemsClass.VOLCANITE);
        simpleItem(MCMItemsClass.VOIDITE);
        simpleItem(MCMItemsClass.DRAKINITE);

        simpleItem(MCMItemsClass.WHITE_BRICK);


    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MODID = MarquitosCoreMod.MODID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MODID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MODID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MODID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MarquitosCoreMod.MODID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(MarquitosCoreMod.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(MarquitosCoreMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(MarquitosCoreMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(MarquitosCoreMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MarquitosCoreMod.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MarquitosCoreMod.MODID,"item/" + item.getId().getPath()));
    }


}