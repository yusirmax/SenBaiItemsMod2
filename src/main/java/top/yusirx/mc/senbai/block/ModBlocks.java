package top.yusirx.mc.senbai.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import top.yusirx.mc.senbai.SenBaiItemsMod;
import top.yusirx.mc.senbai.item.ModItemGroup;

public class ModBlocks {
    // 创建方块-- 一坨雪
    public static final Block shit_block = registerBlock("shit_block",
            new OreBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(0.01f),
                    UniformIntProvider
                            .create(50, 100)),
            ModItemGroup.SENBAIBLOCK);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(SenBaiItemsMod.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(SenBaiItemsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        SenBaiItemsMod.LOGGER.debug("Registering ModBlocks for" + SenBaiItemsMod.MOD_ID);
    }
}
