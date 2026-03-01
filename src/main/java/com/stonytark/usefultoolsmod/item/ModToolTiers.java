package com.stonytark.usefultoolsmod.item;

import com.stonytark.usefultoolsmod.block.ModBlocks;
import com.stonytark.usefultoolsmod.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

// NeoForge 1.21.1 uses SimpleTier instead of ForgeTier.
// SimpleTier constructor: (incorrectBlocksForDrops, uses, speed, attackDamageBonus, enchantmentValue, repairIngredient)
public class ModToolTiers {
    public static final Tier JEMERALD = new SimpleTier(ModTags.Blocks.INCORRECT_JEM_TOOL,
            1361, 4.5f, 6, 22, () -> Ingredient.of(Items.EMERALD));

    public static final Tier SEMERALD = new SimpleTier(ModTags.Blocks.INCORRECT_SEM_TOOL,
            1561, 3.2f, 7, 30, () -> Ingredient.of(ModItems.SEM.get()));

    public static final Tier JOBSIDIAN = new SimpleTier(ModTags.Blocks.INCORRECT_JOB_TOOL,
            1650, 6f, 9, 15, () -> Ingredient.of(ModItems.OBSHARD.get()));

    public static final Tier SOBSIDIAN = new SimpleTier(ModTags.Blocks.INCORRECT_SOB_TOOL,
            2031, 5f, 10, 18, () -> Ingredient.of(ModItems.OBINGOT.get()));

    public static final Tier OVERPOWER = new SimpleTier(ModTags.Blocks.INCORRECT_OP_TOOL,
            9999, 30f, 25, 35, () -> Ingredient.of(ModBlocks.SOBLOCK.get()));

    public static final Tier HREDSTONE = new SimpleTier(ModTags.Blocks.INCORRECT_HRED_TOOL,
            600, 3f, 8, 20, () -> Ingredient.of(ModItems.HRED.get()));

    public static final Tier RGOLD = new SimpleTier(ModTags.Blocks.INCORRECT_RGOLD_TOOL,
            1200, 3.5f, 8, 16, () -> Ingredient.of(ModItems.RGOLD.get()));

    public static final Tier RLAPIS = new SimpleTier(ModTags.Blocks.INCORRECT_RLAPIS_TOOL,
            1100, 3.2f, 9, 32, () -> Ingredient.of(ModItems.RGOLD.get()));
}
