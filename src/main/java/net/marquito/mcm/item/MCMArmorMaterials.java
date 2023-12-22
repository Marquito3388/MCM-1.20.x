package net.marquito.mcm.item;

import net.marquito.mcm.MarquitosCoreMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum MCMArmorMaterials implements ArmorMaterial {

    SILVER("silver", 13, new int[]{2, 5, 4, 2}, 8, SoundEvents.ARMOR_EQUIP_IRON,
            0F, 0.0F, () -> Ingredient.of(MCMItemsClass.SILVER_INGOT.get())),

    STEEL("steel", 20, new int[]{3, 6, 5, 3}, 10, SoundEvents.ARMOR_EQUIP_IRON,
            0.5F, 0F, () -> Ingredient.of(MCMItemsClass.STEEL_INGOT.get())),

    BLACKSTEEL("blacksteel", 30, new int[]{2, 6, 6, 3}, 11, SoundEvents.ARMOR_EQUIP_IRON,
            1.9F, 0F, () -> Ingredient.of(MCMItemsClass.BLACK_STEEL_INGOT.get())),



    BLACKSTEEL_O("blacksteel_o", 31, new int[]{2, 7, 6, 3}, 11, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.1F, 0.0F, () -> Ingredient.of(MCMItemsClass.BLACK_STEEL_INGOT.get())),

    BLACKSTEEL_P("blacksteel_p", 32, new int[]{2, 7, 7, 3}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.3F, 0F, () -> Ingredient.of(MCMItemsClass.BLACK_STEEL_INGOT.get())),

    BLACKSTEEL_T("blacksteel_t", 33, new int[]{3, 8, 7, 3}, 13, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.5F, 0F, () -> Ingredient.of(MCMItemsClass.BLACK_STEEL_INGOT.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};

    MCMArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MarquitosCoreMod.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
