package net.wickedkane.MatchaMod.item;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wickedkane.MatchaMod.MatchaMod;
import net.wickedkane.MatchaMod.block.ModBlocks;


import static net.minecraft.world.item.Items.registerBlock;

public class ModItems {
    // holds all items duh tf
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MatchaMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", // Item one
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MATCHA_COOKIE = ITEMS.register("matcha_cookie",
            () -> new Item(new Item.Properties().food(ModFoods.MATCHA_COOKIE)));

    public static final RegistryObject<Item> MATCHA_POWDER = ITEMS.register("matcha_powder",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
