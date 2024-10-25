package net.mcreator.pondersroleplaymod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.pondersroleplaymod.world.inventory.PepsiGUIMenu;
import net.mcreator.pondersroleplaymod.network.PepsiGUIButtonMessage;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PepsiGUIScreen extends AbstractContainerScreen<PepsiGUIMenu> {
	private final static HashMap<String, Object> guistate = PepsiGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_diet_dr_pepper;
	Button button_diet_dr_pepper1;
	Button button_diet_dr_pepper2;
	Button button_diet_dr_pepper3;
	Button button_diet_dr_pepper4;
	Button button_diet_dr_pepper5;
	Button button_diet_dr_pepper6;
	Button button_diet_dr_pepper7;

	public PepsiGUIScreen(PepsiGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ponders_roleplay_mod:textures/screens/pepsi_gui.png");

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
		button_diet_dr_pepper = new Button(this.leftPos + 42, this.topPos + 79, 98, 20, Component.translatable("gui.ponders_roleplay_mod.pepsi_gui.button_diet_dr_pepper"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new PepsiGUIButtonMessage(0, x, y, z));
				PepsiGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_diet_dr_pepper", button_diet_dr_pepper);
		this.addRenderableWidget(button_diet_dr_pepper);
		button_diet_dr_pepper1 = new Button(this.leftPos + 42, this.topPos + 97, 98, 20, Component.translatable("gui.ponders_roleplay_mod.pepsi_gui.button_diet_dr_pepper1"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new PepsiGUIButtonMessage(1, x, y, z));
				PepsiGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_diet_dr_pepper1", button_diet_dr_pepper1);
		this.addRenderableWidget(button_diet_dr_pepper1);
		button_diet_dr_pepper2 = new Button(this.leftPos + 42, this.topPos + 115, 98, 20, Component.translatable("gui.ponders_roleplay_mod.pepsi_gui.button_diet_dr_pepper2"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new PepsiGUIButtonMessage(2, x, y, z));
				PepsiGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_diet_dr_pepper2", button_diet_dr_pepper2);
		this.addRenderableWidget(button_diet_dr_pepper2);
		button_diet_dr_pepper3 = new Button(this.leftPos + 42, this.topPos + 133, 98, 20, Component.translatable("gui.ponders_roleplay_mod.pepsi_gui.button_diet_dr_pepper3"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new PepsiGUIButtonMessage(3, x, y, z));
				PepsiGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_diet_dr_pepper3", button_diet_dr_pepper3);
		this.addRenderableWidget(button_diet_dr_pepper3);
		button_diet_dr_pepper4 = new Button(this.leftPos + 42, this.topPos + 61, 98, 20, Component.translatable("gui.ponders_roleplay_mod.pepsi_gui.button_diet_dr_pepper4"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new PepsiGUIButtonMessage(4, x, y, z));
				PepsiGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_diet_dr_pepper4", button_diet_dr_pepper4);
		this.addRenderableWidget(button_diet_dr_pepper4);
		button_diet_dr_pepper5 = new Button(this.leftPos + 42, this.topPos + 43, 98, 20, Component.translatable("gui.ponders_roleplay_mod.pepsi_gui.button_diet_dr_pepper5"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new PepsiGUIButtonMessage(5, x, y, z));
				PepsiGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_diet_dr_pepper5", button_diet_dr_pepper5);
		this.addRenderableWidget(button_diet_dr_pepper5);
		button_diet_dr_pepper6 = new Button(this.leftPos + 42, this.topPos + 25, 98, 20, Component.translatable("gui.ponders_roleplay_mod.pepsi_gui.button_diet_dr_pepper6"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new PepsiGUIButtonMessage(6, x, y, z));
				PepsiGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_diet_dr_pepper6", button_diet_dr_pepper6);
		this.addRenderableWidget(button_diet_dr_pepper6);
		button_diet_dr_pepper7 = new Button(this.leftPos + 42, this.topPos + 7, 98, 20, Component.translatable("gui.ponders_roleplay_mod.pepsi_gui.button_diet_dr_pepper7"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new PepsiGUIButtonMessage(7, x, y, z));
				PepsiGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:button_diet_dr_pepper7", button_diet_dr_pepper7);
		this.addRenderableWidget(button_diet_dr_pepper7);
	}
}
