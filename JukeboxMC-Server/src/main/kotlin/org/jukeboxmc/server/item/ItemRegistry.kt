package org.jukeboxmc.server.item

import org.jukeboxmc.api.Identifier
import org.jukeboxmc.api.item.ItemType
import org.jukeboxmc.server.item.behavior.*

class ItemRegistry {

    companion object {

        private val identifierFromItemType: MutableMap<ItemType, Identifier> = mutableMapOf()
        private val itemTypeFromIdentifier: MutableMap<Identifier, ItemType> = mutableMapOf()
        private val itemClassFromItemType: MutableMap<ItemType, Class<out JukeboxItem?>> = mutableMapOf()

        init {
            register(ItemType.ACACIA_BOAT, Identifier.fromString("minecraft:acacia_boat"))
            register(ItemType.ACACIA_BUTTON, Identifier.fromString("minecraft:acacia_button"))
            register(ItemType.ACACIA_CHEST_BOAT, Identifier.fromString("minecraft:acacia_chest_boat"))
            register(ItemType.ACACIA_DOOR, Identifier.fromString("minecraft:acacia_door"), ItemDoor::class.java)
            register(ItemType.ACACIA_FENCE, Identifier.fromString("minecraft:acacia_fence"))
            register(ItemType.ACACIA_FENCE_GATE, Identifier.fromString("minecraft:acacia_fence_gate"))
            register(
                ItemType.ACACIA_HANGING_SIGN,
                Identifier.fromString("minecraft:acacia_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.ACACIA_LOG, Identifier.fromString("minecraft:acacia_log"))
            register(ItemType.ACACIA_PRESSURE_PLATE, Identifier.fromString("minecraft:acacia_pressure_plate"))
            register(ItemType.ACACIA_SIGN, Identifier.fromString("minecraft:acacia_sign"), ItemSign::class.java)
            register(ItemType.ACACIA_STAIRS, Identifier.fromString("minecraft:acacia_stairs"))
            register(
                ItemType.ACACIA_STANDING_SIGN,
                Identifier.fromString("minecraft:acacia_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.ACACIA_TRAPDOOR, Identifier.fromString("minecraft:acacia_trapdoor"))
            register(
                ItemType.ACACIA_WALL_SIGN,
                Identifier.fromString("minecraft:acacia_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.ACTIVATOR_RAIL, Identifier.fromString("minecraft:activator_rail"))
            register(ItemType.AGENT_SPAWN_EGG, Identifier.fromString("minecraft:agent_spawn_egg"))
            register(ItemType.AIR, Identifier.fromString("minecraft:air"))
            register(
                ItemType.ALLAY_SPAWN_EGG,
                Identifier.fromString("minecraft:allay_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.ALLOW, Identifier.fromString("minecraft:allow"))
            register(ItemType.AMETHYST_BLOCK, Identifier.fromString("minecraft:amethyst_block"))
            register(ItemType.AMETHYST_CLUSTER, Identifier.fromString("minecraft:amethyst_cluster"))
            register(ItemType.AMETHYST_SHARD, Identifier.fromString("minecraft:amethyst_shard"))
            register(ItemType.ANCIENT_DEBRIS, Identifier.fromString("minecraft:ancient_debris"))
            register(ItemType.ANDESITE_STAIRS, Identifier.fromString("minecraft:andesite_stairs"))
            register(ItemType.ANGLER_POTTERY_SHERD, Identifier.fromString("minecraft:angler_pottery_sherd"))
            register(ItemType.ANVIL, Identifier.fromString("minecraft:anvil"))
            register(ItemType.APPLE, Identifier.fromString("minecraft:apple"), ItemApple::class.java)
            register(ItemType.ARCHER_POTTERY_SHERD, Identifier.fromString("minecraft:archer_pottery_sherd"))
            register(ItemType.ARMOR_STAND, Identifier.fromString("minecraft:armor_stand"))
            register(ItemType.ARMS_UP_POTTERY_SHERD, Identifier.fromString("minecraft:arms_up_pottery_sherd"))
            register(ItemType.ARROW, Identifier.fromString("minecraft:arrow"))
            register(ItemType.AXOLOTL_BUCKET, Identifier.fromString("minecraft:axolotl_bucket"))
            register(
                ItemType.AXOLOTL_SPAWN_EGG,
                Identifier.fromString("minecraft:axolotl_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.AZALEA, Identifier.fromString("minecraft:azalea"))
            register(ItemType.AZALEA_LEAVES, Identifier.fromString("minecraft:azalea_leaves"))
            register(ItemType.AZALEA_LEAVES_FLOWERED, Identifier.fromString("minecraft:azalea_leaves_flowered"))
            register(
                ItemType.BAKED_POTATO,
                Identifier.fromString("minecraft:baked_potato"),
                ItemBakedPotato::class.java
            )
            register(ItemType.BALLOON, Identifier.fromString("minecraft:balloon"))
            register(ItemType.BAMBOO, Identifier.fromString("minecraft:bamboo"))
            register(ItemType.BAMBOO_BLOCK, Identifier.fromString("minecraft:bamboo_block"))
            register(ItemType.BAMBOO_BUTTON, Identifier.fromString("minecraft:bamboo_button"))
            register(ItemType.BAMBOO_CHEST_RAFT, Identifier.fromString("minecraft:bamboo_chest_raft"))
            register(ItemType.BAMBOO_DOOR, Identifier.fromString("minecraft:bamboo_door"), ItemDoor::class.java)
            register(ItemType.BAMBOO_DOUBLE_SLAB, Identifier.fromString("minecraft:bamboo_double_slab"))
            register(ItemType.BAMBOO_FENCE, Identifier.fromString("minecraft:bamboo_fence"))
            register(ItemType.BAMBOO_FENCE_GATE, Identifier.fromString("minecraft:bamboo_fence_gate"))
            register(
                ItemType.BAMBOO_HANGING_SIGN,
                Identifier.fromString("minecraft:bamboo_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.BAMBOO_MOSAIC, Identifier.fromString("minecraft:bamboo_mosaic"))
            register(ItemType.BAMBOO_MOSAIC_DOUBLE_SLAB, Identifier.fromString("minecraft:bamboo_mosaic_double_slab"))
            register(ItemType.BAMBOO_MOSAIC_SLAB, Identifier.fromString("minecraft:bamboo_mosaic_slab"))
            register(ItemType.BAMBOO_MOSAIC_STAIRS, Identifier.fromString("minecraft:bamboo_mosaic_stairs"))
            register(ItemType.BAMBOO_PLANKS, Identifier.fromString("minecraft:bamboo_planks"))
            register(ItemType.BAMBOO_PRESSURE_PLATE, Identifier.fromString("minecraft:bamboo_pressure_plate"))
            register(ItemType.BAMBOO_RAFT, Identifier.fromString("minecraft:bamboo_raft"))
            register(ItemType.BAMBOO_SAPLING, Identifier.fromString("minecraft:bamboo_sapling"))
            register(ItemType.BAMBOO_SIGN, Identifier.fromString("minecraft:bamboo_sign"), ItemSign::class.java)
            register(ItemType.BAMBOO_SLAB, Identifier.fromString("minecraft:bamboo_slab"))
            register(ItemType.BAMBOO_STAIRS, Identifier.fromString("minecraft:bamboo_stairs"))
            register(
                ItemType.BAMBOO_STANDING_SIGN,
                Identifier.fromString("minecraft:bamboo_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.BAMBOO_TRAPDOOR, Identifier.fromString("minecraft:bamboo_trapdoor"))
            register(
                ItemType.BAMBOO_WALL_SIGN,
                Identifier.fromString("minecraft:bamboo_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.BANNER, Identifier.fromString("minecraft:banner"), ItemBanner::class.java)
            register(ItemType.BANNER_PATTERN, Identifier.fromString("minecraft:banner_pattern"))
            register(ItemType.BARREL, Identifier.fromString("minecraft:barrel"))
            register(ItemType.BARRIER, Identifier.fromString("minecraft:barrier"))
            register(ItemType.BASALT, Identifier.fromString("minecraft:basalt"))
            register(ItemType.BAT_SPAWN_EGG, Identifier.fromString("minecraft:bat_spawn_egg"), ItemSpawnEgg::class.java)
            register(ItemType.BEACON, Identifier.fromString("minecraft:beacon"))
            register(ItemType.BED, Identifier.fromString("minecraft:bed"), ItemBed::class.java)
            register(ItemType.BEDROCK, Identifier.fromString("minecraft:bedrock"))
            register(ItemType.BEE_NEST, Identifier.fromString("minecraft:bee_nest"))
            register(ItemType.BEE_SPAWN_EGG, Identifier.fromString("minecraft:bee_spawn_egg"), ItemSpawnEgg::class.java)
            register(ItemType.BEEF, Identifier.fromString("minecraft:beef"), ItemBeef::class.java)
            register(ItemType.BEEHIVE, Identifier.fromString("minecraft:beehive"))
            register(ItemType.BEETROOT, Identifier.fromString("minecraft:beetroot"), ItemBeetroot::class.java)
            register(ItemType.BEETROOT_SEEDS, Identifier.fromString("minecraft:beetroot_seeds"))
            register(
                ItemType.BEETROOT_SOUP,
                Identifier.fromString("minecraft:beetroot_soup"),
                ItemBeetrootSoup::class.java
            )
            register(ItemType.BELL, Identifier.fromString("minecraft:bell"))
            register(ItemType.BIG_DRIPLEAF, Identifier.fromString("minecraft:big_dripleaf"))
            register(ItemType.BIRCH_BOAT, Identifier.fromString("minecraft:birch_boat"))
            register(ItemType.BIRCH_BUTTON, Identifier.fromString("minecraft:birch_button"))
            register(ItemType.BIRCH_CHEST_BOAT, Identifier.fromString("minecraft:birch_chest_boat"))
            register(ItemType.BIRCH_DOOR, Identifier.fromString("minecraft:birch_door"), ItemDoor::class.java)
            register(ItemType.BIRCH_FENCE, Identifier.fromString("minecraft:birch_fence"))
            register(ItemType.BIRCH_FENCE_GATE, Identifier.fromString("minecraft:birch_fence_gate"))
            register(
                ItemType.BIRCH_HANGING_SIGN,
                Identifier.fromString("minecraft:birch_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.BIRCH_LOG, Identifier.fromString("minecraft:birch_log"))
            register(ItemType.BIRCH_PRESSURE_PLATE, Identifier.fromString("minecraft:birch_pressure_plate"))
            register(ItemType.BIRCH_SIGN, Identifier.fromString("minecraft:birch_sign"), ItemSign::class.java)
            register(ItemType.BIRCH_STAIRS, Identifier.fromString("minecraft:birch_stairs"))
            register(
                ItemType.BIRCH_STANDING_SIGN,
                Identifier.fromString("minecraft:birch_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.BIRCH_TRAPDOOR, Identifier.fromString("minecraft:birch_trapdoor"))
            register(ItemType.BIRCH_WALL_SIGN, Identifier.fromString("minecraft:birch_wall_sign"), ItemSign::class.java)
            register(ItemType.BLACK_CANDLE, Identifier.fromString("minecraft:black_candle"))
            register(ItemType.BLACK_CANDLE_CAKE, Identifier.fromString("minecraft:black_candle_cake"))
            register(ItemType.BLACK_CARPET, Identifier.fromString("minecraft:black_carpet"))
            register(ItemType.BLACK_CONCRETE, Identifier.fromString("minecraft:black_concrete"))
            register(ItemType.BLACK_CONCRETE_POWDER, Identifier.fromString("minecraft:black_concrete_powder"))
            register(ItemType.BLACK_DYE, Identifier.fromString("minecraft:black_dye"))
            register(ItemType.BLACK_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:black_glazed_terracotta"))
            register(ItemType.BLACK_SHULKER_BOX, Identifier.fromString("minecraft:black_shulker_box"))
            register(ItemType.BLACK_STAINED_GLASS, Identifier.fromString("minecraft:black_stained_glass"))
            register(ItemType.BLACK_STAINED_GLASS_PANE, Identifier.fromString("minecraft:black_stained_glass_pane"))
            register(ItemType.BLACK_TERRACOTTA, Identifier.fromString("minecraft:black_terracotta"))
            register(ItemType.BLACK_WOOL, Identifier.fromString("minecraft:black_wool"))
            register(ItemType.BLACKSTONE, Identifier.fromString("minecraft:blackstone"))
            register(ItemType.BLACKSTONE_DOUBLE_SLAB, Identifier.fromString("minecraft:blackstone_double_slab"))
            register(ItemType.BLACKSTONE_SLAB, Identifier.fromString("minecraft:blackstone_slab"))
            register(ItemType.BLACKSTONE_STAIRS, Identifier.fromString("minecraft:blackstone_stairs"))
            register(ItemType.BLACKSTONE_WALL, Identifier.fromString("minecraft:blackstone_wall"))
            register(ItemType.BLADE_POTTERY_SHERD, Identifier.fromString("minecraft:blade_pottery_sherd"))
            register(ItemType.BLAST_FURNACE, Identifier.fromString("minecraft:blast_furnace"))
            register(ItemType.BLAZE_POWDER, Identifier.fromString("minecraft:blaze_powder"))
            register(ItemType.BLAZE_ROD, Identifier.fromString("minecraft:blaze_rod"))
            register(
                ItemType.BLAZE_SPAWN_EGG,
                Identifier.fromString("minecraft:blaze_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.BLEACH, Identifier.fromString("minecraft:bleach"))
            register(ItemType.BLUE_CANDLE, Identifier.fromString("minecraft:blue_candle"))
            register(ItemType.BLUE_CANDLE_CAKE, Identifier.fromString("minecraft:blue_candle_cake"))
            register(ItemType.BLUE_CARPET, Identifier.fromString("minecraft:blue_carpet"))
            register(ItemType.BLUE_CONCRETE, Identifier.fromString("minecraft:blue_concrete"))
            register(ItemType.BLUE_CONCRETE_POWDER, Identifier.fromString("minecraft:blue_concrete_powder"))
            register(ItemType.BLUE_DYE, Identifier.fromString("minecraft:blue_dye"))
            register(ItemType.BLUE_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:blue_glazed_terracotta"))
            register(ItemType.BLUE_ICE, Identifier.fromString("minecraft:blue_ice"))
            register(ItemType.BLUE_SHULKER_BOX, Identifier.fromString("minecraft:blue_shulker_box"))
            register(ItemType.BLUE_STAINED_GLASS, Identifier.fromString("minecraft:blue_stained_glass"))
            register(ItemType.BLUE_STAINED_GLASS_PANE, Identifier.fromString("minecraft:blue_stained_glass_pane"))
            register(ItemType.BLUE_TERRACOTTA, Identifier.fromString("minecraft:blue_terracotta"))
            register(ItemType.BLUE_WOOL, Identifier.fromString("minecraft:blue_wool"))
            register(ItemType.BOAT, Identifier.fromString("minecraft:boat"))
            register(ItemType.BONE, Identifier.fromString("minecraft:bone"))
            register(ItemType.BONE_BLOCK, Identifier.fromString("minecraft:bone_block"))
            register(ItemType.BONE_MEAL, Identifier.fromString("minecraft:bone_meal"))
            register(ItemType.BOOK, Identifier.fromString("minecraft:book"))
            register(ItemType.BOOKSHELF, Identifier.fromString("minecraft:bookshelf"))
            register(ItemType.BORDER_BLOCK, Identifier.fromString("minecraft:border_block"))
            register(
                ItemType.BORDURE_INDENTED_BANNER_PATTERN,
                Identifier.fromString("minecraft:bordure_indented_banner_pattern")
            )
            register(ItemType.BOW, Identifier.fromString("minecraft:bow"))
            register(ItemType.BOWL, Identifier.fromString("minecraft:bowl"))
            register(ItemType.BRAIN_CORAL, Identifier.fromString("minecraft:brain_coral"))
            register(ItemType.BREAD, Identifier.fromString("minecraft:bread"), ItemBread::class.java)
            register(ItemType.BREWER_POTTERY_SHERD, Identifier.fromString("minecraft:brewer_pottery_sherd"))
            register(ItemType.BREWING_STAND, Identifier.fromString("minecraft:brewing_stand"))
            register(ItemType.BRICK, Identifier.fromString("minecraft:brick"))
            register(ItemType.BRICK_BLOCK, Identifier.fromString("minecraft:brick_block"))
            register(ItemType.BRICK_STAIRS, Identifier.fromString("minecraft:brick_stairs"))
            register(ItemType.BROWN_CANDLE, Identifier.fromString("minecraft:brown_candle"))
            register(ItemType.BROWN_CANDLE_CAKE, Identifier.fromString("minecraft:brown_candle_cake"))
            register(ItemType.BROWN_CARPET, Identifier.fromString("minecraft:brown_carpet"))
            register(ItemType.BROWN_CONCRETE, Identifier.fromString("minecraft:brown_concrete"))
            register(ItemType.BROWN_CONCRETE_POWDER, Identifier.fromString("minecraft:brown_concrete_powder"))
            register(ItemType.BROWN_DYE, Identifier.fromString("minecraft:brown_dye"))
            register(ItemType.BROWN_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:brown_glazed_terracotta"))
            register(ItemType.BROWN_MUSHROOM, Identifier.fromString("minecraft:brown_mushroom"))
            register(ItemType.BROWN_MUSHROOM_BLOCK, Identifier.fromString("minecraft:brown_mushroom_block"))
            register(ItemType.BROWN_SHULKER_BOX, Identifier.fromString("minecraft:brown_shulker_box"))
            register(ItemType.BROWN_STAINED_GLASS, Identifier.fromString("minecraft:brown_stained_glass"))
            register(ItemType.BROWN_STAINED_GLASS_PANE, Identifier.fromString("minecraft:brown_stained_glass_pane"))
            register(ItemType.BROWN_TERRACOTTA, Identifier.fromString("minecraft:brown_terracotta"))
            register(ItemType.BROWN_WOOL, Identifier.fromString("minecraft:brown_wool"))
            register(ItemType.BRUSH, Identifier.fromString("minecraft:brush"))
            register(ItemType.BUBBLE_COLUMN, Identifier.fromString("minecraft:bubble_column"))
            register(ItemType.BUBBLE_CORAL, Identifier.fromString("minecraft:bubble_coral"))
            register(ItemType.BUCKET, Identifier.fromString("minecraft:bucket"))
            register(ItemType.BUDDING_AMETHYST, Identifier.fromString("minecraft:budding_amethyst"))
            register(ItemType.BURN_POTTERY_SHERD, Identifier.fromString("minecraft:burn_pottery_sherd"))
            register(ItemType.CACTUS, Identifier.fromString("minecraft:cactus"))
            register(ItemType.CAKE, Identifier.fromString("minecraft:cake"))
            register(ItemType.CALCITE, Identifier.fromString("minecraft:calcite"))
            register(ItemType.CALIBRATED_SCULK_SENSOR, Identifier.fromString("minecraft:calibrated_sculk_sensor"))
            register(
                ItemType.CAMEL_SPAWN_EGG,
                Identifier.fromString("minecraft:camel_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.CAMERA, Identifier.fromString("minecraft:camera"))
            register(ItemType.CAMPFIRE, Identifier.fromString("minecraft:campfire"))
            register(ItemType.CANDLE, Identifier.fromString("minecraft:candle"))
            register(ItemType.CANDLE_CAKE, Identifier.fromString("minecraft:candle_cake"))
            register(ItemType.CARPET, Identifier.fromString("minecraft:carpet"))
            register(ItemType.CARROT, Identifier.fromString("minecraft:carrot"), ItemCarrot::class.java)
            register(ItemType.CARROT_ON_A_STICK, Identifier.fromString("minecraft:carrot_on_a_stick"))
            register(ItemType.CARROTS, Identifier.fromString("minecraft:carrots"))
            register(ItemType.CARTOGRAPHY_TABLE, Identifier.fromString("minecraft:cartography_table"))
            register(ItemType.CARVED_PUMPKIN, Identifier.fromString("minecraft:carved_pumpkin"))
            register(ItemType.CAT_SPAWN_EGG, Identifier.fromString("minecraft:cat_spawn_egg"), ItemSpawnEgg::class.java)
            register(ItemType.CAULDRON, Identifier.fromString("minecraft:cauldron"))
            register(
                ItemType.CAVE_SPIDER_SPAWN_EGG,
                Identifier.fromString("minecraft:cave_spider_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.CAVE_VINES, Identifier.fromString("minecraft:cave_vines"))
            register(
                ItemType.CAVE_VINES_BODY_WITH_BERRIES,
                Identifier.fromString("minecraft:cave_vines_body_with_berries")
            )
            register(
                ItemType.CAVE_VINES_HEAD_WITH_BERRIES,
                Identifier.fromString("minecraft:cave_vines_head_with_berries")
            )
            register(ItemType.CHAIN, Identifier.fromString("minecraft:chain"))
            register(ItemType.CHAIN_COMMAND_BLOCK, Identifier.fromString("minecraft:chain_command_block"))
            register(
                ItemType.CHAINMAIL_BOOTS,
                Identifier.fromString("minecraft:chainmail_boots"),
                ItemChainBoots::class.java
            )
            register(
                ItemType.CHAINMAIL_CHESTPLATE,
                Identifier.fromString("minecraft:chainmail_chestplate"),
                ItemChainChestplate::class.java
            )
            register(
                ItemType.CHAINMAIL_HELMET,
                Identifier.fromString("minecraft:chainmail_helmet"),
                ItemChainHelmet::class.java
            )
            register(
                ItemType.CHAINMAIL_LEGGINGS,
                Identifier.fromString("minecraft:chainmail_leggings"),
                ItemChainLeggings::class.java
            )
            register(ItemType.CHARCOAL, Identifier.fromString("minecraft:charcoal"))
            register(ItemType.CHEMICAL_HEAT, Identifier.fromString("minecraft:chemical_heat"))
            register(ItemType.CHEMISTRY_TABLE, Identifier.fromString("minecraft:chemistry_table"))
            register(ItemType.CHERRY_BOAT, Identifier.fromString("minecraft:cherry_boat"))
            register(ItemType.CHERRY_BUTTON, Identifier.fromString("minecraft:cherry_button"))
            register(ItemType.CHERRY_CHEST_BOAT, Identifier.fromString("minecraft:cherry_chest_boat"))
            register(ItemType.CHERRY_DOOR, Identifier.fromString("minecraft:cherry_door"), ItemDoor::class.java)
            register(ItemType.CHERRY_DOUBLE_SLAB, Identifier.fromString("minecraft:cherry_double_slab"))
            register(ItemType.CHERRY_FENCE, Identifier.fromString("minecraft:cherry_fence"))
            register(ItemType.CHERRY_FENCE_GATE, Identifier.fromString("minecraft:cherry_fence_gate"))
            register(
                ItemType.CHERRY_HANGING_SIGN,
                Identifier.fromString("minecraft:cherry_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.CHERRY_LEAVES, Identifier.fromString("minecraft:cherry_leaves"))
            register(ItemType.CHERRY_LOG, Identifier.fromString("minecraft:cherry_log"))
            register(ItemType.CHERRY_PLANKS, Identifier.fromString("minecraft:cherry_planks"))
            register(ItemType.CHERRY_PRESSURE_PLATE, Identifier.fromString("minecraft:cherry_pressure_plate"))
            register(ItemType.CHERRY_SAPLING, Identifier.fromString("minecraft:cherry_sapling"))
            register(ItemType.CHERRY_SIGN, Identifier.fromString("minecraft:cherry_sign"), ItemSign::class.java)
            register(ItemType.CHERRY_SLAB, Identifier.fromString("minecraft:cherry_slab"))
            register(ItemType.CHERRY_STAIRS, Identifier.fromString("minecraft:cherry_stairs"))
            register(
                ItemType.CHERRY_STANDING_SIGN,
                Identifier.fromString("minecraft:cherry_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.CHERRY_TRAPDOOR, Identifier.fromString("minecraft:cherry_trapdoor"))
            register(
                ItemType.CHERRY_WALL_SIGN,
                Identifier.fromString("minecraft:cherry_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.CHERRY_WOOD, Identifier.fromString("minecraft:cherry_wood"))
            register(ItemType.CHEST, Identifier.fromString("minecraft:chest"))
            register(ItemType.CHEST_BOAT, Identifier.fromString("minecraft:chest_boat"))
            register(ItemType.CHEST_MINECART, Identifier.fromString("minecraft:chest_minecart"))
            register(ItemType.CHICKEN, Identifier.fromString("minecraft:chicken"), ItemChicken::class.java)
            register(
                ItemType.CHICKEN_SPAWN_EGG,
                Identifier.fromString("minecraft:chicken_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.CHISELED_BOOKSHELF, Identifier.fromString("minecraft:chiseled_bookshelf"))
            register(ItemType.CHISELED_DEEPSLATE, Identifier.fromString("minecraft:chiseled_deepslate"))
            register(ItemType.CHISELED_NETHER_BRICKS, Identifier.fromString("minecraft:chiseled_nether_bricks"))
            register(
                ItemType.CHISELED_POLISHED_BLACKSTONE,
                Identifier.fromString("minecraft:chiseled_polished_blackstone")
            )
            register(ItemType.CHORUS_FLOWER, Identifier.fromString("minecraft:chorus_flower"))
            register(ItemType.CHORUS_FRUIT, Identifier.fromString("minecraft:chorus_fruit"))
            register(ItemType.CHORUS_PLANT, Identifier.fromString("minecraft:chorus_plant"))
            register(ItemType.CLAY, Identifier.fromString("minecraft:clay"))
            register(ItemType.CLAY_BALL, Identifier.fromString("minecraft:clay_ball"))
            register(
                ItemType.CLIENT_REQUEST_PLACEHOLDER_BLOCK,
                Identifier.fromString("minecraft:client_request_placeholder_block")
            )
            register(ItemType.CLOCK, Identifier.fromString("minecraft:clock"))
            register(ItemType.COAL, Identifier.fromString("minecraft:coal"))
            register(ItemType.COAL_BLOCK, Identifier.fromString("minecraft:coal_block"))
            register(ItemType.COAL_ORE, Identifier.fromString("minecraft:coal_ore"))
            register(
                ItemType.COAST_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:coast_armor_trim_smithing_template")
            )
            register(ItemType.COBBLED_DEEPSLATE, Identifier.fromString("minecraft:cobbled_deepslate"))
            register(
                ItemType.COBBLED_DEEPSLATE_DOUBLE_SLAB,
                Identifier.fromString("minecraft:cobbled_deepslate_double_slab")
            )
            register(ItemType.COBBLED_DEEPSLATE_SLAB, Identifier.fromString("minecraft:cobbled_deepslate_slab"))
            register(ItemType.COBBLED_DEEPSLATE_STAIRS, Identifier.fromString("minecraft:cobbled_deepslate_stairs"))
            register(ItemType.COBBLED_DEEPSLATE_WALL, Identifier.fromString("minecraft:cobbled_deepslate_wall"))
            register(ItemType.COBBLESTONE, Identifier.fromString("minecraft:cobblestone"))
            register(ItemType.COBBLESTONE_WALL, Identifier.fromString("minecraft:cobblestone_wall"))
            register(ItemType.COCOA, Identifier.fromString("minecraft:cocoa"))
            register(ItemType.COCOA_BEANS, Identifier.fromString("minecraft:cocoa_beans"), ItemCocoaBeans::class.java)
            register(ItemType.COD, Identifier.fromString("minecraft:cod"), ItemCod::class.java)
            register(ItemType.COD_BUCKET, Identifier.fromString("minecraft:cod_bucket"))
            register(ItemType.COD_SPAWN_EGG, Identifier.fromString("minecraft:cod_spawn_egg"), ItemSpawnEgg::class.java)
            register(ItemType.COLORED_TORCH_BP, Identifier.fromString("minecraft:colored_torch_bp"))
            register(ItemType.COLORED_TORCH_RG, Identifier.fromString("minecraft:colored_torch_rg"))
            register(ItemType.COMMAND_BLOCK, Identifier.fromString("minecraft:command_block"))
            register(ItemType.COMMAND_BLOCK_MINECART, Identifier.fromString("minecraft:command_block_minecart"))
            register(ItemType.COMPARATOR, Identifier.fromString("minecraft:comparator"))
            register(ItemType.COMPASS, Identifier.fromString("minecraft:compass"))
            register(ItemType.COMPOSTER, Identifier.fromString("minecraft:composter"))
            register(ItemType.COMPOUND, Identifier.fromString("minecraft:compound"))
            register(ItemType.CONCRETE, Identifier.fromString("minecraft:concrete"))
            register(ItemType.CONCRETE_POWDER, Identifier.fromString("minecraft:concrete_powder"))
            register(ItemType.CONDUIT, Identifier.fromString("minecraft:conduit"))
            register(ItemType.COOKED_BEEF, Identifier.fromString("minecraft:cooked_beef"), ItemCookedBeef::class.java)
            register(
                ItemType.COOKED_CHICKEN,
                Identifier.fromString("minecraft:cooked_chicken"),
                ItemCookedChicken::class.java
            )
            register(ItemType.COOKED_COD, Identifier.fromString("minecraft:cooked_cod"), ItemCookedCod::class.java)
            register(
                ItemType.COOKED_MUTTON,
                Identifier.fromString("minecraft:cooked_mutton"),
                ItemCookedMutton::class.java
            )
            register(
                ItemType.COOKED_PORKCHOP,
                Identifier.fromString("minecraft:cooked_porkchop"),
                ItemCookedPorkchop::class.java
            )
            register(
                ItemType.COOKED_RABBIT,
                Identifier.fromString("minecraft:cooked_rabbit"),
                ItemCookedRabbit::class.java
            )
            register(
                ItemType.COOKED_SALMON,
                Identifier.fromString("minecraft:cooked_salmon"),
                ItemCookedSalmon::class.java
            )
            register(ItemType.COOKIE, Identifier.fromString("minecraft:cookie"), ItemCookie::class.java)
            register(ItemType.COPPER_BLOCK, Identifier.fromString("minecraft:copper_block"))
            register(ItemType.COPPER_INGOT, Identifier.fromString("minecraft:copper_ingot"))
            register(ItemType.COPPER_ORE, Identifier.fromString("minecraft:copper_ore"))
            register(ItemType.CORAL, Identifier.fromString("minecraft:coral"))
            register(ItemType.CORAL_BLOCK, Identifier.fromString("minecraft:coral_block"))
            register(ItemType.CORAL_FAN, Identifier.fromString("minecraft:coral_fan"))
            register(ItemType.CORAL_FAN_DEAD, Identifier.fromString("minecraft:coral_fan_dead"))
            register(ItemType.CORAL_FAN_HANG, Identifier.fromString("minecraft:coral_fan_hang"))
            register(ItemType.CORAL_FAN_HANG2, Identifier.fromString("minecraft:coral_fan_hang2"))
            register(ItemType.CORAL_FAN_HANG3, Identifier.fromString("minecraft:coral_fan_hang3"))
            register(ItemType.COW_SPAWN_EGG, Identifier.fromString("minecraft:cow_spawn_egg"), ItemSpawnEgg::class.java)
            register(ItemType.CRACKED_DEEPSLATE_BRICKS, Identifier.fromString("minecraft:cracked_deepslate_bricks"))
            register(ItemType.CRACKED_DEEPSLATE_TILES, Identifier.fromString("minecraft:cracked_deepslate_tiles"))
            register(ItemType.CRACKED_NETHER_BRICKS, Identifier.fromString("minecraft:cracked_nether_bricks"))
            register(
                ItemType.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                Identifier.fromString("minecraft:cracked_polished_blackstone_bricks")
            )
            register(ItemType.CRAFTING_TABLE, Identifier.fromString("minecraft:crafting_table"))
            register(ItemType.CREEPER_BANNER_PATTERN, Identifier.fromString("minecraft:creeper_banner_pattern"))
            register(
                ItemType.CREEPER_SPAWN_EGG,
                Identifier.fromString("minecraft:creeper_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.CRIMSON_BUTTON, Identifier.fromString("minecraft:crimson_button"))
            register(ItemType.CRIMSON_DOOR, Identifier.fromString("minecraft:crimson_door"), ItemDoor::class.java)
            register(ItemType.CRIMSON_DOUBLE_SLAB, Identifier.fromString("minecraft:crimson_double_slab"))
            register(ItemType.CRIMSON_FENCE, Identifier.fromString("minecraft:crimson_fence"))
            register(ItemType.CRIMSON_FENCE_GATE, Identifier.fromString("minecraft:crimson_fence_gate"))
            register(ItemType.CRIMSON_FUNGUS, Identifier.fromString("minecraft:crimson_fungus"))
            register(
                ItemType.CRIMSON_HANGING_SIGN,
                Identifier.fromString("minecraft:crimson_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.CRIMSON_HYPHAE, Identifier.fromString("minecraft:crimson_hyphae"))
            register(ItemType.CRIMSON_NYLIUM, Identifier.fromString("minecraft:crimson_nylium"))
            register(ItemType.CRIMSON_PLANKS, Identifier.fromString("minecraft:crimson_planks"))
            register(ItemType.CRIMSON_PRESSURE_PLATE, Identifier.fromString("minecraft:crimson_pressure_plate"))
            register(ItemType.CRIMSON_ROOTS, Identifier.fromString("minecraft:crimson_roots"))
            register(ItemType.CRIMSON_SIGN, Identifier.fromString("minecraft:crimson_sign"), ItemSign::class.java)
            register(ItemType.CRIMSON_SLAB, Identifier.fromString("minecraft:crimson_slab"), ItemSign::class.java)
            register(ItemType.CRIMSON_STAIRS, Identifier.fromString("minecraft:crimson_stairs"))
            register(
                ItemType.CRIMSON_STANDING_SIGN,
                Identifier.fromString("minecraft:crimson_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.CRIMSON_STEM, Identifier.fromString("minecraft:crimson_stem"))
            register(ItemType.CRIMSON_TRAPDOOR, Identifier.fromString("minecraft:crimson_trapdoor"))
            register(
                ItemType.CRIMSON_WALL_SIGN,
                Identifier.fromString("minecraft:crimson_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.CROSSBOW, Identifier.fromString("minecraft:crossbow"))
            register(ItemType.CRYING_OBSIDIAN, Identifier.fromString("minecraft:crying_obsidian"))
            register(ItemType.CUT_COPPER, Identifier.fromString("minecraft:cut_copper"))
            register(ItemType.CUT_COPPER_SLAB, Identifier.fromString("minecraft:cut_copper_slab"))
            register(ItemType.CUT_COPPER_STAIRS, Identifier.fromString("minecraft:cut_copper_stairs"))
            register(ItemType.CYAN_CANDLE, Identifier.fromString("minecraft:cyan_candle"))
            register(ItemType.CYAN_CANDLE_CAKE, Identifier.fromString("minecraft:cyan_candle_cake"))
            register(ItemType.CYAN_CARPET, Identifier.fromString("minecraft:cyan_carpet"))
            register(ItemType.CYAN_CONCRETE, Identifier.fromString("minecraft:cyan_concrete"))
            register(ItemType.CYAN_CONCRETE_POWDER, Identifier.fromString("minecraft:cyan_concrete_powder"))
            register(ItemType.CYAN_DYE, Identifier.fromString("minecraft:cyan_dye"))
            register(ItemType.CYAN_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:cyan_glazed_terracotta"))
            register(ItemType.CYAN_SHULKER_BOX, Identifier.fromString("minecraft:cyan_shulker_box"))
            register(ItemType.CYAN_STAINED_GLASS, Identifier.fromString("minecraft:cyan_stained_glass"))
            register(ItemType.CYAN_STAINED_GLASS_PANE, Identifier.fromString("minecraft:cyan_stained_glass_pane"))
            register(ItemType.CYAN_TERRACOTTA, Identifier.fromString("minecraft:cyan_terracotta"))
            register(ItemType.CYAN_WOOL, Identifier.fromString("minecraft:cyan_wool"))
            register(ItemType.DANGER_POTTERY_SHERD, Identifier.fromString("minecraft:danger_pottery_sherd"))
            register(ItemType.DARK_OAK_BOAT, Identifier.fromString("minecraft:dark_oak_boat"))
            register(ItemType.DARK_OAK_BUTTON, Identifier.fromString("minecraft:dark_oak_button"))
            register(ItemType.DARK_OAK_CHEST_BOAT, Identifier.fromString("minecraft:dark_oak_chest_boat"))
            register(ItemType.DARK_OAK_DOOR, Identifier.fromString("minecraft:dark_oak_door"), ItemDoor::class.java)
            register(ItemType.DARK_OAK_FENCE, Identifier.fromString("minecraft:dark_oak_fence"))
            register(ItemType.DARK_OAK_FENCE_GATE, Identifier.fromString("minecraft:dark_oak_fence_gate"))
            register(
                ItemType.DARK_OAK_HANGING_SIGN,
                Identifier.fromString("minecraft:dark_oak_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.DARK_OAK_LOG, Identifier.fromString("minecraft:dark_oak_log"))
            register(ItemType.DARK_OAK_PRESSURE_PLATE, Identifier.fromString("minecraft:dark_oak_pressure_plate"))
            register(ItemType.DARK_OAK_SIGN, Identifier.fromString("minecraft:dark_oak_sign"), ItemSign::class.java)
            register(ItemType.DARK_OAK_STAIRS, Identifier.fromString("minecraft:dark_oak_stairs"))
            register(ItemType.DARK_OAK_TRAPDOOR, Identifier.fromString("minecraft:dark_oak_trapdoor"))
            register(ItemType.DARK_PRISMARINE_STAIRS, Identifier.fromString("minecraft:dark_prismarine_stairs"))
            register(
                ItemType.DARKOAK_STANDING_SIGN,
                Identifier.fromString("minecraft:darkoak_standing_sign"),
                ItemSign::class.java
            )
            register(
                ItemType.DARKOAK_WALL_SIGN,
                Identifier.fromString("minecraft:darkoak_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.DAYLIGHT_DETECTOR, Identifier.fromString("minecraft:daylight_detector"))
            register(ItemType.DAYLIGHT_DETECTOR_INVERTED, Identifier.fromString("minecraft:daylight_detector_inverted"))
            register(ItemType.DEAD_BRAIN_CORAL, Identifier.fromString("minecraft:dead_brain_coral"))
            register(ItemType.DEAD_BUBBLE_CORAL, Identifier.fromString("minecraft:dead_bubble_coral"))
            register(ItemType.DEAD_FIRE_CORAL, Identifier.fromString("minecraft:dead_fire_coral"))
            register(ItemType.DEAD_HORN_CORAL, Identifier.fromString("minecraft:dead_horn_coral"))
            register(ItemType.DEAD_TUBE_CORAL, Identifier.fromString("minecraft:dead_tube_coral"))
            register(ItemType.DEADBUSH, Identifier.fromString("minecraft:deadbush"))
            register(ItemType.DECORATED_POT, Identifier.fromString("minecraft:decorated_pot"))
            register(ItemType.DEEPSLATE, Identifier.fromString("minecraft:deepslate"))
            register(
                ItemType.DEEPSLATE_BRICK_DOUBLE_SLAB,
                Identifier.fromString("minecraft:deepslate_brick_double_slab")
            )
            register(ItemType.DEEPSLATE_BRICK_SLAB, Identifier.fromString("minecraft:deepslate_brick_slab"))
            register(ItemType.DEEPSLATE_BRICK_STAIRS, Identifier.fromString("minecraft:deepslate_brick_stairs"))
            register(ItemType.DEEPSLATE_BRICK_WALL, Identifier.fromString("minecraft:deepslate_brick_wall"))
            register(ItemType.DEEPSLATE_BRICKS, Identifier.fromString("minecraft:deepslate_bricks"))
            register(ItemType.DEEPSLATE_COAL_ORE, Identifier.fromString("minecraft:deepslate_coal_ore"))
            register(ItemType.DEEPSLATE_COPPER_ORE, Identifier.fromString("minecraft:deepslate_copper_ore"))
            register(ItemType.DEEPSLATE_DIAMOND_ORE, Identifier.fromString("minecraft:deepslate_diamond_ore"))
            register(ItemType.DEEPSLATE_EMERALD_ORE, Identifier.fromString("minecraft:deepslate_emerald_ore"))
            register(ItemType.DEEPSLATE_GOLD_ORE, Identifier.fromString("minecraft:deepslate_gold_ore"))
            register(ItemType.DEEPSLATE_IRON_ORE, Identifier.fromString("minecraft:deepslate_iron_ore"))
            register(ItemType.DEEPSLATE_LAPIS_ORE, Identifier.fromString("minecraft:deepslate_lapis_ore"))
            register(ItemType.DEEPSLATE_REDSTONE_ORE, Identifier.fromString("minecraft:deepslate_redstone_ore"))
            register(ItemType.DEEPSLATE_TILE_DOUBLE_SLAB, Identifier.fromString("minecraft:deepslate_tile_double_slab"))
            register(ItemType.DEEPSLATE_TILE_SLAB, Identifier.fromString("minecraft:deepslate_tile_slab"))
            register(ItemType.DEEPSLATE_TILE_STAIRS, Identifier.fromString("minecraft:deepslate_tile_stairs"))
            register(ItemType.DEEPSLATE_TILE_WALL, Identifier.fromString("minecraft:deepslate_tile_wall"))
            register(ItemType.DEEPSLATE_TILES, Identifier.fromString("minecraft:deepslate_tiles"))
            register(ItemType.DENY, Identifier.fromString("minecraft:deny"))
            register(ItemType.DETECTOR_RAIL, Identifier.fromString("minecraft:detector_rail"))
            register(ItemType.DIAMOND, Identifier.fromString("minecraft:diamond"))
            register(ItemType.DIAMOND_AXE, Identifier.fromString("minecraft:diamond_axe"), ItemDiamondAxe::class.java)
            register(ItemType.DIAMOND_BLOCK, Identifier.fromString("minecraft:diamond_block"))
            register(
                ItemType.DIAMOND_BOOTS,
                Identifier.fromString("minecraft:diamond_boots"),
                ItemDiamondBoots::class.java
            )
            register(
                ItemType.DIAMOND_CHESTPLATE,
                Identifier.fromString("minecraft:diamond_chestplate"),
                ItemDiamondChestplate::class.java
            )
            register(
                ItemType.DIAMOND_HELMET,
                Identifier.fromString("minecraft:diamond_helmet"),
                ItemDiamondHelmet::class.java
            )
            register(ItemType.DIAMOND_HOE, Identifier.fromString("minecraft:diamond_hoe"), ItemDiamondHoe::class.java)
            register(ItemType.DIAMOND_HORSE_ARMOR, Identifier.fromString("minecraft:diamond_horse_armor"))
            register(
                ItemType.DIAMOND_LEGGINGS,
                Identifier.fromString("minecraft:diamond_leggings"),
                ItemDiamondLeggings::class.java
            )
            register(ItemType.DIAMOND_ORE, Identifier.fromString("minecraft:diamond_ore"))
            register(
                ItemType.DIAMOND_PICKAXE,
                Identifier.fromString("minecraft:diamond_pickaxe"),
                ItemDiamondPickaxe::class.java
            )
            register(
                ItemType.DIAMOND_SHOVEL,
                Identifier.fromString("minecraft:diamond_shovel"),
                ItemDiamondShovel::class.java
            )
            register(
                ItemType.DIAMOND_SWORD,
                Identifier.fromString("minecraft:diamond_sword"),
                ItemDiamondSword::class.java
            )
            register(ItemType.DIORITE_STAIRS, Identifier.fromString("minecraft:diorite_stairs"))
            register(ItemType.DIRT, Identifier.fromString("minecraft:dirt"))
            register(ItemType.DIRT_WITH_ROOTS, Identifier.fromString("minecraft:dirt_with_roots"))
            register(ItemType.DISC_FRAGMENT_5, Identifier.fromString("minecraft:disc_fragment_5"))
            register(ItemType.DISPENSER, Identifier.fromString("minecraft:dispenser"))
            register(
                ItemType.DOLPHIN_SPAWN_EGG,
                Identifier.fromString("minecraft:dolphin_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.DONKEY_SPAWN_EGG,
                Identifier.fromString("minecraft:donkey_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.DOUBLE_CUT_COPPER_SLAB, Identifier.fromString("minecraft:double_cut_copper_slab"))
            register(ItemType.DOUBLE_PLANT, Identifier.fromString("minecraft:double_plant"))
            register(ItemType.DOUBLE_STONE_BLOCK_SLAB, Identifier.fromString("minecraft:double_stone_block_slab"))
            register(ItemType.DOUBLE_STONE_BLOCK_SLAB2, Identifier.fromString("minecraft:double_stone_block_slab2"))
            register(ItemType.DOUBLE_STONE_BLOCK_SLAB3, Identifier.fromString("minecraft:double_stone_block_slab3"))
            register(ItemType.DOUBLE_STONE_BLOCK_SLAB4, Identifier.fromString("minecraft:double_stone_block_slab4"))
            register(ItemType.DOUBLE_WOODEN_SLAB, Identifier.fromString("minecraft:double_wooden_slab"))
            register(ItemType.DRAGON_BREATH, Identifier.fromString("minecraft:dragon_breath"))
            register(ItemType.DRAGON_EGG, Identifier.fromString("minecraft:dragon_egg"))
            register(ItemType.DRIED_KELP, Identifier.fromString("minecraft:dried_kelp"), ItemDriedKelp::class.java)
            register(ItemType.DRIED_KELP_BLOCK, Identifier.fromString("minecraft:dried_kelp_block"))
            register(ItemType.DRIPSTONE_BLOCK, Identifier.fromString("minecraft:dripstone_block"))
            register(ItemType.DROPPER, Identifier.fromString("minecraft:dropper"))
            register(
                ItemType.DROWNED_SPAWN_EGG,
                Identifier.fromString("minecraft:drowned_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:dune_armor_trim_smithing_template")
            )
            register(ItemType.DYE, Identifier.fromString("minecraft:dye"))
            register(ItemType.ECHO_SHARD, Identifier.fromString("minecraft:echo_shard"))
            register(ItemType.EGG, Identifier.fromString("minecraft:egg"))
            register(
                ItemType.ELDER_GUARDIAN_SPAWN_EGG,
                Identifier.fromString("minecraft:elder_guardian_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.ELEMENT_0, Identifier.fromString("minecraft:element_0"))
            register(ItemType.ELEMENT_1, Identifier.fromString("minecraft:element_1"))
            register(ItemType.ELEMENT_10, Identifier.fromString("minecraft:element_10"))
            register(ItemType.ELEMENT_100, Identifier.fromString("minecraft:element_100"))
            register(ItemType.ELEMENT_101, Identifier.fromString("minecraft:element_101"))
            register(ItemType.ELEMENT_102, Identifier.fromString("minecraft:element_102"))
            register(ItemType.ELEMENT_103, Identifier.fromString("minecraft:element_103"))
            register(ItemType.ELEMENT_104, Identifier.fromString("minecraft:element_104"))
            register(ItemType.ELEMENT_105, Identifier.fromString("minecraft:element_105"))
            register(ItemType.ELEMENT_106, Identifier.fromString("minecraft:element_106"))
            register(ItemType.ELEMENT_107, Identifier.fromString("minecraft:element_107"))
            register(ItemType.ELEMENT_108, Identifier.fromString("minecraft:element_108"))
            register(ItemType.ELEMENT_109, Identifier.fromString("minecraft:element_109"))
            register(ItemType.ELEMENT_11, Identifier.fromString("minecraft:element_11"))
            register(ItemType.ELEMENT_110, Identifier.fromString("minecraft:element_110"))
            register(ItemType.ELEMENT_111, Identifier.fromString("minecraft:element_111"))
            register(ItemType.ELEMENT_112, Identifier.fromString("minecraft:element_112"))
            register(ItemType.ELEMENT_113, Identifier.fromString("minecraft:element_113"))
            register(ItemType.ELEMENT_114, Identifier.fromString("minecraft:element_114"))
            register(ItemType.ELEMENT_115, Identifier.fromString("minecraft:element_115"))
            register(ItemType.ELEMENT_116, Identifier.fromString("minecraft:element_116"))
            register(ItemType.ELEMENT_117, Identifier.fromString("minecraft:element_117"))
            register(ItemType.ELEMENT_118, Identifier.fromString("minecraft:element_118"))
            register(ItemType.ELEMENT_12, Identifier.fromString("minecraft:element_12"))
            register(ItemType.ELEMENT_13, Identifier.fromString("minecraft:element_13"))
            register(ItemType.ELEMENT_14, Identifier.fromString("minecraft:element_14"))
            register(ItemType.ELEMENT_15, Identifier.fromString("minecraft:element_15"))
            register(ItemType.ELEMENT_16, Identifier.fromString("minecraft:element_16"))
            register(ItemType.ELEMENT_17, Identifier.fromString("minecraft:element_17"))
            register(ItemType.ELEMENT_18, Identifier.fromString("minecraft:element_18"))
            register(ItemType.ELEMENT_19, Identifier.fromString("minecraft:element_19"))
            register(ItemType.ELEMENT_2, Identifier.fromString("minecraft:element_2"))
            register(ItemType.ELEMENT_20, Identifier.fromString("minecraft:element_20"))
            register(ItemType.ELEMENT_21, Identifier.fromString("minecraft:element_21"))
            register(ItemType.ELEMENT_22, Identifier.fromString("minecraft:element_22"))
            register(ItemType.ELEMENT_23, Identifier.fromString("minecraft:element_23"))
            register(ItemType.ELEMENT_24, Identifier.fromString("minecraft:element_24"))
            register(ItemType.ELEMENT_25, Identifier.fromString("minecraft:element_25"))
            register(ItemType.ELEMENT_26, Identifier.fromString("minecraft:element_26"))
            register(ItemType.ELEMENT_27, Identifier.fromString("minecraft:element_27"))
            register(ItemType.ELEMENT_28, Identifier.fromString("minecraft:element_28"))
            register(ItemType.ELEMENT_29, Identifier.fromString("minecraft:element_29"))
            register(ItemType.ELEMENT_3, Identifier.fromString("minecraft:element_3"))
            register(ItemType.ELEMENT_30, Identifier.fromString("minecraft:element_30"))
            register(ItemType.ELEMENT_31, Identifier.fromString("minecraft:element_31"))
            register(ItemType.ELEMENT_32, Identifier.fromString("minecraft:element_32"))
            register(ItemType.ELEMENT_33, Identifier.fromString("minecraft:element_33"))
            register(ItemType.ELEMENT_34, Identifier.fromString("minecraft:element_34"))
            register(ItemType.ELEMENT_35, Identifier.fromString("minecraft:element_35"))
            register(ItemType.ELEMENT_36, Identifier.fromString("minecraft:element_36"))
            register(ItemType.ELEMENT_37, Identifier.fromString("minecraft:element_37"))
            register(ItemType.ELEMENT_38, Identifier.fromString("minecraft:element_38"))
            register(ItemType.ELEMENT_39, Identifier.fromString("minecraft:element_39"))
            register(ItemType.ELEMENT_4, Identifier.fromString("minecraft:element_4"))
            register(ItemType.ELEMENT_40, Identifier.fromString("minecraft:element_40"))
            register(ItemType.ELEMENT_41, Identifier.fromString("minecraft:element_41"))
            register(ItemType.ELEMENT_42, Identifier.fromString("minecraft:element_42"))
            register(ItemType.ELEMENT_43, Identifier.fromString("minecraft:element_43"))
            register(ItemType.ELEMENT_44, Identifier.fromString("minecraft:element_44"))
            register(ItemType.ELEMENT_45, Identifier.fromString("minecraft:element_45"))
            register(ItemType.ELEMENT_46, Identifier.fromString("minecraft:element_46"))
            register(ItemType.ELEMENT_47, Identifier.fromString("minecraft:element_47"))
            register(ItemType.ELEMENT_48, Identifier.fromString("minecraft:element_48"))
            register(ItemType.ELEMENT_49, Identifier.fromString("minecraft:element_49"))
            register(ItemType.ELEMENT_5, Identifier.fromString("minecraft:element_5"))
            register(ItemType.ELEMENT_50, Identifier.fromString("minecraft:element_50"))
            register(ItemType.ELEMENT_51, Identifier.fromString("minecraft:element_51"))
            register(ItemType.ELEMENT_52, Identifier.fromString("minecraft:element_52"))
            register(ItemType.ELEMENT_53, Identifier.fromString("minecraft:element_53"))
            register(ItemType.ELEMENT_54, Identifier.fromString("minecraft:element_54"))
            register(ItemType.ELEMENT_55, Identifier.fromString("minecraft:element_55"))
            register(ItemType.ELEMENT_56, Identifier.fromString("minecraft:element_56"))
            register(ItemType.ELEMENT_57, Identifier.fromString("minecraft:element_57"))
            register(ItemType.ELEMENT_58, Identifier.fromString("minecraft:element_58"))
            register(ItemType.ELEMENT_59, Identifier.fromString("minecraft:element_59"))
            register(ItemType.ELEMENT_6, Identifier.fromString("minecraft:element_6"))
            register(ItemType.ELEMENT_60, Identifier.fromString("minecraft:element_60"))
            register(ItemType.ELEMENT_61, Identifier.fromString("minecraft:element_61"))
            register(ItemType.ELEMENT_62, Identifier.fromString("minecraft:element_62"))
            register(ItemType.ELEMENT_63, Identifier.fromString("minecraft:element_63"))
            register(ItemType.ELEMENT_64, Identifier.fromString("minecraft:element_64"))
            register(ItemType.ELEMENT_65, Identifier.fromString("minecraft:element_65"))
            register(ItemType.ELEMENT_66, Identifier.fromString("minecraft:element_66"))
            register(ItemType.ELEMENT_67, Identifier.fromString("minecraft:element_67"))
            register(ItemType.ELEMENT_68, Identifier.fromString("minecraft:element_68"))
            register(ItemType.ELEMENT_69, Identifier.fromString("minecraft:element_69"))
            register(ItemType.ELEMENT_7, Identifier.fromString("minecraft:element_7"))
            register(ItemType.ELEMENT_70, Identifier.fromString("minecraft:element_70"))
            register(ItemType.ELEMENT_71, Identifier.fromString("minecraft:element_71"))
            register(ItemType.ELEMENT_72, Identifier.fromString("minecraft:element_72"))
            register(ItemType.ELEMENT_73, Identifier.fromString("minecraft:element_73"))
            register(ItemType.ELEMENT_74, Identifier.fromString("minecraft:element_74"))
            register(ItemType.ELEMENT_75, Identifier.fromString("minecraft:element_75"))
            register(ItemType.ELEMENT_76, Identifier.fromString("minecraft:element_76"))
            register(ItemType.ELEMENT_77, Identifier.fromString("minecraft:element_77"))
            register(ItemType.ELEMENT_78, Identifier.fromString("minecraft:element_78"))
            register(ItemType.ELEMENT_79, Identifier.fromString("minecraft:element_79"))
            register(ItemType.ELEMENT_8, Identifier.fromString("minecraft:element_8"))
            register(ItemType.ELEMENT_80, Identifier.fromString("minecraft:element_80"))
            register(ItemType.ELEMENT_81, Identifier.fromString("minecraft:element_81"))
            register(ItemType.ELEMENT_82, Identifier.fromString("minecraft:element_82"))
            register(ItemType.ELEMENT_83, Identifier.fromString("minecraft:element_83"))
            register(ItemType.ELEMENT_84, Identifier.fromString("minecraft:element_84"))
            register(ItemType.ELEMENT_85, Identifier.fromString("minecraft:element_85"))
            register(ItemType.ELEMENT_86, Identifier.fromString("minecraft:element_86"))
            register(ItemType.ELEMENT_87, Identifier.fromString("minecraft:element_87"))
            register(ItemType.ELEMENT_88, Identifier.fromString("minecraft:element_88"))
            register(ItemType.ELEMENT_89, Identifier.fromString("minecraft:element_89"))
            register(ItemType.ELEMENT_9, Identifier.fromString("minecraft:element_9"))
            register(ItemType.ELEMENT_90, Identifier.fromString("minecraft:element_90"))
            register(ItemType.ELEMENT_91, Identifier.fromString("minecraft:element_91"))
            register(ItemType.ELEMENT_92, Identifier.fromString("minecraft:element_92"))
            register(ItemType.ELEMENT_93, Identifier.fromString("minecraft:element_93"))
            register(ItemType.ELEMENT_94, Identifier.fromString("minecraft:element_94"))
            register(ItemType.ELEMENT_95, Identifier.fromString("minecraft:element_95"))
            register(ItemType.ELEMENT_96, Identifier.fromString("minecraft:element_96"))
            register(ItemType.ELEMENT_97, Identifier.fromString("minecraft:element_97"))
            register(ItemType.ELEMENT_98, Identifier.fromString("minecraft:element_98"))
            register(ItemType.ELEMENT_99, Identifier.fromString("minecraft:element_99"))
            register(ItemType.ELYTRA, Identifier.fromString("minecraft:elytra"))
            register(ItemType.EMERALD, Identifier.fromString("minecraft:emerald"))
            register(ItemType.EMERALD_BLOCK, Identifier.fromString("minecraft:emerald_block"))
            register(ItemType.EMERALD_ORE, Identifier.fromString("minecraft:emerald_ore"))
            register(ItemType.EMPTY_MAP, Identifier.fromString("minecraft:empty_map"))
            register(ItemType.ENCHANTED_BOOK, Identifier.fromString("minecraft:enchanted_book"))
            register(
                ItemType.ENCHANTED_GOLDEN_APPLE,
                Identifier.fromString("minecraft:enchanted_golden_apple"),
                ItemEnchantedGoldenApple::class.java
            )
            register(ItemType.ENCHANTING_TABLE, Identifier.fromString("minecraft:enchanting_table"))
            register(ItemType.END_BRICK_STAIRS, Identifier.fromString("minecraft:end_brick_stairs"))
            register(ItemType.END_BRICKS, Identifier.fromString("minecraft:end_bricks"))
            register(ItemType.END_CRYSTAL, Identifier.fromString("minecraft:end_crystal"))
            register(ItemType.END_GATEWAY, Identifier.fromString("minecraft:end_gateway"))
            register(ItemType.END_PORTAL, Identifier.fromString("minecraft:end_portal"))
            register(ItemType.END_PORTAL_FRAME, Identifier.fromString("minecraft:end_portal_frame"))
            register(ItemType.END_ROD, Identifier.fromString("minecraft:end_rod"))
            register(ItemType.END_STONE, Identifier.fromString("minecraft:end_stone"))
            register(ItemType.ENDER_CHEST, Identifier.fromString("minecraft:ender_chest"))
            register(
                ItemType.ENDER_DRAGON_SPAWN_EGG,
                Identifier.fromString("minecraft:ender_dragon_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.ENDER_EYE, Identifier.fromString("minecraft:ender_eye"))
            register(ItemType.ENDER_PEARL, Identifier.fromString("minecraft:ender_pearl"))
            register(
                ItemType.ENDERMAN_SPAWN_EGG,
                Identifier.fromString("minecraft:enderman_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.ENDERMITE_SPAWN_EGG,
                Identifier.fromString("minecraft:endermite_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.EVOKER_SPAWN_EGG,
                Identifier.fromString("minecraft:evoker_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.EXPERIENCE_BOTTLE, Identifier.fromString("minecraft:experience_bottle"))
            register(ItemType.EXPLORER_POTTERY_SHERD, Identifier.fromString("minecraft:explorer_pottery_sherd"))
            register(ItemType.EXPOSED_COPPER, Identifier.fromString("minecraft:exposed_copper"))
            register(ItemType.EXPOSED_CUT_COPPER, Identifier.fromString("minecraft:exposed_cut_copper"))
            register(ItemType.EXPOSED_CUT_COPPER_SLAB, Identifier.fromString("minecraft:exposed_cut_copper_slab"))
            register(ItemType.EXPOSED_CUT_COPPER_STAIRS, Identifier.fromString("minecraft:exposed_cut_copper_stairs"))
            register(
                ItemType.EXPOSED_DOUBLE_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:exposed_double_cut_copper_slab")
            )
            register(
                ItemType.EYE_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:eye_armor_trim_smithing_template")
            )
            register(ItemType.FARMLAND, Identifier.fromString("minecraft:farmland"))
            register(ItemType.FEATHER, Identifier.fromString("minecraft:feather"))
            register(ItemType.FENCE, Identifier.fromString("minecraft:fence"))
            register(ItemType.OAK_FENCE_GATE, Identifier.fromString("minecraft:fence_gate"))
            register(ItemType.FERMENTED_SPIDER_EYE, Identifier.fromString("minecraft:fermented_spider_eye"))
            register(
                ItemType.FIELD_MASONED_BANNER_PATTERN,
                Identifier.fromString("minecraft:field_masoned_banner_pattern")
            )
            register(ItemType.FILLED_MAP, Identifier.fromString("minecraft:filled_map"))
            register(ItemType.FIRE, Identifier.fromString("minecraft:fire"))
            register(ItemType.FIRE_CHARGE, Identifier.fromString("minecraft:fire_charge"))
            register(ItemType.FIRE_CORAL, Identifier.fromString("minecraft:fire_coral"))
            register(ItemType.FIREWORK_ROCKET, Identifier.fromString("minecraft:firework_rocket"))
            register(ItemType.FIREWORK_STAR, Identifier.fromString("minecraft:firework_star"))
            register(ItemType.FISHING_ROD, Identifier.fromString("minecraft:fishing_rod"))
            register(ItemType.FLETCHING_TABLE, Identifier.fromString("minecraft:fletching_table"))
            register(ItemType.FLINT, Identifier.fromString("minecraft:flint"))
            register(ItemType.FLINT_AND_STEEL, Identifier.fromString("minecraft:flint_and_steel"))
            register(ItemType.FLOWER_BANNER_PATTERN, Identifier.fromString("minecraft:flower_banner_pattern"))
            register(ItemType.FLOWER_POT, Identifier.fromString("minecraft:flower_pot"))
            register(ItemType.FLOWERING_AZALEA, Identifier.fromString("minecraft:flowering_azalea"))
            register(ItemType.FLOWING_LAVA, Identifier.fromString("minecraft:flowing_lava"))
            register(ItemType.FLOWING_WATER, Identifier.fromString("minecraft:flowing_water"))
            register(ItemType.FOX_SPAWN_EGG, Identifier.fromString("minecraft:fox_spawn_egg"), ItemSpawnEgg::class.java)
            register(ItemType.FRAME, Identifier.fromString("minecraft:frame"))
            register(ItemType.FRIEND_POTTERY_SHERD, Identifier.fromString("minecraft:friend_pottery_sherd"))
            register(ItemType.FROG_SPAWN, Identifier.fromString("minecraft:frog_spawn"))
            register(
                ItemType.FROG_SPAWN_EGG,
                Identifier.fromString("minecraft:frog_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.FROSTED_ICE, Identifier.fromString("minecraft:frosted_ice"))
            register(ItemType.FURNACE, Identifier.fromString("minecraft:furnace"))
            register(
                ItemType.GHAST_SPAWN_EGG,
                Identifier.fromString("minecraft:ghast_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.GHAST_TEAR, Identifier.fromString("minecraft:ghast_tear"))
            register(ItemType.GILDED_BLACKSTONE, Identifier.fromString("minecraft:gilded_blackstone"))
            register(ItemType.GLASS, Identifier.fromString("minecraft:glass"))
            register(ItemType.GLASS_BOTTLE, Identifier.fromString("minecraft:glass_bottle"))
            register(ItemType.GLASS_PANE, Identifier.fromString("minecraft:glass_pane"))
            register(ItemType.GLISTERING_MELON_SLICE, Identifier.fromString("minecraft:glistering_melon_slice"))
            register(ItemType.GLOBE_BANNER_PATTERN, Identifier.fromString("minecraft:globe_banner_pattern"))
            register(
                ItemType.GLOW_BERRIES,
                Identifier.fromString("minecraft:glow_berries"),
                ItemGlowBerries::class.java
            )
            register(ItemType.GLOW_FRAME, Identifier.fromString("minecraft:glow_frame"))
            register(ItemType.GLOW_INK_SAC, Identifier.fromString("minecraft:glow_ink_sac"))
            register(ItemType.GLOW_LICHEN, Identifier.fromString("minecraft:glow_lichen"))
            register(
                ItemType.GLOW_SQUID_SPAWN_EGG,
                Identifier.fromString("minecraft:glow_squid_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.GLOW_STICK, Identifier.fromString("minecraft:glow_stick"))
            register(ItemType.GLOWINGOBSIDIAN, Identifier.fromString("minecraft:glowingobsidian"))
            register(ItemType.GLOWSTONE, Identifier.fromString("minecraft:glowstone"))
            register(ItemType.GLOWSTONE_DUST, Identifier.fromString("minecraft:glowstone_dust"))
            register(ItemType.GOAT_HORN, Identifier.fromString("minecraft:goat_horn"))
            register(
                ItemType.GOAT_SPAWN_EGG,
                Identifier.fromString("minecraft:goat_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.GOLD_BLOCK, Identifier.fromString("minecraft:gold_block"))
            register(ItemType.GOLD_INGOT, Identifier.fromString("minecraft:gold_ingot"))
            register(ItemType.GOLD_NUGGET, Identifier.fromString("minecraft:gold_nugget"))
            register(ItemType.GOLD_ORE, Identifier.fromString("minecraft:gold_ore"))
            register(
                ItemType.GOLDEN_APPLE,
                Identifier.fromString("minecraft:golden_apple"),
                ItemGoldenApple::class.java
            )
            register(ItemType.GOLDEN_AXE, Identifier.fromString("minecraft:golden_axe"), ItemGoldenAxe::class.java)
            register(
                ItemType.GOLDEN_BOOTS,
                Identifier.fromString("minecraft:golden_boots"),
                ItemGoldenBoots::class.java
            )
            register(
                ItemType.GOLDEN_CARROT,
                Identifier.fromString("minecraft:golden_carrot"),
                ItemGoldenCarrot::class.java
            )
            register(
                ItemType.GOLDEN_CHESTPLATE,
                Identifier.fromString("minecraft:golden_chestplate"),
                ItemGoldenChestplate::class.java
            )
            register(
                ItemType.GOLDEN_HELMET,
                Identifier.fromString("minecraft:golden_helmet"),
                ItemGoldenHelmet::class.java
            )
            register(ItemType.GOLDEN_HOE, Identifier.fromString("minecraft:golden_hoe"), ItemGoldenHoe::class.java)
            register(ItemType.GOLDEN_HORSE_ARMOR, Identifier.fromString("minecraft:golden_horse_armor"))
            register(
                ItemType.GOLDEN_LEGGINGS,
                Identifier.fromString("minecraft:golden_leggings"),
                ItemGoldenLeggings::class.java
            )
            register(
                ItemType.GOLDEN_PICKAXE,
                Identifier.fromString("minecraft:golden_pickaxe"),
                ItemGoldenPickaxe::class.java
            )
            register(ItemType.GOLDEN_RAIL, Identifier.fromString("minecraft:golden_rail"))
            register(
                ItemType.GOLDEN_SHOVEL,
                Identifier.fromString("minecraft:golden_shovel"),
                ItemGoldenShovel::class.java
            )
            register(
                ItemType.GOLDEN_SWORD,
                Identifier.fromString("minecraft:golden_sword"),
                ItemGoldenSword::class.java
            )
            register(ItemType.GRANITE_STAIRS, Identifier.fromString("minecraft:granite_stairs"))
            register(ItemType.GRASS, Identifier.fromString("minecraft:grass"))
            register(ItemType.GRASS_PATH, Identifier.fromString("minecraft:grass_path"))
            register(ItemType.GRAVEL, Identifier.fromString("minecraft:gravel"))
            register(ItemType.GRAY_CANDLE, Identifier.fromString("minecraft:gray_candle"))
            register(ItemType.GRAY_CANDLE_CAKE, Identifier.fromString("minecraft:gray_candle_cake"))
            register(ItemType.GRAY_CARPET, Identifier.fromString("minecraft:gray_carpet"))
            register(ItemType.GRAY_CONCRETE, Identifier.fromString("minecraft:gray_concrete"))
            register(ItemType.GRAY_CONCRETE_POWDER, Identifier.fromString("minecraft:gray_concrete_powder"))
            register(ItemType.GRAY_DYE, Identifier.fromString("minecraft:gray_dye"))
            register(ItemType.GRAY_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:gray_glazed_terracotta"))
            register(ItemType.GRAY_SHULKER_BOX, Identifier.fromString("minecraft:gray_shulker_box"))
            register(ItemType.GRAY_STAINED_GLASS, Identifier.fromString("minecraft:gray_stained_glass"))
            register(ItemType.GRAY_STAINED_GLASS_PANE, Identifier.fromString("minecraft:gray_stained_glass_pane"))
            register(ItemType.GRAY_TERRACOTTA, Identifier.fromString("minecraft:gray_terracotta"))
            register(ItemType.GRAY_WOOL, Identifier.fromString("minecraft:gray_wool"))
            register(ItemType.GREEN_CANDLE, Identifier.fromString("minecraft:green_candle"))
            register(ItemType.GREEN_CANDLE_CAKE, Identifier.fromString("minecraft:green_candle_cake"))
            register(ItemType.GREEN_CARPET, Identifier.fromString("minecraft:green_carpet"))
            register(ItemType.GREEN_CONCRETE, Identifier.fromString("minecraft:green_concrete"))
            register(ItemType.GREEN_CONCRETE_POWDER, Identifier.fromString("minecraft:green_concrete_powder"))
            register(ItemType.GREEN_DYE, Identifier.fromString("minecraft:green_dye"))
            register(ItemType.GREEN_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:green_glazed_terracotta"))
            register(ItemType.GREEN_SHULKER_BOX, Identifier.fromString("minecraft:green_shulker_box"))
            register(ItemType.GREEN_STAINED_GLASS, Identifier.fromString("minecraft:green_stained_glass"))
            register(ItemType.GREEN_STAINED_GLASS_PANE, Identifier.fromString("minecraft:green_stained_glass_pane"))
            register(ItemType.GREEN_TERRACOTTA, Identifier.fromString("minecraft:green_terracotta"))
            register(ItemType.GREEN_WOOL, Identifier.fromString("minecraft:green_wool"))
            register(ItemType.GRINDSTONE, Identifier.fromString("minecraft:grindstone"))
            register(
                ItemType.GUARDIAN_SPAWN_EGG,
                Identifier.fromString("minecraft:guardian_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.GUNPOWDER, Identifier.fromString("minecraft:gunpowder"))
            register(ItemType.HANGING_ROOTS, Identifier.fromString("minecraft:hanging_roots"))
            register(ItemType.HARD_GLASS, Identifier.fromString("minecraft:hard_glass"))
            register(ItemType.HARD_GLASS_PANE, Identifier.fromString("minecraft:hard_glass_pane"))
            register(ItemType.HARD_STAINED_GLASS, Identifier.fromString("minecraft:hard_stained_glass"))
            register(ItemType.HARD_STAINED_GLASS_PANE, Identifier.fromString("minecraft:hard_stained_glass_pane"))
            register(ItemType.HARDENED_CLAY, Identifier.fromString("minecraft:hardened_clay"))
            register(ItemType.HAY_BLOCK, Identifier.fromString("minecraft:hay_block"))
            register(ItemType.HEART_OF_THE_SEA, Identifier.fromString("minecraft:heart_of_the_sea"))
            register(ItemType.HEART_POTTERY_SHERD, Identifier.fromString("minecraft:heart_pottery_sherd"))
            register(ItemType.HEARTBREAK_POTTERY_SHERD, Identifier.fromString("minecraft:heartbreak_pottery_sherd"))
            register(
                ItemType.HEAVY_WEIGHTED_PRESSURE_PLATE,
                Identifier.fromString("minecraft:heavy_weighted_pressure_plate")
            )
            register(
                ItemType.HOGLIN_SPAWN_EGG,
                Identifier.fromString("minecraft:hoglin_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.HONEY_BLOCK, Identifier.fromString("minecraft:honey_block"))
            register(ItemType.HONEY_BOTTLE, Identifier.fromString("minecraft:honey_bottle"))
            register(ItemType.HONEYCOMB, Identifier.fromString("minecraft:honeycomb"))
            register(ItemType.HONEYCOMB_BLOCK, Identifier.fromString("minecraft:honeycomb_block"))
            register(ItemType.HOPPER, Identifier.fromString("minecraft:hopper"))
            register(ItemType.HOPPER_MINECART, Identifier.fromString("minecraft:hopper_minecart"))
            register(ItemType.HORN_CORAL, Identifier.fromString("minecraft:horn_coral"))
            register(
                ItemType.HORSE_SPAWN_EGG,
                Identifier.fromString("minecraft:horse_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.HOST_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:host_armor_trim_smithing_template")
            )
            register(ItemType.HOWL_POTTERY_SHERD, Identifier.fromString("minecraft:howl_pottery_sherd"))
            register(
                ItemType.HUSK_SPAWN_EGG,
                Identifier.fromString("minecraft:husk_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.ICE, Identifier.fromString("minecraft:ice"))
            register(ItemType.ICE_BOMB, Identifier.fromString("minecraft:ice_bomb"))
            register(ItemType.INFESTED_DEEPSLATE, Identifier.fromString("minecraft:infested_deepslate"))
            register(ItemType.INFO_UPDATE, Identifier.fromString("minecraft:info_update"))
            register(ItemType.INFO_UPDATE2, Identifier.fromString("minecraft:info_update2"))
            register(ItemType.INK_SAC, Identifier.fromString("minecraft:ink_sac"))
            register(ItemType.INVISIBLE_BEDROCK, Identifier.fromString("minecraft:invisible_bedrock"))
            register(ItemType.IRON_AXE, Identifier.fromString("minecraft:iron_axe"), ItemIronAxe::class.java)
            register(ItemType.IRON_BARS, Identifier.fromString("minecraft:iron_bars"))
            register(ItemType.IRON_BLOCK, Identifier.fromString("minecraft:iron_block"))
            register(ItemType.IRON_BOOTS, Identifier.fromString("minecraft:iron_boots"), ItemIronBoots::class.java)
            register(
                ItemType.IRON_CHESTPLATE,
                Identifier.fromString("minecraft:iron_chestplate"),
                ItemIronChestplate::class.java
            )
            register(ItemType.IRON_DOOR, Identifier.fromString("minecraft:iron_door"), ItemDoor::class.java)
            register(
                ItemType.IRON_GOLEM_SPAWN_EGG,
                Identifier.fromString("minecraft:iron_golem_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.IRON_HELMET, Identifier.fromString("minecraft:iron_helmet"), ItemIronHelmet::class.java)
            register(ItemType.IRON_HOE, Identifier.fromString("minecraft:iron_hoe"), ItemIronHoe::class.java)
            register(ItemType.IRON_HORSE_ARMOR, Identifier.fromString("minecraft:iron_horse_armor"))
            register(ItemType.IRON_INGOT, Identifier.fromString("minecraft:iron_ingot"))
            register(
                ItemType.IRON_LEGGINGS,
                Identifier.fromString("minecraft:iron_leggings"),
                ItemIronLeggings::class.java
            )
            register(ItemType.IRON_NUGGET, Identifier.fromString("minecraft:iron_nugget"))
            register(ItemType.IRON_ORE, Identifier.fromString("minecraft:iron_ore"))
            register(
                ItemType.IRON_PICKAXE,
                Identifier.fromString("minecraft:iron_pickaxe"),
                ItemIronPickaxe::class.java
            )
            register(ItemType.IRON_SHOVEL, Identifier.fromString("minecraft:iron_shovel"), ItemIronShovel::class.java)
            register(ItemType.IRON_SWORD, Identifier.fromString("minecraft:iron_sword"), ItemIronSword::class.java)
            register(ItemType.IRON_TRAPDOOR, Identifier.fromString("minecraft:iron_trapdoor"))
            register(ItemType.JIGSAW, Identifier.fromString("minecraft:jigsaw"))
            register(ItemType.JUKEBOX, Identifier.fromString("minecraft:jukebox"))
            register(ItemType.JUNGLE_BOAT, Identifier.fromString("minecraft:jungle_boat"))
            register(ItemType.JUNGLE_BUTTON, Identifier.fromString("minecraft:jungle_button"))
            register(ItemType.JUNGLE_CHEST_BOAT, Identifier.fromString("minecraft:jungle_chest_boat"))
            register(ItemType.JUNGLE_DOOR, Identifier.fromString("minecraft:jungle_door"), ItemDoor::class.java)
            register(ItemType.JUNGLE_FENCE, Identifier.fromString("minecraft:jungle_fence"))
            register(ItemType.JUNGLE_FENCE_GATE, Identifier.fromString("minecraft:jungle_fence_gate"))
            register(
                ItemType.JUNGLE_HANGING_SIGN,
                Identifier.fromString("minecraft:jungle_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.JUNGLE_LOG, Identifier.fromString("minecraft:jungle_log"))
            register(ItemType.JUNGLE_PRESSURE_PLATE, Identifier.fromString("minecraft:jungle_pressure_plate"))
            register(ItemType.JUNGLE_SIGN, Identifier.fromString("minecraft:jungle_sign"), ItemSign::class.java)
            register(ItemType.JUNGLE_STAIRS, Identifier.fromString("minecraft:jungle_stairs"))
            register(
                ItemType.JUNGLE_STANDING_SIGN,
                Identifier.fromString("minecraft:jungle_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.JUNGLE_TRAPDOOR, Identifier.fromString("minecraft:jungle_trapdoor"))
            register(
                ItemType.JUNGLE_WALL_SIGN,
                Identifier.fromString("minecraft:jungle_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.KELP, Identifier.fromString("minecraft:kelp"))
            register(ItemType.LADDER, Identifier.fromString("minecraft:ladder"))
            register(ItemType.LANTERN, Identifier.fromString("minecraft:lantern"))
            register(ItemType.LAPIS_BLOCK, Identifier.fromString("minecraft:lapis_block"))
            register(ItemType.LAPIS_LAZULI, Identifier.fromString("minecraft:lapis_lazuli"))
            register(ItemType.LAPIS_ORE, Identifier.fromString("minecraft:lapis_ore"))
            register(ItemType.LARGE_AMETHYST_BUD, Identifier.fromString("minecraft:large_amethyst_bud"))
            register(ItemType.LAVA, Identifier.fromString("minecraft:lava"))
            register(ItemType.LAVA_BUCKET, Identifier.fromString("minecraft:lava_bucket"))
            register(ItemType.LEAD, Identifier.fromString("minecraft:lead"))
            register(ItemType.LEATHER, Identifier.fromString("minecraft:leather"))
            register(
                ItemType.LEATHER_BOOTS,
                Identifier.fromString("minecraft:leather_boots"),
                ItemLeatherBoots::class.java
            )
            register(
                ItemType.LEATHER_CHESTPLATE,
                Identifier.fromString("minecraft:leather_chestplate"),
                ItemLeatherChestplate::class.java
            )
            register(
                ItemType.LEATHER_HELMET,
                Identifier.fromString("minecraft:leather_helmet"),
                ItemLeatherHelmet::class.java
            )
            register(ItemType.LEATHER_HORSE_ARMOR, Identifier.fromString("minecraft:leather_horse_armor"))
            register(
                ItemType.LEATHER_LEGGINGS,
                Identifier.fromString("minecraft:leather_leggings"),
                ItemLeatherLeggings::class.java
            )
            register(ItemType.LEAVES, Identifier.fromString("minecraft:leaves"))
            register(ItemType.LEAVES2, Identifier.fromString("minecraft:leaves2"))
            register(ItemType.LECTERN, Identifier.fromString("minecraft:lectern"))
            register(ItemType.LEVER, Identifier.fromString("minecraft:lever"))
            register(ItemType.LIGHT_BLOCK, Identifier.fromString("minecraft:light_block"))
            register(ItemType.LIGHT_BLUE_CANDLE, Identifier.fromString("minecraft:light_blue_candle"))
            register(ItemType.LIGHT_BLUE_CANDLE_CAKE, Identifier.fromString("minecraft:light_blue_candle_cake"))
            register(ItemType.LIGHT_BLUE_CARPET, Identifier.fromString("minecraft:light_blue_carpet"))
            register(ItemType.LIGHT_BLUE_CONCRETE, Identifier.fromString("minecraft:light_blue_concrete"))
            register(ItemType.LIGHT_BLUE_CONCRETE_POWDER, Identifier.fromString("minecraft:light_blue_concrete_powder"))
            register(ItemType.LIGHT_BLUE_DYE, Identifier.fromString("minecraft:light_blue_dye"))
            register(
                ItemType.LIGHT_BLUE_GLAZED_TERRACOTTA,
                Identifier.fromString("minecraft:light_blue_glazed_terracotta")
            )
            register(ItemType.LIGHT_BLUE_SHULKER_BOX, Identifier.fromString("minecraft:light_blue_shulker_box"))
            register(ItemType.LIGHT_BLUE_STAINED_GLASS, Identifier.fromString("minecraft:light_blue_stained_glass"))
            register(
                ItemType.LIGHT_BLUE_STAINED_GLASS_PANE,
                Identifier.fromString("minecraft:light_blue_stained_glass_pane")
            )
            register(ItemType.LIGHT_BLUE_TERRACOTTA, Identifier.fromString("minecraft:light_blue_terracotta"))
            register(ItemType.LIGHT_BLUE_WOOL, Identifier.fromString("minecraft:light_blue_wool"))
            register(ItemType.LIGHT_GRAY_CANDLE, Identifier.fromString("minecraft:light_gray_candle"))
            register(ItemType.LIGHT_GRAY_CANDLE_CAKE, Identifier.fromString("minecraft:light_gray_candle_cake"))
            register(ItemType.LIGHT_GRAY_CARPET, Identifier.fromString("minecraft:light_gray_carpet"))
            register(ItemType.LIGHT_GRAY_CONCRETE, Identifier.fromString("minecraft:light_gray_concrete"))
            register(ItemType.LIGHT_GRAY_CONCRETE_POWDER, Identifier.fromString("minecraft:light_gray_concrete_powder"))
            register(ItemType.LIGHT_GRAY_DYE, Identifier.fromString("minecraft:light_gray_dye"))
            register(ItemType.LIGHT_GRAY_SHULKER_BOX, Identifier.fromString("minecraft:light_gray_shulker_box"))
            register(ItemType.LIGHT_GRAY_STAINED_GLASS, Identifier.fromString("minecraft:light_gray_stained_glass"))
            register(
                ItemType.LIGHT_GRAY_STAINED_GLASS_PANE,
                Identifier.fromString("minecraft:light_gray_stained_glass_pane")
            )
            register(ItemType.LIGHT_GRAY_TERRACOTTA, Identifier.fromString("minecraft:light_gray_terracotta"))
            register(ItemType.LIGHT_GRAY_WOOL, Identifier.fromString("minecraft:light_gray_wool"))
            register(
                ItemType.LIGHT_WEIGHTED_PRESSURE_PLATE,
                Identifier.fromString("minecraft:light_weighted_pressure_plate")
            )
            register(ItemType.LIGHTNING_ROD, Identifier.fromString("minecraft:lightning_rod"))
            register(ItemType.LIME_CANDLE, Identifier.fromString("minecraft:lime_candle"))
            register(ItemType.LIME_CANDLE_CAKE, Identifier.fromString("minecraft:lime_candle_cake"))
            register(ItemType.LIME_CARPET, Identifier.fromString("minecraft:lime_carpet"))
            register(ItemType.LIME_CONCRETE, Identifier.fromString("minecraft:lime_concrete"))
            register(ItemType.LIME_CONCRETE_POWDER, Identifier.fromString("minecraft:lime_concrete_powder"))
            register(ItemType.LIME_DYE, Identifier.fromString("minecraft:lime_dye"))
            register(ItemType.LIME_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:lime_glazed_terracotta"))
            register(ItemType.LIME_SHULKER_BOX, Identifier.fromString("minecraft:lime_shulker_box"))
            register(ItemType.LIME_STAINED_GLASS, Identifier.fromString("minecraft:lime_stained_glass"))
            register(ItemType.LIME_STAINED_GLASS_PANE, Identifier.fromString("minecraft:lime_stained_glass_pane"))
            register(ItemType.LIME_TERRACOTTA, Identifier.fromString("minecraft:lime_terracotta"))
            register(ItemType.LIME_WOOL, Identifier.fromString("minecraft:lime_wool"))
            register(ItemType.LINGERING_POTION, Identifier.fromString("minecraft:lingering_potion"))
            register(ItemType.LIT_BLAST_FURNACE, Identifier.fromString("minecraft:lit_blast_furnace"))
            register(ItemType.LIT_DEEPSLATE_REDSTONE_ORE, Identifier.fromString("minecraft:lit_deepslate_redstone_ore"))
            register(ItemType.LIT_FURNACE, Identifier.fromString("minecraft:lit_furnace"))
            register(ItemType.LIT_PUMPKIN, Identifier.fromString("minecraft:lit_pumpkin"))
            register(ItemType.LIT_REDSTONE_LAMP, Identifier.fromString("minecraft:lit_redstone_lamp"))
            register(ItemType.LIT_REDSTONE_ORE, Identifier.fromString("minecraft:lit_redstone_ore"))
            register(ItemType.LIT_SMOKER, Identifier.fromString("minecraft:lit_smoker"))
            register(
                ItemType.LLAMA_SPAWN_EGG,
                Identifier.fromString("minecraft:llama_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.LODESTONE, Identifier.fromString("minecraft:lodestone"))
            register(ItemType.LODESTONE_COMPASS, Identifier.fromString("minecraft:lodestone_compass"))
            register(ItemType.LOG, Identifier.fromString("minecraft:log"))
            register(ItemType.LOG2, Identifier.fromString("minecraft:log2"))
            register(ItemType.LOOM, Identifier.fromString("minecraft:loom"))
            register(ItemType.MAGENTA_CANDLE, Identifier.fromString("minecraft:magenta_candle"))
            register(ItemType.MAGENTA_CANDLE_CAKE, Identifier.fromString("minecraft:magenta_candle_cake"))
            register(ItemType.MAGENTA_CARPET, Identifier.fromString("minecraft:magenta_carpet"))
            register(ItemType.MAGENTA_CONCRETE, Identifier.fromString("minecraft:magenta_concrete"))
            register(ItemType.MAGENTA_CONCRETE_POWDER, Identifier.fromString("minecraft:magenta_concrete_powder"))
            register(ItemType.MAGENTA_DYE, Identifier.fromString("minecraft:magenta_dye"))
            register(ItemType.MAGENTA_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:magenta_glazed_terracotta"))
            register(ItemType.MAGENTA_SHULKER_BOX, Identifier.fromString("minecraft:magenta_shulker_box"))
            register(ItemType.MAGENTA_STAINED_GLASS, Identifier.fromString("minecraft:magenta_stained_glass"))
            register(ItemType.MAGENTA_STAINED_GLASS_PANE, Identifier.fromString("minecraft:magenta_stained_glass_pane"))
            register(ItemType.MAGENTA_TERRACOTTA, Identifier.fromString("minecraft:magenta_terracotta"))
            register(ItemType.MAGENTA_WOOL, Identifier.fromString("minecraft:magenta_wool"))
            register(ItemType.MAGMA, Identifier.fromString("minecraft:magma"))
            register(ItemType.MAGMA_CREAM, Identifier.fromString("minecraft:magma_cream"))
            register(
                ItemType.MAGMA_CUBE_SPAWN_EGG,
                Identifier.fromString("minecraft:magma_cube_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.MANGROVE_BOAT, Identifier.fromString("minecraft:mangrove_boat"))
            register(ItemType.MANGROVE_BUTTON, Identifier.fromString("minecraft:mangrove_button"))
            register(ItemType.MANGROVE_CHEST_BOAT, Identifier.fromString("minecraft:mangrove_chest_boat"))
            register(ItemType.MANGROVE_DOOR, Identifier.fromString("minecraft:mangrove_door"), ItemDoor::class.java)
            register(ItemType.MANGROVE_DOUBLE_SLAB, Identifier.fromString("minecraft:mangrove_double_slab"))
            register(ItemType.MANGROVE_FENCE, Identifier.fromString("minecraft:mangrove_fence"))
            register(ItemType.MANGROVE_FENCE_GATE, Identifier.fromString("minecraft:mangrove_fence_gate"))
            register(
                ItemType.MANGROVE_HANGING_SIGN,
                Identifier.fromString("minecraft:mangrove_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.MANGROVE_LEAVES, Identifier.fromString("minecraft:mangrove_leaves"))
            register(ItemType.MANGROVE_LOG, Identifier.fromString("minecraft:mangrove_log"))
            register(ItemType.MANGROVE_PLANKS, Identifier.fromString("minecraft:mangrove_planks"))
            register(ItemType.MANGROVE_PRESSURE_PLATE, Identifier.fromString("minecraft:mangrove_pressure_plate"))
            register(ItemType.MANGROVE_PROPAGULE, Identifier.fromString("minecraft:mangrove_propagule"))
            register(ItemType.MANGROVE_ROOTS, Identifier.fromString("minecraft:mangrove_roots"))
            register(ItemType.MANGROVE_SIGN, Identifier.fromString("minecraft:mangrove_sign"), ItemSign::class.java)
            register(ItemType.MANGROVE_SLAB, Identifier.fromString("minecraft:mangrove_slab"))
            register(ItemType.MANGROVE_STAIRS, Identifier.fromString("minecraft:mangrove_stairs"))
            register(
                ItemType.MANGROVE_STANDING_SIGN,
                Identifier.fromString("minecraft:mangrove_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.MANGROVE_TRAPDOOR, Identifier.fromString("minecraft:mangrove_trapdoor"))
            register(
                ItemType.MANGROVE_WALL_SIGN,
                Identifier.fromString("minecraft:mangrove_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.MANGROVE_WOOD, Identifier.fromString("minecraft:mangrove_wood"))
            register(ItemType.MEDICINE, Identifier.fromString("minecraft:medicine"))
            register(ItemType.MEDIUM_AMETHYST_BUD, Identifier.fromString("minecraft:medium_amethyst_bud"))
            register(ItemType.MELON_BLOCK, Identifier.fromString("minecraft:melon_block"))
            register(ItemType.MELON_SEEDS, Identifier.fromString("minecraft:melon_seeds"))
            register(ItemType.MELON_SLICE, Identifier.fromString("minecraft:melon_slice"), ItemMelonSlice::class.java)
            register(ItemType.MELON_STEM, Identifier.fromString("minecraft:melon_stem"))
            register(ItemType.MILK_BUCKET, Identifier.fromString("minecraft:milk_bucket"))
            register(ItemType.MINECART, Identifier.fromString("minecraft:minecart"))
            register(ItemType.MINER_POTTERY_SHERD, Identifier.fromString("minecraft:miner_pottery_sherd"))
            register(ItemType.MOB_SPAWNER, Identifier.fromString("minecraft:mob_spawner"))
            register(ItemType.MOJANG_BANNER_PATTERN, Identifier.fromString("minecraft:mojang_banner_pattern"))
            register(ItemType.MONSTER_EGG, Identifier.fromString("minecraft:monster_egg"))
            register(
                ItemType.MOOSHROOM_SPAWN_EGG,
                Identifier.fromString("minecraft:mooshroom_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.MOSS_BLOCK, Identifier.fromString("minecraft:moss_block"))
            register(ItemType.MOSS_CARPET, Identifier.fromString("minecraft:moss_carpet"))
            register(ItemType.MOSSY_COBBLESTONE, Identifier.fromString("minecraft:mossy_cobblestone"))
            register(ItemType.MOSSY_COBBLESTONE_STAIRS, Identifier.fromString("minecraft:mossy_cobblestone_stairs"))
            register(ItemType.MOSSY_STONE_BRICK_STAIRS, Identifier.fromString("minecraft:mossy_stone_brick_stairs"))
            register(ItemType.MOURNER_POTTERY_SHERD, Identifier.fromString("minecraft:mourner_pottery_sherd"))
            register(ItemType.MOVING_BLOCK, Identifier.fromString("minecraft:moving_block"))
            register(ItemType.MUD, Identifier.fromString("minecraft:mud"))
            register(ItemType.MUD_BRICK_DOUBLE_SLAB, Identifier.fromString("minecraft:mud_brick_double_slab"))
            register(ItemType.MUD_BRICK_SLAB, Identifier.fromString("minecraft:mud_brick_slab"))
            register(ItemType.MUD_BRICK_STAIRS, Identifier.fromString("minecraft:mud_brick_stairs"))
            register(ItemType.MUD_BRICK_WALL, Identifier.fromString("minecraft:mud_brick_wall"))
            register(ItemType.MUD_BRICKS, Identifier.fromString("minecraft:mud_bricks"))
            register(ItemType.MUDDY_MANGROVE_ROOTS, Identifier.fromString("minecraft:muddy_mangrove_roots"))
            register(
                ItemType.MULE_SPAWN_EGG,
                Identifier.fromString("minecraft:mule_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.MUSHROOM_STEW,
                Identifier.fromString("minecraft:mushroom_stew"),
                ItemMushroomStew::class.java
            )
            register(ItemType.MUSIC_DISC_11, Identifier.fromString("minecraft:music_disc_11"))
            register(ItemType.MUSIC_DISC_13, Identifier.fromString("minecraft:music_disc_13"))
            register(ItemType.MUSIC_DISC_5, Identifier.fromString("minecraft:music_disc_5"))
            register(ItemType.MUSIC_DISC_BLOCKS, Identifier.fromString("minecraft:music_disc_blocks"))
            register(ItemType.MUSIC_DISC_CAT, Identifier.fromString("minecraft:music_disc_cat"))
            register(ItemType.MUSIC_DISC_CHIRP, Identifier.fromString("minecraft:music_disc_chirp"))
            register(ItemType.MUSIC_DISC_FAR, Identifier.fromString("minecraft:music_disc_far"))
            register(ItemType.MUSIC_DISC_MALL, Identifier.fromString("minecraft:music_disc_mall"))
            register(ItemType.MUSIC_DISC_MELLOHI, Identifier.fromString("minecraft:music_disc_mellohi"))
            register(ItemType.MUSIC_DISC_OTHERSIDE, Identifier.fromString("minecraft:music_disc_otherside"))
            register(ItemType.MUSIC_DISC_PIGSTEP, Identifier.fromString("minecraft:music_disc_pigstep"))
            register(ItemType.MUSIC_DISC_RELIC, Identifier.fromString("minecraft:music_disc_relic"))
            register(ItemType.MUSIC_DISC_STAL, Identifier.fromString("minecraft:music_disc_stal"))
            register(ItemType.MUSIC_DISC_STRAD, Identifier.fromString("minecraft:music_disc_strad"))
            register(ItemType.MUSIC_DISC_WAIT, Identifier.fromString("minecraft:music_disc_wait"))
            register(ItemType.MUSIC_DISC_WARD, Identifier.fromString("minecraft:music_disc_ward"))
            register(ItemType.MUTTON, Identifier.fromString("minecraft:mutton"), ItemMutton::class.java)
            register(ItemType.MYCELIUM, Identifier.fromString("minecraft:mycelium"))
            register(ItemType.NAME_TAG, Identifier.fromString("minecraft:name_tag"))
            register(ItemType.NAUTILUS_SHELL, Identifier.fromString("minecraft:nautilus_shell"))
            register(ItemType.NETHER_BRICK, Identifier.fromString("minecraft:nether_brick"))
            register(ItemType.NETHER_BRICK_FENCE, Identifier.fromString("minecraft:nether_brick_fence"))
            register(ItemType.NETHER_BRICK_STAIRS, Identifier.fromString("minecraft:nether_brick_stairs"))
            register(ItemType.NETHER_GOLD_ORE, Identifier.fromString("minecraft:nether_gold_ore"))
            register(ItemType.NETHER_SPROUTS, Identifier.fromString("minecraft:nether_sprouts"))
            register(ItemType.NETHER_STAR, Identifier.fromString("minecraft:nether_star"))
            register(ItemType.NETHER_WART, Identifier.fromString("minecraft:nether_wart"))
            register(ItemType.NETHER_WART_BLOCK, Identifier.fromString("minecraft:nether_wart_block"))
            register(ItemType.NETHERBRICK, Identifier.fromString("minecraft:netherbrick"))
            register(
                ItemType.NETHERITE_AXE,
                Identifier.fromString("minecraft:netherite_axe"),
                ItemNetheriteAxe::class.java
            )
            register(ItemType.NETHERITE_BLOCK, Identifier.fromString("minecraft:netherite_block"))
            register(
                ItemType.NETHERITE_BOOTS,
                Identifier.fromString("minecraft:netherite_boots"),
                ItemNetheriteBoots::class.java
            )
            register(
                ItemType.NETHERITE_CHESTPLATE,
                Identifier.fromString("minecraft:netherite_chestplate"),
                ItemNetheriteChestplate::class.java
            )
            register(
                ItemType.NETHERITE_HELMET,
                Identifier.fromString("minecraft:netherite_helmet"),
                ItemNetheriteHelmet::class.java
            )
            register(
                ItemType.NETHERITE_HOE,
                Identifier.fromString("minecraft:netherite_hoe"),
                ItemNetheriteHoe::class.java
            )
            register(ItemType.NETHERITE_INGOT, Identifier.fromString("minecraft:netherite_ingot"))
            register(
                ItemType.NETHERITE_LEGGINGS,
                Identifier.fromString("minecraft:netherite_leggings"),
                ItemNetheriteLeggings::class.java
            )
            register(
                ItemType.NETHERITE_PICKAXE,
                Identifier.fromString("minecraft:netherite_pickaxe"),
                ItemNetheritePickaxe::class.java
            )
            register(ItemType.NETHERITE_SCRAP, Identifier.fromString("minecraft:netherite_scrap"))
            register(
                ItemType.NETHERITE_SHOVEL,
                Identifier.fromString("minecraft:netherite_shovel"),
                ItemNetheriteShovel::class.java
            )
            register(
                ItemType.NETHERITE_SWORD,
                Identifier.fromString("minecraft:netherite_sword"),
                ItemNetheriteSword::class.java
            )
            register(
                ItemType.NETHERITE_UPGRADE_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:netherite_upgrade_smithing_template")
            )
            register(ItemType.NETHERRACK, Identifier.fromString("minecraft:netherrack"))
            register(ItemType.NETHERREACTOR, Identifier.fromString("minecraft:netherreactor"))
            register(ItemType.NORMAL_STONE_STAIRS, Identifier.fromString("minecraft:normal_stone_stairs"))
            register(ItemType.NOTEBLOCK, Identifier.fromString("minecraft:noteblock"))
            register(ItemType.NPC_SPAWN_EGG, Identifier.fromString("minecraft:npc_spawn_egg"))
            register(ItemType.OAK_BOAT, Identifier.fromString("minecraft:oak_boat"))
            register(ItemType.OAK_CHEST_BOAT, Identifier.fromString("minecraft:oak_chest_boat"))
            register(ItemType.OAK_FENCE, Identifier.fromString("minecraft:oak_fence"))
            register(
                ItemType.OAK_HANGING_SIGN,
                Identifier.fromString("minecraft:oak_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.OAK_LOG, Identifier.fromString("minecraft:oak_log"))
            register(ItemType.OAK_SIGN, Identifier.fromString("minecraft:oak_sign"), ItemSign::class.java)
            register(ItemType.OAK_STAIRS, Identifier.fromString("minecraft:oak_stairs"))
            register(ItemType.OBSERVER, Identifier.fromString("minecraft:observer"))
            register(ItemType.OBSIDIAN, Identifier.fromString("minecraft:obsidian"))
            register(
                ItemType.OCELOT_SPAWN_EGG,
                Identifier.fromString("minecraft:ocelot_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.OCHRE_FROGLIGHT, Identifier.fromString("minecraft:ochre_froglight"))
            register(ItemType.ORANGE_CANDLE, Identifier.fromString("minecraft:orange_candle"))
            register(ItemType.ORANGE_CANDLE_CAKE, Identifier.fromString("minecraft:orange_candle_cake"))
            register(ItemType.ORANGE_CARPET, Identifier.fromString("minecraft:orange_carpet"))
            register(ItemType.ORANGE_CONCRETE, Identifier.fromString("minecraft:orange_concrete"))
            register(ItemType.ORANGE_CONCRETE_POWDER, Identifier.fromString("minecraft:orange_concrete_powder"))
            register(ItemType.ORANGE_DYE, Identifier.fromString("minecraft:orange_dye"))
            register(ItemType.ORANGE_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:orange_glazed_terracotta"))
            register(ItemType.ORANGE_SHULKER_BOX, Identifier.fromString("minecraft:orange_shulker_box"))
            register(ItemType.ORANGE_STAINED_GLASS, Identifier.fromString("minecraft:orange_stained_glass"))
            register(ItemType.ORANGE_STAINED_GLASS_PANE, Identifier.fromString("minecraft:orange_stained_glass_pane"))
            register(ItemType.ORANGE_TERRACOTTA, Identifier.fromString("minecraft:orange_terracotta"))
            register(ItemType.ORANGE_WOOL, Identifier.fromString("minecraft:orange_wool"))
            register(ItemType.OXIDIZED_COPPER, Identifier.fromString("minecraft:oxidized_copper"))
            register(ItemType.OXIDIZED_CUT_COPPER, Identifier.fromString("minecraft:oxidized_cut_copper"))
            register(ItemType.OXIDIZED_CUT_COPPER_SLAB, Identifier.fromString("minecraft:oxidized_cut_copper_slab"))
            register(ItemType.OXIDIZED_CUT_COPPER_STAIRS, Identifier.fromString("minecraft:oxidized_cut_copper_stairs"))
            register(
                ItemType.OXIDIZED_DOUBLE_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:oxidized_double_cut_copper_slab")
            )
            register(ItemType.PACKED_ICE, Identifier.fromString("minecraft:packed_ice"))
            register(ItemType.PACKED_MUD, Identifier.fromString("minecraft:packed_mud"))
            register(ItemType.PAINTING, Identifier.fromString("minecraft:painting"))
            register(
                ItemType.PANDA_SPAWN_EGG,
                Identifier.fromString("minecraft:panda_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.PAPER, Identifier.fromString("minecraft:paper"))
            register(
                ItemType.PARROT_SPAWN_EGG,
                Identifier.fromString("minecraft:parrot_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.PEARLESCENT_FROGLIGHT, Identifier.fromString("minecraft:pearlescent_froglight"))
            register(ItemType.PHANTOM_MEMBRANE, Identifier.fromString("minecraft:phantom_membrane"))
            register(
                ItemType.PHANTOM_SPAWN_EGG,
                Identifier.fromString("minecraft:phantom_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.PIG_SPAWN_EGG, Identifier.fromString("minecraft:pig_spawn_egg"), ItemSpawnEgg::class.java)
            register(ItemType.PIGLIN_BANNER_PATTERN, Identifier.fromString("minecraft:piglin_banner_pattern"))
            register(
                ItemType.PIGLIN_BRUTE_SPAWN_EGG,
                Identifier.fromString("minecraft:piglin_brute_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.PIGLIN_SPAWN_EGG,
                Identifier.fromString("minecraft:piglin_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.PILLAGER_SPAWN_EGG,
                Identifier.fromString("minecraft:pillager_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.PINK_CANDLE, Identifier.fromString("minecraft:pink_candle"))
            register(ItemType.PINK_CANDLE_CAKE, Identifier.fromString("minecraft:pink_candle_cake"))
            register(ItemType.PINK_CARPET, Identifier.fromString("minecraft:pink_carpet"))
            register(ItemType.PINK_CONCRETE, Identifier.fromString("minecraft:pink_concrete"))
            register(ItemType.PINK_CONCRETE_POWDER, Identifier.fromString("minecraft:pink_concrete_powder"))
            register(ItemType.PINK_DYE, Identifier.fromString("minecraft:pink_dye"))
            register(ItemType.PINK_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:pink_glazed_terracotta"))
            register(ItemType.PINK_PETALS, Identifier.fromString("minecraft:pink_petals"))
            register(ItemType.PINK_SHULKER_BOX, Identifier.fromString("minecraft:pink_shulker_box"))
            register(ItemType.PINK_STAINED_GLASS, Identifier.fromString("minecraft:pink_stained_glass"))
            register(ItemType.PINK_STAINED_GLASS_PANE, Identifier.fromString("minecraft:pink_stained_glass_pane"))
            register(ItemType.PINK_TERRACOTTA, Identifier.fromString("minecraft:pink_terracotta"))
            register(ItemType.PINK_WOOL, Identifier.fromString("minecraft:pink_wool"))
            register(ItemType.PISTON, Identifier.fromString("minecraft:piston"))
            register(ItemType.PISTON_ARM_COLLISION, Identifier.fromString("minecraft:piston_arm_collision"))
            register(ItemType.PITCHER_CROP, Identifier.fromString("minecraft:pitcher_crop"))
            register(ItemType.PITCHER_PLANT, Identifier.fromString("minecraft:pitcher_plant"))
            register(ItemType.PITCHER_POD, Identifier.fromString("minecraft:pitcher_pod"))
            register(ItemType.OAK_PLANKS, Identifier.fromString("minecraft:oak_planks"))
            register(ItemType.SPRUCE_PLANKS, Identifier.fromString("minecraft:spruce_planks"))
            register(ItemType.BIRCH_PLANKS, Identifier.fromString("minecraft:birch_planks"))
            register(ItemType.JUNGLE_PLANKS, Identifier.fromString("minecraft:jungle_planks"))
            register(ItemType.ACACIA_PLANKS, Identifier.fromString("minecraft:acacia_planks"))
            register(ItemType.DARK_OAK_PLANKS, Identifier.fromString("minecraft:dark_oak_planks"))
            register(ItemType.PLENTY_POTTERY_SHERD, Identifier.fromString("minecraft:plenty_pottery_sherd"))
            register(ItemType.PODZOL, Identifier.fromString("minecraft:podzol"))
            register(ItemType.POINTED_DRIPSTONE, Identifier.fromString("minecraft:pointed_dripstone"))
            register(
                ItemType.POISONOUS_POTATO,
                Identifier.fromString("minecraft:poisonous_potato"),
                ItemPoisonousPotato::class.java
            )
            register(
                ItemType.POLAR_BEAR_SPAWN_EGG,
                Identifier.fromString("minecraft:polar_bear_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.POLISHED_ANDESITE_STAIRS, Identifier.fromString("minecraft:polished_andesite_stairs"))
            register(ItemType.POLISHED_BASALT, Identifier.fromString("minecraft:polished_basalt"))
            register(ItemType.POLISHED_BLACKSTONE, Identifier.fromString("minecraft:polished_blackstone"))
            register(
                ItemType.POLISHED_BLACKSTONE_BRICK_DOUBLE_SLAB,
                Identifier.fromString("minecraft:polished_blackstone_brick_double_slab")
            )
            register(
                ItemType.POLISHED_BLACKSTONE_BRICK_SLAB,
                Identifier.fromString("minecraft:polished_blackstone_brick_slab")
            )
            register(
                ItemType.POLISHED_BLACKSTONE_BRICK_STAIRS,
                Identifier.fromString("minecraft:polished_blackstone_brick_stairs")
            )
            register(
                ItemType.POLISHED_BLACKSTONE_BRICK_WALL,
                Identifier.fromString("minecraft:polished_blackstone_brick_wall")
            )
            register(ItemType.POLISHED_BLACKSTONE_BRICKS, Identifier.fromString("minecraft:polished_blackstone_bricks"))
            register(ItemType.POLISHED_BLACKSTONE_BUTTON, Identifier.fromString("minecraft:polished_blackstone_button"))
            register(
                ItemType.POLISHED_BLACKSTONE_DOUBLE_SLAB,
                Identifier.fromString("minecraft:polished_blackstone_double_slab")
            )
            register(
                ItemType.POLISHED_BLACKSTONE_PRESSURE_PLATE,
                Identifier.fromString("minecraft:polished_blackstone_pressure_plate")
            )
            register(ItemType.POLISHED_BLACKSTONE_SLAB, Identifier.fromString("minecraft:polished_blackstone_slab"))
            register(ItemType.POLISHED_BLACKSTONE_STAIRS, Identifier.fromString("minecraft:polished_blackstone_stairs"))
            register(ItemType.POLISHED_BLACKSTONE_WALL, Identifier.fromString("minecraft:polished_blackstone_wall"))
            register(ItemType.POLISHED_DEEPSLATE, Identifier.fromString("minecraft:polished_deepslate"))
            register(
                ItemType.POLISHED_DEEPSLATE_DOUBLE_SLAB,
                Identifier.fromString("minecraft:polished_deepslate_double_slab")
            )
            register(ItemType.POLISHED_DEEPSLATE_SLAB, Identifier.fromString("minecraft:polished_deepslate_slab"))
            register(ItemType.POLISHED_DEEPSLATE_STAIRS, Identifier.fromString("minecraft:polished_deepslate_stairs"))
            register(ItemType.POLISHED_DEEPSLATE_WALL, Identifier.fromString("minecraft:polished_deepslate_wall"))
            register(ItemType.POLISHED_DIORITE_STAIRS, Identifier.fromString("minecraft:polished_diorite_stairs"))
            register(ItemType.POLISHED_GRANITE_STAIRS, Identifier.fromString("minecraft:polished_granite_stairs"))
            register(ItemType.POPPED_CHORUS_FRUIT, Identifier.fromString("minecraft:popped_chorus_fruit"))
            register(ItemType.PORKCHOP, Identifier.fromString("minecraft:porkchop"), ItemPorkchop::class.java)
            register(ItemType.PORTAL, Identifier.fromString("minecraft:portal"))
            register(ItemType.POTATO, Identifier.fromString("minecraft:potato"), ItemPotato::class.java)
            register(ItemType.POTATOES, Identifier.fromString("minecraft:potatoes"))
            register(ItemType.POTION, Identifier.fromString("minecraft:potion"))
            register(ItemType.POWDER_SNOW, Identifier.fromString("minecraft:powder_snow"))
            register(ItemType.POWDER_SNOW_BUCKET, Identifier.fromString("minecraft:powder_snow_bucket"))
            register(ItemType.POWERED_COMPARATOR, Identifier.fromString("minecraft:powered_comparator"))
            register(ItemType.POWERED_REPEATER, Identifier.fromString("minecraft:powered_repeater"))
            register(ItemType.PRISMARINE, Identifier.fromString("minecraft:prismarine"))
            register(ItemType.PRISMARINE_BRICKS_STAIRS, Identifier.fromString("minecraft:prismarine_bricks_stairs"))
            register(ItemType.PRISMARINE_CRYSTALS, Identifier.fromString("minecraft:prismarine_crystals"))
            register(ItemType.PRISMARINE_SHARD, Identifier.fromString("minecraft:prismarine_shard"))
            register(ItemType.PRISMARINE_STAIRS, Identifier.fromString("minecraft:prismarine_stairs"))
            register(ItemType.PRIZE_POTTERY_SHERD, Identifier.fromString("minecraft:prize_pottery_sherd"))
            register(ItemType.PUFFERFISH, Identifier.fromString("minecraft:pufferfish"), ItemPufferfish::class.java)
            register(ItemType.PUFFERFISH_BUCKET, Identifier.fromString("minecraft:pufferfish_bucket"))
            register(
                ItemType.PUFFERFISH_SPAWN_EGG,
                Identifier.fromString("minecraft:pufferfish_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.PUMPKIN, Identifier.fromString("minecraft:pumpkin"))
            register(ItemType.PUMPKIN_PIE, Identifier.fromString("minecraft:pumpkin_pie"), ItemPumpkinPie::class.java)
            register(ItemType.PUMPKIN_SEEDS, Identifier.fromString("minecraft:pumpkin_seeds"))
            register(ItemType.PUMPKIN_STEM, Identifier.fromString("minecraft:pumpkin_stem"))
            register(ItemType.PURPLE_CANDLE, Identifier.fromString("minecraft:purple_candle"))
            register(ItemType.PURPLE_CANDLE_CAKE, Identifier.fromString("minecraft:purple_candle_cake"))
            register(ItemType.PURPLE_CARPET, Identifier.fromString("minecraft:purple_carpet"))
            register(ItemType.PURPLE_CONCRETE, Identifier.fromString("minecraft:purple_concrete"))
            register(ItemType.PURPLE_CONCRETE_POWDER, Identifier.fromString("minecraft:purple_concrete_powder"))
            register(ItemType.PURPLE_DYE, Identifier.fromString("minecraft:purple_dye"))
            register(ItemType.PURPLE_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:purple_glazed_terracotta"))
            register(ItemType.PURPLE_SHULKER_BOX, Identifier.fromString("minecraft:purple_shulker_box"))
            register(ItemType.PURPLE_STAINED_GLASS, Identifier.fromString("minecraft:purple_stained_glass"))
            register(ItemType.PURPLE_STAINED_GLASS_PANE, Identifier.fromString("minecraft:purple_stained_glass_pane"))
            register(ItemType.PURPLE_TERRACOTTA, Identifier.fromString("minecraft:purple_terracotta"))
            register(ItemType.PURPLE_WOOL, Identifier.fromString("minecraft:purple_wool"))
            register(ItemType.PURPUR_BLOCK, Identifier.fromString("minecraft:purpur_block"))
            register(ItemType.PURPUR_STAIRS, Identifier.fromString("minecraft:purpur_stairs"))
            register(ItemType.QUARTZ, Identifier.fromString("minecraft:quartz"))
            register(ItemType.QUARTZ_BLOCK, Identifier.fromString("minecraft:quartz_block"))
            register(ItemType.QUARTZ_BRICKS, Identifier.fromString("minecraft:quartz_bricks"))
            register(ItemType.QUARTZ_ORE, Identifier.fromString("minecraft:quartz_ore"))
            register(ItemType.QUARTZ_STAIRS, Identifier.fromString("minecraft:quartz_stairs"))
            register(ItemType.RABBIT, Identifier.fromString("minecraft:rabbit"), ItemRabbit::class.java)
            register(ItemType.RABBIT_FOOT, Identifier.fromString("minecraft:rabbit_foot"))
            register(ItemType.RABBIT_HIDE, Identifier.fromString("minecraft:rabbit_hide"))
            register(
                ItemType.RABBIT_SPAWN_EGG,
                Identifier.fromString("minecraft:rabbit_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.RABBIT_STEW, Identifier.fromString("minecraft:rabbit_stew"), ItemRabbitStew::class.java)
            register(ItemType.RAIL, Identifier.fromString("minecraft:rail"))
            register(
                ItemType.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:raiser_armor_trim_smithing_template")
            )
            register(ItemType.RAPID_FERTILIZER, Identifier.fromString("minecraft:rapid_fertilizer"))
            register(
                ItemType.RAVAGER_SPAWN_EGG,
                Identifier.fromString("minecraft:ravager_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.RAW_COPPER, Identifier.fromString("minecraft:raw_copper"))
            register(ItemType.RAW_COPPER_BLOCK, Identifier.fromString("minecraft:raw_copper_block"))
            register(ItemType.RAW_GOLD, Identifier.fromString("minecraft:raw_gold"))
            register(ItemType.RAW_GOLD_BLOCK, Identifier.fromString("minecraft:raw_gold_block"))
            register(ItemType.RAW_IRON, Identifier.fromString("minecraft:raw_iron"))
            register(ItemType.RAW_IRON_BLOCK, Identifier.fromString("minecraft:raw_iron_block"))
            register(ItemType.RECOVERY_COMPASS, Identifier.fromString("minecraft:recovery_compass"))
            register(ItemType.RED_CANDLE, Identifier.fromString("minecraft:red_candle"))
            register(ItemType.RED_CANDLE_CAKE, Identifier.fromString("minecraft:red_candle_cake"))
            register(ItemType.RED_CARPET, Identifier.fromString("minecraft:red_carpet"))
            register(ItemType.RED_CONCRETE, Identifier.fromString("minecraft:red_concrete"))
            register(ItemType.RED_CONCRETE_POWDER, Identifier.fromString("minecraft:red_concrete_powder"))
            register(ItemType.RED_DYE, Identifier.fromString("minecraft:red_dye"))
            register(ItemType.RED_FLOWER, Identifier.fromString("minecraft:red_flower"))
            register(ItemType.RED_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:red_glazed_terracotta"))
            register(ItemType.RED_MUSHROOM, Identifier.fromString("minecraft:red_mushroom"))
            register(ItemType.RED_MUSHROOM_BLOCK, Identifier.fromString("minecraft:red_mushroom_block"))
            register(ItemType.RED_NETHER_BRICK, Identifier.fromString("minecraft:red_nether_brick"))
            register(ItemType.RED_NETHER_BRICK_STAIRS, Identifier.fromString("minecraft:red_nether_brick_stairs"))
            register(ItemType.RED_SANDSTONE, Identifier.fromString("minecraft:red_sandstone"))
            register(ItemType.RED_SANDSTONE_STAIRS, Identifier.fromString("minecraft:red_sandstone_stairs"))
            register(ItemType.RED_SHULKER_BOX, Identifier.fromString("minecraft:red_shulker_box"))
            register(ItemType.RED_STAINED_GLASS, Identifier.fromString("minecraft:red_stained_glass"))
            register(ItemType.RED_STAINED_GLASS_PANE, Identifier.fromString("minecraft:red_stained_glass_pane"))
            register(ItemType.RED_TERRACOTTA, Identifier.fromString("minecraft:red_terracotta"))
            register(ItemType.RED_WOOL, Identifier.fromString("minecraft:red_wool"))
            register(ItemType.REDSTONE, Identifier.fromString("minecraft:redstone"))
            register(ItemType.REDSTONE_BLOCK, Identifier.fromString("minecraft:redstone_block"))
            register(ItemType.REDSTONE_LAMP, Identifier.fromString("minecraft:redstone_lamp"))
            register(ItemType.REDSTONE_ORE, Identifier.fromString("minecraft:redstone_ore"))
            register(ItemType.REDSTONE_TORCH, Identifier.fromString("minecraft:redstone_torch"))
            register(ItemType.REDSTONE_WIRE, Identifier.fromString("minecraft:redstone_wire"))
            register(ItemType.REINFORCED_DEEPSLATE, Identifier.fromString("minecraft:reinforced_deepslate"))
            register(ItemType.REPEATER, Identifier.fromString("minecraft:repeater"))
            register(ItemType.REPEATING_COMMAND_BLOCK, Identifier.fromString("minecraft:repeating_command_block"))
            register(ItemType.RESERVED6, Identifier.fromString("minecraft:reserved6"))
            register(ItemType.RESPAWN_ANCHOR, Identifier.fromString("minecraft:respawn_anchor"))
            register(
                ItemType.RIB_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:rib_armor_trim_smithing_template")
            )
            register(ItemType.ROTTEN_FLESH, Identifier.fromString("minecraft:rotten_flesh"))
            register(ItemType.SADDLE, Identifier.fromString("minecraft:saddle"))
            register(ItemType.SALMON, Identifier.fromString("minecraft:salmon"), ItemSalmon::class.java)
            register(ItemType.SALMON_BUCKET, Identifier.fromString("minecraft:salmon_bucket"))
            register(
                ItemType.SALMON_SPAWN_EGG,
                Identifier.fromString("minecraft:salmon_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.SAND, Identifier.fromString("minecraft:sand"))
            register(ItemType.SANDSTONE, Identifier.fromString("minecraft:sandstone"))
            register(ItemType.SANDSTONE_STAIRS, Identifier.fromString("minecraft:sandstone_stairs"))
            register(ItemType.SAPLING, Identifier.fromString("minecraft:sapling"))
            register(ItemType.SCAFFOLDING, Identifier.fromString("minecraft:scaffolding"))
            register(ItemType.SCULK, Identifier.fromString("minecraft:sculk"))
            register(ItemType.SCULK_CATALYST, Identifier.fromString("minecraft:sculk_catalyst"))
            register(ItemType.SCULK_SENSOR, Identifier.fromString("minecraft:sculk_sensor"))
            register(ItemType.SCULK_SHRIEKER, Identifier.fromString("minecraft:sculk_shrieker"))
            register(ItemType.SCULK_VEIN, Identifier.fromString("minecraft:sculk_vein"))
            register(ItemType.SCUTE, Identifier.fromString("minecraft:scute"))
            register(ItemType.SEA_LANTERN, Identifier.fromString("minecraft:sea_lantern"))
            register(ItemType.SEA_PICKLE, Identifier.fromString("minecraft:sea_pickle"))
            register(ItemType.SEAGRASS, Identifier.fromString("minecraft:seagrass"))
            register(
                ItemType.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:sentry_armor_trim_smithing_template")
            )
            register(
                ItemType.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:shaper_armor_trim_smithing_template")
            )
            register(ItemType.SHEAF_POTTERY_SHERD, Identifier.fromString("minecraft:sheaf_pottery_sherd"))
            register(ItemType.SHEARS, Identifier.fromString("minecraft:shears"))
            register(
                ItemType.SHEEP_SPAWN_EGG,
                Identifier.fromString("minecraft:sheep_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.SHELTER_POTTERY_SHERD, Identifier.fromString("minecraft:shelter_pottery_sherd"))
            register(ItemType.SHIELD, Identifier.fromString("minecraft:shield"))
            register(ItemType.SHROOMLIGHT, Identifier.fromString("minecraft:shroomlight"))
            register(ItemType.SHULKER_BOX, Identifier.fromString("minecraft:shulker_box"))
            register(ItemType.SHULKER_SHELL, Identifier.fromString("minecraft:shulker_shell"))
            register(
                ItemType.SHULKER_SPAWN_EGG,
                Identifier.fromString("minecraft:shulker_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:silence_armor_trim_smithing_template")
            )
            register(ItemType.SILVER_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:silver_glazed_terracotta"))
            register(
                ItemType.SILVERFISH_SPAWN_EGG,
                Identifier.fromString("minecraft:silverfish_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.SKELETON_HORSE_SPAWN_EGG,
                Identifier.fromString("minecraft:skeleton_horse_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.SKELETON_SPAWN_EGG,
                Identifier.fromString("minecraft:skeleton_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.SKULL, Identifier.fromString("minecraft:skull"))
            register(ItemType.SKULL_BANNER_PATTERN, Identifier.fromString("minecraft:skull_banner_pattern"))
            register(ItemType.SKULL_POTTERY_SHERD, Identifier.fromString("minecraft:skull_pottery_sherd"))
            register(ItemType.SLIME, Identifier.fromString("minecraft:slime"))
            register(ItemType.SLIME_BALL, Identifier.fromString("minecraft:slime_ball"))
            register(
                ItemType.SLIME_SPAWN_EGG,
                Identifier.fromString("minecraft:slime_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.SMALL_AMETHYST_BUD, Identifier.fromString("minecraft:small_amethyst_bud"))
            register(ItemType.SMALL_DRIPLEAF_BLOCK, Identifier.fromString("minecraft:small_dripleaf_block"))
            register(ItemType.SMITHING_TABLE, Identifier.fromString("minecraft:smithing_table"))
            register(ItemType.SMOKER, Identifier.fromString("minecraft:smoker"))
            register(ItemType.SMOOTH_BASALT, Identifier.fromString("minecraft:smooth_basalt"))
            register(ItemType.SMOOTH_QUARTZ_STAIRS, Identifier.fromString("minecraft:smooth_quartz_stairs"))
            register(
                ItemType.SMOOTH_RED_SANDSTONE_STAIRS,
                Identifier.fromString("minecraft:smooth_red_sandstone_stairs")
            )
            register(ItemType.SMOOTH_SANDSTONE_STAIRS, Identifier.fromString("minecraft:smooth_sandstone_stairs"))
            register(ItemType.SMOOTH_STONE, Identifier.fromString("minecraft:smooth_stone"))
            register(ItemType.SNIFFER_EGG, Identifier.fromString("minecraft:sniffer_egg"))
            register(
                ItemType.SNIFFER_SPAWN_EGG,
                Identifier.fromString("minecraft:sniffer_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.SNORT_POTTERY_SHERD, Identifier.fromString("minecraft:snort_pottery_sherd"))
            register(
                ItemType.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:snout_armor_trim_smithing_template")
            )
            register(ItemType.SNOW, Identifier.fromString("minecraft:snow"))
            register(
                ItemType.SNOW_GOLEM_SPAWN_EGG,
                Identifier.fromString("minecraft:snow_golem_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.SNOW_LAYER, Identifier.fromString("minecraft:snow_layer"))
            register(ItemType.SNOWBALL, Identifier.fromString("minecraft:snowball"))
            register(ItemType.SOUL_CAMPFIRE, Identifier.fromString("minecraft:soul_campfire"))
            register(ItemType.SOUL_FIRE, Identifier.fromString("minecraft:soul_fire"))
            register(ItemType.SOUL_LANTERN, Identifier.fromString("minecraft:soul_lantern"))
            register(ItemType.SOUL_SAND, Identifier.fromString("minecraft:soul_sand"))
            register(ItemType.SOUL_SOIL, Identifier.fromString("minecraft:soul_soil"))
            register(ItemType.SOUL_TORCH, Identifier.fromString("minecraft:soul_torch"))
            register(ItemType.SPARKLER, Identifier.fromString("minecraft:sparkler"))
            register(ItemType.SPAWN_EGG, Identifier.fromString("minecraft:spawn_egg"))
            register(ItemType.SPIDER_EYE, Identifier.fromString("minecraft:spider_eye"))
            register(
                ItemType.SPIDER_SPAWN_EGG,
                Identifier.fromString("minecraft:spider_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:spire_armor_trim_smithing_template")
            )
            register(ItemType.SPLASH_POTION, Identifier.fromString("minecraft:splash_potion"))
            register(ItemType.SPONGE, Identifier.fromString("minecraft:sponge"))
            register(ItemType.SPORE_BLOSSOM, Identifier.fromString("minecraft:spore_blossom"))
            register(ItemType.SPRUCE_BOAT, Identifier.fromString("minecraft:spruce_boat"))
            register(ItemType.SPRUCE_BUTTON, Identifier.fromString("minecraft:spruce_button"))
            register(ItemType.SPRUCE_CHEST_BOAT, Identifier.fromString("minecraft:spruce_chest_boat"))
            register(ItemType.SPRUCE_DOOR, Identifier.fromString("minecraft:spruce_door"), ItemDoor::class.java)
            register(ItemType.SPRUCE_FENCE, Identifier.fromString("minecraft:spruce_fence"))
            register(ItemType.SPRUCE_FENCE_GATE, Identifier.fromString("minecraft:spruce_fence_gate"))
            register(
                ItemType.SPRUCE_HANGING_SIGN,
                Identifier.fromString("minecraft:spruce_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.SPRUCE_LOG, Identifier.fromString("minecraft:spruce_log"))
            register(ItemType.SPRUCE_PRESSURE_PLATE, Identifier.fromString("minecraft:spruce_pressure_plate"))
            register(ItemType.SPRUCE_SIGN, Identifier.fromString("minecraft:spruce_sign"), ItemSign::class.java)
            register(ItemType.SPRUCE_STAIRS, Identifier.fromString("minecraft:spruce_stairs"))
            register(
                ItemType.SPRUCE_STANDING_SIGN,
                Identifier.fromString("minecraft:spruce_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.SPRUCE_TRAPDOOR, Identifier.fromString("minecraft:spruce_trapdoor"))
            register(
                ItemType.SPRUCE_WALL_SIGN,
                Identifier.fromString("minecraft:spruce_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.SPYGLASS, Identifier.fromString("minecraft:spyglass"))
            register(
                ItemType.SQUID_SPAWN_EGG,
                Identifier.fromString("minecraft:squid_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.STAINED_GLASS, Identifier.fromString("minecraft:stained_glass"))
            register(ItemType.STAINED_GLASS_PANE, Identifier.fromString("minecraft:stained_glass_pane"))
            register(ItemType.STAINED_HARDENED_CLAY, Identifier.fromString("minecraft:stained_hardened_clay"))
            register(ItemType.STANDING_BANNER, Identifier.fromString("minecraft:standing_banner"))
            register(ItemType.STANDING_SIGN, Identifier.fromString("minecraft:standing_sign"), ItemSign::class.java)
            register(ItemType.STICK, Identifier.fromString("minecraft:stick"))
            register(ItemType.STICKY_PISTON, Identifier.fromString("minecraft:sticky_piston"))
            register(
                ItemType.STICKY_PISTON_ARM_COLLISION,
                Identifier.fromString("minecraft:sticky_piston_arm_collision")
            )
            register(ItemType.STONE, Identifier.fromString("minecraft:stone"))
            register(ItemType.GRANITE, Identifier.fromString("minecraft:granite"))
            register(ItemType.POLISHED_ANDESITE, Identifier.fromString("minecraft:polished_granite"))
            register(ItemType.DIORITE, Identifier.fromString("minecraft:diorite"))
            register(ItemType.POLISHED_DIORITE, Identifier.fromString("minecraft:polished_diorite"))
            register(ItemType.ANDESITE, Identifier.fromString("minecraft:andesite"))
            register(ItemType.POLISHED_ANDESITE, Identifier.fromString("minecraft:polished_andesite"))
            register(ItemType.STONE_AXE, Identifier.fromString("minecraft:stone_axe"), ItemStoneAxe::class.java)
            register(ItemType.STONE_BLOCK_SLAB, Identifier.fromString("minecraft:stone_block_slab"))
            register(ItemType.STONE_BLOCK_SLAB2, Identifier.fromString("minecraft:stone_block_slab2"))
            register(ItemType.STONE_BLOCK_SLAB3, Identifier.fromString("minecraft:stone_block_slab3"))
            register(ItemType.STONE_BLOCK_SLAB4, Identifier.fromString("minecraft:stone_block_slab4"))
            register(ItemType.STONE_BRICK_STAIRS, Identifier.fromString("minecraft:stone_brick_stairs"))
            register(ItemType.STONE_BUTTON, Identifier.fromString("minecraft:stone_button"))
            register(ItemType.STONE_HOE, Identifier.fromString("minecraft:stone_hoe"), ItemStoneHoe::class.java)
            register(
                ItemType.STONE_PICKAXE,
                Identifier.fromString("minecraft:stone_pickaxe"),
                ItemStonePickaxe::class.java
            )
            register(ItemType.STONE_PRESSURE_PLATE, Identifier.fromString("minecraft:stone_pressure_plate"))
            register(
                ItemType.STONE_SHOVEL,
                Identifier.fromString("minecraft:stone_shovel"),
                ItemStoneShovel::class.java
            )
            register(ItemType.STONE_STAIRS, Identifier.fromString("minecraft:stone_stairs"))
            register(ItemType.STONE_SWORD, Identifier.fromString("minecraft:stone_sword"), ItemStoneSword::class.java)
            register(ItemType.STONEBRICK, Identifier.fromString("minecraft:stonebrick"))
            register(ItemType.STONECUTTER, Identifier.fromString("minecraft:stonecutter"))
            register(ItemType.STONECUTTER_BLOCK, Identifier.fromString("minecraft:stonecutter_block"))
            register(
                ItemType.STRAY_SPAWN_EGG,
                Identifier.fromString("minecraft:stray_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.STRIDER_SPAWN_EGG,
                Identifier.fromString("minecraft:strider_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.STRING, Identifier.fromString("minecraft:string"))
            register(ItemType.STRIPPED_ACACIA_LOG, Identifier.fromString("minecraft:stripped_acacia_log"))
            register(ItemType.STRIPPED_BAMBOO_BLOCK, Identifier.fromString("minecraft:stripped_bamboo_block"))
            register(ItemType.STRIPPED_BIRCH_LOG, Identifier.fromString("minecraft:stripped_birch_log"))
            register(ItemType.STRIPPED_CHERRY_LOG, Identifier.fromString("minecraft:stripped_cherry_log"))
            register(ItemType.STRIPPED_CHERRY_WOOD, Identifier.fromString("minecraft:stripped_cherry_wood"))
            register(ItemType.STRIPPED_CRIMSON_HYPHAE, Identifier.fromString("minecraft:stripped_crimson_hyphae"))
            register(ItemType.STRIPPED_CRIMSON_STEM, Identifier.fromString("minecraft:stripped_crimson_stem"))
            register(ItemType.STRIPPED_DARK_OAK_LOG, Identifier.fromString("minecraft:stripped_dark_oak_log"))
            register(ItemType.STRIPPED_JUNGLE_LOG, Identifier.fromString("minecraft:stripped_jungle_log"))
            register(ItemType.STRIPPED_MANGROVE_LOG, Identifier.fromString("minecraft:stripped_mangrove_log"))
            register(ItemType.STRIPPED_MANGROVE_WOOD, Identifier.fromString("minecraft:stripped_mangrove_wood"))
            register(ItemType.STRIPPED_OAK_LOG, Identifier.fromString("minecraft:stripped_oak_log"))
            register(ItemType.STRIPPED_SPRUCE_LOG, Identifier.fromString("minecraft:stripped_spruce_log"))
            register(ItemType.STRIPPED_WARPED_HYPHAE, Identifier.fromString("minecraft:stripped_warped_hyphae"))
            register(ItemType.STRIPPED_WARPED_STEM, Identifier.fromString("minecraft:stripped_warped_stem"))
            register(ItemType.STRUCTURE_BLOCK, Identifier.fromString("minecraft:structure_block"))
            register(ItemType.STRUCTURE_VOID, Identifier.fromString("minecraft:structure_void"))
            register(ItemType.SUGAR, Identifier.fromString("minecraft:sugar"))
            register(ItemType.SUGAR_CANE, Identifier.fromString("minecraft:sugar_cane"))
            register(ItemType.SUSPICIOUS_GRAVEL, Identifier.fromString("minecraft:suspicious_gravel"))
            register(ItemType.SUSPICIOUS_SAND, Identifier.fromString("minecraft:suspicious_sand"))
            register(ItemType.SUSPICIOUS_STEW, Identifier.fromString("minecraft:suspicious_stew"))
            register(
                ItemType.SWEET_BERRIES,
                Identifier.fromString("minecraft:sweet_berries"),
                ItemSweetBerries::class.java
            )
            register(ItemType.SWEET_BERRY_BUSH, Identifier.fromString("minecraft:sweet_berry_bush"))
            register(ItemType.TADPOLE_BUCKET, Identifier.fromString("minecraft:tadpole_bucket"))
            register(
                ItemType.TADPOLE_SPAWN_EGG,
                Identifier.fromString("minecraft:tadpole_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.TALLGRASS, Identifier.fromString("minecraft:tallgrass"))
            register(ItemType.TARGET, Identifier.fromString("minecraft:target"))
            register(
                ItemType.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:tide_armor_trim_smithing_template")
            )
            register(ItemType.TINTED_GLASS, Identifier.fromString("minecraft:tinted_glass"))
            register(ItemType.TNT, Identifier.fromString("minecraft:tnt"))
            register(ItemType.TNT_MINECART, Identifier.fromString("minecraft:tnt_minecart"))
            register(ItemType.TORCH, Identifier.fromString("minecraft:torch"))
            register(ItemType.TORCHFLOWER, Identifier.fromString("minecraft:torchflower"))
            register(ItemType.TORCHFLOWER_CROP, Identifier.fromString("minecraft:torchflower_crop"))
            register(ItemType.TORCHFLOWER_SEEDS, Identifier.fromString("minecraft:torchflower_seeds"))
            register(ItemType.TOTEM_OF_UNDYING, Identifier.fromString("minecraft:totem_of_undying"))
            register(
                ItemType.TRADER_LLAMA_SPAWN_EGG,
                Identifier.fromString("minecraft:trader_llama_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.TRAPDOOR, Identifier.fromString("minecraft:trapdoor"))
            register(ItemType.TRAPPED_CHEST, Identifier.fromString("minecraft:trapped_chest"))
            register(ItemType.TRIDENT, Identifier.fromString("minecraft:trident"))
            register(ItemType.TRIP_WIRE, Identifier.fromString("minecraft:trip_wire"))
            register(ItemType.TRIPWIRE_HOOK, Identifier.fromString("minecraft:tripwire_hook"))
            register(
                ItemType.TROPICAL_FISH,
                Identifier.fromString("minecraft:tropical_fish"),
                ItemTropicalFish::class.java
            )
            register(ItemType.TROPICAL_FISH_BUCKET, Identifier.fromString("minecraft:tropical_fish_bucket"))
            register(
                ItemType.TROPICAL_FISH_SPAWN_EGG,
                Identifier.fromString("minecraft:tropical_fish_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.TUBE_CORAL, Identifier.fromString("minecraft:tube_coral"))
            register(ItemType.TUFF, Identifier.fromString("minecraft:tuff"))
            register(ItemType.TURTLE_EGG, Identifier.fromString("minecraft:turtle_egg"))
            register(
                ItemType.TURTLE_HELMET,
                Identifier.fromString("minecraft:turtle_helmet"),
                ItemTurtleHelmet::class.java
            )
            register(
                ItemType.TURTLE_SPAWN_EGG,
                Identifier.fromString("minecraft:turtle_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.TURTLE_SCUTE, Identifier.fromString("minecraft:turtle_scute"))
            register(ItemType.TWISTING_VINES, Identifier.fromString("minecraft:twisting_vines"))
            register(ItemType.UNDERWATER_TORCH, Identifier.fromString("minecraft:underwater_torch"))
            register(ItemType.UNDYED_SHULKER_BOX, Identifier.fromString("minecraft:undyed_shulker_box"))
            register(ItemType.UNKNOWN, Identifier.fromString("minecraft:unknown"))
            register(ItemType.UNLIT_REDSTONE_TORCH, Identifier.fromString("minecraft:unlit_redstone_torch"))
            register(ItemType.UNPOWERED_COMPARATOR, Identifier.fromString("minecraft:unpowered_comparator"))
            register(ItemType.UNPOWERED_REPEATER, Identifier.fromString("minecraft:unpowered_repeater"))
            register(ItemType.VERDANT_FROGLIGHT, Identifier.fromString("minecraft:verdant_froglight"))
            register(
                ItemType.VEX_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:vex_armor_trim_smithing_template")
            )
            register(ItemType.VEX_SPAWN_EGG, Identifier.fromString("minecraft:vex_spawn_egg"), ItemSpawnEgg::class.java)
            register(
                ItemType.VILLAGER_SPAWN_EGG,
                Identifier.fromString("minecraft:villager_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.VINDICATOR_SPAWN_EGG,
                Identifier.fromString("minecraft:vindicator_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.VINE, Identifier.fromString("minecraft:vine"))
            register(ItemType.WALL_BANNER, Identifier.fromString("minecraft:wall_banner"))
            register(ItemType.WALL_SIGN, Identifier.fromString("minecraft:wall_sign"), ItemSign::class.java)
            register(
                ItemType.WANDERING_TRADER_SPAWN_EGG,
                Identifier.fromString("minecraft:wandering_trader_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.WARD_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:ward_armor_trim_smithing_template")
            )
            register(
                ItemType.WARDEN_SPAWN_EGG,
                Identifier.fromString("minecraft:warden_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.WARPED_BUTTON, Identifier.fromString("minecraft:warped_button"))
            register(ItemType.WARPED_DOOR, Identifier.fromString("minecraft:warped_door"), ItemDoor::class.java)
            register(ItemType.WARPED_DOUBLE_SLAB, Identifier.fromString("minecraft:warped_double_slab"))
            register(ItemType.WARPED_FENCE, Identifier.fromString("minecraft:warped_fence"))
            register(ItemType.WARPED_FENCE_GATE, Identifier.fromString("minecraft:warped_fence_gate"))
            register(ItemType.WARPED_FUNGUS, Identifier.fromString("minecraft:warped_fungus"))
            register(ItemType.WARPED_FUNGUS_ON_A_STICK, Identifier.fromString("minecraft:warped_fungus_on_a_stick"))
            register(
                ItemType.WARPED_HANGING_SIGN,
                Identifier.fromString("minecraft:warped_hanging_sign"),
                ItemHangingSign::class.java
            )
            register(ItemType.WARPED_HYPHAE, Identifier.fromString("minecraft:warped_hyphae"))
            register(ItemType.WARPED_NYLIUM, Identifier.fromString("minecraft:warped_nylium"))
            register(ItemType.WARPED_PLANKS, Identifier.fromString("minecraft:warped_planks"))
            register(ItemType.WARPED_PRESSURE_PLATE, Identifier.fromString("minecraft:warped_pressure_plate"))
            register(ItemType.WARPED_ROOTS, Identifier.fromString("minecraft:warped_roots"))
            register(ItemType.WARPED_SIGN, Identifier.fromString("minecraft:warped_sign"), ItemSign::class.java)
            register(ItemType.WARPED_SLAB, Identifier.fromString("minecraft:warped_slab"))
            register(ItemType.WARPED_STAIRS, Identifier.fromString("minecraft:warped_stairs"))
            register(
                ItemType.WARPED_STANDING_SIGN,
                Identifier.fromString("minecraft:warped_standing_sign"),
                ItemSign::class.java
            )
            register(ItemType.WARPED_STEM, Identifier.fromString("minecraft:warped_stem"))
            register(ItemType.WARPED_TRAPDOOR, Identifier.fromString("minecraft:warped_trapdoor"))
            register(
                ItemType.WARPED_WALL_SIGN,
                Identifier.fromString("minecraft:warped_wall_sign"),
                ItemSign::class.java
            )
            register(ItemType.WARPED_WART_BLOCK, Identifier.fromString("minecraft:warped_wart_block"))
            register(ItemType.WATER, Identifier.fromString("minecraft:water"))
            register(ItemType.WATER_BUCKET, Identifier.fromString("minecraft:water_bucket"))
            register(ItemType.WATERLILY, Identifier.fromString("minecraft:waterlily"))
            register(ItemType.WAXED_COPPER, Identifier.fromString("minecraft:waxed_copper"))
            register(ItemType.WAXED_CUT_COPPER, Identifier.fromString("minecraft:waxed_cut_copper"))
            register(ItemType.WAXED_CUT_COPPER_SLAB, Identifier.fromString("minecraft:waxed_cut_copper_slab"))
            register(ItemType.WAXED_CUT_COPPER_STAIRS, Identifier.fromString("minecraft:waxed_cut_copper_stairs"))
            register(
                ItemType.WAXED_DOUBLE_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:waxed_double_cut_copper_slab")
            )
            register(ItemType.WAXED_EXPOSED_COPPER, Identifier.fromString("minecraft:waxed_exposed_copper"))
            register(ItemType.WAXED_EXPOSED_CUT_COPPER, Identifier.fromString("minecraft:waxed_exposed_cut_copper"))
            register(
                ItemType.WAXED_EXPOSED_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:waxed_exposed_cut_copper_slab")
            )
            register(
                ItemType.WAXED_EXPOSED_CUT_COPPER_STAIRS,
                Identifier.fromString("minecraft:waxed_exposed_cut_copper_stairs")
            )
            register(
                ItemType.WAXED_EXPOSED_DOUBLE_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:waxed_exposed_double_cut_copper_slab")
            )
            register(ItemType.WAXED_OXIDIZED_COPPER, Identifier.fromString("minecraft:waxed_oxidized_copper"))
            register(ItemType.WAXED_OXIDIZED_CUT_COPPER, Identifier.fromString("minecraft:waxed_oxidized_cut_copper"))
            register(
                ItemType.WAXED_OXIDIZED_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:waxed_oxidized_cut_copper_slab")
            )
            register(
                ItemType.WAXED_OXIDIZED_CUT_COPPER_STAIRS,
                Identifier.fromString("minecraft:waxed_oxidized_cut_copper_stairs")
            )
            register(
                ItemType.WAXED_OXIDIZED_DOUBLE_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:waxed_oxidized_double_cut_copper_slab")
            )
            register(ItemType.WAXED_WEATHERED_COPPER, Identifier.fromString("minecraft:waxed_weathered_copper"))
            register(ItemType.WAXED_WEATHERED_CUT_COPPER, Identifier.fromString("minecraft:waxed_weathered_cut_copper"))
            register(
                ItemType.WAXED_WEATHERED_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:waxed_weathered_cut_copper_slab")
            )
            register(
                ItemType.WAXED_WEATHERED_CUT_COPPER_STAIRS,
                Identifier.fromString("minecraft:waxed_weathered_cut_copper_stairs")
            )
            register(
                ItemType.WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:waxed_weathered_double_cut_copper_slab")
            )
            register(
                ItemType.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:wayfinder_armor_trim_smithing_template")
            )
            register(ItemType.WEATHERED_COPPER, Identifier.fromString("minecraft:weathered_copper"))
            register(ItemType.WEATHERED_CUT_COPPER, Identifier.fromString("minecraft:weathered_cut_copper"))
            register(ItemType.WEATHERED_CUT_COPPER_SLAB, Identifier.fromString("minecraft:weathered_cut_copper_slab"))
            register(
                ItemType.WEATHERED_CUT_COPPER_STAIRS,
                Identifier.fromString("minecraft:weathered_cut_copper_stairs")
            )
            register(
                ItemType.WEATHERED_DOUBLE_CUT_COPPER_SLAB,
                Identifier.fromString("minecraft:weathered_double_cut_copper_slab")
            )
            register(ItemType.WEB, Identifier.fromString("minecraft:web"))
            register(ItemType.WEEPING_VINES, Identifier.fromString("minecraft:weeping_vines"))
            register(ItemType.WHEAT, Identifier.fromString("minecraft:wheat"))
            register(ItemType.WHEAT_SEEDS, Identifier.fromString("minecraft:wheat_seeds"))
            register(ItemType.WHITE_CANDLE, Identifier.fromString("minecraft:white_candle"))
            register(ItemType.WHITE_CANDLE_CAKE, Identifier.fromString("minecraft:white_candle_cake"))
            register(ItemType.WHITE_CARPET, Identifier.fromString("minecraft:white_carpet"))
            register(ItemType.WHITE_CONCRETE, Identifier.fromString("minecraft:white_concrete"))
            register(ItemType.WHITE_CONCRETE_POWDER, Identifier.fromString("minecraft:white_concrete_powder"))
            register(ItemType.WHITE_DYE, Identifier.fromString("minecraft:white_dye"))
            register(ItemType.WHITE_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:white_glazed_terracotta"))
            register(ItemType.WHITE_SHULKER_BOX, Identifier.fromString("minecraft:white_shulker_box"))
            register(ItemType.WHITE_STAINED_GLASS, Identifier.fromString("minecraft:white_stained_glass"))
            register(ItemType.WHITE_STAINED_GLASS_PANE, Identifier.fromString("minecraft:white_stained_glass_pane"))
            register(ItemType.WHITE_TERRACOTTA, Identifier.fromString("minecraft:white_terracotta"))
            register(ItemType.WHITE_WOOL, Identifier.fromString("minecraft:white_wool"))
            register(
                ItemType.WILD_ARMOR_TRIM_SMITHING_TEMPLATE,
                Identifier.fromString("minecraft:wild_armor_trim_smithing_template")
            )
            register(
                ItemType.WITCH_SPAWN_EGG,
                Identifier.fromString("minecraft:witch_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.WITHER_ROSE, Identifier.fromString("minecraft:wither_rose"))
            register(
                ItemType.WITHER_SKELETON_SPAWN_EGG,
                Identifier.fromString("minecraft:wither_skeleton_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.WITHER_SPAWN_EGG,
                Identifier.fromString("minecraft:wither_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.WOLF_SPAWN_EGG,
                Identifier.fromString("minecraft:wolf_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(ItemType.WOOD, Identifier.fromString("minecraft:wood"))
            register(ItemType.WOODEN_AXE, Identifier.fromString("minecraft:wooden_axe"), ItemWoodenAxe::class.java)
            register(ItemType.WOODEN_BUTTON, Identifier.fromString("minecraft:wooden_button"))
            register(ItemType.WOODEN_DOOR, Identifier.fromString("minecraft:wooden_door"), ItemDoor::class.java)
            register(ItemType.WOODEN_HOE, Identifier.fromString("minecraft:wooden_hoe"), ItemWoodenHoe::class.java)
            register(
                ItemType.WOODEN_PICKAXE,
                Identifier.fromString("minecraft:wooden_pickaxe"),
                ItemWoodenPickaxe::class.java
            )
            register(ItemType.WOODEN_PRESSURE_PLATE, Identifier.fromString("minecraft:wooden_pressure_plate"))
            register(
                ItemType.WOODEN_SHOVEL,
                Identifier.fromString("minecraft:wooden_shovel"),
                ItemWoodenShovel::class.java
            )
            register(ItemType.WOODEN_SLAB, Identifier.fromString("minecraft:wooden_slab"))
            register(
                ItemType.WOODEN_SWORD,
                Identifier.fromString("minecraft:wooden_sword"),
                ItemWoodenSword::class.java
            )
            register(ItemType.WOOL, Identifier.fromString("minecraft:wool"))
            register(ItemType.WRITABLE_BOOK, Identifier.fromString("minecraft:writable_book"))
            register(ItemType.WRITTEN_BOOK, Identifier.fromString("minecraft:written_book"))
            register(ItemType.YELLOW_CANDLE, Identifier.fromString("minecraft:yellow_candle"))
            register(ItemType.YELLOW_CANDLE_CAKE, Identifier.fromString("minecraft:yellow_candle_cake"))
            register(ItemType.YELLOW_CARPET, Identifier.fromString("minecraft:yellow_carpet"))
            register(ItemType.YELLOW_CONCRETE, Identifier.fromString("minecraft:yellow_concrete"))
            register(ItemType.YELLOW_CONCRETE_POWDER, Identifier.fromString("minecraft:yellow_concrete_powder"))
            register(ItemType.YELLOW_DYE, Identifier.fromString("minecraft:yellow_dye"))
            register(ItemType.YELLOW_FLOWER, Identifier.fromString("minecraft:yellow_flower"))
            register(ItemType.YELLOW_GLAZED_TERRACOTTA, Identifier.fromString("minecraft:yellow_glazed_terracotta"))
            register(ItemType.YELLOW_SHULKER_BOX, Identifier.fromString("minecraft:yellow_shulker_box"))
            register(ItemType.YELLOW_STAINED_GLASS, Identifier.fromString("minecraft:yellow_stained_glass"))
            register(ItemType.YELLOW_STAINED_GLASS_PANE, Identifier.fromString("minecraft:yellow_stained_glass_pane"))
            register(ItemType.YELLOW_TERRACOTTA, Identifier.fromString("minecraft:yellow_terracotta"))
            register(ItemType.YELLOW_WOOL, Identifier.fromString("minecraft:yellow_wool"))
            register(
                ItemType.ZOGLIN_SPAWN_EGG,
                Identifier.fromString("minecraft:zoglin_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.ZOMBIE_HORSE_SPAWN_EGG,
                Identifier.fromString("minecraft:zombie_horse_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.ZOMBIE_PIGMAN_SPAWN_EGG,
                Identifier.fromString("minecraft:zombie_pigman_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.ZOMBIE_SPAWN_EGG,
                Identifier.fromString("minecraft:zombie_spawn_egg"),
                ItemSpawnEgg::class.java
            )
            register(
                ItemType.ZOMBIE_VILLAGER_SPAWN_EGG,
                Identifier.fromString("minecraft:zombie_villager_spawn_egg"),
                ItemSpawnEgg::class.java
            )
        }

        private fun register(itemType: ItemType, identifier: Identifier) {
            register(itemType, identifier, null)
        }

        private fun register(itemType: ItemType, identifier: Identifier, itemClass: Class<out JukeboxItem?>?) {
            identifierFromItemType[itemType] = identifier
            itemTypeFromIdentifier[identifier] = itemType
            if (itemClass != null) {
                itemClassFromItemType[itemType] = itemClass
            }
        }

        fun getIdentifier(itemType: ItemType): Identifier {
            return identifierFromItemType[itemType]!!
        }

        fun getItemType(identifier: Identifier): ItemType {
            return itemTypeFromIdentifier[identifier]!!
        }

        fun itemClassExists(itemType: ItemType): Boolean {
            return itemClassFromItemType.containsKey(itemType)
        }

        fun getBlockClass(itemType: ItemType): Class<out JukeboxItem?>? {
            return itemClassFromItemType[itemType]!!
        }

        fun getItemTypeFromIdentifier(): MutableMap<Identifier, ItemType> {
            return this.itemTypeFromIdentifier
        }
    }

}