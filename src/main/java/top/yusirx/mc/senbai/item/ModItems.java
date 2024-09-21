package top.yusirx.mc.senbai.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.yusirx.mc.senbai.SenBaiItemsMod;
import top.yusirx.mc.senbai.food.ModFoodComponents;

public class ModItems {

    public static final Item haooer = registerItem("haoer",
            new Item(new FabricItemSettings().group(ModItemGroup.SENBAI)
                    .food(ModFoodComponents.haoer)));

    public static final Item chunping = registerItem("chunping",
            new Item(new FabricItemSettings().group(ModItemGroup.SENBAI)
                    .food(ModFoodComponents.chunping)));

    public static final Item kfc_jitui = registerItem("kfc_jitui",
            new Item(new FabricItemSettings().group(ModItemGroup.SENBAI)
                    .food(ModFoodComponents.kfc_jitui)));

    public static final Item kfc_tong = registerItem("kfc_tong",
            new Item(new FabricItemSettings().group(ModItemGroup.SENBAI)
                    .food(ModFoodComponents.kfc_tong)));

    public static final Item shit = registerItem("shit",
            new Item(new FabricItemSettings().group(ModItemGroup.SENBAI)
                    .food(ModFoodComponents.shit)));

    // 铁傀儡蛋蛋
    public static final Item tkl_egg = registerItem("tkl_egg",
            new SpawnEggItem(EntityType.IRON_GOLEM, 0xc4c4c4, 0xadadad,
                    new FabricItemSettings().group(ModItemGroup.SENBAI)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SenBaiItemsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SenBaiItemsMod.LOGGER.debug("Registering mod items for " + SenBaiItemsMod.MOD_ID);
    }
}