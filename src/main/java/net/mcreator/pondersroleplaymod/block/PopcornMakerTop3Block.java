
package net.mcreator.pondersroleplaymod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.pondersroleplaymod.procedures.PopcornmakerOnBlockRightClickedProcedure;
import net.mcreator.pondersroleplaymod.procedures.PopcornMakerBlockAddedProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModParticleTypes;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlocks;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlockEntities;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;

public class PopcornMakerTop3Block extends BaseEntityBlock implements EntityBlock {
	public static final IntegerProperty ANIMATION = IntegerProperty.create("animation", 0, (int) 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public PopcornMakerTop3Block() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return PondersRoleplayModModBlockEntities.POPCORN_MAKER_TOP_3.get().create(blockPos, blockState);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 0, 2, 16, 16), box(0, 0, 0, 16, 16, 2), box(0, 14, 0, 16, 16, 16), box(4, 7, 4, 12, 10, 12), box(7.5, 8, 7.5, 8.5, 16, 8.5), box(3, 0, 3, 13, 2, 13));
			case NORTH -> Shapes.or(box(14, 0, 0, 16, 16, 16), box(0, 0, 14, 16, 16, 16), box(0, 14, 0, 16, 16, 16), box(4, 7, 4, 12, 10, 12), box(7.5, 8, 7.5, 8.5, 16, 8.5), box(3, 0, 3, 13, 2, 13));
			case EAST -> Shapes.or(box(0, 0, 14, 16, 16, 16), box(0, 0, 0, 2, 16, 16), box(0, 14, 0, 16, 16, 16), box(4, 7, 4, 12, 10, 12), box(7.5, 8, 7.5, 8.5, 16, 8.5), box(3, 0, 3, 13, 2, 13));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 16, 2), box(14, 0, 0, 16, 16, 16), box(0, 14, 0, 16, 16, 16), box(4, 7, 4, 12, 10, 12), box(7.5, 8, 7.5, 8.5, 16, 8.5), box(3, 0, 3, 13, 2, 13));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(ANIMATION, FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(PondersRoleplayModModBlocks.POPCORNMAKERTOP_1.get());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(PondersRoleplayModModBlocks.POPCORNMAKERTOP_1.get()));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		PopcornMakerBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 40; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.1D;
			double dy = (random.nextFloat() - 0.5D) * 0.1D;
			double dz = (random.nextFloat() - 0.5D) * 0.1D;
			world.addParticle((SimpleParticleType) (PondersRoleplayModModParticleTypes.POPCORN_PARTICLE.get()), x0, y0, z0, dx, dy, dz);
		}
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();

		PopcornmakerOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
