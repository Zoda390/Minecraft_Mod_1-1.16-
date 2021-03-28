package com.turtywurty.tutorialmod.core.init;

import com.turtywurty.tutorialmod.TutorialMod;
import com.turtywurty.tutorialmod.common.items.ModSpawnEgg;
import com.turtywurty.tutorialmod.common.items.SpecialItem;

import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			TutorialMod.MOD_ID);

	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
			() -> new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item",
			() -> new SpecialItem(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)
					.addToolType(ToolType.SHOVEL, 5).maxDamage(200).rarity(Rarity.EPIC).isImmuneToFire()));

	public static final RegistryObject<Item> EXAMPLE_FOOD = ITEMS.register("example_food",
			() -> new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP).food(FoodInit.EXAMPLE_FOOD)));

	// Block Items
	public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
			() -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
					new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<BlockItem> EXAMPLE_ORE = ITEMS.register("example_ore",
			() -> new BlockItem(BlockInit.EXAMPLE_ORE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () ->
			new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () ->
			new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () ->
			new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> SILVER_ORE = ITEMS.register("silver_ore",
			() -> new BlockItem(BlockInit.SILVER_ORE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> SILVER_BLOCK = ITEMS.register("silver_block",
			() -> new BlockItem(BlockInit.SILVER_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> COPPER_ORE = ITEMS.register("copper_ore",
			() -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> COPPER_BLOCK = ITEMS.register("copper_block",
			() -> new BlockItem(BlockInit.COPPER_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> URANIUM_ORE = ITEMS.register("uranium_ore",
			() -> new BlockItem(BlockInit.URANIUM_ORE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> URANIUM_BLOCK = ITEMS.register("uranium_block",
			() -> new BlockItem(BlockInit.URANIUM_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () ->
			new PickaxeItem(ItemTier.IRON, 1, 3, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->
			new PickaxeItem(ItemTier.IRON, 2, 1, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<PickaxeItem> URANIUM_PICKAXE = ITEMS.register("uranium_pickaxe", () ->
			new PickaxeItem(ItemTier.IRON, 3, 0, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () ->
			new AxeItem(ItemTier.IRON, 1, 3, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () ->
			new AxeItem(ItemTier.IRON, 2, 1, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<AxeItem> URANIUM_AXE = ITEMS.register("uranium_axe", () ->
			new AxeItem(ItemTier.IRON, 3, 0, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () ->
			new ShovelItem(ItemTier.IRON, 1, 3, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->
			new ShovelItem(ItemTier.IRON, 2, 1, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<ShovelItem> URANIUM_SHOVEL = ITEMS.register("uranium_shovel", () ->
			new ShovelItem(ItemTier.IRON, 3, 0, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () ->
			new HoeItem(ItemTier.IRON, 1, 3, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () ->
			new HoeItem(ItemTier.IRON, 2, 1, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<HoeItem> URANIUM_HOE = ITEMS.register("uranium_hoe", () ->
			new HoeItem(ItemTier.IRON, 3, 0, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () ->
			new SwordItem(ItemTier.IRON, 1, 3, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () ->
			new SwordItem(ItemTier.IRON, 2, 1, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<SwordItem> URANIUM_SWORD = ITEMS.register("uranium_sword", () ->
			new SwordItem(ItemTier.IRON, 3, 0, new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<Item> ICE_CREAM = ITEMS.register("ice_cream", () ->
			new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP).food(FoodInit.ICE_CREAM)));
	public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () ->
			new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP).food(FoodInit.CHOCOLATE_ICE_CREAM)));
	public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () ->
			new Item(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP).food(FoodInit.STRAWBERRY_ICE_CREAM)));
	public static final RegistryObject<BlockItem> SILVER_WEAPON_CRAFTER = ITEMS.register("silver_weapon_crafter",
			() -> new BlockItem(BlockInit.SILVER_WEAPON_CRAFTER.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<BlockItem> DISPLAY_CASE = ITEMS.register("display_case",
			() -> new BlockItem(BlockInit.DISPLAY_CASE.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
	public static final RegistryObject<Item> LIGHT_CUBE_SPAWN_EGG = ITEMS.register("light_cube_spawn_egg",
			() -> new ModSpawnEgg(new Item.Properties().group(TutorialMod.TUTORIAL_GROUP),
					() -> EntityTypeInit.LIGHT_CUBE.get()));

	public static final RegistryObject<BlockItem> CUSTOM_BLOCK = ITEMS.register("custom_block",
			() -> new BlockItem(BlockInit.CUSTOM_BLOCK.get(), new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));

	public static final RegistryObject<BlockItem> CUSTOM_BLOCK2 = ITEMS.register("custom_block2",
			() -> new BlockItem(BlockInit.CUSTOM_BLOCK2.get(),
					new Item.Properties().group(TutorialMod.TUTORIAL_GROUP)));
}
