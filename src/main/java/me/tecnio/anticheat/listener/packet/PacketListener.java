package me.tecnio.anticheat.listener.packet;

import io.github.retrooper.packetevents.event.PacketListenerDynamic;
import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlaySendEvent;
import io.github.retrooper.packetevents.event.priority.PacketEventPriority;

public class PacketListener extends PacketListenerDynamic {
    public PacketListener() {
        super(PacketEventPriority.MONITOR);
    }

    @Override
    public void onPacketPlayReceive(final PacketPlayReceiveEvent event) {
    }

    @Override
    public void onPacketPlaySend(final PacketPlaySendEvent event) {
    }

}
