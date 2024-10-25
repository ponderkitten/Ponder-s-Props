
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

import net.mcreator.pondersroleplaymod.procedures.CoffeeGrinderOnBlockRightClickedProcedure;
import net.mcreator.pondersroleplaymod.init.PondersRoleplayModModBlockEntities;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Collections;

public class CoffeeGrinder1Block extends BaseEntityBlock implements EntityBlock {
	public static final IntegerProperty ANIMATION = IntegerProperty.create("animation", 0, (int) 1);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public CoffeeGrinder1Block() {
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
		return PondersRoleplayModModBlockEntities.COFFEE_GRINDER_1.get().create(blockPos, blockState);
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
			default -> Shapes.or(box(5, 0, 8, 11, 1, 14), box(5.5, 1, 8.5, 10.5, 6, 13.5), box(5.5, 11, 8.5, 10.5, 15, 13.5), box(5.5, 15, 8.5, 10.5, 16, 13.5), box(6, 6, 9, 10, 7, 13), box(6, 10, 9, 10, 11, 13), box(6.5, 7, 1.5, 9.5, 10, 13.5),
					box(7, 7.5, 13.5, 9, 9.5, 14.5), box(6, 0, 2, 10, 7, 8));
			case NORTH -> Shapes.or(box(5, 0, 2, 11, 1, 8), box(5.5, 1, 2.5, 10.5, 6, 7.5), box(5.5, 11, 2.5, 10.5, 15, 7.5), box(5.5, 15, 2.5, 10.5, 16, 7.5), box(6, 6, 3, 10, 7, 7), box(6, 10, 3, 10, 11, 7), box(6.5, 7, 2.5, 9.5, 10, 14.5),
					box(7, 7.5, 1.5, 9, 9.5, 2.5), box(6, 0, 8, 10, 7, 14));
			case EAST -> Shapes.or(box(8, 0, 5, 14, 1, 11), box(8.5, 1, 5.5, 13.5, 6, 10.5), box(8.5, 11, 5.5, 13.5, 15, 10.5), box(8.5, 15, 5.5, 13.5, 16, 10.5), box(9, 6, 6, 13, 7, 10), box(9, 10, 6, 13, 11, 10), box(1.5, 7, 6.5, 13.5, 10, 9.5),
					box(13.5, 7.5, 7, 14.5, 9.5, 9), box(2, 0, 6, 8, 7, 10));
			case WEST -> Shapes.or(box(2, 0, 5, 8, 1, 11), box(2.5, 1, 5.5, 7.5, 6, 10.5), box(2.5, 11, 5.5, 7.5, 15, 10.5), box(2.5, 15, 5.5, 7.5, 16, 10.5), box(3, 6, 6, 7, 7, 10), box(3, 10, 6, 7, 11, 10), box(2.5, 7, 6.5, 14.5, 10, 9.5),
					box(1.5, 7.5, 7, 2.5, 9.5, 9), box(8, 0, 6, 14, 7, 10));
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

		CoffeeGrinderOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
