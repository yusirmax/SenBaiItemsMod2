package top.yusirx.mc.senbai.food;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    // 媲美附魔金苹果(确信
    public static final FoodComponent haoer = new FoodComponent.Builder()
            .hunger(20).saturationModifier(1.0f).meat().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 5140), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 24), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1140, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .build();
    // 吃下了淳平-会变得不幸罢
    public static final FoodComponent chunping = new FoodComponent.Builder()
            .hunger(10).saturationModifier(1.0f).meat().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 1145), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 24), 1.0f)
            .build();
    // 是KFC鸡腿耶( •̀ ω •́ )y
    public static final FoodComponent kfc_jitui = new FoodComponent.Builder()
            .hunger(10).saturationModifier(1.0f).meat().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1145), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 24), 1.0f)
            .build();
    // 啊，kfc全家桶！带suki
    public static final FoodComponent kfc_tong = new FoodComponent.Builder()
            .hunger(10).saturationModifier(1.0f).meat().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1145), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1145), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 24), 1.0f)
            .build();
    // *里有毒都听说过吧
    public static final FoodComponent shit = new FoodComponent.Builder()
            .hunger(4).saturationModifier(0.5f).meat().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 191), 0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1), 0.4f)
            .build();
}