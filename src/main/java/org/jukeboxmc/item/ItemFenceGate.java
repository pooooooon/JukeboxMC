package org.jukeboxmc.item;

import org.jukeboxmc.block.BlockOakFenceGate;
import org.jukeboxmc.item.type.Burnable;

import java.time.Duration;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemFenceGate extends Item implements Burnable {

    public ItemFenceGate() {
        super ( "minecraft:fence_gate" );
    }

    @Override
    public BlockOakFenceGate getBlock() {
        return new BlockOakFenceGate();
    }

    @Override
    public Duration getBurnTime() {
        return Duration.ofMillis( 300 );
    }
}
