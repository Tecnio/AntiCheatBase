package me.tecnio.anticheat.data;

import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;


/**
 * This is the class where we store all of our player data and handle it.
 */
@Getter
public final class PlayerDataManager {

    private final ConcurrentHashMap<UUID, PlayerData> playerDataMap = new ConcurrentHashMap<>();

    public void addPlayer(final Player player) {
        if (player != null) {
            playerDataMap.put(player.getUniqueId(), new PlayerData(player));
        }
    }

    public void removePlayer(final Player player) {
        if (player != null) {
            playerDataMap.remove(player.getUniqueId());
        }
    }

    public PlayerData get(final Player player) {
        if (player != null) {
            return playerDataMap.get(player.getUniqueId());
        }
        return null;
    }
}
