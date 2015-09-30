package com.thedoctorsoda.sodacantorches.client.renderer.item;

import com.thedoctorsoda.sodacantorches.client.BlockRendererHelper;
import com.thedoctorsoda.sodacantorches.client.OpenGLHelper;
import com.thedoctorsoda.sodacantorches.init.ModBlocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;

/**
 * Gany's Surface
 *
 * @author ganymedes01
 *
 */

@SideOnly(Side.CLIENT)
public class StoneFlowerPotRender implements IItemRenderer {

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type != ItemRenderType.FIRST_PERSON_MAP;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack stack, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack stack, Object... data) {
		Object renderer = data[0];
		if (renderer instanceof RenderBlocks)
			switch (type) {
			case ENTITY:
				render(stack, -0.5F, 0.0F, -0.5F, (RenderBlocks) renderer);
				break;
			case EQUIPPED:
				render(stack, 0.0F, 0.25F, 0.0F, (RenderBlocks) renderer);
				break;
			case EQUIPPED_FIRST_PERSON:
				OpenGLHelper.scale(2, 2, 2);
				render(stack, 0.0F, 0.0F, -0.25F, (RenderBlocks) renderer);
				break;
			case INVENTORY:
				OpenGLHelper.scale(1.5, 1.5, 1.5);
				render(stack, -0.5F, -0.25F, -0.5F, (RenderBlocks) renderer);
				break;
			default:
				break;
			}
	}

	private void render(ItemStack stack, float x, float y, float z, RenderBlocks renderer) {
		OpenGLHelper.pushMatrix();
		OpenGLHelper.translate(x, y, z);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(TextureMap.locationBlocksTexture);

		OpenGLHelper.translate(0.5F, 0.5F, 0.5F);
		float f = 0.375F;
		float f1 = f / 2.0F;
		renderer.setRenderBounds(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f, 0.5F + f1);
		BlockRendererHelper.renderSimpleBlock(ModBlocks.stone_flowerpot, 0, renderer);

		OpenGLHelper.translate(-0.5F, -0.5F, -0.5F);
		OpenGLHelper.disableLighting();
		float f3 = 0.1865F;
		IIcon iicon = renderer.getBlockIconFromSide(ModBlocks.stone_flowerpot, 0);
		Tessellator.instance.startDrawingQuads();
		renderer.renderFaceXPos(ModBlocks.stone_flowerpot, 0 - 0.5F + f3, 0, 0, iicon);
		renderer.renderFaceXNeg(ModBlocks.stone_flowerpot, 0 + 0.5F - f3, 0, 0, iicon);
		renderer.renderFaceZPos(ModBlocks.stone_flowerpot, 0, 0, 0 - 0.5F + f3, iicon);
		renderer.renderFaceZNeg(ModBlocks.stone_flowerpot, 0, 0, 0 + 0.5F - f3, iicon);
		renderer.renderFaceYPos(ModBlocks.stone_flowerpot, 0, 0 - 0.5F + f3 + 0.1875F, 0, renderer.getBlockIcon(Blocks.dirt));
		Tessellator.instance.draw();
		OpenGLHelper.enableLighting();

		OpenGLHelper.popMatrix();
	}
}