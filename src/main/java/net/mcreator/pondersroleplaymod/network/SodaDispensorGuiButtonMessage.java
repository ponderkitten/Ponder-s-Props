
package net.mcreator.pondersroleplaymod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.world.inventory.SodaDispensorGuiMenu;
import net.mcreator.pondersroleplaymod.procedures.YellowSodaButtonProcedure;
import net.mcreator.pondersroleplaymod.procedures.RedSodaButtonProcedure;
import net.mcreator.pondersroleplaymod.procedures.GreenSodaButtonProcedure;
import net.mcreator.pondersroleplaymod.procedures.BlueSodaButtonProcedure;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SodaDispensorGuiButtonMessage {
	private final int buttonID, x, y, z;

	public SodaDispensorGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SodaDispensorGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SodaDispensorGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SodaDispensorGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SodaDispensorGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			YellowSodaButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			BlueSodaButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			RedSodaButtonProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			GreenSodaButtonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PondersRoleplayModMod.addNetworkMessage(SodaDispensorGuiButtonMessage.class, SodaDispensorGuiButtonMessage::buffer, SodaDispensorGuiButtonMessage::new, SodaDispensorGuiButtonMessage::handler);
	}
}
