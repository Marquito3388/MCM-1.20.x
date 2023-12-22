package net.marquito.mcm.datagen;

import net.marquito.mcm.MarquitosCoreMod;
import net.marquito.mcm.block.MCMBlockClass;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class MCMBlockStateProvider extends BlockStateProvider {
    public MCMBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MarquitosCoreMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(MCMBlockClass.SILVER_ORE);
        blockWithItem(MCMBlockClass.STEEL_ORE);
        blockWithItem(MCMBlockClass.BLACKSTEEL_ORE);

        blockWithItem(MCMBlockClass.ONYX_ORE);
        blockWithItem(MCMBlockClass.PERIODITE_ORE);
        blockWithItem(MCMBlockClass.TOURMALINE_ORE);

        blockWithItem(MCMBlockClass.SILVER_BLOCK);
        blockWithItem(MCMBlockClass.STEEL_BLOCK);
        blockWithItem(MCMBlockClass.BLACK_STEEL_BLOCK);

        blockWithItem(MCMBlockClass.ONYX_BLOCK);
        blockWithItem(MCMBlockClass.PERIODITE_BLOCK);
        blockWithItem(MCMBlockClass.TOURMALINE_BLOCK);

        blockWithItem(MCMBlockClass.WHITE_BRICKS);
        blockWithItem(MCMBlockClass.WHITE_BRICKS_2);
        blockWithItem(MCMBlockClass.WHITE_BRICKS_3);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }


}
