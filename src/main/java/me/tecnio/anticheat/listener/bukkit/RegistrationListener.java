package me.tecnio.anticheat.listener.bukkit;

import me.tecnio.anticheat.AntiCheat;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * This is the class where we listen for players joining and leaving the server. We do this to handle our PlayerData.
 *
 * You may ask why do we remove players when they exit, well that is a good question its to prevent memory leaks.
 * We already have no use for PlayerData when a player leaves and we are not gonna waste memory for 2 variables.
 */
public final class RegistrationListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(final PlayerJoinEvent event) {
        AntiCheat.INSTANCE.getPlayerDataManager().addPlayer(event.getPlayer());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerQuit(final PlayerQuitEvent event) {
        AntiCheat.INSTANCE.getPlayerDataManager().removePlayer(event.getPlayer());
    }

}
