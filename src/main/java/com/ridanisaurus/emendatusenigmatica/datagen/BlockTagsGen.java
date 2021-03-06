/*
 * MIT License
 *
 * Copyright (c) 2020 Ridanisaurus
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.ridanisaurus.emendatusenigmatica.datagen;

import com.ridanisaurus.emendatusenigmatica.registries.BlockHandler;
import com.ridanisaurus.emendatusenigmatica.util.Reference;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;

public class BlockTagsGen extends BlockTagsProvider {

  public BlockTagsGen(DataGenerator gen) { super(gen); }

  @Override
  protected void registerTags() {
    // Storage Blocks
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks")))
            .add(BlockHandler.BLOCK_COPPER.get())
            .add(BlockHandler.BLOCK_ALUMINUM.get())
            .add(BlockHandler.BLOCK_SILVER.get())
            .add(BlockHandler.BLOCK_LEAD.get())
            .add(BlockHandler.BLOCK_NICKEL.get())
            .add(BlockHandler.BLOCK_URANIUM.get())
            .add(BlockHandler.BLOCK_OSMIUM.get())
            .add(BlockHandler.BLOCK_TIN.get())
            .add(BlockHandler.BLOCK_ZINC.get())
            .add(BlockHandler.BLOCK_BRONZE.get())
            .add(BlockHandler.BLOCK_BRASS.get())
            .add(BlockHandler.BLOCK_CONSTANTAN.get())
            .add(BlockHandler.BLOCK_ELECTRUM.get())
            .add(BlockHandler.BLOCK_STEEL.get())

            .add(BlockHandler.BLOCK_INVAR.get())
            .add(BlockHandler.BLOCK_LUMIUM.get())
            .add(BlockHandler.BLOCK_SIGNALUM.get())
            .add(BlockHandler.BLOCK_ENDERIUM.get())
            .add(BlockHandler.BLOCK_CINNABAR.get())
            .add(BlockHandler.BLOCK_APATITE.get())
            .add(BlockHandler.BLOCK_SULFUR.get())
            .add(BlockHandler.BLOCK_POTASSIUM_NITRATE.get());

    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/copper")))
            .add(BlockHandler.BLOCK_COPPER.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/aluminum")))
            .add(BlockHandler.BLOCK_ALUMINUM.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/silver")))
            .add(BlockHandler.BLOCK_SILVER.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/lead")))
            .add(BlockHandler.BLOCK_LEAD.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/nickel")))
            .add(BlockHandler.BLOCK_NICKEL.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/uranium")))
            .add(BlockHandler.BLOCK_URANIUM.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/osmium")))
            .add(BlockHandler.BLOCK_OSMIUM.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/tin")))
            .add(BlockHandler.BLOCK_TIN.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/zinc")))
            .add(BlockHandler.BLOCK_ZINC.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/bronze")))
            .add(BlockHandler.BLOCK_BRONZE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/brass")))
            .add(BlockHandler.BLOCK_BRASS.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/constantan")))
            .add(BlockHandler.BLOCK_CONSTANTAN.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/electrum")))
            .add(BlockHandler.BLOCK_ELECTRUM.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/steel")))
            .add(BlockHandler.BLOCK_STEEL.get());

    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/invar")))
            .add(BlockHandler.BLOCK_INVAR.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/lumium")))
            .add(BlockHandler.BLOCK_LUMIUM.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/signalum")))
            .add(BlockHandler.BLOCK_SIGNALUM.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/enderium")))
            .add(BlockHandler.BLOCK_ENDERIUM.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/cinnabar")))
            .add(BlockHandler.BLOCK_CINNABAR.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/apatite")))
            .add(BlockHandler.BLOCK_APATITE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/sulfur")))
            .add(BlockHandler.BLOCK_SULFUR.get());

    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/potassium_nitrate")))
            .add(BlockHandler.BLOCK_POTASSIUM_NITRATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/niter")))
            .add(BlockHandler.BLOCK_POTASSIUM_NITRATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "storage_blocks/saltpeter")))
            .add(BlockHandler.BLOCK_POTASSIUM_NITRATE.get());

    // Ores
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores")))
            .add(BlockHandler.ORE_COAL.get())
            .add(BlockHandler.ORE_IRON.get())
            .add(BlockHandler.ORE_GOLD.get())
            .add(BlockHandler.ORE_DIAMOND.get())
            .add(BlockHandler.ORE_EMERALD.get())
            .add(BlockHandler.ORE_LAPIS.get())
            .add(BlockHandler.ORE_REDSTONE.get())
            .add(BlockHandler.ORE_COPPER.get())
            .add(BlockHandler.ORE_ALUMINUM.get())
            .add(BlockHandler.ORE_SILVER.get())
            .add(BlockHandler.ORE_LEAD.get())
            .add(BlockHandler.ORE_NICKEL.get())
            .add(BlockHandler.ORE_URANIUM.get())
            .add(BlockHandler.ORE_OSMIUM.get())
            .add(BlockHandler.ORE_TIN.get())
            .add(BlockHandler.ORE_ZINC.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ.get())

            .add(BlockHandler.ORE_CINNABAR.get())
            .add(BlockHandler.ORE_APATITE.get())
            .add(BlockHandler.ORE_SULFUR.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE.get())

            .add(BlockHandler.ORE_COAL_ANDESITE.get())
            .add(BlockHandler.ORE_IRON_ANDESITE.get())
            .add(BlockHandler.ORE_GOLD_ANDESITE.get())
            .add(BlockHandler.ORE_DIAMOND_ANDESITE.get())
            .add(BlockHandler.ORE_EMERALD_ANDESITE.get())
            .add(BlockHandler.ORE_LAPIS_ANDESITE.get())
            .add(BlockHandler.ORE_REDSTONE_ANDESITE.get())
            .add(BlockHandler.ORE_COPPER_ANDESITE.get())
            .add(BlockHandler.ORE_ALUMINUM_ANDESITE.get())
            .add(BlockHandler.ORE_SILVER_ANDESITE.get())
            .add(BlockHandler.ORE_LEAD_ANDESITE.get())
            .add(BlockHandler.ORE_NICKEL_ANDESITE.get())
            .add(BlockHandler.ORE_URANIUM_ANDESITE.get())
            .add(BlockHandler.ORE_OSMIUM_ANDESITE.get())
            .add(BlockHandler.ORE_TIN_ANDESITE.get())
            .add(BlockHandler.ORE_ZINC_ANDESITE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_ANDESITE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_ANDESITE.get())

            .add(BlockHandler.ORE_CINNABAR_ANDESITE.get())
            .add(BlockHandler.ORE_APATITE_ANDESITE.get())
            .add(BlockHandler.ORE_SULFUR_ANDESITE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_ANDESITE.get())
            
            .add(BlockHandler.ORE_COAL_GABBRO.get())
            .add(BlockHandler.ORE_IRON_GABBRO.get())
            .add(BlockHandler.ORE_GOLD_GABBRO.get())
            .add(BlockHandler.ORE_DIAMOND_GABBRO.get())
            .add(BlockHandler.ORE_EMERALD_GABBRO.get())
            .add(BlockHandler.ORE_LAPIS_GABBRO.get())
            .add(BlockHandler.ORE_REDSTONE_GABBRO.get())
            .add(BlockHandler.ORE_COPPER_GABBRO.get())
            .add(BlockHandler.ORE_ALUMINUM_GABBRO.get())
            .add(BlockHandler.ORE_SILVER_GABBRO.get())
            .add(BlockHandler.ORE_LEAD_GABBRO.get())
            .add(BlockHandler.ORE_NICKEL_GABBRO.get())
            .add(BlockHandler.ORE_URANIUM_GABBRO.get())
            .add(BlockHandler.ORE_OSMIUM_GABBRO.get())
            .add(BlockHandler.ORE_TIN_GABBRO.get())
            .add(BlockHandler.ORE_ZINC_GABBRO.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_GABBRO.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_GABBRO.get())

            .add(BlockHandler.ORE_CINNABAR_GABBRO.get())
            .add(BlockHandler.ORE_APATITE_GABBRO.get())
            .add(BlockHandler.ORE_SULFUR_GABBRO.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_GABBRO.get())
            
            .add(BlockHandler.ORE_COAL_C_LIMESTONE.get())
            .add(BlockHandler.ORE_IRON_C_LIMESTONE.get())
            .add(BlockHandler.ORE_GOLD_C_LIMESTONE.get())
            .add(BlockHandler.ORE_DIAMOND_C_LIMESTONE.get())
            .add(BlockHandler.ORE_EMERALD_C_LIMESTONE.get())
            .add(BlockHandler.ORE_LAPIS_C_LIMESTONE.get())
            .add(BlockHandler.ORE_REDSTONE_C_LIMESTONE.get())
            .add(BlockHandler.ORE_COPPER_C_LIMESTONE.get())
            .add(BlockHandler.ORE_ALUMINUM_C_LIMESTONE.get())
            .add(BlockHandler.ORE_SILVER_C_LIMESTONE.get())
            .add(BlockHandler.ORE_LEAD_C_LIMESTONE.get())
            .add(BlockHandler.ORE_NICKEL_C_LIMESTONE.get())
            .add(BlockHandler.ORE_URANIUM_C_LIMESTONE.get())
            .add(BlockHandler.ORE_OSMIUM_C_LIMESTONE.get())
            .add(BlockHandler.ORE_TIN_C_LIMESTONE.get())
            .add(BlockHandler.ORE_ZINC_C_LIMESTONE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_C_LIMESTONE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_C_LIMESTONE.get())

            .add(BlockHandler.ORE_CINNABAR_C_LIMESTONE.get())
            .add(BlockHandler.ORE_APATITE_C_LIMESTONE.get())
            .add(BlockHandler.ORE_SULFUR_C_LIMESTONE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_C_LIMESTONE.get())
            
            .add(BlockHandler.ORE_COAL_SCORIA.get())
            .add(BlockHandler.ORE_IRON_SCORIA.get())
            .add(BlockHandler.ORE_GOLD_SCORIA.get())
            .add(BlockHandler.ORE_DIAMOND_SCORIA.get())
            .add(BlockHandler.ORE_EMERALD_SCORIA.get())
            .add(BlockHandler.ORE_LAPIS_SCORIA.get())
            .add(BlockHandler.ORE_REDSTONE_SCORIA.get())
            .add(BlockHandler.ORE_COPPER_SCORIA.get())
            .add(BlockHandler.ORE_ALUMINUM_SCORIA.get())
            .add(BlockHandler.ORE_SILVER_SCORIA.get())
            .add(BlockHandler.ORE_LEAD_SCORIA.get())
            .add(BlockHandler.ORE_NICKEL_SCORIA.get())
            .add(BlockHandler.ORE_URANIUM_SCORIA.get())
            .add(BlockHandler.ORE_OSMIUM_SCORIA.get())
            .add(BlockHandler.ORE_TIN_SCORIA.get())
            .add(BlockHandler.ORE_ZINC_SCORIA.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_SCORIA.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_SCORIA.get())

            .add(BlockHandler.ORE_CINNABAR_SCORIA.get())
            .add(BlockHandler.ORE_APATITE_SCORIA.get())
            .add(BlockHandler.ORE_SULFUR_SCORIA.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_SCORIA.get())
            
            .add(BlockHandler.ORE_COAL_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_IRON_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_GOLD_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_DIAMOND_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_EMERALD_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_LAPIS_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_REDSTONE_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_COPPER_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_ALUMINUM_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_SILVER_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_LEAD_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_NICKEL_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_URANIUM_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_OSMIUM_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_TIN_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_ZINC_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_WEATHERED_LIMESTONE.get())

            .add(BlockHandler.ORE_CINNABAR_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_APATITE_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_SULFUR_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_WEATHERED_LIMESTONE.get())
            
            .add(BlockHandler.ORE_COAL_JASPER.get())
            .add(BlockHandler.ORE_IRON_JASPER.get())
            .add(BlockHandler.ORE_GOLD_JASPER.get())
            .add(BlockHandler.ORE_DIAMOND_JASPER.get())
            .add(BlockHandler.ORE_EMERALD_JASPER.get())
            .add(BlockHandler.ORE_LAPIS_JASPER.get())
            .add(BlockHandler.ORE_REDSTONE_JASPER.get())
            .add(BlockHandler.ORE_COPPER_JASPER.get())
            .add(BlockHandler.ORE_ALUMINUM_JASPER.get())
            .add(BlockHandler.ORE_SILVER_JASPER.get())
            .add(BlockHandler.ORE_LEAD_JASPER.get())
            .add(BlockHandler.ORE_NICKEL_JASPER.get())
            .add(BlockHandler.ORE_URANIUM_JASPER.get())
            .add(BlockHandler.ORE_OSMIUM_JASPER.get())
            .add(BlockHandler.ORE_TIN_JASPER.get())
            .add(BlockHandler.ORE_ZINC_JASPER.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_JASPER.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_JASPER.get())

            .add(BlockHandler.ORE_CINNABAR_JASPER.get())
            .add(BlockHandler.ORE_APATITE_JASPER.get())
            .add(BlockHandler.ORE_SULFUR_JASPER.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_JASPER.get())
            
            .add(BlockHandler.ORE_COAL_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_IRON_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_GOLD_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_DIAMOND_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_EMERALD_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_LAPIS_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_REDSTONE_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_COPPER_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_ALUMINUM_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_SILVER_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_LEAD_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_NICKEL_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_URANIUM_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_OSMIUM_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_TIN_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_ZINC_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_Q_LIMESTONE.get())

            .add(BlockHandler.ORE_CINNABAR_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_APATITE_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_SULFUR_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_Q_LIMESTONE.get())
            
            .add(BlockHandler.ORE_COAL_MARBLE.get())
            .add(BlockHandler.ORE_IRON_MARBLE.get())
            .add(BlockHandler.ORE_GOLD_MARBLE.get())
            .add(BlockHandler.ORE_DIAMOND_MARBLE.get())
            .add(BlockHandler.ORE_EMERALD_MARBLE.get())
            .add(BlockHandler.ORE_LAPIS_MARBLE.get())
            .add(BlockHandler.ORE_REDSTONE_MARBLE.get())
            .add(BlockHandler.ORE_COPPER_MARBLE.get())
            .add(BlockHandler.ORE_ALUMINUM_MARBLE.get())
            .add(BlockHandler.ORE_SILVER_MARBLE.get())
            .add(BlockHandler.ORE_LEAD_MARBLE.get())
            .add(BlockHandler.ORE_NICKEL_MARBLE.get())
            .add(BlockHandler.ORE_URANIUM_MARBLE.get())
            .add(BlockHandler.ORE_OSMIUM_MARBLE.get())
            .add(BlockHandler.ORE_TIN_MARBLE.get())
            .add(BlockHandler.ORE_ZINC_MARBLE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_MARBLE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_MARBLE.get())

            .add(BlockHandler.ORE_CINNABAR_MARBLE.get())
            .add(BlockHandler.ORE_APATITE_MARBLE.get())
            .add(BlockHandler.ORE_SULFUR_MARBLE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_MARBLE.get())
            
            .add(BlockHandler.ORE_COAL_SLATE.get())
            .add(BlockHandler.ORE_IRON_SLATE.get())
            .add(BlockHandler.ORE_GOLD_SLATE.get())
            .add(BlockHandler.ORE_DIAMOND_SLATE.get())
            .add(BlockHandler.ORE_EMERALD_SLATE.get())
            .add(BlockHandler.ORE_LAPIS_SLATE.get())
            .add(BlockHandler.ORE_REDSTONE_SLATE.get())
            .add(BlockHandler.ORE_COPPER_SLATE.get())
            .add(BlockHandler.ORE_ALUMINUM_SLATE.get())
            .add(BlockHandler.ORE_SILVER_SLATE.get())
            .add(BlockHandler.ORE_LEAD_SLATE.get())
            .add(BlockHandler.ORE_NICKEL_SLATE.get())
            .add(BlockHandler.ORE_URANIUM_SLATE.get())
            .add(BlockHandler.ORE_OSMIUM_SLATE.get())
            .add(BlockHandler.ORE_TIN_SLATE.get())
            .add(BlockHandler.ORE_ZINC_SLATE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_SLATE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_SLATE.get())

            .add(BlockHandler.ORE_CINNABAR_SLATE.get())
            .add(BlockHandler.ORE_APATITE_SLATE.get())
            .add(BlockHandler.ORE_SULFUR_SLATE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_SLATE.get());

    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/coal")))
            .add(BlockHandler.ORE_COAL.get())
            .add(BlockHandler.ORE_COAL_ANDESITE.get())
            .add(BlockHandler.ORE_COAL_GABBRO.get())
            .add(BlockHandler.ORE_COAL_C_LIMESTONE.get())
            .add(BlockHandler.ORE_COAL_SCORIA.get())
            .add(BlockHandler.ORE_COAL_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_COAL_JASPER.get())
            .add(BlockHandler.ORE_COAL_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_COAL_MARBLE.get())
            .add(BlockHandler.ORE_COAL_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/iron")))
            .add(BlockHandler.ORE_IRON.get())
            .add(BlockHandler.ORE_IRON_ANDESITE.get())
            .add(BlockHandler.ORE_IRON_GABBRO.get())
            .add(BlockHandler.ORE_IRON_C_LIMESTONE.get())
            .add(BlockHandler.ORE_IRON_SCORIA.get())
            .add(BlockHandler.ORE_IRON_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_IRON_JASPER.get())
            .add(BlockHandler.ORE_IRON_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_IRON_MARBLE.get())
            .add(BlockHandler.ORE_IRON_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/gold")))
            .add(BlockHandler.ORE_GOLD.get())
            .add(BlockHandler.ORE_GOLD_ANDESITE.get())
            .add(BlockHandler.ORE_GOLD_GABBRO.get())
            .add(BlockHandler.ORE_GOLD_C_LIMESTONE.get())
            .add(BlockHandler.ORE_GOLD_SCORIA.get())
            .add(BlockHandler.ORE_GOLD_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_GOLD_JASPER.get())
            .add(BlockHandler.ORE_GOLD_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_GOLD_MARBLE.get())
            .add(BlockHandler.ORE_GOLD_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/diamond")))
            .add(BlockHandler.ORE_DIAMOND.get())
            .add(BlockHandler.ORE_DIAMOND_ANDESITE.get())
            .add(BlockHandler.ORE_DIAMOND_GABBRO.get())
            .add(BlockHandler.ORE_DIAMOND_C_LIMESTONE.get())
            .add(BlockHandler.ORE_DIAMOND_SCORIA.get())
            .add(BlockHandler.ORE_DIAMOND_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_DIAMOND_JASPER.get())
            .add(BlockHandler.ORE_DIAMOND_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_DIAMOND_MARBLE.get())
            .add(BlockHandler.ORE_DIAMOND_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/emerald")))
            .add(BlockHandler.ORE_EMERALD.get())
            .add(BlockHandler.ORE_EMERALD_ANDESITE.get())
            .add(BlockHandler.ORE_EMERALD_GABBRO.get())
            .add(BlockHandler.ORE_EMERALD_C_LIMESTONE.get())
            .add(BlockHandler.ORE_EMERALD_SCORIA.get())
            .add(BlockHandler.ORE_EMERALD_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_EMERALD_JASPER.get())
            .add(BlockHandler.ORE_EMERALD_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_EMERALD_MARBLE.get())
            .add(BlockHandler.ORE_EMERALD_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/lapis")))
            .add(BlockHandler.ORE_LAPIS.get())
            .add(BlockHandler.ORE_LAPIS_ANDESITE.get())
            .add(BlockHandler.ORE_LAPIS_GABBRO.get())
            .add(BlockHandler.ORE_LAPIS_C_LIMESTONE.get())
            .add(BlockHandler.ORE_LAPIS_SCORIA.get())
            .add(BlockHandler.ORE_LAPIS_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_LAPIS_JASPER.get())
            .add(BlockHandler.ORE_LAPIS_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_LAPIS_MARBLE.get())
            .add(BlockHandler.ORE_LAPIS_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/redstone")))
            .add(BlockHandler.ORE_REDSTONE.get())
            .add(BlockHandler.ORE_REDSTONE_ANDESITE.get())
            .add(BlockHandler.ORE_REDSTONE_GABBRO.get())
            .add(BlockHandler.ORE_REDSTONE_C_LIMESTONE.get())
            .add(BlockHandler.ORE_REDSTONE_SCORIA.get())
            .add(BlockHandler.ORE_REDSTONE_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_REDSTONE_JASPER.get())
            .add(BlockHandler.ORE_REDSTONE_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_REDSTONE_MARBLE.get())
            .add(BlockHandler.ORE_REDSTONE_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/copper")))
            .add(BlockHandler.ORE_COPPER.get())
            .add(BlockHandler.ORE_COPPER_ANDESITE.get())
            .add(BlockHandler.ORE_COPPER_GABBRO.get())
            .add(BlockHandler.ORE_COPPER_C_LIMESTONE.get())
            .add(BlockHandler.ORE_COPPER_SCORIA.get())
            .add(BlockHandler.ORE_COPPER_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_COPPER_JASPER.get())
            .add(BlockHandler.ORE_COPPER_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_COPPER_MARBLE.get())
            .add(BlockHandler.ORE_COPPER_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/aluminum")))
            .add(BlockHandler.ORE_ALUMINUM.get())
            .add(BlockHandler.ORE_ALUMINUM_ANDESITE.get())
            .add(BlockHandler.ORE_ALUMINUM_GABBRO.get())
            .add(BlockHandler.ORE_ALUMINUM_C_LIMESTONE.get())
            .add(BlockHandler.ORE_ALUMINUM_SCORIA.get())
            .add(BlockHandler.ORE_ALUMINUM_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_ALUMINUM_JASPER.get())
            .add(BlockHandler.ORE_ALUMINUM_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_ALUMINUM_MARBLE.get())
            .add(BlockHandler.ORE_ALUMINUM_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/silver")))
            .add(BlockHandler.ORE_SILVER.get())
            .add(BlockHandler.ORE_SILVER_ANDESITE.get())
            .add(BlockHandler.ORE_SILVER_GABBRO.get())
            .add(BlockHandler.ORE_SILVER_C_LIMESTONE.get())
            .add(BlockHandler.ORE_SILVER_SCORIA.get())
            .add(BlockHandler.ORE_SILVER_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_SILVER_JASPER.get())
            .add(BlockHandler.ORE_SILVER_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_SILVER_MARBLE.get())
            .add(BlockHandler.ORE_SILVER_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/lead")))
            .add(BlockHandler.ORE_LEAD.get())
            .add(BlockHandler.ORE_LEAD_ANDESITE.get())
            .add(BlockHandler.ORE_LEAD_GABBRO.get())
            .add(BlockHandler.ORE_LEAD_C_LIMESTONE.get())
            .add(BlockHandler.ORE_LEAD_SCORIA.get())
            .add(BlockHandler.ORE_LEAD_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_LEAD_JASPER.get())
            .add(BlockHandler.ORE_LEAD_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_LEAD_MARBLE.get())
            .add(BlockHandler.ORE_LEAD_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/nickel")))
            .add(BlockHandler.ORE_NICKEL.get())
            .add(BlockHandler.ORE_NICKEL_ANDESITE.get())
            .add(BlockHandler.ORE_NICKEL_GABBRO.get())
            .add(BlockHandler.ORE_NICKEL_C_LIMESTONE.get())
            .add(BlockHandler.ORE_NICKEL_SCORIA.get())
            .add(BlockHandler.ORE_NICKEL_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_NICKEL_JASPER.get())
            .add(BlockHandler.ORE_NICKEL_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_NICKEL_MARBLE.get())
            .add(BlockHandler.ORE_NICKEL_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/uranium")))
            .add(BlockHandler.ORE_URANIUM.get())
            .add(BlockHandler.ORE_URANIUM_ANDESITE.get())
            .add(BlockHandler.ORE_URANIUM_GABBRO.get())
            .add(BlockHandler.ORE_URANIUM_C_LIMESTONE.get())
            .add(BlockHandler.ORE_URANIUM_SCORIA.get())
            .add(BlockHandler.ORE_URANIUM_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_URANIUM_JASPER.get())
            .add(BlockHandler.ORE_URANIUM_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_URANIUM_MARBLE.get())
            .add(BlockHandler.ORE_URANIUM_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/osmium")))
            .add(BlockHandler.ORE_OSMIUM.get())
            .add(BlockHandler.ORE_OSMIUM_ANDESITE.get())
            .add(BlockHandler.ORE_OSMIUM_GABBRO.get())
            .add(BlockHandler.ORE_OSMIUM_C_LIMESTONE.get())
            .add(BlockHandler.ORE_OSMIUM_SCORIA.get())
            .add(BlockHandler.ORE_OSMIUM_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_OSMIUM_JASPER.get())
            .add(BlockHandler.ORE_OSMIUM_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_OSMIUM_MARBLE.get())
            .add(BlockHandler.ORE_OSMIUM_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/tin")))
            .add(BlockHandler.ORE_TIN.get())
            .add(BlockHandler.ORE_TIN_ANDESITE.get())
            .add(BlockHandler.ORE_TIN_GABBRO.get())
            .add(BlockHandler.ORE_TIN_C_LIMESTONE.get())
            .add(BlockHandler.ORE_TIN_SCORIA.get())
            .add(BlockHandler.ORE_TIN_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_TIN_JASPER.get())
            .add(BlockHandler.ORE_TIN_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_TIN_MARBLE.get())
            .add(BlockHandler.ORE_TIN_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/zinc")))
            .add(BlockHandler.ORE_ZINC.get())
            .add(BlockHandler.ORE_ZINC_ANDESITE.get())
            .add(BlockHandler.ORE_ZINC_GABBRO.get())
            .add(BlockHandler.ORE_ZINC_C_LIMESTONE.get())
            .add(BlockHandler.ORE_ZINC_SCORIA.get())
            .add(BlockHandler.ORE_ZINC_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_ZINC_JASPER.get())
            .add(BlockHandler.ORE_ZINC_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_ZINC_MARBLE.get())
            .add(BlockHandler.ORE_ZINC_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/certus_quartz")))
            .add(BlockHandler.ORE_CERTUS_QUARTZ.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_ANDESITE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_GABBRO.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_C_LIMESTONE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_SCORIA.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_JASPER.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_MARBLE.get())
            .add(BlockHandler.ORE_CERTUS_QUARTZ_SLATE.get());
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/charged_certus_quartz")))
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_ANDESITE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_GABBRO.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_C_LIMESTONE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_SCORIA.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_JASPER.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_MARBLE.get())
            .add(BlockHandler.ORE_CHARGED_CERTUS_QUARTZ_SLATE.get());

    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/cinnabar")))
            .add(BlockHandler.ORE_CINNABAR.get())
            .add(BlockHandler.ORE_CINNABAR_ANDESITE.get())
            .add(BlockHandler.ORE_CINNABAR_GABBRO.get())
            .add(BlockHandler.ORE_CINNABAR_C_LIMESTONE.get())
            .add(BlockHandler.ORE_CINNABAR_SCORIA.get())
            .add(BlockHandler.ORE_CINNABAR_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_CINNABAR_JASPER.get())
            .add(BlockHandler.ORE_CINNABAR_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_CINNABAR_MARBLE.get())
            .add(BlockHandler.ORE_CINNABAR_SLATE.get());

    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/apatite")))
            .add(BlockHandler.ORE_APATITE.get())
            .add(BlockHandler.ORE_APATITE_ANDESITE.get())
            .add(BlockHandler.ORE_APATITE_GABBRO.get())
            .add(BlockHandler.ORE_APATITE_C_LIMESTONE.get())
            .add(BlockHandler.ORE_APATITE_SCORIA.get())
            .add(BlockHandler.ORE_APATITE_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_APATITE_JASPER.get())
            .add(BlockHandler.ORE_APATITE_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_APATITE_MARBLE.get())
            .add(BlockHandler.ORE_APATITE_SLATE.get());

    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/sulfur")))
            .add(BlockHandler.ORE_SULFUR.get())
            .add(BlockHandler.ORE_SULFUR_ANDESITE.get())
            .add(BlockHandler.ORE_SULFUR_GABBRO.get())
            .add(BlockHandler.ORE_SULFUR_C_LIMESTONE.get())
            .add(BlockHandler.ORE_SULFUR_SCORIA.get())
            .add(BlockHandler.ORE_SULFUR_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_SULFUR_JASPER.get())
            .add(BlockHandler.ORE_SULFUR_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_SULFUR_MARBLE.get())
            .add(BlockHandler.ORE_SULFUR_SLATE.get());

    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.FORGE_TAG, "ores/potassium_nitrate")))
            .add(BlockHandler.ORE_POTASSIUM_NITRATE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_ANDESITE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_GABBRO.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_C_LIMESTONE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_SCORIA.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_WEATHERED_LIMESTONE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_JASPER.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_Q_LIMESTONE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_MARBLE.get())
            .add(BlockHandler.ORE_POTASSIUM_NITRATE_SLATE.get());

    // Misc
    getBuilder(new BlockTags.Wrapper(new ResourceLocation(Reference.MOD_ID, "misc/enigmatic_exchanger")))
            .add(BlockHandler.ENIGMATIC_EXCHANGER.get());
  }
}