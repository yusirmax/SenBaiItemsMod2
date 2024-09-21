package top.yusirx.mc.senbai.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.yusirx.mc.senbai.SenBaiItemsMod;

public class ModPotions {
    public static final Potion nm = ModPotions.registerPotions("nm",
            new Potion(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600)));

    private static Potion registerPotions(String name, Potion potion) {
        return Registry.register(Registry.POTION, new Identifier(SenBaiItemsMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        SenBaiItemsMod.LOGGER.debug("Registering mod potions for " + SenBaiItemsMod.MOD_ID);
    }
}
