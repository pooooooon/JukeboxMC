package jukeboxmc.world;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public enum LevelEvent {

    UNDEFINED( 0 ),
    SOUND_CLICK( 1000 ),
    SOUND_CLICK_FAIL( 1001 ),
    SOUND_LAUNCH( 1002 ),
    SOUND_DOOR_OPEN( 1003 ),
    SOUND_FIZZ( 1004 ),
    SOUND_FUSE( 1005 ),
    SOUND_PLAY_RECORDING( 1006 ),
    SOUND_GHAST_WARNING( 1007 ),
    SOUND_GHAST_FIREBALL( 1008 ),
    SOUND_BLAZE_FIREBALL( 1009 ),
    SOUND_ZOMBIE_DOOR_BUMP( 1010 ),
    SOUND_ZOMBIE_DOOR_CRASH( 1012 ),
    SOUND_ZOMBIE_INFECTED( 1016 ),
    SOUND_ZOMBIE_CONVERTED( 1017 ),
    SOUND_ENDERMAN_TELEPORT( 1018 ),
    SOUND_ANVIL_BROKEN( 1020 ),
    SOUND_ANVIL_USED( 1021 ),
    SOUND_ANVIL_LAND( 1022 ),
    SOUND_INFINITY_ARROW_PICKUP( 1030 ),
    SOUND_TELEPORT_ENDERPEARL( 1032 ),
    SOUND_ITEMFRAME_ITEM_ADD( 1040 ),
    SOUND_ITEMFRAME_BREAK( 1041 ),
    SOUND_ITEMFRAME_PLACE( 1042 ),
    SOUND_ITEMFRAME_ITEM_REMOVE( 1043 ),
    SOUND_ITEMFRAME_ITEM_ROTATE( 1044 ),
    SOUND_CAMERA( 1050 ),
    SOUND_EXPERIENCE_ORB_PICKUP( 1051 ),
    SOUND_TOTEM_USED( 1052 ),
    SOUND_ARMOR_STAND_BREAK( 1060 ),
    SOUND_ARMOR_STAND_HIT( 1061 ),
    SOUND_ARMOR_STAND_LAND( 1062 ),
    SOUND_ARMOR_STAND_PLACE( 1063 ),
    SOUND_POINTED_DRIPSTONE_LAND( 1064 ),
    SOUND_DYE_USED( 1065 ),
    SOUND_INK_SACE_USED( 1066 ),
    PARTICLE_SHOOT( 2000 ),
    PARTICLE_DESTROY_BLOCK( 2001 ),
    PARTICLE_POTION_SPLASH( 2002 ),
    PARTICLE_EYE_OF_ENDER_DEATH( 2003 ),
    PARTICLE_MOB_BLOCK_SPAWN( 2004 ),
    PARTICLE_CROP_GROWTH( 2005 ),
    PARTICLE_SOUND_GUARDIAN_GHOST( 2006 ),
    PARTICLE_DEATH_SMOKE( 2007 ),
    PARTICLE_DENY_BLOCK( 2008 ),
    PARTICLE_GENERIC_SPAWN( 2009 ),
    PARTICLE_DRAGON_EGG( 2010 ),
    PARTICLE_CROP_EATEN( 2011 ),
    PARTICLE_CRIT( 2012 ),
    PARTICLE_TELEPORT( 2013 ),
    PARTICLE_CRACK_BLOCK( 2014 ),
    PARTICLE_BUBBLES( 2015 ),
    PARTICLE_EVAPORATE( 2016 ),
    PARTICLE_DESTROY_ARMOR_STAND( 2017 ),
    PARTICLE_BREAKING_EGG( 2018 ),
    PARTICLE_DESTROY_EGG( 2019 ),
    PARTICLE_EVAPORATE_WATER( 2020 ),
    PARTICLE_DESTROY_BLOCK_NO_SOUND( 2021 ),
    PARTICLE_KNOCKBACK_ROAR( 2022 ),
    PARTICLE_TELEPORT_TRAIL( 2023 ),
    PARTICLE_POINT_CLOUD( 2024 ),
    PARTICLE_EXPLOSION( 2025 ),
    PARTICLE_BLOCK_EXPLOSION( 2026 ),
    PARTICLE_DRIPSTONE_DRIP( 2028 ),
    PARTICLE_FIZZ_EFFECT( 2029 ),
    PARTICLE_WAX_ON( 2030 ),
    PARTICLE_WAX_OFF( 2031 ),
    PARTICLE_SCRAPE( 2032 ),
    START_RAINING( 3001 ),
    START_THUNDERSTORM( 3002 ),
    STOP_RAINING( 3003 ),
    STOP_THUNDERSTORM( 3004 ),
    GLOBAL_PAUSE( 3005 ),
    SIM_TIME_STEP( 3006 ),
    SIM_TIME_SCALE( 3007 ),
    ACTIVATE_BLOCK( 3500 ),
    CAULDRON_EXPLODE( 3501 ),
    CAULDRON_DYE_ARMOR( 3502 ),
    CAULDRON_CLEAN_ARMOR( 3503 ),
    CAULDRON_FILL_POTION( 3504 ),
    CAULDRON_TAKE_POTION( 3505 ),
    CAULDRON_FILL_WATER( 3506 ),
    CAULDRON_TAKE_WATER( 3507 ),
    CAULDRON_ADD_DYE( 3508 ),
    CAULDRON_CLEAN_BANNER( 3509 ),
    CAULDRON_FLUSH( 3510 ),
    AGENT_SPAWN_EFFECT( 3511 ),
    CAULDRON_FILL_LAVA( 3512 ),
    CAULDRON_TAKE_LAVA( 3513 ),
    CAULDRON_FILL_POWDER_SNOW( 3514 ),
    CAULDRON_TAKE_POWDER_SNOW( 3515 ),
    BLOCK_START_BREAK( 3600 ),
    BLOCK_STOP_BREAK( 3601 ),
    BLOCK_UPDATE_BREAK( 3602 ),
    SET_DATA( 4000 ),
    ALL_PLAYERS_SLEEPING( 9800 ),
    JUMP_PREVENTED( 9810 ),
    PARTICLE_BUBBLE( 16385 ),
    PARTICLE_BUBBLE_MANUAL( 16386 ),
    PARTICLE_CRITICAL( 16387 ),
    PARTICLE_BLOCK_FORCE_FIELD( 16388 ),
    PARTICLE_SMOKE( 16389 ),
    PARTICLE_EXPLODE( 16390 ),
    PARTICLE_EVAPORATION( 16391 ),
    PARTICLE_FLAME( 16392 ),
    PARTICLE_CANDLE_FLAME( 16393 ),
    PARTICLE_LAVA( 16394 ),
    PARTICLE_LARGE_SMOKE( 16395 ),
    PARTICLE_REDSTONE( 16396 ),
    PARTICLE_RISING_RED_DUST( 16397 ),
    PARTICLE_ITEM_BREAK( 16398 ),
    PARTICLE_SNOWBALL_POOF( 16399 ),
    PARTICLE_HUGE_EXPLODE( 16400 ),
    PARTICLE_HUGE_EXPLODE_SEED( 16401 ),
    PARTICLE_MOB_FLAME( 16402 ),
    PARTICLE_HEART( 16403 ),
    PARTICLE_TERRAIN( 16404 ),
    PARTICLE_TOWN_AURA( 16405 ),
    PARTICLE_PORTAL( 16406 ),
    PARTICLE_MOB_PORTAL( 16407 ),
    PARTICLE_SPLASH( 16408 ),
    PARTICLE_SPLASH_MANUAL( 16409 ),
    PARTICLE_WATER_WAKE( 16410 ),
    PARTICLE_DRIP_WATER( 16411 ),
    PARTICLE_DRIP_LAVA( 16412 ),
    PARTICLE_DRIP_HONEY( 16413 ),
    PARTICLE_STALACTITE_DRIP_WATER( 16414 ),
    PARTICLE_STALACTITE_DRIP_LAVA( 16415 ),
    PARTICLE_FALLING_DUST( 16416 ),
    PARTICLE_MOB_SPELL( 16417 ),
    PARTICLE_MOB_SPELL_AMBIENT( 16418 ),
    PARTICLE_MOB_SPELL_INSTANTANEOUS( 16419 ),
    PARTICLE_INK( 16420 ),
    PARTICLE_SLIME( 16421 ),
    PARTICLE_RAIN_SPLASH( 16422 ),
    PARTICLE_VILLAGER_ANGRY( 16423 ),
    PARTICLE_VILLAGER_HAPPY( 16424 ),
    PARTICLE_ENCHANTMENT_TABLE( 16425 ),
    PARTICLE_TRACKING_EMITTER( 16426 ),
    PARTICLE_NOTE( 16427 ),
    PARTICLE_WITCH_SPELL( 16428 ),
    PARTICLE_CARROT( 16429 ),
    PARTICLE_MOB_APPEARANCE( 16430 ),
    PARTICLE_END_ROD( 16431 ),
    PARTICLE_SPIT( 16433 ),
    PARTICLE_TOTEM( 16434 ),
    PARTICLE_FOOD( 16435 ),
    PARTICLE_FIREWORKS_STARTER( 16436 ),
    PARTICLE_FIREWORKS_SPARK( 16437 ),
    PARTICLE_FIREWORKS_OVERLAY( 16438 ),
    PARTICLE_BALLOON_GAS( 16439 ),
    PARTICLE_COLORED_FLAME( 16440 ),
    PARTICLE_SPARKLER( 16441 ),
    PARTICLE_CONDUIT( 16442 ),
    PARTICLE_BUBBLE_COLUMN_UP( 16443 ),
    PARTICLE_BUBBLE_COLUMN_DOWN( 16444 ),
    PARTICLE_SNEEZE( 16445 ),
    PARTICLE_SHULKER_BULLET( 16446 ),
    PARTICLE_BLEACH( 16447 ),
    PARTICLE_DRAGON_DESTROY_BLOCK( 16448 ),
    PARTICLE_MYCELIUM_DUST( 16449 ),
    PARTICLE_FALLING_RED_DUST( 16450 ),
    PARTICLE_CAMPFIRE_SMOKE( 16451 ),
    PARTICLE_TALL_CAMPFIRE_SMOKE( 16452 ),
    PARTICLE_RISING_DRAGONS_BREATH( 16453 ),
    PARTICLE_DRAGONS_BREATH( 16454 ),
    PARTICLE_BLUE_FLAME( 16455 ),
    PARTICLE_SOUL( 16456 ),
    PARTICLE_OBSIDIAN_TEAR( 16457 ),
    PARTICLE_PORTAL_REVERSE( 16458 ),
    PARTICLE_SNOWFLAKE( 16459 ),
    PARTICLE_VIBRATION_SIGNAL( 16460 ),
    PARTICLE_SCULK_SENSOR_REDSTONE( 16461 ),
    PARTICLE_SPORE_BLOSSOM_SHOWER( 16462 ),
    PARTICLE_SPORE_BLOSSOM_AMBIENT( 16463 ),
    PARTICLE_WAX( 16464 ),
    PARTICLE_ELECTRIC_SPARK( 16465 );

    private int id;

    LevelEvent( int id ) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}