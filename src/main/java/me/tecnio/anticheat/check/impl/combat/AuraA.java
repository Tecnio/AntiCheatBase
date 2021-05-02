package me.tecnio.anticheat.check.impl.combat;

import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlaySendEvent;
import io.github.retrooper.packetevents.packettype.PacketType;
import me.tecnio.anticheat.check.Check;
import me.tecnio.anticheat.check.api.CheckInfo;
import me.tecnio.anticheat.data.PlayerData;
import org.bukkit.Location;

@CheckInfo(name = "Aura", type = "A")
public final class AuraA extends Check {

    // Do not forget to register your checks in CheckManager!

    public AuraA(final PlayerData data) {
        super(data);
    }

    @Override
    public void onPacketReceive(final PacketPlayReceiveEvent event) {
        if (event.getPacketId() == PacketType.Play.Client.USE_ENTITY) {
            // Do stuff

            final Location to = data.getPositionProcessor().getTo();
            final Location from = data.getPositionProcessor().getFrom();
        }
    }

    @Override
    public void onPacketSend(final PacketPlaySendEvent event) {
        if (event.getPacketId() == PacketType.Play.Server.ANIMATION) {
            // Do stuff
        }
    }
}
