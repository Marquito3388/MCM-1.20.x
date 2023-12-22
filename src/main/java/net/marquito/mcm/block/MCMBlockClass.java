package net.marquito.mcm.block;

import net.marquito.mcm.item.MCMItemsClass;
import net.marquito.mcm.MarquitosCoreMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MCMBlockClass {

    public static final DeferredRegister<Block> BLOCKS=
            DeferredRegister.create(ForgeRegistries.BLOCKS, MarquitosCoreMod.MODID);


    public static final RegistryObject<Block> WHITE_BRICKS =
            registerBlock("whitebricks", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> WHITE_BRICKS_2 =
            registerBlock("whitebricks2", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> WHITE_BRICKS_3 =
            registerBlock("whitebricks3", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.BRICKS)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));


    //ORES

    public static final RegistryObject<Block> BLACKSTEEL_ORE = registerBlock(
            "blacksteel_oreds", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    ,UniformInt.of(3, 7)));

    public static final RegistryObject<Block> STEEL_ORE = registerBlock(
            "steel_oreds", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    ,UniformInt.of(3, 7)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock(
            "silver_oreds", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    ,UniformInt.of(1, 3)));


    public static final RegistryObject<Block> ONYX_ORE = registerBlock(
            "onyx_oreds", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .of().lightLevel(value -> 4)
                    .strength(3.0F, 6.0F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    ,UniformInt.of(3, 7)));

    public static final RegistryObject<Block> PERIODITE_ORE = registerBlock(
            "periodite_oreds", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .of().lightLevel(value -> 4)
                    .strength(3.0F, 6.0F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    ,UniformInt.of(3, 7)));

    public static final RegistryObject<Block> TOURMALINE_ORE = registerBlock(
            "tourmaline_oreds", () -> new DropExperienceBlock(BlockBehaviour.Properties
                    .of().lightLevel(value -> 4)
                    .strength(3.0F, 6.0F)
                    .sound(SoundType.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    ,UniformInt.of(3, 7)));




    // BLOCKS

    public static final RegistryObject<Block> BLACK_STEEL_BLOCK = registerBlock(
            "blacksteelblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock(
            "steelblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.DEEPSLATE)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock(
            "silverblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));


    public static final RegistryObject<Block> ONYX_BLOCK = registerBlock(
            "onyxblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> PERIODITE_BLOCK = registerBlock(
            "perioditeblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TOURMALINE_BLOCK = registerBlock(
            "tourmalineblock", () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.IRON_BLOCK)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return toReturn;

    }


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){

        return MCMItemsClass.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }




    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }

}
