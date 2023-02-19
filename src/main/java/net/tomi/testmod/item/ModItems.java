package net.tomi.testmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
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

            public static final RegistryObject<ArmorItem> zircon_chesplate = ITEMS.register("zircon_chestplate",
            () -> new ArmorItem(ArmorMaterials.CHAIN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));

             public static final RegistryObject<ArmorItem> zircon_helmet = ITEMS.register("zircon_helmet",
            () -> new ArmorItem(ArmorMaterials.CHAIN, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));

            public static final RegistryObject<ArmorItem> zircon_leggings = ITEMS.register("zircon_leggings",
            () -> new ArmorItem(ArmorMaterials.CHAIN, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));

            public static final RegistryObject<ArmorItem> ZIRCON_BOOTS = ITEMS.register("zircon_boots",
            () -> new ArmorItem(ArmorMaterials.CHAIN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.ZIRCON_TAB)));

            public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
            }
}
