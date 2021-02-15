package me.tecnio.anticheat.packet.processor;

import io.github.retrooper.packetevents.event.impl.PacketPlaySendEvent;
import lombok.experimental.UtilityClass;
import me.tecnio.anticheat.data.PlayerData;

@UtilityClass
public final class SendingPacketProcessor {
    public void process(final PacketPlaySendEvent event, final PlayerData data) {
        data.getChecks().forEach(check -> check.onPacketSend(event));
    }
}
