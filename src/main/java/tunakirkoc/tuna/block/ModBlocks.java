package tunakirkoc.tuna.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tunakirkoc.tuna.Tuna;

public class ModBlocks {
    public static final Block GRANT_BLOCK = registerBlock("grant_block",
            new Block(FabricBlockSettings.of(Material.DECORATION).strength(5.0F, 5.0F).sounds(BlockSoundGroup.BONE).breakInstantly()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Tuna.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Tuna.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.MISC)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + Tuna.MOD_ID);
    }
}
