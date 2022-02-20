package tunakirkoc.tuna.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tunakirkoc.tuna.Tuna;
import tunakirkoc.tuna.item.ModItemsGroup;

public class ModBlocks {

    public static final Block CRATE = registerBlock("crate", new Block(FabricBlockSettings
            .of(Material.WOOD)
            .strength(5.0F, 5.0F)
            .sounds(BlockSoundGroup.WOOD)
            .breakInstantly()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Tuna.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Tuna.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemsGroup.TUNA)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + Tuna.MOD_ID);
    }
}
