package net.marquito.mcm.datagen;

import net.marquito.mcm.MarquitosCoreMod;
import net.marquito.mcm.worldgen.MCMBiomeModifiers;
import net.marquito.mcm.worldgen.MCMConfiguredFeatures;
import net.marquito.mcm.worldgen.MCMPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MCMWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, MCMConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, MCMPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, MCMBiomeModifiers::bootstrap);

    public MCMWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MarquitosCoreMod.MODID));
    }
}