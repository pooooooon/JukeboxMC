package org.jukeboxmc.block.behavior;

import org.cloudburstmc.nbt.NbtMap;
import org.jukeboxmc.block.Block;
import org.jukeboxmc.item.Item;
import org.jukeboxmc.item.ItemType;
import org.jukeboxmc.item.enchantment.Enchantment;
import org.jukeboxmc.item.enchantment.EnchantmentType;
import org.jukeboxmc.util.Identifier;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockNetherGoldOre extends Block {

    public BlockNetherGoldOre( Identifier identifier ) {
        super( identifier );
    }

    public BlockNetherGoldOre( Identifier identifier, NbtMap blockStates ) {
        super( identifier, blockStates );
    }

    @Override
    public List<Item> getDrops( Item item ) {
        if ( this.isCorrectToolType( item ) && this.isCorrectTierType( item ) ) {
            ThreadLocalRandom current = ThreadLocalRandom.current();
            int amount = current.nextInt(2, 6);
            Enchantment enchantment = item.getEnchantment( EnchantmentType.FORTUNE );
            if ( enchantment != null ) {
                amount += current.nextInt(0, enchantment.getLevel() + 1 );
            }
            return Collections.singletonList( Item.create( ItemType.GOLD_NUGGET ).setAmount( amount ) );
        }
        return Collections.emptyList();
    }
}
