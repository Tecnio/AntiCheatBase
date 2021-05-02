package me.tecnio.anticheat.packet.processor;

import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import io.github.retrooper.packetevents.packettype.PacketType;
import io.github.retrooper.packetevents.packetwrappers.play.in.flying.WrappedPacketInFlying;
import lombok.experimental.UtilityClass;
import me.tecnio.anticheat.data.PlayerData;

@UtilityClass
public final class ReceivingPacketProcessor {
    public void process(final PacketPlayReceiveEvent event, final PlayerData data) {
        if (PacketType.Play.Client.Util.isInstanceOfFlying(event.getPacketId())) {
            final WrappedPacketInFlying wrapper = new WrappedPacketInFlying(event.getNMSPacket());

            data.getPositionProcessor().handle(wrapper);
        }

        data.getChecks().forEach(check -> check.onPacketReceive(event));
    }
}
