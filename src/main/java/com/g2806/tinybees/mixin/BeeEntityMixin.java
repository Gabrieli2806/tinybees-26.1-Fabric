package com.g2806.tinybees.mixin;

import net.minecraft.world.entity.animal.bee.Bee;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Bee.class)
public class BeeEntityMixin {
	@Inject(at = @At("TAIL"), method = "<init>")
	private void onInit(CallbackInfo info) {
		((Bee) (Object) this).setBaby(true);
	}
}
