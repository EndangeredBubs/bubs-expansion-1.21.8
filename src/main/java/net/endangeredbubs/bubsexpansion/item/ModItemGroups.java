package net.endangeredbubs.bubsexpansion.item;

import net.endangeredbubs.bubsexpansion.BubsExpansion;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> BUBS_EXPANSION_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(BubsExpansion.MOD_ID, "bubs_expansion_item_group"));

    public static final ItemGroup BUBS_EXPANSION_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.WOODEN_GEAR))
            .displayName(Text.translatable("itemGroup.bubsexpansion"))
            .build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, BUBS_EXPANSION_ITEM_GROUP_KEY, BUBS_EXPANSION_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(BUBS_EXPANSION_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.WOODEN_GEAR);
        });
    }
}
