package net.marquito.mcm.worldgen;

import net.marquito.mcm.MarquitosCoreMod;
import net.marquito.mcm.block.MCMBlockClass;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import java.util.List;

public class MCMConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_oreds");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STEEL_ORE_KEY = registerKey("steel_oreds");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKSTEEL_ORE_KEY = registerKey("blacksteel_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ONYX_ORE_KEY = registerKey("onyx_oreds");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PERIODITE_ORE_KEY = registerKey("periodite_oreds");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOURMALINE_ORE_KEY = registerKey("tourmaline_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        /*
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
         */

        List<OreConfiguration.TargetBlockState> silverOres = List.of(
                OreConfiguration.target(deepslateReplaceables, MCMBlockClass.SILVER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> steelOres = List.of(
                OreConfiguration.target(deepslateReplaceables, MCMBlockClass.STEEL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> blacksteelOres = List.of(
                OreConfiguration.target(deepslateReplaceables, MCMBlockClass.BLACKSTEEL_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> onyxOres = List.of(
                OreConfiguration.target(deepslateReplaceables, MCMBlockClass.ONYX_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> perioditeOres = List.of(
                OreConfiguration.target(deepslateReplaceables, MCMBlockClass.PERIODITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> tourmalineOres = List.of(
                OreConfiguration.target(deepslateReplaceables, MCMBlockClass.TOURMALINE_ORE.get().defaultBlockState()));


        register(context, SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(silverOres, 9));
        register(context, STEEL_ORE_KEY, Feature.ORE, new OreConfiguration(steelOres, 6));
        register(context, BLACKSTEEL_ORE_KEY, Feature.ORE, new OreConfiguration(blacksteelOres, 4));

        register(context, ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(onyxOres, 7));
        register(context, PERIODITE_ORE_KEY, Feature.ORE, new OreConfiguration(perioditeOres, 5));
        register(context, TOURMALINE_ORE_KEY, Feature.ORE, new OreConfiguration(tourmalineOres, 3));







        /*
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
                ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 9));
        register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.END_STONE_SAPPHIRE_ORE.get().defaultBlockState(), 9));
         */

    }




    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MarquitosCoreMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}