package me.tecnio.anticheat.data;

import lombok.Getter;
import lombok.Setter;
import me.tecnio.anticheat.check.Check;
import me.tecnio.anticheat.check.manager.CheckManager;
import org.bukkit.entity.Player;

import java.util.List;
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

    private final List<Check> checks = CheckManager.loadChecks(this);

    public PlayerData(final Player player) {
        this.player = player;
        this.uuid = player.getUniqueId();
    }
}
