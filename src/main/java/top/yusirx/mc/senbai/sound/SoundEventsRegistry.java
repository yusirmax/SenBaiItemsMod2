package top.yusirx.mc.senbai.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import top.yusirx.mc.senbai.SenBaiItemsMod;

import java.util.HashMap;

public final class SoundEventsRegistry {

    private static final HashMap<String, SoundEvent> SOUND_EVENTS = new HashMap<>();

    public static void createAndRegister(String id) {
        register(id, SenBaiItemsMod.ID(id));
    }

    public static void register(String id, Identifier identifier) {
        SOUND_EVENTS.put(id, Registry.register(Registry.SOUND_EVENT, identifier, new SoundEvent(identifier)));
    }

    public static SoundEvent get(String key) {
        return SOUND_EVENTS.get(key);
    }

}
