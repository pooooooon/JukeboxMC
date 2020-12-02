package org.jukeboxmc.network.protocol.packet;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author LucGamesYT
 * @version 1.0
 */
@Data
@ToString
@EqualsAndHashCode ( callSuper = true )
public class PlayStatusPacket extends Packet {

    private Status status;

    @Override
    public int getPacketId() {
        return 0x02;
    }

    @Override
    public void read() {}

    @Override
    public void write() {
        super.write();
        this.writeInt( this.status.ordinal() );
    }

    public enum Status {
        LOGIN_SUCCESS,
        LOGIN_FAILED_CLIENT,
        LOGIN_FAILED_SERVER,
        PLAYER_SPAWN,
        LOGIN_FAILED_INVALID_TENANT,
        LOGIN_FAILED_VANILLA_EDU,
        LOGIN_FAILED_EDU_VANILLA,
        LOGIN_FAILED_SERVER_FULL
    }

}
