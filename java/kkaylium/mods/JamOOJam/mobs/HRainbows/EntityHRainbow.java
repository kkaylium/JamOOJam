package kkaylium.mods.JamOOJam.mobs.HRainbows;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Kayla Marie on 12/18/2014.
 */
public class EntityHRainbow extends EntityAnimal {

    public EntityHRainbow(World world){
        super(world);
        this.setSize(1.0F, 2.0F);
        this.setScale(1.0F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 20.0F));
        this.tasks.addTask(2, new EntityAIWander(this, 10D));
    }

    protected boolean isAIEnabled()
    {
        return true;
    }

    protected void updateAITasks() {
        super.updateAITasks();
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Byte((byte)0));
    }

    @Override
    public EntityAgeable createChild(EntityAgeable p_90011_1_) {
        return null;
    }
}
