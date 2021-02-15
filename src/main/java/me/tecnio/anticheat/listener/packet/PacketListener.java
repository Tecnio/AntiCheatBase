package me.tecnio.anticheat.listener.packet;

import io.github.retrooper.packetevents.event.PacketListenerDynamic;
import io.github.retrooper.packetevents.event.impl.PacketPlayReceiveEvent;
import io.github.retrooper.packetevents.event.impl.PacketPlaySendEvent;
import io.github.retrooper.packetevents.event.priority.PacketEventPriority;

/**
 * In this class we listen to all of the packets being transmitted while we are playing the game.
 * We don't listen to login etc packets to save a bit of performance as thread switching every packet is not the way to go lol.
 *
 * When we receive a packet the onPacketPlayReceive event is called and we can deal with the packet there.
 * And when we send a packet we can listen to it on onPacketPlaySend.
 */
public final class PacketListener extends PacketListenerDynamic {

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
