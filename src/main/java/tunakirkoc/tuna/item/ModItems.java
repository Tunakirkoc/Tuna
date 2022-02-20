package tunakirkoc.tuna.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tunakirkoc.tuna.Tuna;

public class ModItems {

    public static final Item GRANT = registerItem("grant",
            new Item(new Item.Settings().group(ItemGroup.MISC)));

    public static final Item BITE = registerItem("bite",new Item(new Item.Settings()
        .food(new FoodComponent.Builder().hunger(2).saturationModifier(.3F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 10), 0.8F).snack().build())
        .group(ItemGroup.FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Tuna.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Tuna.MOD_ID);
    }

    // public static final Block GRANT_BLOCK = new
    // Block(FabricBlockSettings.of(Material.DECORATION).strength(5.0F, 5.0F).sounds(BlockSoundGroup.BONE).breakInstantly());

    // Registry.register(Registry.BLOCK, new Identifier("tuna", "grant_block"), GRANT_BLOCK);
    // Registry.register(Registry.ITEM, new Identifier("tuna", "grant_block"),new BlockItem(GRANT_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
}
