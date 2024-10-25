package net.mcreator.pondersroleplaymod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.pondersroleplaymod.world.inventory.IndexMenu;
import net.mcreator.pondersroleplaymod.network.IndexButtonMessage;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class IndexScreen extends AbstractContainerScreen<IndexMenu> {
	private final static HashMap<String, Object> guistate = IndexMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_sample;
	Button button_sample1;
	Button button_sample2;
	Button button_sample3;
	Button button_sample4;
	Button button_sample6;
	Button button_sample7;
	Button button_sample8;
	Button button_sample9;

	public IndexScreen(IndexMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ponders_roleplay_mod:textures/screens/index.png");

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
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.index.label_index"), 75, 6, -12829636);
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
		button_sample = new Button(this.leftPos + 105, this.topPos + 16, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample"), e -> {
		});
		guistate.put("button:button_sample", button_sample);
		this.addRenderableWidget(button_sample);
		button_sample1 = new Button(this.leftPos + 105, this.topPos + 70, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample1"), e -> {
		});
		guistate.put("button:button_sample1", button_sample1);
		this.addRenderableWidget(button_sample1);
		button_sample2 = new Button(this.leftPos + 15, this.topPos + 43, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample2"), e -> {
		});
		guistate.put("button:button_sample2", button_sample2);
		this.addRenderableWidget(button_sample2);
		button_sample3 = new Button(this.leftPos + 105, this.topPos + 97, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample3"), e -> {
		});
		guistate.put("button:button_sample3", button_sample3);
		this.addRenderableWidget(button_sample3);
		button_sample4 = new Button(this.leftPos + 105, this.topPos + 124, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample4"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new IndexButtonMessage(4, x, y, z));
				IndexButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_sample4", button_sample4);
		this.addRenderableWidget(button_sample4);
		button_sample6 = new Button(this.leftPos + 15, this.topPos + 97, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample6"), e -> {
		});
		guistate.put("button:button_sample6", button_sample6);
		this.addRenderableWidget(button_sample6);
		button_sample7 = new Button(this.leftPos + 15, this.topPos + 70, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample7"), e -> {
		});
		guistate.put("button:button_sample7", button_sample7);
		this.addRenderableWidget(button_sample7);
		button_sample8 = new Button(this.leftPos + 105, this.topPos + 43, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample8"), e -> {
		});
		guistate.put("button:button_sample8", button_sample8);
		this.addRenderableWidget(button_sample8);
		button_sample9 = new Button(this.leftPos + 15, this.topPos + 16, 56, 20, Component.translatable("gui.ponders_roleplay_mod.index.button_sample9"), e -> {
		});
		guistate.put("button:button_sample9", button_sample9);
		this.addRenderableWidget(button_sample9);
	}
}
