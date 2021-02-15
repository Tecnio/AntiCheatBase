package me.tecnio.anticheat.packet.processor;

import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import lombok.experimental.UtilityClass;
import me.tecnio.anticheat.data.PlayerData;

@UtilityClass
public final class ReceivingPacketProcessor {
    public void process(final PacketPlayReceiveEvent event, final PlayerData data) {
        data.getChecks().forEach(check -> check.onPacketReceive(event));
    }
}
