package com.jerios.willywonka.client.enity.render;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.enities.AgressiveOompaLoompaEntity;
import com.jerios.willywonka.client.enity.model.AgressiveOompaLoompaModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AgressiveOompaLoompaRender extends MobRenderer<AgressiveOompaLoompaEntity, AgressiveOompaLoompaModel<AgressiveOompaLoompaEntity>> {
    public AgressiveOompaLoompaRender(EntityRendererManager p_i50961_1_, AgressiveOompaLoompaModel<AgressiveOompaLoompaEntity> p_i50961_2_, float p_i50961_3_) {
        super(p_i50961_1_, p_i50961_2_, p_i50961_3_);
    }

    public static final ResourceLocation TEXTURE = new ResourceLocation(WillyWonka.MOD_ID, "textures/entity/agressiveoomplalumpa");

    @Override
    public ResourceLocation getTextureLocation(AgressiveOompaLoompaEntity p_110775_1_) {
        return TEXTURE;
    }
}
