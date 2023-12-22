package net.marquito.mcm.util;

import net.marquito.mcm.MarquitosCoreMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MCMTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SILVER_TOOL = tag("needs_silver_tool");

        public static final TagKey<Block> NEEDS_STEEL_TOOL = tag("needs_steel_tool");

        public static final TagKey<Block> NEEDS_BLACKSTEEL_TOOL = tag("needs_blacksteel_tool");

        public static final TagKey<Block> NEEDS_ONYX_TOOL = tag("needs_onyx_tool");

        public static final TagKey<Block> NEEDS_PERIODITE_TOOL = tag("needs_periodite_tool");

        public static final TagKey<Block> NEEDS_TOURMALINE_TOOL = tag("needs_tourmaline_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MarquitosCoreMod.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MarquitosCoreMod.MODID, name));
        }
    }
}
