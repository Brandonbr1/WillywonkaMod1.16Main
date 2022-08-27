
package com.jerios.willywonka.client.enity.render;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.enities.ExplosiveArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;


public class ExplosiveArrowRenderer extends ArrowRenderer<ExplosiveArrowEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(WillyWonka.MOD_ID, "textures/entity/explosive_arrow.png");
    public ExplosiveArrowRenderer(EntityRendererManager p_i46193_1_) {
        super(p_i46193_1_);
    }

    @Override
    public ResourceLocation getTextureLocation(ExplosiveArrowEntity p_110775_1_) {
        return TEXTURE;
    }
}

