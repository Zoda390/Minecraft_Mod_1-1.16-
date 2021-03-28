package com.turtywurty.tutorialmod.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {

	public static final Food EXAMPLE_FOOD = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.SPEED, 100, 2), 0.5f)
			.effect(() -> new EffectInstance(Effects.POISON, 60), 0.05f).fastToEat().hunger(2).saturation(0.2f)
			.setAlwaysEdible().build();

	public static final Food ICE_CREAM = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.POISON, 10, 2),0.5f)
			.effect(() -> new EffectInstance(Effects.SLOWNESS, 100, 5),0.2f)
			.effect(() -> new EffectInstance(Effects.SLOW_FALLING, 150, 2),0.5f)
			.hunger(10).build();

	public static final Food CHOCOLATE_ICE_CREAM = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.POISON, 10, 2),0.5f)
			.effect(() -> new EffectInstance(Effects.SLOWNESS, 100, 5),0.2f)
			.effect(() -> new EffectInstance(Effects.SLOW_FALLING, 200, 2),0.7f)
			.hunger(12).build();

	public static final Food STRAWBERRY_ICE_CREAM = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.POISON, 10, 2),0.5f)
			.effect(() -> new EffectInstance(Effects.SLOWNESS, 100, 5),0.2f)
			.effect(() -> new EffectInstance(Effects.SLOW_FALLING, 200, 2),0.7f)
			.hunger(12).build();
}
