package kkaylium.mods.JamOOJam.mobs.HRainbows;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by Kayla Marie on 12/18/2014.
 */
public class ModelHRainbow extends ModelBase
{
    //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;

    public ModelHRainbow()
    {
        textureWidth = 256;
        textureHeight = 128;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(-8F, 0F, -8F, 16, 6, 16);
        Shape1.setRotationPoint(0F, 16F, 0F);
        Shape1.setTextureSize(256, 128);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 66, 0);
        Shape2.addBox(0F, 0F, -5F, 8, 5, 10);
        Shape2.setRotationPoint(8F, 17F, 0F);
        Shape2.setTextureSize(256, 128);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 0, 38);
        Shape3.addBox(-6F, 0F, -5F, 6, 4, 10);
        Shape3.setRotationPoint(-8F, 18F, 0F);
        Shape3.setTextureSize(256, 128);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 104, 0);
        Shape4.addBox(0F, 0F, -4F, 4, 3, 8);
        Shape4.setRotationPoint(16F, 18F, 0F);
        Shape4.setTextureSize(256, 128);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 0, 24);
        Shape5.addBox(-8F, 0F, -5F, 16, 3, 10);
        Shape5.setRotationPoint(0F, 13F, 0F);
        Shape5.setTextureSize(256, 128);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 66, 17);
        Shape6.addBox(0F, 0F, -3F, 7, 2, 6);
        Shape6.setRotationPoint(8F, 15F, 0F);
        Shape6.setTextureSize(256, 128);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 0, 53);
        Shape7.addBox(-4F, 0F, -3F, 4, 3, 6);
        Shape7.setRotationPoint(-8F, 15F, 0F);
        Shape7.setTextureSize(256, 128);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
