package kkaylium.mods.JamOOJam.mobs.HRainbows;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kayla Marie on 12/18/2014.
 */
public class RenderHRainbow extends RenderLiving {

    ResourceLocation texture = new ResourceLocation("rainbows", "/models/hrainbow.png");

    public RenderHRainbow(ModelBase modelBase, float f) {
        super(modelBase, f);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return texture;
    }
}
