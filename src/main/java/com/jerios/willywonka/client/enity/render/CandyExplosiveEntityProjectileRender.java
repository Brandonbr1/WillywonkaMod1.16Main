package com.jerios.willywonka.client.enity.render;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.enities.projectile.CandyExplosiveEntityProjectile;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class CandyExplosiveEntityProjectileRender extends ArrowRenderer<CandyExplosiveEntityProjectile> {
    public CandyExplosiveEntityProjectileRender(EntityRendererManager manager) {
        super(manager);
    }
    public static final ResourceLocation TEXTURE = new ResourceLocation(WillyWonka.MOD_ID, "textures/entity/explosive_arrow.png");


    @Override
    public ResourceLocation getTextureLocation(CandyExplosiveEntityProjectile p_110775_1_) {
        return TEXTURE;
    }
}
