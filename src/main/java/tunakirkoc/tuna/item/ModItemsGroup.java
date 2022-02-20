package tunakirkoc.tuna.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import tunakirkoc.tuna.Tuna;
import tunakirkoc.tuna.block.ModBlocks;

public class ModItemsGroup {
    public static final ItemGroup TUNA = FabricItemGroupBuilder.build(new Identifier(Tuna.MOD_ID, "tuna"),
            () -> new ItemStack(ModBlocks.CRATE));
}
