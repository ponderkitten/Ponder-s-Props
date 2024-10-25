
package net.mcreator.pondersroleplaymod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.world.inventory.PepsiGUIMenu;
import net.mcreator.pondersroleplaymod.procedures.SevenUpCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.PepsiCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.MountainDewCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.DrPepperCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.DietPepsiCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.DietDrPepperCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.CherryPepsiCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.AWRootBeerCodeProcedure;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PepsiGUIButtonMessage {
	private final int buttonID, x, y, z;

	public PepsiGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PepsiGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PepsiGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PepsiGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = PepsiGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			DietDrPepperCodeProcedure.execute(entity);
		}
		if (buttonID == 1) {

			MountainDewCodeProcedure.execute(entity);
		}
		if (buttonID == 2) {

			AWRootBeerCodeProcedure.execute(entity);
		}
		if (buttonID == 3) {

			SevenUpCodeProcedure.execute(entity);
		}
		if (buttonID == 4) {

			DrPepperCodeProcedure.execute(entity);
		}
		if (buttonID == 5) {

			CherryPepsiCodeProcedure.execute(entity);
		}
		if (buttonID == 6) {

			DietPepsiCodeProcedure.execute(entity);
		}
		if (buttonID == 7) {

			PepsiCodeProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PondersRoleplayModMod.addNetworkMessage(PepsiGUIButtonMessage.class, PepsiGUIButtonMessage::buffer, PepsiGUIButtonMessage::new, PepsiGUIButtonMessage::handler);
	}
}
