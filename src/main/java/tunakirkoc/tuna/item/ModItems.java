package tunakirkoc.tuna.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tunakirkoc.tuna.Tuna;

public class ModItems {

    public static final Item STONE_HAMMER = registerItem("stone_hammer", new Item(new Item.Settings()
            .group(ModItemsGroup.TUNA)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Tuna.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Tuna.MOD_ID);
    }
}
