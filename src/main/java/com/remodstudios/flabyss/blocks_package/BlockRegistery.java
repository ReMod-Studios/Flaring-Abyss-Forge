package com.remodstudios.flabyss.blocks_package;

import com.remodstudios.flabyss.misc_package.ModMaterials;
import com.remodstudios.remodcore.api.registry.BlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class BlockRegistery extends BlockRegistry {
    public static final BlockRegistery INSTANCE = new BlockRegistery();

    // HUGE ASS COPY PASTE INCOMING FROM FABRIC

    // "cube-things go here" - LePichu

    // "mod additions" - LePichu
    public final RegistryObject<Block> WILTSLATE = add("wiltslate", new Block(AbstractBlock.Settings.of(ModMaterials.WILTSLATE_MATERIAL).strength(2.5F).harvestTool(ToolType.PICKAXE).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));
    public final RegistryObject<Block> WILTSLATE_BRICKS = add("wiltslate_bricks", new Block(AbstractBlock.Settings.copy(WILTSLATE)));
    public final RegistryObject<Block> CRACKED_WILTSLATE_BRICKS = add("cracked_wiltslate_bricks", new Block(AbstractBlock.Settings.copy(WILTSLATE)));
    public final RegistryObject<Block> CHISELED_WILTSLATE_BRICKS = add("chiseled_wiltslate_bricks", new Block(AbstractBlock.Settings.copy(WILTSLATE)));

    public final RegistryObject<Block> ARIDSTONE = add("aridstone", new Block(AbstractBlock.Settings.of(ModMaterials.ARIDSTONE_MATERIAL).strength(2.5F).harvestTool(ToolType.PICKAXE).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public final RegistryObject<Block> ARIDSTONE_BRICKS = add("aridstone_bricks", new Block(AbstractBlock.Settings.of(ModMaterials.ARIDSTONE_MATERIAL).strength(2.5F).harvestTool(ToolType.PICKAXE).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public final RegistryObject<Block> CRACKED_ARIDSTONE_BRICKS = add("cracked_aridstone_bricks", new Block(AbstractBlock.Settings.of(ModMaterials.ARIDSTONE_MATERIAL).strength(2.5F).harvestTool(ToolType.PICKAXE).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public final RegistryObject<Block> CHISELED_ARIDSTONE_BRICKS = add("chiseled_aridstone_bricks", new Block(AbstractBlock.Settings.of(ModMaterials.ARIDSTONE_MATERIAL).strength(2.5F).harvestTool(ToolType.PICKAXE).requiresTool().sounds(BlockSoundGroup.GILDED_BLACKSTONE)));

    // TODO: Sponge Block

    public final RegistryObject<Block> RIMENIUM = add("rimenium", new Block(AbstractBlock.Settings.copy(Blocks.GLOWSTONE).of(ModMaterials.RIMENIUM_MATERIAL)));
    public final RegistryObject<Block> POLISHED_RIMENIUM = add("polished_rimenium", new Block(AbstractBlock.Settings.copy(RIMENIUM)));

    // "vanilla-ish expansions" - LePichu
    public final RegistryObject<Block> BASALT_IRON_ORE = add("basalt_iron_ore", new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));

    public final RegistryObject<Block> SOUL_DIAMOND_ORE = add("soul_diamond_ore", new Block(AbstractBlock.Settings.copy(Blocks.SOUL_SAND)));
    public final RegistryObject<Block> SOUL_GAS = add("soul_gas",
            new SoulGasBlock(AbstractBlock.Settings.of(Material.AIR)
                    .sounds(BlockSoundGroup.WOOL)
                    .breakInstantly()
                    .noCollision()
//                    .luminance()
            )
    );
    public final RegistryObject<Block> SOUL_SANDSTONE = add("soul_sandstone", new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public final RegistryObject<Block> CUT_SOUL_SANDSTONE = add("cut_soul_sandstone", new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public final RegistryObject<Block> CHISELED_SOUL_SANDSTONE = add("chiseled_soul_sandstone", new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));


}
