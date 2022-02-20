package tunakirkoc.tuna;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class food {
    public static final FoodComponent BITE = (new FoodComponent.Builder()).hunger(2).saturationModifier(.3F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 10), 0.8F).snack().build(); 
}
