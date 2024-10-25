
package net.mcreator.pondersroleplaymod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.world.inventory.CocaColaGUIMenu;
import net.mcreator.pondersroleplaymod.procedures.SpriteCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.LemonadeCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.FantaCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.DietCokeCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.DasaniCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.CokecodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.CokeZeroCodeProcedure;
import net.mcreator.pondersroleplaymod.procedures.BRootBeerCodeProcedure;
import net.mcreator.pondersroleplaymod.PondersRoleplayModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CocaColaGUIButtonMessage {
	private final int buttonID, x, y, z;

	public CocaColaGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CocaColaGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CocaColaGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CocaColaGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CocaColaGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SpriteCodeProcedure.execute(entity);
		}
		if (buttonID == 1) {

			FantaCodeProcedure.execute(entity);
		}
		if (buttonID == 2) {

			LemonadeCodeProcedure.execute(entity);
		}
		if (buttonID == 3) {

			DasaniCodeProcedure.execute(entity);
		}
		if (buttonID == 4) {

			BRootBeerCodeProcedure.execute(entity);
		}
		if (buttonID == 5) {

			CokeZeroCodeProcedure.execute(entity);
		}
		if (buttonID == 6) {

			DietCokeCodeProcedure.execute(entity);
		}
		if (buttonID == 7) {

			CokecodeProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PondersRoleplayModMod.addNetworkMessage(CocaColaGUIButtonMessage.class, CocaColaGUIButtonMessage::buffer, CocaColaGUIButtonMessage::new, CocaColaGUIButtonMessage::handler);
	}
}
