package top.yusirx.mc.senbai;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.yusirx.mc.senbai.block.ModBlocks;
import top.yusirx.mc.senbai.item.ModItems;
import top.yusirx.mc.senbai.item.ModPotions;
import top.yusirx.mc.senbai.sound.MusicDiscRegistry;

public class SenBaiItemsMod implements ModInitializer {
    public static Identifier ID(String path) {
        return new Identifier(SenBaiItemsMod.MOD_ID, path);
    }

    public static final Logger LOGGER = LoggerFactory.getLogger("senbaiitemsmod");
    public static final String MOD_ID = "senbaiitemsmod";// mod id

    @Override
    public void onInitialize() {
        ModItems.registerModItems();// 注册物品类
        ModBlocks.registerModBlocks();// 注册方块类
        MusicDiscRegistry.init();// 注册声音类物品
        ModPotions.registerPotions();// 注册药水
        LOGGER.info("Loaded SenBaiItems Mod");
        LOGGER.warn("Don't play 2 discs at the same time");
    }
}