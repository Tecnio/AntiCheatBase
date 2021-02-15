package me.tecnio.anticheat;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * This is our main bukkit event class.
 */
public final class AntiCheatPlugin extends JavaPlugin {

    /**
     * Gets called on load. And we redirect it to our main class.
     */
    @Override
    public void onLoad() {
        AntiCheat.INSTANCE.load(this);
    }

    /**
     * Gets called on plugin enable. And we redirect it to our main class.
     */
    @Override
    public void onEnable() {
        AntiCheat.INSTANCE.init(this);
    }

    /**
     * Gets called on plugin disable. And we redirect it to our main class.
     */
    @Override
    public void onDisable() {
        AntiCheat.INSTANCE.stop(this);
    }

}
