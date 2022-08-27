package com.jerios.willywonka.food;

import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.event.entity.ProjectileImpactEvent;

public class ThrowableItems extends ProjectileImpactEvent.Throwable {
    public ThrowableItems(ThrowableEntity throwable, RayTraceResult ray) {
        super(throwable, ray);
    }
}
