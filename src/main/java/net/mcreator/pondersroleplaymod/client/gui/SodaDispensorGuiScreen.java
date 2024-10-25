package net.mcreator.pondersroleplaymod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.pondersroleplaymod.world.inventory.SodaDispensorGuiMenu;
import net.mcreator.pondersroleplaymod.network.SodaDispensorGuiButtonMessage;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SodaDispensorGuiScreen extends AbstractContainerScreen<SodaDispensorGuiMenu> {
	private final static HashMap<String, Object> guistate = SodaDispensorGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_yellowsoda;
	ImageButton imagebutton_bluesoda;
	ImageButton imagebutton_redsoda;
	ImageButton imagebutton_greensoda;

	public SodaDispensorGuiScreen(SodaDispensorGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ponders_roleplay_mod:textures/screens/soda_dispensor_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_yellowsoda = new ImageButton(this.leftPos + 15, this.topPos + 7, 64, 64, 0, 0, 64, new ResourceLocation("ponders_roleplay_mod:textures/screens/atlas/imagebutton_yellowsoda.png"), 64, 128, e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new SodaDispensorGuiButtonMessage(0, x, y, z));
				SodaDispensorGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_yellowsoda", imagebutton_yellowsoda);
		this.addRenderableWidget(imagebutton_yellowsoda);
		imagebutton_bluesoda = new ImageButton(this.leftPos + 96, this.topPos + 7, 64, 64, 0, 0, 64, new ResourceLocation("ponders_roleplay_mod:textures/screens/atlas/imagebutton_bluesoda.png"), 64, 128, e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new SodaDispensorGuiButtonMessage(1, x, y, z));
				SodaDispensorGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_bluesoda", imagebutton_bluesoda);
		this.addRenderableWidget(imagebutton_bluesoda);
		imagebutton_redsoda = new ImageButton(this.leftPos + 96, this.topPos + 88, 64, 64, 0, 0, 64, new ResourceLocation("ponders_roleplay_mod:textures/screens/atlas/imagebutton_redsoda.png"), 64, 128, e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new SodaDispensorGuiButtonMessage(2, x, y, z));
				SodaDispensorGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_redsoda", imagebutton_redsoda);
		this.addRenderableWidget(imagebutton_redsoda);
		imagebutton_greensoda = new ImageButton(this.leftPos + 15, this.topPos + 88, 64, 64, 0, 0, 64, new ResourceLocation("ponders_roleplay_mod:textures/screens/atlas/imagebutton_greensoda.png"), 64, 128, e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new SodaDispensorGuiButtonMessage(3, x, y, z));
				SodaDispensorGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_greensoda", imagebutton_greensoda);
		this.addRenderableWidget(imagebutton_greensoda);
	}
}
