package com.jerios.willywonka.enities.projectile;

import com.jerios.willywonka.enities.ExplosiveArrowEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

@SuppressWarnings("unused")
public class CandyExplosiveEntityProjectile extends AbstractArrowEntity {

    public CandyExplosiveEntityProjectile(EntityType<CandyExplosiveEntityProjectile> entityType, World world) {
        super(entityType, world);
    }

    public CandyExplosiveEntityProjectile(EntityType<CandyExplosiveEntityProjectile> entityType, double x, double y, double z, World world) {
        super(entityType, x, y, z, world);
    }

    public CandyExplosiveEntityProjectile(EntityType<CandyExplosiveEntityProjectile> entityType, LivingEntity shooter, World world) {
        super(entityType, shooter, world);
    }



    @Override
    protected void onHitEntity(EntityRayTraceResult ray) {
        super.onHitEntity(ray);
        this.level.explode(this, this.getX(), this.getY(), this.getZ(), 4.0f, true, Explosion.Mode.BREAK);
        BlockState theBlockYouHit = this.level.getBlockState(ray.getEntity().blockPosition());

    }

    @Override
    protected void tickDespawn() {
        if (this.inGroundTime > 60){
            this.level.explode(this, this.getX(), this.getY(), this.getZ(), 4.0f, true, Explosion.Mode.BREAK);
            this.remove();
        }
    }

    @Override
    public IPacket<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }




    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
}
