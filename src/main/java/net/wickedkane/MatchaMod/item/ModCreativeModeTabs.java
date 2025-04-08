package net.wickedkane.MatchaMod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wickedkane.MatchaMod.MatchaMod;
import net.wickedkane.MatchaMod.block.ModBlocks;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MatchaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("matcha_tab",
            // Adds items to creative mode tab
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.matcha_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        ModItems.ITEMS.getEntries().forEach(item -> {
                            pOutput.accept(item.get());
                            // needs to be updated for blocks to appear in creative tab in da loop   x
                            pOutput.accept(ModBlocks.EVIL_BLOCK.get());
                        });
                        ModBlocks.BLOCKS.getEntries().forEach(blockRegistryObject-> {
                            pOutput.accept(blockRegistryObject.get().asItem());
                        });
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
