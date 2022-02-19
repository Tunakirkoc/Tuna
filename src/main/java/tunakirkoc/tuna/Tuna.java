package tunakirkoc.tuna;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tuna implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("tuna");

	// instance of the item
	public static final Item GRANT = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Block GRANT_BLOCK = new Block(FabricBlockSettings.of(Material.DECORATION).strength(5.0F, 5.0F).sounds(BlockSoundGroup.BONE).breakInstantly());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		// Init the item
		Registry.register(Registry.ITEM, new Identifier("tuna", "grant"), GRANT);
		Registry.register(Registry.BLOCK, new Identifier("tuna", "grant_block"), GRANT_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("tuna", "grant_block"), new BlockItem(GRANT_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
	}
}
