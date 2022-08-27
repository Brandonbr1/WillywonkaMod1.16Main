package com.jerios.willywonka.client.enity.render;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.client.enity.model.NiceWillyWonkaModel;
import com.jerios.willywonka.enities.NiceWillyWonkaEnity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NiceWillyWonkaRender extends MobRenderer<NiceWillyWonkaEnity, NiceWillyWonkaModel<NiceWillyWonkaEnity>> {
    public NiceWillyWonkaRender(EntityRendererManager p_i50961_1_, NiceWillyWonkaModel<NiceWillyWonkaEnity> p_i50961_2_, float p_i50961_3_) {
        super(p_i50961_1_, p_i50961_2_, p_i50961_3_);
    }

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(WillyWonka.MOD_ID, "textures/entity/willywonkanice");


    @Override
    public ResourceLocation getTextureLocation(NiceWillyWonkaEnity p_110775_1_) {
        return TEXTURE;
    }
}
