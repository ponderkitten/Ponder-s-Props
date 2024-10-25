package net.mcreator.pondersroleplaymod.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.world.inventory.PepsiGUIMenu;
import net.mcreator.pondersroleplaymod.world.inventory.CocaColaGUIMenu;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModItems;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;

import io.netty.buffer.Unpooled;

public class SodaMachineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (PondersRoleplayModModItems.MONEYS.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (PondersRoleplayModModBlocks.COCACOLA_MACHINE.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("CocaColaGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new CocaColaGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			} else if (PondersRoleplayModModBlocks.PEPSI_MACHINE.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("PepsiGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new PepsiGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
		}
	}
}
