package net.sapo.toadite.Entity.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.sapo.toadite.Entity.custom.ToadEntity;
import net.sapo.toadite.Toadite;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class ToadModel extends GeoModel<ToadEntity> {
    @Override
    public Identifier getModelResource(ToadEntity animatable) {
        return new Identifier(Toadite.MODID, "geo/toad.geo.json");
    }

    @Override
    public Identifier getTextureResource(ToadEntity animatable) {
        return new Identifier(Toadite.MODID, "textures/entity/toad.png");
    }

    @Override
    public Identifier getAnimationResource(ToadEntity animatable) {
        return new Identifier(Toadite.MODID, "animations/toad.animation.json");
    }
}
