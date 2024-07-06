
package net.mcreator.pondersroleplaymod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
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
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.pondersroleplaymod.procedures.SodaDispensorOnBlockRightClickedProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlockEntities;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;

public class SodaDispensorBlock extends BaseEntityBlock implements EntityBlock {
	public static final IntegerProperty ANIMATION = IntegerProperty.create("animation", 0, (int) 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public SodaDispensorBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public RenderShape getRenderShape(BlockState state) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return PondersRoleplayModModBlockEntities.SODA_DISPENSOR.get().create(blockPos, blockState);
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
			default -> Shapes.or(box(0, 0, 0, 16, 1, 12), box(0, 1, 0, 16, 12, 6), box(0, 7, 6, 16, 12, 11), box(1, 6, 8, 3, 7, 10), box(5, 6, 8, 7, 7, 10), box(9, 6, 8, 11, 7, 10), box(13, 6, 8, 15, 7, 10), box(0, 1, 11, 16, 2, 12),
					box(0, 1, 6, 16, 2, 7), box(15, 1, 7, 16, 2, 11), box(0, 1, 7, 1, 2, 11));
			case NORTH -> Shapes.or(box(0, 0, 4, 16, 1, 16), box(0, 1, 10, 16, 12, 16), box(0, 7, 5, 16, 12, 10), box(13, 6, 6, 15, 7, 8), box(9, 6, 6, 11, 7, 8), box(5, 6, 6, 7, 7, 8), box(1, 6, 6, 3, 7, 8), box(0, 1, 4, 16, 2, 5),
					box(0, 1, 9, 16, 2, 10), box(0, 1, 5, 1, 2, 9), box(15, 1, 5, 16, 2, 9));
			case EAST -> Shapes.or(box(0, 0, 0, 12, 1, 16), box(0, 1, 0, 6, 12, 16), box(6, 7, 0, 11, 12, 16), box(8, 6, 13, 10, 7, 15), box(8, 6, 9, 10, 7, 11), box(8, 6, 5, 10, 7, 7), box(8, 6, 1, 10, 7, 3), box(11, 1, 0, 12, 2, 16),
					box(6, 1, 0, 7, 2, 16), box(7, 1, 0, 11, 2, 1), box(7, 1, 15, 11, 2, 16));
			case WEST -> Shapes.or(box(4, 0, 0, 16, 1, 16), box(10, 1, 0, 16, 12, 16), box(5, 7, 0, 10, 12, 16), box(6, 6, 1, 8, 7, 3), box(6, 6, 5, 8, 7, 7), box(6, 6, 9, 8, 7, 11), box(6, 6, 13, 8, 7, 15), box(4, 1, 0, 5, 2, 16),
					box(9, 1, 0, 10, 2, 16), box(5, 1, 15, 9, 2, 16), box(5, 1, 0, 9, 2, 1));
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
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
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

		SodaDispensorOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
