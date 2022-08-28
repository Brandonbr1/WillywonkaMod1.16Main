
package com.jerios.willywonka.register;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.food.FizzyLiftingDrinkItem;
import com.jerios.willywonka.food.JawBreakerItem;
import com.jerios.willywonka.food.ModFoodBase;
import com.jerios.willywonka.items.custom.GoodSpeedBadSlowItem;
import com.jerios.willywonka.items.custom.RegisterExplosiveArrow;
import com.jerios.willywonka.liquid.ModLiquid;
import com.jerios.willywonka.util.ModItemGroup;
import com.jerios.willywonka.util.ModItemTier;
import com.jerios.willywonka.util.ModMaterialArmor;
import com.jerios.willywonka.util.ModSpawnEggItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings({"unused"})
public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WillyWonka.MOD_ID);

    public static final RegistryObject<Item> CHOCLATEBAR = ITEMS.register("choclatebar",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).food(ModFoodBase.CHOCLATE_BAR).stacksTo(1).food(ModFoodBase.CHOCLATE_BAR)  ));

    public static final RegistryObject<Item> GOLDENTICKET = ITEMS.register( "goldenticket", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)));

    public static final RegistryObject<Item> CHOCLATEBUCKET = ITEMS.register("chocolate_bucket",
            () -> new BucketItem(() -> ModLiquid.CHOCLATE_FLUID.get(),
                    new Item.Properties().stacksTo(1).tab(ModItemGroup.WILLYWONKA_GROUP)));

    // food

    public static final RegistryObject<Item> SUGARGRASS = ITEMS.register( "tall_sugar_grass", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR) ));

    public static final RegistryObject<Item> EDIBLE_GRASS = ITEMS.register( "edible_grass", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR) ));

    public static final RegistryObject<Item> TAFFY = ITEMS.register( "taffy", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR).food(ModFoodBase.FAST_FOOD)));

    public static final RegistryObject<Item> JAWBREAKER = ITEMS.register( "jawbreaker", () -> new JawBreakerItem(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64)));

    public static final RegistryObject<Item> InfiniCandy = ITEMS.register( "infinicandy", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.INFINI_STUUF)));

    public static final RegistryObject<Item> EXPLOSIVE_ARROW = ITEMS.register("explosive_arrow",
            () -> new RegisterExplosiveArrow(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP)));

    public static final RegistryObject<Item> GummyBear = ITEMS.register( "gummybear", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.FAST_FOOD)));

    public static final RegistryObject<Item> LOLLYPOP3DITEM = ITEMS.register( "lollypop3ditemversion", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR)));

    // tools

    public static final RegistryObject<Item> CHOCLATE_SWORD = ITEMS.register("choclate_sword",
            () -> new GoodSpeedBadSlowItem(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)));

    public static final RegistryObject<Item> CHOCLATE_PICKAXE = ITEMS.register("choclate_pickaxe",
            () -> new PickaxeItem(ModItemTier.CHOCLATETEIR, 0, -2f,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> CHOCLATE_SHOVEL = ITEMS.register("choclate_shovel",
            () -> new ShovelItem(ModItemTier.CHOCLATETEIR, 0, -2f,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)   ));

    public static final RegistryObject<Item> CHOCLATE_AXE = ITEMS.register("choclate_axe",
            () -> new AxeItem(ModItemTier.CHOCLATETEIR, 4, -6f,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)  ));

    public static final RegistryObject<Item> CHOCLATE_HOE = ITEMS.register("choclate_hoe",
            () -> new HoeItem(ModItemTier.CHOCLATETEIR, 0, 0f,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));


    // armor

    public static final RegistryObject<Item> PEARL_BOOTS = ITEMS.register("choclate_boots",
            () -> new ArmorItem(ModMaterialArmor.CHOCLATEARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> PEARL_CHESTPLATE = ITEMS.register("choclate_chestplate",
            () -> new ArmorItem(ModMaterialArmor.CHOCLATEARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> PEARL_LEGGINGS = ITEMS.register("choclate_leggings",
            () -> new ArmorItem(ModMaterialArmor.CHOCLATEARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> PEARL_HELMET = ITEMS.register("choclate_helmet",
            () -> new ArmorItem(ModMaterialArmor.CHOCLATEARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    // jaw breaker armor
    // jaw breaker armor
    // jaw breaker armor


    public static final RegistryObject<Item> JAWBREAKER_BOOTS = ITEMS.register("jawbreaker_boots",
            () -> new ArmorItem(ModMaterialArmor.JAWBREAKERMATERIAL, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> JAWBREAKER_CHESTPLATE = ITEMS.register("jawbreaker_chestplate",
            () -> new ArmorItem(ModMaterialArmor.JAWBREAKERMATERIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> JAWBREAKER_LEGGINGS = ITEMS.register("jawbreaker_leggings",
            () -> new ArmorItem(ModMaterialArmor.JAWBREAKERMATERIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> JAWBREAKER_HELMET = ITEMS.register("jawbreaker_helmet",
            () -> new ArmorItem(ModMaterialArmor.JAWBREAKERMATERIAL, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> OATS = ITEMS.register("oats",
            () -> new BlockItem(ModBlocks.CANDYCANECROP.get(), new Item.Properties()
                    .food(new Food.Builder().nutrition(1).saturationMod(0.1f).fast().build())
                    .tab(ModItemGroup.WILLYWONKA_GROUP)));

    public static final RegistryObject<Item> CHOCLATE_BOW = ITEMS.register("choclate_bow",
            () -> new BowItem(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)));

    public static final RegistryObject<Item> FIZZYDRINK = ITEMS.register("fizzy_drink",
            () -> new FizzyLiftingDrinkItem(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP)));

    public static final RegistryObject<Item> EXPLOSIVECANDY = ITEMS.register("explosive_candy",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP)));



    public static final RegistryObject<Item> GOLDEN_EGG = ITEMS.register("golden_egg",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1).food(ModFoodBase.FAST_FOOD)));


    // spawn eggs

    public static final RegistryObject<ModSpawnEggItem> GUMMY_BEAR_SPAWN_EGG = ITEMS.register("gummy_bear_spawn_egg",
            () -> new ModSpawnEggItem(ModEnityType.GUMMYBEAR, 0x464F56, 0x1D6336,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

