
package com.jerios.willywonka.blocks;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.items.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, WillyWonka.MOD_ID);


    public static final RegistryObject<Block> LOLLYPOP3DVERSION = BLOCKS.register("lollypop3dversion",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL).harvestLevel(4)));

    public static final RegistryObject<Block> HARDENEDCHOCLATE = BLOCKS.register("hardenedchoclate",
            () -> new ModHardenedChoclateBlock(AbstractBlock.Properties.of(Material.WOOL).harvestLevel(2)));

    public static final RegistryObject<Block> SUGARGRASS = BLOCKS.register("tall_sugar_grass",
            () -> new TallGrassBlock(AbstractBlock.Properties.of(Material.GRASS).instabreak()));

    public static final RegistryObject<Block> EDIBLE_GRASS = BLOCKS.register("edible_grass",
            () -> new TallGrassBlock(AbstractBlock.Properties.of(Material.GRASS).instabreak()));

    public static final RegistryObject<Block> TAFFY_BLOCK = BLOCKS.register("taffy_block",
            () -> new Block(AbstractBlock.Properties.of(Material.GRASS).instabreak()));

    public static final RegistryObject<Block> TAFFY_ORE = BLOCKS.register("taffy_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)));

    public static final RegistryObject<Block> JAWBREAKER_ORE = BLOCKS.register("jawbreaker_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> RAINBOW_LOLLYPOP_BLOCK = BLOCKS.register("rainbow_lollypop",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD).harvestLevel((int) 2F).randomTicks()));

    public static final RegistryObject<Block> JAW_BREAKER_BLOCK = BLOCKS.register("jaw_breaker_block",
            () -> new Block(AbstractBlock.Properties.of(Material.GRASS).harvestLevel((int) 50F)));


    public static final RegistryObject<Block> LOLLYPOP_STICK = BLOCKS.register("lollypop_stick",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL).instabreak()));

    // custom blocks

    public static final RegistryObject<Block> GOLDEN_EGG = BLOCKS.register("golden_egg",
            () -> new ModGoldenEgg(AbstractBlock.Properties.of(Material.HEAVY_METAL)));

    public static final RegistryObject<Block> LICKABLEBANANABLOCKLICKABLE = BLOCKS.register("banana_blocks",
            () -> new ModLickableBananaBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL)));

    public static final RegistryObject<Block> SUGARFLOWER = registerBlock("sugar_flower",
            () -> new FlowerBlock(Effects.ABSORPTION, 2, AbstractBlock.Properties.of(Material.GRASS)));

    public static final RegistryObject<Block> CANDYCANECROP = BLOCKS.register("candy_cane_crop",
            () -> new CandyBlock(AbstractBlock.Properties.of(Material.GRASS)));

    public static final RegistryObject<Block> LICKABLECARROTBLOCKLICKABLE = BLOCKS.register("carrot_blocks",
            () -> new ModLickableCarrotBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL)));

    public static final RegistryObject<Block> SNOZBERRYBLOCKLICKABLE = BLOCKS.register("snozberry_blocks",
            () -> new ModLickableSnozberries(AbstractBlock.Properties.of(Material.HEAVY_METAL)));

    public static final RegistryObject<Block> STRAWBERRYBLOCKLICKABLE = BLOCKS.register("strawberry_blocks",
            () -> new ModLickableStrawberryBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL)));




    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static  <T extends  Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties() ));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

