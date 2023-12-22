package net.marquito.mcm.datagen;

import net.marquito.mcm.MarquitosCoreMod;
import net.marquito.mcm.block.MCMBlockClass;
import net.marquito.mcm.util.MCMTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MCMBlockTagGenerator extends BlockTagsProvider {
    public MCMBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MarquitosCoreMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(MCMBlockClass.SILVER_ORE.get(),
                        MCMBlockClass.STEEL_ORE.get(),
                        MCMBlockClass.BLACKSTEEL_ORE.get(),

                        MCMBlockClass.ONYX_ORE.get(),
                        MCMBlockClass.PERIODITE_ORE.get(),
                        MCMBlockClass.TOURMALINE_ORE.get(),

                        MCMBlockClass.SILVER_BLOCK.get(),
                        MCMBlockClass.STEEL_BLOCK.get(),
                        MCMBlockClass.BLACK_STEEL_BLOCK.get(),

                        MCMBlockClass.ONYX_BLOCK.get(),
                        MCMBlockClass.PERIODITE_BLOCK.get(),
                        MCMBlockClass.TOURMALINE_BLOCK.get(),

                        MCMBlockClass.WHITE_BRICKS.get(),
                        MCMBlockClass.WHITE_BRICKS_2.get(),
                        MCMBlockClass.WHITE_BRICKS_3.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.SILVER_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.ONYX_ORE.get());


        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.SILVER_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.PERIODITE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.STEEL_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.BLACK_STEEL_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.ONYX_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.PERIODITE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.TOURMALINE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.WHITE_BRICKS.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.WHITE_BRICKS_2.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(MCMBlockClass.WHITE_BRICKS_3.get());

        //======================================


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(MCMBlockClass.STEEL_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(MCMBlockClass.PERIODITE_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(MCMBlockClass.TOURMALINE_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(MCMBlockClass.BLACKSTEEL_ORE.get());



    }
}
