package net.marquito.mcm.datagen;


import net.marquito.mcm.MarquitosCoreMod;
import net.marquito.mcm.item.MCMItemsClass;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MCMItemTagGenerator extends ItemTagsProvider {
    public MCMItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MarquitosCoreMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        MCMItemsClass.SILVER_HELMET.get(),
                        MCMItemsClass.SILVER_CHESTPLATE.get(),
                        MCMItemsClass.SILVER_LEGGING.get(),
                        MCMItemsClass.SILVER_BOOTS.get(),

                        MCMItemsClass.STEEL_HELMET.get(),
                        MCMItemsClass.STEEL_CHESTPLATE.get(),
                        MCMItemsClass.STEEL_LEGGING.get(),
                        MCMItemsClass.STEEL_BOOTS.get(),

                        MCMItemsClass.BLACKSTEEL_HELMET.get(),
                        MCMItemsClass.BLACKSTEEL_CHESTPLATE.get(),
                        MCMItemsClass.BLACKSTEEL_LEGGING.get(),
                        MCMItemsClass.BLACKSTEEL_BOOTS.get(),

                        MCMItemsClass.BLACKSTEEL_O_HELMET.get(),
                        MCMItemsClass.BLACKSTEEL_O_CHESTPLATE.get(),
                        MCMItemsClass.BLACKSTEEL_O_LEGGING.get(),
                        MCMItemsClass.BLACKSTEEL_O_BOOTS.get(),

                        MCMItemsClass.BLACKSTEEL_P_HELMET.get(),
                        MCMItemsClass.BLACKSTEEL_P_CHESTPLATE.get(),
                        MCMItemsClass.BLACKSTEEL_P_LEGGING.get(),
                        MCMItemsClass.BLACKSTEEL_P_BOOTS.get(),

                        MCMItemsClass.BLACKSTEEL_T_HELMET.get(),
                        MCMItemsClass.BLACKSTEEL_T_CHESTPLATE.get(),
                        MCMItemsClass.BLACKSTEEL_T_LEGGING.get(),
                        MCMItemsClass.BLACKSTEEL_T_BOOTS.get()




                );
    }
}