package net.sapo.toadite.Entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.sapo.toadite.Entity.custom.ToadEntity;
import net.sapo.toadite.Toadite;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ToadRenderer extends GeoEntityRenderer<ToadEntity> {
    public ToadRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new ToadModel());
    }

    @Override
    public Identifier getTextureLocation(ToadEntity animatable) {
        return new Identifier(Toadite.MODID, "textures/entity/toad.png");
    }

    @Override
    public void render(ToadEntity entity, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
