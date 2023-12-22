package net.marquito.mcm.worldgen;

import net.marquito.mcm.MarquitosCoreMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class MCMPlacedFeatures {
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_oreds_placed");
    public static final ResourceKey<PlacedFeature> STEEL_ORE_PLACED_KEY = registerKey("steel_oreds_placed");
    public static final ResourceKey<PlacedFeature> BLACKSTEEL_ORE_PLACED_KEY = registerKey("blacksteel_oreds_placed");

    public static final ResourceKey<PlacedFeature> ONYX_ORE_PLACED_KEY = registerKey("onyx_oreds_placed");
    public static final ResourceKey<PlacedFeature> PERIODITE_ORE_PLACED_KEY = registerKey("periodite_oreds_placed");
    public static final ResourceKey<PlacedFeature> TOURMALINE_ORE_PLACED_KEY = registerKey("tourmaline_oreds_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MCMConfiguredFeatures.SILVER_ORE_KEY),
                MCMOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));

        register(context, STEEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MCMConfiguredFeatures.STEEL_ORE_KEY),
                MCMOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(60))));

        register(context, BLACKSTEEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MCMConfiguredFeatures.BLACKSTEEL_ORE_KEY),
                MCMOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(55))));


        register(context, ONYX_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MCMConfiguredFeatures.ONYX_ORE_KEY),
                MCMOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(70))));

        register(context, PERIODITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MCMConfiguredFeatures.PERIODITE_ORE_KEY),
                MCMOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(60))));

        register(context, TOURMALINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(MCMConfiguredFeatures.TOURMALINE_ORE_KEY),
                MCMOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(50))));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MarquitosCoreMod.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}