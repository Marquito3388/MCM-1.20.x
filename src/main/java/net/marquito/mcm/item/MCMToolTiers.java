package net.marquito.mcm.item;

import net.marquito.mcm.MarquitosCoreMod;
import net.marquito.mcm.util.MCMTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class MCMToolTiers {

    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(1, 131, 5F, 1.0F, 5,
                    MCMTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(MCMItemsClass.SILVER_INGOT.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "silver"), List.of(Tiers.STONE), List.of());



    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                    MCMTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(MCMItemsClass.STEEL_INGOT.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "steel"), List.of(Tiers.IRON), List.of());



    public static final Tier BLACK_STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0F, 3.0F, 10,
                    MCMTags.Blocks.NEEDS_BLACKSTEEL_TOOL, () -> Ingredient.of(MCMItemsClass.BLACK_STEEL_INGOT.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "blacksteel"), List.of(Tiers.DIAMOND), List.of());



    public static final Tier ONYX = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                    MCMTags.Blocks.NEEDS_ONYX_TOOL, () -> Ingredient.of(MCMItemsClass.ONYX.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "onyx"), List.of(Tiers.IRON), List.of());



    public static final Tier PERIODITE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6.0F, 2.0F, 14,
                    MCMTags.Blocks.NEEDS_PERIODITE_TOOL, () -> Ingredient.of(MCMItemsClass.PERIODITE.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "periodite"), List.of(Tiers.IRON), List.of());



    public static final Tier TOURMALINE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8.0F, 3.0F, 10,
                    MCMTags.Blocks.NEEDS_TOURMALINE_TOOL, () -> Ingredient.of(MCMItemsClass.TOURMALINE.get())),
            new ResourceLocation(MarquitosCoreMod.MODID, "tourmaline"), List.of(Tiers.DIAMOND), List.of());


}