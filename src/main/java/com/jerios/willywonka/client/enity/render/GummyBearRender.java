package com.jerios.willywonka.client.enity.render;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.client.enity.model.GummyBearModel;
import com.jerios.willywonka.enities.GummyBearEnity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GummyBearRender extends MobRenderer<GummyBearEnity, GummyBearModel<GummyBearEnity>> {

    public GummyBearRender(EntityRendererManager p_i50961_1_, GummyBearModel<GummyBearEnity> p_i50961_2_, float p_i50961_3_) {
        super(p_i50961_1_, p_i50961_2_, p_i50961_3_);
    }

    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(WillyWonka.MOD_ID, "textures/entity/gummybear_enity");



    @Override
    public ResourceLocation getTextureLocation(GummyBearEnity p_110775_1_) {
        return TEXTURE;
    }
}
