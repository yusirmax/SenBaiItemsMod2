package top.yusirx.mc.senbai.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import top.yusirx.mc.senbai.SenBaiItemsMod;
import top.yusirx.mc.senbai.block.ModBlocks;

//创建物品组
public class ModItemGroup {
    public static final ItemGroup SENBAI = FabricItemGroupBuilder
            .build(new Identifier(SenBaiItemsMod.MOD_ID, "senbai"), () -> new ItemStack(ModItems.haooer));

    public static final ItemGroup SENBAIBLOCK = FabricItemGroupBuilder
            .build(new Identifier(SenBaiItemsMod.MOD_ID, "senbaiblock"), () -> new ItemStack(ModBlocks.shit_block));
}