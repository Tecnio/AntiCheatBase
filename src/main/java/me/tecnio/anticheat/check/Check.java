package me.tecnio.anticheat.check;

import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlaySendEvent;
import lombok.Getter;
import me.tecnio.anticheat.data.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

/**
 * This is our abstract superclass for all of our checks.
 * All checks should extend this class.
 * This class contains all the necessary stuff for a check.
 */
@Getter
public abstract class Check {

    protected final PlayerData data;
    private double buffer;

    public Check(final PlayerData data) {
        this.data = data;
    }

    /**
     * This is our packet event system.
     */
    public void onPacketReceive(final PacketPlayReceiveEvent event) { }
    public void onPacketSend(final PacketPlaySendEvent event) { }

    /**
     * This our buffer system.
     */
    public final double increaseBuffer() {
        return buffer = Math.min(10000, buffer + 1);
    }
    public final double increaseBufferBy(final double amount) {
        return buffer = Math.min(10000, buffer + amount);
    }
    public final double decreaseBuffer() {
        return buffer = Math.max(0, buffer - 1);
    }
    public final double decreaseBufferBy(final double amount) {
        return buffer = Math.max(0, buffer - amount);
    }
    public final void resetBuffer() {
        buffer = 0;
    }
    public final void setBuffer(final double amount) {
        buffer = amount;
    }
    public final void multiplyBuffer(final double multiplier) {
        buffer *= multiplier;
    }


    public final void debug(final Object object) {
        data.getPlayer().sendMessage(ChatColor.RED + "[AC-Debug] " + ChatColor.GRAY + object);
    }

    public final void broadcast(final Object object) {
        Bukkit.broadcastMessage(ChatColor.RED + "[AC-Debug] " + ChatColor.GRAY + object);
    }
}
