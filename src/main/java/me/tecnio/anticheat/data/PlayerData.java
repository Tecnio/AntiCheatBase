package me.tecnio.anticheat.data;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * This is our PlayerData class, as the name suggests we store data about the player here.
 * Every player should have this in order for the anticheat to function as the entire plugin is based on this.
 */
@Getter
@Setter
public final class PlayerData {
    private final Player player;
    private final UUID uuid;

    public PlayerData(final Player player) {
        this.player = player;
        this.uuid = player.getUniqueId();
    }
}
