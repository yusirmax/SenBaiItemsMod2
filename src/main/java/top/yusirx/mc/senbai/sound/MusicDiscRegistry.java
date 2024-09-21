package top.yusirx.mc.senbai.sound;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import top.yusirx.mc.senbai.SenBaiItemsMod;
import top.yusirx.mc.senbai.item.ModItemGroup;

import java.util.HashMap;

public final class MusicDiscRegistry {

    private static final HashMap<String, Item> ITEMS = new HashMap<>();
    private static final FabricItemSettings DISC_SETTINGS = new FabricItemSettings().maxCount(1)
            .group(ModItemGroup.SENBAI).rarity(Rarity.RARE);

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        // 例子:创建id为music_gxfc,时长为199秒的唱片
        createAndRegisterDisc("music_gxfc", 199);
        createAndRegisterDisc("music_ltx", 129);
        createAndRegisterDisc("music_cmsts", 105);
        createAndRegisterDisc("music_backhomo", 158);
        createAndRegisterDisc("music_ylimax", 109);
        // 添加更多
    }

    public static void createAndRegisterDisc(String id, int length) {
        SoundEventsRegistry.createAndRegister(id);
        register(id, new CustomMusicDiscItem(10, SoundEventsRegistry.get(id), DISC_SETTINGS, length));
    }

    public static void register(String id, Item item) {
        ITEMS.put(id, Registry.register(Registry.ITEM, SenBaiItemsMod.ID(id), item));
    }

}