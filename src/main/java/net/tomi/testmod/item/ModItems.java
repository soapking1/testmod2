package net.tomi.testmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tomi.testmod.testmod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, testmod.MOD_ID);

            public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));
            public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));
            public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));
            public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));
            public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));
            public static final RegistryObject<Item> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));
            public static final RegistryObject<Item> ZIRCON_BOOTS = ITEMS.register("zircon_boots",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));



            public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
            }
}
