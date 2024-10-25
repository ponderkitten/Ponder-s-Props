package net.mcreator.pondersroleplaymod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.pondersroleplaymod.world.inventory.CoffeePage2Menu;
import net.mcreator.pondersroleplaymod.network.CoffeePage2ButtonMessage;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CoffeePage2Screen extends AbstractContainerScreen<CoffeePage2Menu> {
	private final static HashMap<String, Object> guistate = CoffeePage2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_next;
	Button button_back;

	public CoffeePage2Screen(CoffeePage2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ponders_roleplay_mod:textures/screens/coffee_page_2.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("ponders_roleplay_mod:textures/screens/coffeecup.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 7, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("ponders_roleplay_mod:textures/screens/coffeepotfull.png"));
		this.blit(ms, this.leftPos + 141, this.topPos + 7, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_broom"), 42, 7, -15672498);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_the_broom_is_used_for_sweeping_u"), 6, 25, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_up_trash_you_right_click"), 6, 34, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_trash_pile_while_holding_a_broom"), 6, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_broom_to_sweep_it_if_you_have"), 6, 52, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_a_dust_pan_in_your_offhand"), 6, 61, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_will_sweep_the_trash_into_the_du"), 6, 70, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_dustpan_the_dustpan_can_hold"), 6, 79, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_rightclick_the_bucket_with_the"), 6, 106, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_mop"), 6, 115, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_to_boil_after_which_it_will"), 6, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_fill_the_pot"), 6, 97, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.label_pick_up"), 6, 106, -12829636);
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
		button_next = new Button(this.leftPos + 114, this.topPos + 133, 46, 20, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.button_next"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new CoffeePage2ButtonMessage(0, x, y, z));
				CoffeePage2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_next", button_next);
		this.addRenderableWidget(button_next);
		button_back = new Button(this.leftPos + 15, this.topPos + 133, 46, 20, Component.translatable("gui.ponders_roleplay_mod.coffee_page_2.button_back"), e -> {
			if (true) {
				PondersRoleplayModMod.PACKET_HANDLER.sendToServer(new CoffeePage2ButtonMessage(1, x, y, z));
				CoffeePage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
	}
}
